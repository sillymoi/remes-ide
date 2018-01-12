package hr.fer.rasip.remes.simulator.ui.views;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.traces.Value;
import hr.fer.rasip.remes.simulator.traces.Variable;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.SimulatorUIImages;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;
import hr.fer.rasip.remes.simulator.ui.navigator.core.providers.SimulatorDataStoreLabelProvider;
import hr.fer.rasip.remes.simulator.ui.views.providers.SimulatorTracesAdapterFactoryContentProvider;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYZDataset;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class TraceDisplayView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "hr.fer.rasip.remes.simulator.ui.views.TraceDisplayView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action showChart;
	private Action setDifferenceRenderer;
	private Action setBoxRenderer;
	private Action doubleClickAction;

	private ChartComposite chartArea;
	private SimulatorDataStore sds;
	private SessionWrapper session = null;
	
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public TraceDisplayView() {
	}

	/**
	 * Initialize this view to display a specific trace.
	 * @param trace
	 */
	public void initialize(SimulatorDataStore dataStore, int traceID) {
		// Create our own session and load data
		this.sds = dataStore;
		this.session = this.sds.getSession(null);

		// Load data from db
		List<Object> params = new ArrayList<Object>();
		params.add(traceID);

		List<?> runs = this.session.executeQuery("from traces.SimulatorRun where id = ?", params);
		
		if(runs.size() > 0) {
			SimulatorRun run = (SimulatorRun) runs.get(0);
			this.viewer.setInput(new TreeParent(run));
			this.drillDownAdapter.reset();
			this.setPartName(((ILabelProvider) this.viewer.getLabelProvider()).getText(run));
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		SashForm sash = new SashForm(parent, SWT.HORIZONTAL);

		// Tree viewer
		viewer = new TreeViewer(sash, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new SimulatorTracesAdapterFactoryContentProvider(this.sds));
		viewer.setLabelProvider(new SimulatorDataStoreLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Set selection provider
		getSite().setSelectionProvider(viewer);
		
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "hr.fer.rasip.remes.simulator.ui.chart.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		// Create chart
		JFreeChart chart = createBoxChart(createBoxDataset());
		// ChartComposite cc = new ChartComposite(sash, SWT.NONE, chart, true);
		chartArea = new ChartComposite(sash, SWT.NONE, chart, true, true, true, true, true);

		sash.setWeights(new int[] { 30, 70 });
	}

	private XYZDataset createBoxDataset() {
		  double[][] serija = new double[4][8];
	      
		    
	       /// Punjenje podacima 
	       /// Ako se zeli da kvadrati budu drugacije obojani treba kreairati novi Array i dodati ga naredbom dataset.addSeries ; 
	       /// tada ce on biti drugacije obojan i naveden u legedni
	       
	       serija[0][0] = 129; // x1
	       serija[1][0] = 930; //y1
	       serija[2][0] = 153; //x2
	       serija[3][0] = 1650; //y2
	        
	       serija[0][1] = 132;
	       serija[1][1] = 1020;
	       serija[2][1] = 156;
	       serija[3][1] = 1740;
	        
	       serija[0][2] = 195;
	       serija[1][2] = 2910;
	       serija[2][2] = 258;
	       serija[3][2] = 4800;
	        
	       serija[0][3] = 198;
	       serija[1][3] = 3000;
	       serija[2][3] = 261;
	       serija[3][3] = 4890;

	       serija[0][4] = 198;
	       serija[1][4] = 3000;
	       serija[2][4] = 510;
	       serija[3][4] = 12360;

	       serija[0][5] = 213;
	       serija[1][5] = 3000;
	       serija[2][5] = 525;
	       serija[3][5] = 12360;

	       serija[0][6] = 221;
	       serija[1][6] = 3000;
	       serija[2][6] = 533;
	       serija[3][6] = 12360;
	       
	       serija[0][7] = 533;
	       serija[1][7] = 3000;
	       serija[2][7] = 800;
	       serija[3][7] = 12360;

	       MojXYZDataset dataset=new MojXYZDataset();
	       dataset.addSeries("Intervali",serija); 
	      
	       return dataset;
	}
	
	private XYZDataset createBoxDataset(Variable var) {

		double[][] series = new double[4][var.getValues().size()];
		
		/// Punjenje podacima 
		/// Ako se zeli da kvadrati budu drugacije obojani treba kreairati novi Array i dodati ga naredbom dataset.addSeries ; 
		/// tada ce on biti drugacije obojan i naveden u legedni
		
		int ix = 0;
		for(Value val : var.getValues()) {
			series[ix][0] = val.getClockMin();
			series[ix][1] = val.getValueMin();
			series[ix][2] = val.getClockMax();
			series[ix][3] = val.getValueMax();
			++ix;
		}
		
		MojXYZDataset dataset=new MojXYZDataset();
		dataset.addSeries(var.getName(), series); 
		
		return dataset;
	}
	
	private XYDataset createDiffDataset(Variable var) {
		final DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();
		double[][] series = new double[6][var.getValues().size()];
		
		// Podaci
		int ix = 0;
		for(Value val : var.getValues()) {
			series[0][ix] = val.getClockMin();
			series[1][ix] = val.getClockMin();
			series[2][ix] = val.getClockMin();
			series[3][ix] = val.getValueMin();
			series[4][ix] = val.getValueMin();
			series[5][ix] = val.getValueMin();
			++ix;
		}

		dataset.addSeries("min("+var.getName()+")", series);
		
		// Podaci
		series = new double[6][var.getValues().size()];
		ix = 0;
		for(Value val : var.getValues()) {
			series[0][ix] = val.getClockMax();
			series[1][ix] = val.getClockMax();
			series[2][ix] = val.getClockMax();
			series[3][ix] = val.getValueMax();
			series[4][ix] = val.getValueMax();
			series[5][ix] = val.getValueMax();
			++ix;
		}
		
		dataset.addSeries("max("+var.getName()+")", series);
		return dataset;
	}
	
	
	private XYDataset createDiffDataset() {
//	    final TimeSeries series1 = createSunriseSeries();
//	    final TimeSeries series2 = createSunsetSeries();
//	    final TimeSeriesCollection dataset = new TimeSeriesCollection();
//	    dataset.addSeries(series1);
//	    dataset.addSeries(series2);
	    
	    final DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();
	    double barWidth = 15.0;
	    double[][] data = new double[6][3];
	    // X values
	    data[0][0] = 1.2;
	    data[0][1] = 2.5;
	    data[0][2] = 3.5;

	    // set the start and end x values based upon the fixed bar width
	    for (int i = 0; i < data[0].length; i++) {
	        data[1][i] = data[0][i] - (barWidth/2);
	        data[2][i] = data[0][i] + (barWidth/2);
	    }

	    // Y values
	    data[3][0] = 17.0;
	    data[3][1] = 29.0;
	    data[3][2] = 48.0;

	    // for safety in case setUseYInterval(true) is called
	    for (int i = 0; i < data[3].length; i++) {
	        data[4][i] = data[3][i] - (barWidth/2);
	        data[5][i] = data[3][i] + (barWidth);
	    }

	    dataset.addSeries("Serie 1", data);
	     
	    double[][] data2 = new double[6][3];
	    for (int i = 0; i < data2[0].length; i++) {
	    	data2[0][i] =  data[0][i];
	    	data2[1][i] =  data[1][i];
	    	data2[2][i] =  data[2][i];
	    	data2[3][i] =  data[3][i]-5*i;
	    	data2[4][i] =  data[4][i]-5*i;
	    	data2[5][i] =  data[5][i]+5*i;	    	
	    }
	    
	    dataset.addSeries("S2", data2);
	    
	    return dataset;
	}
	
	
	/**
	 * A utility method for creating a value based on a time.
	 * 
	 * @param hour
	 *            the hour.
	 * @param min
	 *            the minute.
	 * 
	 * @return a value.
	 */
	private Long time(final int hour, final int min) {
		final Minute m = new Minute(min, hour, 1, 1, 1970);
		return new Long(m.getFirstMillisecond());
	}

	/**
	 * Creates a time series containing sunrise times for London in 2004.
	 * 
	 * @return a time series containing sunrise times.
	 */
	public TimeSeries createSunriseSeries() {

		final TimeSeries series = new TimeSeries("Sunrise");

		series.add(new Day(1, 1, 2004), time(8, 5));
		series.add(new Day(2, 1, 2004), time(8, 5));
		series.add(new Day(3, 1, 2004), time(8, 5));
		series.add(new Day(4, 1, 2004), time(8, 5));
		series.add(new Day(5, 1, 2004), time(8, 5));
		series.add(new Day(6, 1, 2004), time(8, 4));
		series.add(new Day(7, 1, 2004), time(8, 4));
		series.add(new Day(8, 1, 2004), time(8, 4));
		series.add(new Day(9, 1, 2004), time(8, 3));
		series.add(new Day(10, 1, 2004), time(8, 3));
		series.add(new Day(11, 1, 2004), time(8, 2));
		series.add(new Day(12, 1, 2004), time(8, 1));
		series.add(new Day(13, 1, 2004), time(8, 1));
		series.add(new Day(14, 1, 2004), time(8, 0));
		series.add(new Day(15, 1, 2004), time(7, 59));
		series.add(new Day(16, 1, 2004), time(7, 58));
		series.add(new Day(17, 1, 2004), time(7, 58));
		series.add(new Day(18, 1, 2004), time(7, 57));
		series.add(new Day(19, 1, 2004), time(7, 56));
		series.add(new Day(20, 1, 2004), time(7, 55));
		series.add(new Day(21, 1, 2004), time(7, 54));
		series.add(new Day(22, 1, 2004), time(7, 53));
		series.add(new Day(23, 1, 2004), time(7, 51));
		series.add(new Day(24, 1, 2004), time(7, 50));
		series.add(new Day(25, 1, 2004), time(7, 49));
		series.add(new Day(26, 1, 2004), time(7, 48));
		series.add(new Day(27, 1, 2004), time(7, 46));
		series.add(new Day(28, 1, 2004), time(7, 45));
		series.add(new Day(29, 1, 2004), time(7, 44));
		series.add(new Day(30, 1, 2004), time(7, 42));
		series.add(new Day(31, 1, 2004), time(7, 41));

		series.add(new Day(1, 2, 2004), time(7, 39));
		series.add(new Day(2, 2, 2004), time(7, 38));
		series.add(new Day(3, 2, 2004), time(7, 36));
		series.add(new Day(4, 2, 2004), time(7, 35));
		series.add(new Day(5, 2, 2004), time(7, 33));
		series.add(new Day(6, 2, 2004), time(7, 31));
		series.add(new Day(7, 2, 2004), time(7, 30));
		series.add(new Day(8, 2, 2004), time(7, 28));
		series.add(new Day(9, 2, 2004), time(7, 26));
		series.add(new Day(10, 2, 2004), time(7, 25));
		series.add(new Day(11, 2, 2004), time(7, 23));
		series.add(new Day(12, 2, 2004), time(7, 21));
		series.add(new Day(13, 2, 2004), time(7, 19));
		series.add(new Day(14, 2, 2004), time(7, 17));
		series.add(new Day(15, 2, 2004), time(7, 15));
		series.add(new Day(16, 2, 2004), time(7, 13));
		series.add(new Day(17, 2, 2004), time(7, 11));
		series.add(new Day(18, 2, 2004), time(7, 10));
		series.add(new Day(19, 2, 2004), time(7, 8));
		series.add(new Day(20, 2, 2004), time(7, 6));
		series.add(new Day(21, 2, 2004), time(7, 4));
		series.add(new Day(22, 2, 2004), time(7, 2));
		series.add(new Day(23, 2, 2004), time(6, 59));
		series.add(new Day(24, 2, 2004), time(6, 57));
		series.add(new Day(25, 2, 2004), time(6, 55));
		series.add(new Day(26, 2, 2004), time(6, 53));
		series.add(new Day(27, 2, 2004), time(6, 51));
		series.add(new Day(28, 2, 2004), time(6, 49));
		series.add(new Day(29, 2, 2004), time(6, 47));

		series.add(new Day(1, 3, 2004), time(6, 45));
		series.add(new Day(2, 3, 2004), time(6, 43));
		series.add(new Day(3, 3, 2004), time(6, 40));
		series.add(new Day(4, 3, 2004), time(6, 38));
		series.add(new Day(5, 3, 2004), time(6, 36));
		series.add(new Day(6, 3, 2004), time(6, 34));
		series.add(new Day(7, 3, 2004), time(6, 32));
		series.add(new Day(8, 3, 2004), time(6, 29));
		series.add(new Day(9, 3, 2004), time(6, 27));
		series.add(new Day(10, 3, 2004), time(6, 25));
		series.add(new Day(11, 3, 2004), time(6, 23));
		series.add(new Day(12, 3, 2004), time(6, 20));
		series.add(new Day(13, 3, 2004), time(6, 18));
		series.add(new Day(14, 3, 2004), time(6, 16));
		series.add(new Day(15, 3, 2004), time(6, 14));
		series.add(new Day(16, 3, 2004), time(6, 11));
		series.add(new Day(17, 3, 2004), time(6, 9));
		series.add(new Day(18, 3, 2004), time(6, 7));
		series.add(new Day(19, 3, 2004), time(6, 5));
		series.add(new Day(20, 3, 2004), time(6, 2));
		series.add(new Day(21, 3, 2004), time(6, 0));
		series.add(new Day(22, 3, 2004), time(5, 58));
		series.add(new Day(23, 3, 2004), time(5, 55));
		series.add(new Day(24, 3, 2004), time(5, 53));
		series.add(new Day(25, 3, 2004), time(5, 51));
		series.add(new Day(26, 3, 2004), time(5, 49));
		series.add(new Day(27, 3, 2004), time(5, 46));
		series.add(new Day(28, 3, 2004), time(6, 44));
		series.add(new Day(29, 3, 2004), time(6, 42));
		series.add(new Day(30, 3, 2004), time(6, 39));
		series.add(new Day(31, 3, 2004), time(6, 37));

		series.add(new Day(1, 4, 2004), time(6, 35));
		series.add(new Day(2, 4, 2004), time(6, 33));
		series.add(new Day(3, 4, 2004), time(6, 30));
		series.add(new Day(4, 4, 2004), time(6, 28));
		series.add(new Day(5, 4, 2004), time(6, 26));
		series.add(new Day(6, 4, 2004), time(6, 24));
		series.add(new Day(7, 4, 2004), time(6, 21));
		series.add(new Day(8, 4, 2004), time(6, 19));
		series.add(new Day(9, 4, 2004), time(6, 17));
		series.add(new Day(10, 4, 2004), time(6, 15));
		series.add(new Day(11, 4, 2004), time(6, 12));
		series.add(new Day(12, 4, 2004), time(6, 10));
		series.add(new Day(13, 4, 2004), time(6, 8));
		series.add(new Day(14, 4, 2004), time(6, 6));
		series.add(new Day(15, 4, 2004), time(6, 4));
		series.add(new Day(16, 4, 2004), time(6, 2));
		series.add(new Day(17, 4, 2004), time(5, 59));
		series.add(new Day(18, 4, 2004), time(5, 57));
		series.add(new Day(19, 4, 2004), time(5, 55));
		series.add(new Day(20, 4, 2004), time(5, 53));
		series.add(new Day(21, 4, 2004), time(5, 51));
		series.add(new Day(22, 4, 2004), time(5, 49));
		series.add(new Day(23, 4, 2004), time(5, 47));
		series.add(new Day(24, 4, 2004), time(5, 45));
		series.add(new Day(25, 4, 2004), time(5, 43));
		series.add(new Day(26, 4, 2004), time(5, 41));
		series.add(new Day(27, 4, 2004), time(5, 39));
		series.add(new Day(28, 4, 2004), time(5, 37));
		series.add(new Day(29, 4, 2004), time(5, 35));
		series.add(new Day(30, 4, 2004), time(5, 33));

		series.add(new Day(1, 5, 2004), time(5, 31));
		series.add(new Day(2, 5, 2004), time(5, 29));
		series.add(new Day(3, 5, 2004), time(5, 28));
		series.add(new Day(4, 5, 2004), time(5, 26));
		series.add(new Day(5, 5, 2004), time(5, 24));
		series.add(new Day(6, 5, 2004), time(5, 22));
		series.add(new Day(7, 5, 2004), time(5, 20));
		series.add(new Day(8, 5, 2004), time(5, 19));
		series.add(new Day(9, 5, 2004), time(5, 17));
		series.add(new Day(10, 5, 2004), time(5, 15));
		series.add(new Day(11, 5, 2004), time(5, 14));
		series.add(new Day(12, 5, 2004), time(5, 12));
		series.add(new Day(13, 5, 2004), time(5, 11));
		series.add(new Day(14, 5, 2004), time(5, 9));
		series.add(new Day(15, 5, 2004), time(5, 8));
		series.add(new Day(16, 5, 2004), time(5, 6));
		series.add(new Day(17, 5, 2004), time(5, 5));
		series.add(new Day(18, 5, 2004), time(5, 3));
		series.add(new Day(19, 5, 2004), time(5, 2));
		series.add(new Day(20, 5, 2004), time(5, 1));
		series.add(new Day(21, 5, 2004), time(4, 59));
		series.add(new Day(22, 5, 2004), time(4, 58));
		series.add(new Day(23, 5, 2004), time(4, 57));
		series.add(new Day(24, 5, 2004), time(4, 56));
		series.add(new Day(25, 5, 2004), time(4, 55));
		series.add(new Day(26, 5, 2004), time(4, 53));
		series.add(new Day(27, 5, 2004), time(4, 52));
		series.add(new Day(28, 5, 2004), time(4, 51));
		series.add(new Day(29, 5, 2004), time(4, 50));
		series.add(new Day(30, 5, 2004), time(4, 50));
		series.add(new Day(31, 5, 2004), time(4, 49));

		series.add(new Day(1, 6, 2004), time(4, 48));
		series.add(new Day(2, 6, 2004), time(4, 47));
		series.add(new Day(3, 6, 2004), time(4, 46));
		series.add(new Day(4, 6, 2004), time(4, 46));
		series.add(new Day(5, 6, 2004), time(4, 45));
		series.add(new Day(6, 6, 2004), time(4, 45));
		series.add(new Day(7, 6, 2004), time(4, 44));
		series.add(new Day(8, 6, 2004), time(4, 44));
		series.add(new Day(9, 6, 2004), time(4, 43));
		series.add(new Day(10, 6, 2004), time(4, 43));
		series.add(new Day(11, 6, 2004), time(4, 42));
		series.add(new Day(12, 6, 2004), time(4, 42));
		series.add(new Day(13, 6, 2004), time(4, 42));
		series.add(new Day(14, 6, 2004), time(4, 42));
		series.add(new Day(15, 6, 2004), time(4, 42));
		series.add(new Day(16, 6, 2004), time(4, 42));
		series.add(new Day(17, 6, 2004), time(4, 42));
		series.add(new Day(18, 6, 2004), time(4, 42));
		series.add(new Day(19, 6, 2004), time(4, 42));
		series.add(new Day(20, 6, 2004), time(4, 42));
		series.add(new Day(21, 6, 2004), time(4, 42));
		series.add(new Day(22, 6, 2004), time(4, 42));
		series.add(new Day(23, 6, 2004), time(4, 43));
		series.add(new Day(24, 6, 2004), time(4, 43));
		series.add(new Day(25, 6, 2004), time(4, 43));
		series.add(new Day(26, 6, 2004), time(4, 44));
		series.add(new Day(27, 6, 2004), time(4, 44));
		series.add(new Day(28, 6, 2004), time(4, 45));
		series.add(new Day(29, 6, 2004), time(4, 45));
		series.add(new Day(30, 6, 2004), time(4, 46));

		series.add(new Day(1, 7, 2004), time(4, 47));
		series.add(new Day(2, 7, 2004), time(4, 47));
		series.add(new Day(3, 7, 2004), time(4, 48));
		series.add(new Day(4, 7, 2004), time(4, 49));
		series.add(new Day(5, 7, 2004), time(4, 50));
		series.add(new Day(6, 7, 2004), time(4, 51));
		series.add(new Day(7, 7, 2004), time(4, 51));
		series.add(new Day(8, 7, 2004), time(4, 52));
		series.add(new Day(9, 7, 2004), time(4, 53));
		series.add(new Day(10, 7, 2004), time(4, 54));
		series.add(new Day(11, 7, 2004), time(4, 55));
		series.add(new Day(12, 7, 2004), time(4, 57));
		series.add(new Day(13, 7, 2004), time(4, 58));
		series.add(new Day(14, 7, 2004), time(4, 59));
		series.add(new Day(15, 7, 2004), time(5, 0));
		series.add(new Day(16, 7, 2004), time(5, 1));
		series.add(new Day(17, 7, 2004), time(5, 2));
		series.add(new Day(18, 7, 2004), time(5, 4));
		series.add(new Day(19, 7, 2004), time(5, 5));
		series.add(new Day(20, 7, 2004), time(5, 6));
		series.add(new Day(21, 7, 2004), time(5, 8));
		series.add(new Day(22, 7, 2004), time(5, 9));
		series.add(new Day(23, 7, 2004), time(5, 10));
		series.add(new Day(24, 7, 2004), time(5, 12));
		series.add(new Day(25, 7, 2004), time(5, 13));
		series.add(new Day(26, 7, 2004), time(5, 14));
		series.add(new Day(27, 7, 2004), time(5, 16));
		series.add(new Day(28, 7, 2004), time(5, 17));
		series.add(new Day(29, 7, 2004), time(5, 19));
		series.add(new Day(30, 7, 2004), time(5, 20));
		series.add(new Day(31, 7, 2004), time(5, 22));

		series.add(new Day(1, 8, 2004), time(5, 23));
		series.add(new Day(2, 8, 2004), time(5, 25));
		series.add(new Day(3, 8, 2004), time(5, 26));
		series.add(new Day(4, 8, 2004), time(5, 28));
		series.add(new Day(5, 8, 2004), time(5, 29));
		series.add(new Day(6, 8, 2004), time(5, 31));
		series.add(new Day(7, 8, 2004), time(5, 32));
		series.add(new Day(8, 8, 2004), time(5, 34));
		series.add(new Day(9, 8, 2004), time(5, 36));
		series.add(new Day(10, 8, 2004), time(5, 37));
		series.add(new Day(11, 8, 2004), time(5, 39));
		series.add(new Day(12, 8, 2004), time(5, 40));
		series.add(new Day(13, 8, 2004), time(5, 42));
		series.add(new Day(14, 8, 2004), time(5, 43));
		series.add(new Day(15, 8, 2004), time(5, 45));
		series.add(new Day(16, 8, 2004), time(5, 47));
		series.add(new Day(17, 8, 2004), time(5, 48));
		series.add(new Day(18, 8, 2004), time(5, 50));
		series.add(new Day(19, 8, 2004), time(5, 51));
		series.add(new Day(20, 8, 2004), time(5, 53));
		series.add(new Day(21, 8, 2004), time(5, 55));
		series.add(new Day(22, 8, 2004), time(5, 56));
		series.add(new Day(23, 8, 2004), time(5, 58));
		series.add(new Day(24, 8, 2004), time(5, 59));
		series.add(new Day(25, 8, 2004), time(6, 1));
		series.add(new Day(26, 8, 2004), time(6, 3));
		series.add(new Day(27, 8, 2004), time(6, 4));
		series.add(new Day(28, 8, 2004), time(6, 6));
		series.add(new Day(29, 8, 2004), time(6, 7));
		series.add(new Day(30, 8, 2004), time(6, 9));
		series.add(new Day(31, 8, 2004), time(6, 10));

		series.add(new Day(1, 9, 2004), time(6, 12));
		series.add(new Day(2, 9, 2004), time(6, 14));
		series.add(new Day(3, 9, 2004), time(6, 15));
		series.add(new Day(4, 9, 2004), time(6, 17));
		series.add(new Day(5, 9, 2004), time(6, 18));
		series.add(new Day(6, 9, 2004), time(6, 20));
		series.add(new Day(7, 9, 2004), time(6, 22));
		series.add(new Day(8, 9, 2004), time(6, 23));
		series.add(new Day(9, 9, 2004), time(6, 25));
		series.add(new Day(10, 9, 2004), time(6, 26));
		series.add(new Day(11, 9, 2004), time(6, 28));
		series.add(new Day(12, 9, 2004), time(6, 30));
		series.add(new Day(13, 9, 2004), time(6, 31));
		series.add(new Day(14, 9, 2004), time(6, 33));
		series.add(new Day(15, 9, 2004), time(6, 34));
		series.add(new Day(16, 9, 2004), time(6, 36));
		series.add(new Day(17, 9, 2004), time(6, 38));
		series.add(new Day(18, 9, 2004), time(6, 39));
		series.add(new Day(19, 9, 2004), time(6, 41));
		series.add(new Day(20, 9, 2004), time(6, 42));
		series.add(new Day(21, 9, 2004), time(6, 44));
		series.add(new Day(22, 9, 2004), time(6, 46));
		series.add(new Day(23, 9, 2004), time(6, 47));
		series.add(new Day(24, 9, 2004), time(6, 49));
		series.add(new Day(25, 9, 2004), time(6, 50));
		series.add(new Day(26, 9, 2004), time(6, 52));
		series.add(new Day(27, 9, 2004), time(6, 54));
		series.add(new Day(28, 9, 2004), time(6, 55));
		series.add(new Day(29, 9, 2004), time(6, 57));
		series.add(new Day(30, 9, 2004), time(6, 58));

		series.add(new Day(1, 10, 2004), time(7, 0));
		series.add(new Day(2, 10, 2004), time(7, 2));
		series.add(new Day(3, 10, 2004), time(7, 3));
		series.add(new Day(4, 10, 2004), time(7, 5));
		series.add(new Day(5, 10, 2004), time(7, 7));
		series.add(new Day(6, 10, 2004), time(7, 8));
		series.add(new Day(7, 10, 2004), time(7, 10));
		series.add(new Day(8, 10, 2004), time(7, 12));
		series.add(new Day(9, 10, 2004), time(7, 13));
		series.add(new Day(10, 10, 2004), time(7, 15));
		series.add(new Day(11, 10, 2004), time(7, 17));
		series.add(new Day(12, 10, 2004), time(7, 18));
		series.add(new Day(13, 10, 2004), time(7, 20));
		series.add(new Day(14, 10, 2004), time(7, 22));
		series.add(new Day(15, 10, 2004), time(7, 23));
		series.add(new Day(16, 10, 2004), time(7, 25));
		series.add(new Day(17, 10, 2004), time(7, 27));
		series.add(new Day(18, 10, 2004), time(7, 29));
		series.add(new Day(19, 10, 2004), time(7, 30));
		series.add(new Day(20, 10, 2004), time(7, 32));
		series.add(new Day(21, 10, 2004), time(7, 34));
		series.add(new Day(22, 10, 2004), time(7, 35));
		series.add(new Day(23, 10, 2004), time(7, 37));
		series.add(new Day(24, 10, 2004), time(7, 39));
		series.add(new Day(25, 10, 2004), time(7, 41));
		series.add(new Day(26, 10, 2004), time(7, 42));
		series.add(new Day(27, 10, 2004), time(7, 44));
		series.add(new Day(28, 10, 2004), time(7, 46));
		series.add(new Day(29, 10, 2004), time(7, 48));
		series.add(new Day(30, 10, 2004), time(7, 49));
		series.add(new Day(31, 10, 2004), time(6, 51));

		series.add(new Day(1, 11, 2004), time(6, 53));
		series.add(new Day(2, 11, 2004), time(6, 55));
		series.add(new Day(3, 11, 2004), time(6, 57));
		series.add(new Day(4, 11, 2004), time(6, 58));
		series.add(new Day(5, 11, 2004), time(7, 0));
		series.add(new Day(6, 11, 2004), time(7, 2));
		series.add(new Day(7, 11, 2004), time(7, 4));
		series.add(new Day(8, 11, 2004), time(7, 5));
		series.add(new Day(9, 11, 2004), time(7, 7));
		series.add(new Day(10, 11, 2004), time(7, 9));
		series.add(new Day(11, 11, 2004), time(7, 11));
		series.add(new Day(12, 11, 2004), time(7, 12));
		series.add(new Day(13, 11, 2004), time(7, 14));
		series.add(new Day(14, 11, 2004), time(7, 16));
		series.add(new Day(15, 11, 2004), time(7, 17));
		series.add(new Day(16, 11, 2004), time(7, 19));
		series.add(new Day(17, 11, 2004), time(7, 21));
		series.add(new Day(18, 11, 2004), time(7, 23));
		series.add(new Day(19, 11, 2004), time(7, 24));
		series.add(new Day(20, 11, 2004), time(7, 26));
		series.add(new Day(21, 11, 2004), time(7, 28));
		series.add(new Day(22, 11, 2004), time(7, 29));
		series.add(new Day(23, 11, 2004), time(7, 31));
		series.add(new Day(24, 11, 2004), time(7, 32));
		series.add(new Day(25, 11, 2004), time(7, 34));
		series.add(new Day(26, 11, 2004), time(7, 35));
		series.add(new Day(27, 11, 2004), time(7, 37));
		series.add(new Day(28, 11, 2004), time(7, 38));
		series.add(new Day(29, 11, 2004), time(7, 40));
		series.add(new Day(30, 11, 2004), time(7, 41));

		series.add(new Day(1, 12, 2004), time(7, 43));
		series.add(new Day(2, 12, 2004), time(7, 44));
		series.add(new Day(3, 12, 2004), time(7, 45));
		series.add(new Day(4, 12, 2004), time(7, 47));
		series.add(new Day(5, 12, 2004), time(7, 48));
		series.add(new Day(6, 12, 2004), time(7, 49));
		series.add(new Day(7, 12, 2004), time(7, 51));
		series.add(new Day(8, 12, 2004), time(7, 52));
		series.add(new Day(9, 12, 2004), time(7, 53));
		series.add(new Day(10, 12, 2004), time(7, 54));
		series.add(new Day(11, 12, 2004), time(7, 55));
		series.add(new Day(12, 12, 2004), time(7, 56));
		series.add(new Day(13, 12, 2004), time(7, 57));
		series.add(new Day(14, 12, 2004), time(7, 58));
		series.add(new Day(15, 12, 2004), time(7, 59));
		series.add(new Day(16, 12, 2004), time(7, 59));
		series.add(new Day(17, 12, 2004), time(8, 0));
		series.add(new Day(18, 12, 2004), time(8, 1));
		series.add(new Day(19, 12, 2004), time(8, 2));
		series.add(new Day(20, 12, 2004), time(8, 2));
		series.add(new Day(21, 12, 2004), time(8, 3));
		series.add(new Day(22, 12, 2004), time(8, 3));
		series.add(new Day(23, 12, 2004), time(8, 4));
		series.add(new Day(24, 12, 2004), time(8, 4));
		series.add(new Day(25, 12, 2004), time(8, 4));
		series.add(new Day(26, 12, 2004), time(8, 5));
		series.add(new Day(27, 12, 2004), time(8, 5));
		series.add(new Day(28, 12, 2004), time(8, 5));
		series.add(new Day(29, 12, 2004), time(8, 5));
		series.add(new Day(30, 12, 2004), time(8, 5));
		series.add(new Day(31, 12, 2004), time(8, 5));

		return series;
	}

	/**
	 * Creates a time series containing sunset times for London in 2004.
	 * 
	 * @return a time series containing sunset times.
	 */
	public TimeSeries createSunsetSeries() {
		final TimeSeries series = new TimeSeries("Sunset");

		series.add(new Day(1, 1, 2004), time(16, 0));
		series.add(new Day(2, 1, 2004), time(16, 1));
		series.add(new Day(3, 1, 2004), time(16, 2));
		series.add(new Day(4, 1, 2004), time(16, 3));
		series.add(new Day(5, 1, 2004), time(16, 4));
		series.add(new Day(6, 1, 2004), time(16, 5));
		series.add(new Day(7, 1, 2004), time(16, 7));
		series.add(new Day(8, 1, 2004), time(16, 8));
		series.add(new Day(9, 1, 2004), time(16, 9));
		series.add(new Day(10, 1, 2004), time(16, 11));
		series.add(new Day(11, 1, 2004), time(16, 12));
		series.add(new Day(12, 1, 2004), time(16, 13));
		series.add(new Day(13, 1, 2004), time(16, 15));
		series.add(new Day(14, 1, 2004), time(16, 16));
		series.add(new Day(15, 1, 2004), time(16, 18));
		series.add(new Day(16, 1, 2004), time(16, 19));
		series.add(new Day(17, 1, 2004), time(16, 21));
		series.add(new Day(18, 1, 2004), time(16, 22));
		series.add(new Day(19, 1, 2004), time(16, 24));
		series.add(new Day(20, 1, 2004), time(16, 26));
		series.add(new Day(21, 1, 2004), time(16, 27));
		series.add(new Day(22, 1, 2004), time(16, 29));
		series.add(new Day(23, 1, 2004), time(16, 31));
		series.add(new Day(24, 1, 2004), time(16, 32));
		series.add(new Day(25, 1, 2004), time(16, 34));
		series.add(new Day(26, 1, 2004), time(16, 36));
		series.add(new Day(27, 1, 2004), time(16, 38));
		series.add(new Day(28, 1, 2004), time(16, 39));
		series.add(new Day(29, 1, 2004), time(16, 41));
		series.add(new Day(30, 1, 2004), time(16, 43));
		series.add(new Day(31, 1, 2004), time(16, 45));

		series.add(new Day(1, 2, 2004), time(16, 47));
		series.add(new Day(2, 2, 2004), time(16, 48));
		series.add(new Day(3, 2, 2004), time(16, 50));
		series.add(new Day(4, 2, 2004), time(16, 52));
		series.add(new Day(5, 2, 2004), time(16, 54));
		series.add(new Day(6, 2, 2004), time(16, 56));
		series.add(new Day(7, 2, 2004), time(16, 57));
		series.add(new Day(8, 2, 2004), time(16, 59));
		series.add(new Day(9, 2, 2004), time(17, 1));
		series.add(new Day(10, 2, 2004), time(17, 3));
		series.add(new Day(11, 2, 2004), time(17, 5));
		series.add(new Day(12, 2, 2004), time(17, 7));
		series.add(new Day(13, 2, 2004), time(17, 8));
		series.add(new Day(14, 2, 2004), time(17, 10));
		series.add(new Day(15, 2, 2004), time(17, 12));
		series.add(new Day(16, 2, 2004), time(17, 14));
		series.add(new Day(17, 2, 2004), time(17, 16));
		series.add(new Day(18, 2, 2004), time(17, 17));
		series.add(new Day(19, 2, 2004), time(17, 19));
		series.add(new Day(20, 2, 2004), time(17, 21));
		series.add(new Day(21, 2, 2004), time(17, 23));
		series.add(new Day(22, 2, 2004), time(17, 25));
		series.add(new Day(23, 2, 2004), time(17, 27));
		series.add(new Day(24, 2, 2004), time(17, 28));
		series.add(new Day(25, 2, 2004), time(17, 30));
		series.add(new Day(26, 2, 2004), time(17, 32));
		series.add(new Day(27, 2, 2004), time(17, 34));
		series.add(new Day(28, 2, 2004), time(17, 35));
		series.add(new Day(29, 2, 2004), time(17, 37));

		series.add(new Day(1, 3, 2004), time(17, 39));
		series.add(new Day(2, 3, 2004), time(17, 41));
		series.add(new Day(3, 3, 2004), time(17, 43));
		series.add(new Day(4, 3, 2004), time(17, 44));
		series.add(new Day(5, 3, 2004), time(17, 46));
		series.add(new Day(6, 3, 2004), time(17, 48));
		series.add(new Day(7, 3, 2004), time(17, 50));
		series.add(new Day(8, 3, 2004), time(17, 51));
		series.add(new Day(9, 3, 2004), time(17, 53));
		series.add(new Day(10, 3, 2004), time(17, 55));
		series.add(new Day(11, 3, 2004), time(17, 56));
		series.add(new Day(12, 3, 2004), time(17, 58));
		series.add(new Day(13, 3, 2004), time(18, 0));
		series.add(new Day(14, 3, 2004), time(18, 2));
		series.add(new Day(15, 3, 2004), time(18, 3));
		series.add(new Day(16, 3, 2004), time(18, 5));
		series.add(new Day(17, 3, 2004), time(18, 7));
		series.add(new Day(18, 3, 2004), time(18, 8));
		series.add(new Day(19, 3, 2004), time(18, 10));
		series.add(new Day(20, 3, 2004), time(18, 12));
		series.add(new Day(21, 3, 2004), time(18, 13));
		series.add(new Day(22, 3, 2004), time(18, 15));
		series.add(new Day(23, 3, 2004), time(18, 17));
		series.add(new Day(24, 3, 2004), time(18, 19));
		series.add(new Day(25, 3, 2004), time(18, 20));
		series.add(new Day(26, 3, 2004), time(18, 22));
		series.add(new Day(27, 3, 2004), time(18, 24));
		series.add(new Day(28, 3, 2004), time(19, 25));
		series.add(new Day(29, 3, 2004), time(19, 27));
		series.add(new Day(30, 3, 2004), time(19, 29));
		series.add(new Day(31, 3, 2004), time(19, 30));

		series.add(new Day(1, 4, 2004), time(19, 32));
		series.add(new Day(2, 4, 2004), time(19, 34));
		series.add(new Day(3, 4, 2004), time(19, 35));
		series.add(new Day(4, 4, 2004), time(19, 37));
		series.add(new Day(5, 4, 2004), time(19, 39));
		series.add(new Day(6, 4, 2004), time(19, 40));
		series.add(new Day(7, 4, 2004), time(19, 42));
		series.add(new Day(8, 4, 2004), time(19, 44));
		series.add(new Day(9, 4, 2004), time(19, 45));
		series.add(new Day(10, 4, 2004), time(19, 47));
		series.add(new Day(11, 4, 2004), time(19, 49));
		series.add(new Day(12, 4, 2004), time(19, 50));
		series.add(new Day(13, 4, 2004), time(19, 52));
		series.add(new Day(14, 4, 2004), time(19, 54));
		series.add(new Day(15, 4, 2004), time(19, 55));
		series.add(new Day(16, 4, 2004), time(19, 57));
		series.add(new Day(17, 4, 2004), time(19, 59));
		series.add(new Day(18, 4, 2004), time(20, 0));
		series.add(new Day(19, 4, 2004), time(20, 2));
		series.add(new Day(20, 4, 2004), time(20, 4));
		series.add(new Day(21, 4, 2004), time(20, 5));
		series.add(new Day(22, 4, 2004), time(20, 7));
		series.add(new Day(23, 4, 2004), time(20, 9));
		series.add(new Day(24, 4, 2004), time(20, 10));
		series.add(new Day(25, 4, 2004), time(20, 12));
		series.add(new Day(26, 4, 2004), time(20, 14));
		series.add(new Day(27, 4, 2004), time(20, 15));
		series.add(new Day(28, 4, 2004), time(20, 17));
		series.add(new Day(29, 4, 2004), time(20, 19));
		series.add(new Day(30, 4, 2004), time(20, 20));

		series.add(new Day(1, 5, 2004), time(20, 22));
		series.add(new Day(2, 5, 2004), time(20, 24));
		series.add(new Day(3, 5, 2004), time(20, 25));
		series.add(new Day(4, 5, 2004), time(20, 27));
		series.add(new Day(5, 5, 2004), time(20, 28));
		series.add(new Day(6, 5, 2004), time(20, 30));
		series.add(new Day(7, 5, 2004), time(20, 32));
		series.add(new Day(8, 5, 2004), time(20, 33));
		series.add(new Day(9, 5, 2004), time(20, 35));
		series.add(new Day(10, 5, 2004), time(20, 36));
		series.add(new Day(11, 5, 2004), time(20, 38));
		series.add(new Day(12, 5, 2004), time(20, 40));
		series.add(new Day(13, 5, 2004), time(20, 41));
		series.add(new Day(14, 5, 2004), time(20, 43));
		series.add(new Day(15, 5, 2004), time(20, 44));
		series.add(new Day(16, 5, 2004), time(20, 46));
		series.add(new Day(17, 5, 2004), time(20, 47));
		series.add(new Day(18, 5, 2004), time(20, 49));
		series.add(new Day(19, 5, 2004), time(20, 50));
		series.add(new Day(20, 5, 2004), time(20, 51));
		series.add(new Day(21, 5, 2004), time(20, 53));
		series.add(new Day(22, 5, 2004), time(20, 54));
		series.add(new Day(23, 5, 2004), time(20, 56));
		series.add(new Day(24, 5, 2004), time(20, 57));
		series.add(new Day(25, 5, 2004), time(20, 58));
		series.add(new Day(26, 5, 2004), time(21, 0));
		series.add(new Day(27, 5, 2004), time(21, 1));
		series.add(new Day(28, 5, 2004), time(21, 2));
		series.add(new Day(29, 5, 2004), time(21, 3));
		series.add(new Day(30, 5, 2004), time(21, 4));
		series.add(new Day(31, 5, 2004), time(21, 6));

		series.add(new Day(1, 6, 2004), time(21, 7));
		series.add(new Day(2, 6, 2004), time(21, 8));
		series.add(new Day(3, 6, 2004), time(21, 9));
		series.add(new Day(4, 6, 2004), time(21, 10));
		series.add(new Day(5, 6, 2004), time(21, 11));
		series.add(new Day(6, 6, 2004), time(21, 12));
		series.add(new Day(7, 6, 2004), time(21, 13));
		series.add(new Day(8, 6, 2004), time(21, 13));
		series.add(new Day(9, 6, 2004), time(21, 14));
		series.add(new Day(10, 6, 2004), time(21, 15));
		series.add(new Day(11, 6, 2004), time(21, 16));
		series.add(new Day(12, 6, 2004), time(21, 16));
		series.add(new Day(13, 6, 2004), time(21, 17));
		series.add(new Day(14, 6, 2004), time(21, 18));
		series.add(new Day(15, 6, 2004), time(21, 18));
		series.add(new Day(16, 6, 2004), time(21, 19));
		series.add(new Day(17, 6, 2004), time(21, 19));
		series.add(new Day(18, 6, 2004), time(21, 19));
		series.add(new Day(19, 6, 2004), time(21, 20));
		series.add(new Day(20, 6, 2004), time(21, 20));
		series.add(new Day(21, 6, 2004), time(21, 20));
		series.add(new Day(22, 6, 2004), time(21, 21));
		series.add(new Day(23, 6, 2004), time(21, 21));
		series.add(new Day(24, 6, 2004), time(21, 21));
		series.add(new Day(25, 6, 2004), time(21, 21));
		series.add(new Day(26, 6, 2004), time(21, 21));
		series.add(new Day(27, 6, 2004), time(21, 21));
		series.add(new Day(28, 6, 2004), time(21, 21));
		series.add(new Day(29, 6, 2004), time(21, 21));
		series.add(new Day(30, 6, 2004), time(21, 21));

		series.add(new Day(1, 7, 2004), time(21, 20));
		series.add(new Day(2, 7, 2004), time(21, 20));
		series.add(new Day(3, 7, 2004), time(21, 19));
		series.add(new Day(4, 7, 2004), time(21, 19));
		series.add(new Day(5, 7, 2004), time(21, 18));
		series.add(new Day(6, 7, 2004), time(21, 18));
		series.add(new Day(7, 7, 2004), time(21, 17));
		series.add(new Day(8, 7, 2004), time(21, 17));
		series.add(new Day(9, 7, 2004), time(21, 16));
		series.add(new Day(10, 7, 2004), time(21, 15));
		series.add(new Day(11, 7, 2004), time(21, 14));
		series.add(new Day(12, 7, 2004), time(21, 14));
		series.add(new Day(13, 7, 2004), time(21, 13));
		series.add(new Day(14, 7, 2004), time(21, 12));
		series.add(new Day(15, 7, 2004), time(21, 11));
		series.add(new Day(16, 7, 2004), time(21, 10));
		series.add(new Day(17, 7, 2004), time(21, 9));
		series.add(new Day(18, 7, 2004), time(21, 8));
		series.add(new Day(19, 7, 2004), time(21, 7));
		series.add(new Day(20, 7, 2004), time(21, 5));
		series.add(new Day(21, 7, 2004), time(21, 4));
		series.add(new Day(22, 7, 2004), time(21, 3));
		series.add(new Day(23, 7, 2004), time(21, 2));
		series.add(new Day(24, 7, 2004), time(21, 0));
		series.add(new Day(25, 7, 2004), time(20, 59));
		series.add(new Day(26, 7, 2004), time(20, 58));
		series.add(new Day(27, 7, 2004), time(20, 56));
		series.add(new Day(28, 7, 2004), time(20, 55));
		series.add(new Day(29, 7, 2004), time(20, 53));
		series.add(new Day(30, 7, 2004), time(20, 52));
		series.add(new Day(31, 7, 2004), time(20, 50));

		series.add(new Day(1, 8, 2004), time(20, 48));
		series.add(new Day(2, 8, 2004), time(20, 47));
		series.add(new Day(3, 8, 2004), time(20, 45));
		series.add(new Day(4, 8, 2004), time(20, 43));
		series.add(new Day(5, 8, 2004), time(20, 42));
		series.add(new Day(6, 8, 2004), time(20, 40));
		series.add(new Day(7, 8, 2004), time(20, 38));
		series.add(new Day(8, 8, 2004), time(20, 36));
		series.add(new Day(9, 8, 2004), time(20, 34));
		series.add(new Day(10, 8, 2004), time(20, 33));
		series.add(new Day(11, 8, 2004), time(20, 31));
		series.add(new Day(12, 8, 2004), time(20, 29));
		series.add(new Day(13, 8, 2004), time(20, 27));
		series.add(new Day(14, 8, 2004), time(20, 25));
		series.add(new Day(15, 8, 2004), time(20, 23));
		series.add(new Day(16, 8, 2004), time(20, 21));
		series.add(new Day(17, 8, 2004), time(20, 19));
		series.add(new Day(18, 8, 2004), time(20, 17));
		series.add(new Day(19, 8, 2004), time(20, 15));
		series.add(new Day(20, 8, 2004), time(20, 13));
		series.add(new Day(21, 8, 2004), time(20, 11));
		series.add(new Day(22, 8, 2004), time(20, 9));
		series.add(new Day(23, 8, 2004), time(20, 7));
		series.add(new Day(24, 8, 2004), time(20, 4));
		series.add(new Day(25, 8, 2004), time(20, 2));
		series.add(new Day(26, 8, 2004), time(20, 0));
		series.add(new Day(27, 8, 2004), time(19, 58));
		series.add(new Day(28, 8, 2004), time(19, 56));
		series.add(new Day(29, 8, 2004), time(19, 54));
		series.add(new Day(30, 8, 2004), time(19, 51));
		series.add(new Day(31, 8, 2004), time(19, 49));

		series.add(new Day(1, 9, 2004), time(19, 47));
		series.add(new Day(2, 9, 2004), time(19, 45));
		series.add(new Day(3, 9, 2004), time(19, 42));
		series.add(new Day(4, 9, 2004), time(19, 40));
		series.add(new Day(5, 9, 2004), time(19, 38));
		series.add(new Day(6, 9, 2004), time(19, 36));
		series.add(new Day(7, 9, 2004), time(19, 33));
		series.add(new Day(8, 9, 2004), time(19, 31));
		series.add(new Day(9, 9, 2004), time(19, 29));
		series.add(new Day(10, 9, 2004), time(19, 27));
		series.add(new Day(11, 9, 2004), time(19, 24));
		series.add(new Day(12, 9, 2004), time(19, 22));
		series.add(new Day(13, 9, 2004), time(19, 20));
		series.add(new Day(14, 9, 2004), time(19, 17));
		series.add(new Day(15, 9, 2004), time(19, 15));
		series.add(new Day(16, 9, 2004), time(19, 13));
		series.add(new Day(17, 9, 2004), time(19, 11));
		series.add(new Day(18, 9, 2004), time(19, 8));
		series.add(new Day(19, 9, 2004), time(19, 6));
		series.add(new Day(20, 9, 2004), time(19, 4));
		series.add(new Day(21, 9, 2004), time(19, 1));
		series.add(new Day(22, 9, 2004), time(18, 59));
		series.add(new Day(23, 9, 2004), time(18, 57));
		series.add(new Day(24, 9, 2004), time(18, 54));
		series.add(new Day(25, 9, 2004), time(18, 52));
		series.add(new Day(26, 9, 2004), time(18, 50));
		series.add(new Day(27, 9, 2004), time(18, 47));
		series.add(new Day(28, 9, 2004), time(18, 45));
		series.add(new Day(29, 9, 2004), time(18, 43));
		series.add(new Day(30, 9, 2004), time(18, 41));

		series.add(new Day(1, 10, 2004), time(18, 38));
		series.add(new Day(2, 10, 2004), time(18, 36));
		series.add(new Day(3, 10, 2004), time(18, 34));
		series.add(new Day(4, 10, 2004), time(18, 31));
		series.add(new Day(5, 10, 2004), time(18, 29));
		series.add(new Day(6, 10, 2004), time(18, 27));
		series.add(new Day(7, 10, 2004), time(18, 25));
		series.add(new Day(8, 10, 2004), time(18, 22));
		series.add(new Day(9, 10, 2004), time(18, 20));
		series.add(new Day(10, 10, 2004), time(18, 18));
		series.add(new Day(11, 10, 2004), time(18, 16));
		series.add(new Day(12, 10, 2004), time(18, 14));
		series.add(new Day(13, 10, 2004), time(18, 11));
		series.add(new Day(14, 10, 2004), time(18, 9));
		series.add(new Day(15, 10, 2004), time(18, 7));
		series.add(new Day(16, 10, 2004), time(18, 5));
		series.add(new Day(17, 10, 2004), time(18, 3));
		series.add(new Day(18, 10, 2004), time(18, 1));
		series.add(new Day(19, 10, 2004), time(17, 59));
		series.add(new Day(20, 10, 2004), time(17, 57));
		series.add(new Day(21, 10, 2004), time(17, 55));
		series.add(new Day(22, 10, 2004), time(17, 53));
		series.add(new Day(23, 10, 2004), time(17, 50));
		series.add(new Day(24, 10, 2004), time(17, 48));
		series.add(new Day(25, 10, 2004), time(17, 46));
		series.add(new Day(26, 10, 2004), time(17, 45));
		series.add(new Day(27, 10, 2004), time(17, 43));
		series.add(new Day(28, 10, 2004), time(17, 41));
		series.add(new Day(29, 10, 2004), time(17, 39));
		series.add(new Day(30, 10, 2004), time(17, 37));
		series.add(new Day(31, 10, 2004), time(16, 35));

		series.add(new Day(1, 11, 2004), time(16, 33));
		series.add(new Day(2, 11, 2004), time(16, 31));
		series.add(new Day(3, 11, 2004), time(16, 30));
		series.add(new Day(4, 11, 2004), time(16, 28));
		series.add(new Day(5, 11, 2004), time(16, 26));
		series.add(new Day(6, 11, 2004), time(16, 24));
		series.add(new Day(7, 11, 2004), time(16, 23));
		series.add(new Day(8, 11, 2004), time(16, 21));
		series.add(new Day(9, 11, 2004), time(16, 20));
		series.add(new Day(10, 11, 2004), time(16, 18));
		series.add(new Day(11, 11, 2004), time(16, 16));
		series.add(new Day(12, 11, 2004), time(16, 15));
		series.add(new Day(13, 11, 2004), time(16, 13));
		series.add(new Day(14, 11, 2004), time(16, 12));
		series.add(new Day(15, 11, 2004), time(16, 11));
		series.add(new Day(16, 11, 2004), time(16, 9));
		series.add(new Day(17, 11, 2004), time(16, 8));
		series.add(new Day(18, 11, 2004), time(16, 7));
		series.add(new Day(19, 11, 2004), time(16, 5));
		series.add(new Day(20, 11, 2004), time(16, 4));
		series.add(new Day(21, 11, 2004), time(16, 3));
		series.add(new Day(22, 11, 2004), time(16, 2));
		series.add(new Day(23, 11, 2004), time(16, 1));
		series.add(new Day(24, 11, 2004), time(16, 0));
		series.add(new Day(25, 11, 2004), time(15, 59));
		series.add(new Day(26, 11, 2004), time(15, 58));
		series.add(new Day(27, 11, 2004), time(15, 57));
		series.add(new Day(28, 11, 2004), time(15, 56));
		series.add(new Day(29, 11, 2004), time(15, 56));
		series.add(new Day(30, 11, 2004), time(15, 55));

		series.add(new Day(1, 12, 2004), time(15, 54));
		series.add(new Day(2, 12, 2004), time(15, 54));
		series.add(new Day(3, 12, 2004), time(15, 53));
		series.add(new Day(4, 12, 2004), time(15, 53));
		series.add(new Day(5, 12, 2004), time(15, 52));
		series.add(new Day(6, 12, 2004), time(15, 52));
		series.add(new Day(7, 12, 2004), time(15, 51));
		series.add(new Day(8, 12, 2004), time(15, 51));
		series.add(new Day(9, 12, 2004), time(15, 51));
		series.add(new Day(10, 12, 2004), time(15, 51));
		series.add(new Day(11, 12, 2004), time(15, 50));
		series.add(new Day(12, 12, 2004), time(15, 50));
		series.add(new Day(13, 12, 2004), time(15, 50));
		series.add(new Day(14, 12, 2004), time(15, 50));
		series.add(new Day(15, 12, 2004), time(15, 51));
		series.add(new Day(16, 12, 2004), time(15, 51));
		series.add(new Day(17, 12, 2004), time(15, 51));
		series.add(new Day(18, 12, 2004), time(15, 51));
		series.add(new Day(19, 12, 2004), time(15, 51));
		series.add(new Day(20, 12, 2004), time(15, 52));
		series.add(new Day(21, 12, 2004), time(15, 52));
		series.add(new Day(22, 12, 2004), time(15, 53));
		series.add(new Day(23, 12, 2004), time(15, 53));
		series.add(new Day(24, 12, 2004), time(15, 54));
		series.add(new Day(25, 12, 2004), time(15, 55));
		series.add(new Day(26, 12, 2004), time(15, 55));
		series.add(new Day(27, 12, 2004), time(15, 56));
		series.add(new Day(28, 12, 2004), time(15, 57));
		series.add(new Day(29, 12, 2004), time(15, 58));
		series.add(new Day(30, 12, 2004), time(15, 59));
		series.add(new Day(31, 12, 2004), time(16, 0));

		return series;

	}

	private JFreeChart createBoxChart(final XYZDataset dataset) {
		final JFreeChart chart = ChartFactory.createBubbleChart(
		            "Graf intervala", "X", "Y",  dataset, 
		            PlotOrientation.VERTICAL, 
		            true,
		            true, false);

		chart.setBackgroundPaint(new GradientPaint(0, 0, Color.white, 0, 1000, Color.blue));

		final XYPlot plot = chart.getXYPlot();
		plot.setForegroundAlpha(0.5f);
		
		final XYBoxRenderer renderer = new XYBoxRenderer();
//				Color.green, Color.red, true);
//				Color.blue, Color.blue, false);
		renderer.setStroke(new BasicStroke(2.0f));
		renderer.setSeriesPaint(0, Color.yellow);
	//	renderer.setSeriesPaint(1, Color.blue);
		plot.setRenderer(renderer);

		final NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
		domainAxis.setLowerBound(0);
		domainAxis.setUpperBound(800);
    
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();

		// rangeAxis.setInverted(true);  // uncoment to reproduce a bug in jFreeChart
		rangeAxis.setLowerBound(0);
		rangeAxis.setUpperBound(12360);

		return chart;
	}
	

	private JFreeChart createBoxChart2(final XYZDataset dataset, String title, String xTitle, String yTitle) {
		final JFreeChart chart = ChartFactory.createBubbleChart(
		            title, xTitle, yTitle, dataset, 
		            PlotOrientation.VERTICAL, 
		            true,
		            true, false);

		chart.setBackgroundPaint(new GradientPaint(0, 0, Color.white, 0, 1000, Color.blue));

		final XYPlot plot = chart.getXYPlot();
		plot.setForegroundAlpha(0.5f);
		
		final XYBoxRenderer renderer = new XYBoxRenderer();
//				Color.green, Color.red, true);
//				Color.blue, Color.blue, false);
		renderer.setStroke(new BasicStroke(2.0f));
		renderer.setSeriesPaint(0, Color.green);
	//	renderer.setSeriesPaint(1, Color.blue);
		plot.setRenderer(renderer);

		final NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
//		domainAxis.setLowerBound(0);
//		domainAxis.setUpperBound(800);
    
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();

		// rangeAxis.setInverted(true);  // uncoment to reproduce a bug in jFreeChart
//		rangeAxis.setLowerBound(0);
//		rangeAxis.setUpperBound(12360);

		return chart;
	}
	
	
	/**
	 * Creates a chart.
	 * 
	 * @param dataset
	 *            the dataset.
	 * 
	 * @return The chart.
	 */
	private JFreeChart createDiffChart(final XYDataset dataset, String title, String titleX, String titleY) {
		final JFreeChart chart = ChartFactory.createXYAreaChart(
				title, titleX, titleY, dataset, 
				PlotOrientation.VERTICAL,
				true, // legend
				true, // tool tips
				true // URLs
				);
//		chart.setBackgroundPaint(Color.white);
		chart.setBackgroundPaint(new GradientPaint(0, 0, Color.white, 0, 1000, Color.blue));
		
		final XYDifferenceRenderer renderer = new XYDifferenceRenderer(
				Color.green, Color.red, true);
//				Color.blue, Color.blue, false);
		renderer.setStroke(new BasicStroke(2.0f));
		renderer.setSeriesPaint(0, Color.yellow);
		renderer.setSeriesPaint(1, Color.blue);
		final XYPlot plot = chart.getXYPlot();
		plot.setRenderer(renderer);
		plot.setBackgroundPaint(Color.lightGray);
		plot.setDomainGridlinePaint(Color.white);
		plot.setRangeGridlinePaint(Color.white);
		// plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));

//		final DateAxis domainAxis = new DateAxis("Time");
//		domainAxis.setTickMarkPosition(DateTickMarkPosition.MIDDLE);
//		domainAxis.setLowerMargin(0.0);
//		domainAxis.setUpperMargin(0.0);
//		plot.setDomainAxis(domainAxis);
//		plot.setForegroundAlpha(0.5f);

//		final Color c = new Color(255, 60, 24, 63);
//		final Marker bst = new IntervalMarker(new Day(28, 3, 2004)
//				.getFirstMillisecond(), new Day(30, 10, 2004)
//				.getFirstMillisecond(), c, new BasicStroke(2.0f), null, null,
//				1.0f);
//		bst.setLabel("British Summer Time");
//		bst.setLabelAnchor(RectangleAnchor.BOTTOM_RIGHT);
//		bst.setLabelFont(new Font("SansSerif", Font.ITALIC + Font.BOLD, 10));
//		bst.setLabelTextAnchor(TextAnchor.BASELINE_RIGHT);
//		plot.addDomainMarker(bst, Layer.BACKGROUND);

//		final DateAxis rangeAxis = new DateAxis("Time");
//		rangeAxis.setLowerMargin(0.15);
//		rangeAxis.setUpperMargin(0.15);
//		plot.setRangeAxis(rangeAxis);
		return chart;
	}

	/**
	 * Creates the Dataset for the Pie chart
	 */
	private PieDataset createPieDataset() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("One", new Double(43.2));
		dataset.setValue("Two", new Double(10.0));
		dataset.setValue("Three", new Double(27.5));
		dataset.setValue("Four", new Double(17.5));
		dataset.setValue("Five", new Double(11.0));
		dataset.setValue("Six", new Double(19.4));
		return dataset;
	}

	/**
	 * Creates the Chart based on a dataset
	 */
	private JFreeChart createPieChart(PieDataset dataset) {

		JFreeChart chart = ChartFactory.createPieChart("Pie Chart Demo 1", // chart
				// title
				dataset, // data
				true, // include legend
				true, false);

		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setSectionOutlinesVisible(false);
		plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
		plot.setNoDataMessage("No data available");
		plot.setCircular(false);
		plot.setLabelGap(0.02);
		return chart;

	}

	/**
	 * Returns a sample dataset.
	 * 
	 * @return The dataset.
	 */
	private static CategoryDataset createBarDataset() {

		// row keys...
		String series1 = "First";
		String series2 = "Second";
		String series3 = "Third";

		// column keys...
		String category1 = "Category 1";
		String category2 = "Category 2";
		String category3 = "Category 3";
		String category4 = "Category 4";
		String category5 = "Category 5";

		// create the dataset...
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		dataset.addValue(1.0, series1, category1);
		dataset.addValue(4.0, series1, category2);
		dataset.addValue(3.0, series1, category3);
		dataset.addValue(5.0, series1, category4);
		dataset.addValue(5.0, series1, category5);

		dataset.addValue(5.0, series2, category1);
		dataset.addValue(7.0, series2, category2);
		dataset.addValue(6.0, series2, category3);
		dataset.addValue(8.0, series2, category4);
		dataset.addValue(4.0, series2, category5);

		dataset.addValue(4.0, series3, category1);
		dataset.addValue(3.0, series3, category2);
		dataset.addValue(2.0, series3, category3);
		dataset.addValue(3.0, series3, category4);
		dataset.addValue(6.0, series3, category5);

		return dataset;

	}

	/**
	 * Creates a sample chart.
	 * 
	 * @param dataset
	 *            the dataset.
	 * 
	 * @return The chart.
	 */
	private static JFreeChart createBarChart(CategoryDataset dataset) {

		// create the chart...
		JFreeChart chart = ChartFactory.createBarChart("Bar Chart Demo 1", // chart
																			// title
				"Category", // domain axis label
				"Value", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend
				true, // tooltips?
				false // URLs?
				);

		// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

		// set the background color for the chart...
		chart.setBackgroundPaint(Color.white);

		// get a reference to the plot for further customisation...
		CategoryPlot plot = (CategoryPlot) chart.getPlot();
		plot.setBackgroundPaint(Color.lightGray);
		plot.setDomainGridlinePaint(Color.white);
		plot.setDomainGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.white);

		// ******************************************************************
		// More than 150 demo applications are included with the JFreeChart
		// Developer Guide...for more information, see:
		//
		// > http://www.object-refinery.com/jfreechart/guide.html
		//
		// ******************************************************************

		// set the range axis to display integers only...
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

		// disable bar outlines...
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setDrawBarOutline(false);

		// set up gradient paints for series...
		GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.blue, 0.0f,
				0.0f, new Color(0, 0, 64));
		GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.green, 0.0f,
				0.0f, new Color(0, 64, 0));
		GradientPaint gp2 = new GradientPaint(0.0f, 0.0f, Color.red, 0.0f,
				0.0f, new Color(64, 0, 0));
		renderer.setSeriesPaint(0, gp0);
		renderer.setSeriesPaint(1, gp1);
		renderer.setSeriesPaint(2, gp2);

		CategoryAxis domainAxis = plot.getDomainAxis();
		domainAxis.setCategoryLabelPositions(CategoryLabelPositions
				.createUpRotationLabelPositions(Math.PI / 6.0));
		// OPTIONAL CUSTOMISATION COMPLETED.

		return chart;

	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				TraceDisplayView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(showChart);
		manager.add(new Separator());
		manager.add(setDifferenceRenderer);
		manager.add(setBoxRenderer);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(showChart);
		manager.add(setDifferenceRenderer);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(showChart);
		manager.add(new Separator());
		manager.add(setDifferenceRenderer);
		manager.add(setBoxRenderer);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		showChart = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				if(selection instanceof IStructuredSelection) {
					IStructuredSelection sel = (IStructuredSelection) selection;
					
					ArrayList<Variable> vars = new ArrayList<Variable>();
					for(Iterator it = sel.iterator(); it.hasNext(); ) {
						Object obj = it.next();
						if(obj instanceof Variable) {
							vars.add((Variable) obj);
						}
						if(obj instanceof SimulatorDataStoreNavigatorItem) {
							EObject eobj = ((SimulatorDataStoreNavigatorItem) obj).getEObject();
							if(eobj instanceof Variable) {
								vars.add((Variable) eobj);
							}
						}
					}
					displayIntervalChartForVariables(vars);
				}
			}
		};
		showChart.setText("Show Chart");
		showChart.setToolTipText("Displays the selected data in a chart");
		showChart.setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(SimulatorUIImages.IMG_CHART_INTERVAL));

		setDifferenceRenderer = new Action() {
			public void run() {
				JFreeChart chart = chartArea.getChart();
				final XYDifferenceRenderer renderer = new XYDifferenceRenderer(); //Color.green, Color.red, true);
				final XYPlot plot = chart.getXYPlot();
				plot.setRenderer(renderer);
				chartArea.forceRedraw();
			}
		};
		setDifferenceRenderer.setText("Difference Renderer");
		setDifferenceRenderer.setToolTipText("Render chart data using a difference renderer");
		setDifferenceRenderer.setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(SimulatorUIImages.IMG_RENDER_DIFFERENCE));
		
		setBoxRenderer = new Action() {
			public void run() {
				JFreeChart chart = chartArea.getChart();
				final XYBoxRenderer renderer = new XYBoxRenderer();
				final XYPlot plot = chart.getXYPlot();
				plot.setRenderer(renderer);
				chartArea.forceRedraw();
			}
		};
		setBoxRenderer.setText("Box renderer");
		setBoxRenderer.setToolTipText("Render chart data using a box renderer");
		setBoxRenderer.setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(SimulatorUIImages.IMG_RENDER_BOX));
		
		doubleClickAction = showChart;
//		doubleClickAction = new Action() {
//			public void run() {
//				ISelection selection = viewer.getSelection();
//				Object obj = ((IStructuredSelection) selection).getFirstElement();
//				
//				if(obj instanceof Variable) {
//					displayChartForVariable((Variable) obj);
//				}
//			}
//		};
	}

	protected void displayIntervalChartForVariables(ArrayList<Variable> vars) {
		StringBuilder title = new StringBuilder();
		
		for(Iterator<Variable> it = vars.iterator(); it.hasNext();) {
			title.append(it.next().getName());
			if(it.hasNext()) {
				title.append(", ");
			}
		}
		
		JFreeChart chart = createDiffChart(createDiffDataset(vars),
								title.toString(),
								"clock ticks",
								"units");
		
		// Display chart
		chartArea.setChart(chart);
		chartArea.forceRedraw();	
	}

	private XYDataset createDiffDataset(ArrayList<Variable> vars) {
		final DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();

		for(Variable var : vars) {
			double[][] series = new double[6][var.getValues().size()];
			
			// Podaci
			int ix = 0;
			for(Value val : var.getValues()) {
				series[0][ix] = val.getClockMin();
				series[1][ix] = val.getClockMin();
				series[2][ix] = val.getClockMin();
				series[3][ix] = val.getValueMin();
				series[4][ix] = val.getValueMin();
				series[5][ix] = val.getValueMin();
				++ix;
			}
	
			dataset.addSeries("min("+var.getName()+")", series);
			
			// Podaci
			series = new double[6][var.getValues().size()];
			ix = 0;
			for(Value val : var.getValues()) {
				series[0][ix] = val.getClockMax();
				series[1][ix] = val.getClockMax();
				series[2][ix] = val.getClockMax();
				series[3][ix] = val.getValueMax();
				series[4][ix] = val.getValueMax();
				series[5][ix] = val.getValueMax();
				++ix;
			}
			
			dataset.addSeries("max("+var.getName()+")", series);
		}
		
		return dataset;
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Sample View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	protected void displayChartForVariable(Variable var) {
		// Create chart
//		JFreeChart chart = createBoxChart2(createBoxDataset(var), var.getName(), "clock ticks", "units");
		JFreeChart chart = createDiffChart(createDiffDataset(var), var.getName(), "clock ticks", "units");
		
		// Display chart
		chartArea.setChart(chart);
		chartArea.forceRedraw();
	}

	public class TreeParent {
		SimulatorRun children;
		
		public TreeParent(SimulatorRun children) {
			this.children = children;
		}

		public void setChildren(SimulatorRun children) {
			this.children = children;
		}
		
		public SimulatorRun[] getChildren() {
			return new SimulatorRun[] { children };
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		if(this.session != null)
			this.session.close();
		super.dispose();
	}
}