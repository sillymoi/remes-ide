/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2004, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * ----------------------
 * BubblyBubblesDemo.java
 * ----------------------
 * (C) Copyright 2003, 2004, by Barak Naveh and Contributors.
 *
 * Original Author:  Barak Naveh;;
 * Contributor(s):   David Gilbert (for Object Refinery Limited);
 *
 * $Id: BubblyBubblesDemo.java,v 1.12 2004/04/26 19:11:53 taqua Exp $
 *
 * Changes
 * -------
 * 10-Jul-2003 : Version 1 contributed by Barak Naveh (DG);
 * 29-Mar-2004 : Elimintated compiler warnings while keeping JFreeChart conventions (BN); 
 *
 */

package hr.fer.rasip.remes.simulator.ui.views;

import java.awt.Color;
import java.awt.GradientPaint;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.AbstractXYDataset;
import org.jfree.data.xy.AbstractXYZDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.IntervalXYZDataset;
import org.jfree.data.xy.MatrixSeries;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.jfree.data.xy.NormalizedMatrixSeries;
import org.jfree.data.xy.XIntervalSeries;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import org.jfree.data.xy.XYZDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A demo that shows how matrix series can be used for charts that follow a
 * constantly changing grid input.
 *
 * @author Barak Naveh
 *
 * @since Jun 25, 2003
 */
public class BubblyBubblesDemo extends ApplicationFrame {

    /** The default size. */    
    private static final int    SIZE  = 10;
    
    /** The default title. */
    private static final String TITLE = "Graf intervala... ";

    /**
     * The normalized matrix series is used here to represent a changing
     * population on a grid.
     */
    
    private double serija[][];

    /**
     * A demonstration application showing a bubble chart using matrix series.
     *
     * @param title the frame title.
     */
    public BubblyBubblesDemo(final String title) {
        super(title);

       serija = new double[4][4];
      
    
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


       MojXYZDataset dataset=new MojXYZDataset();
       dataset.addSeries("Intervali",serija); 
      
        final JFreeChart chart = ChartFactory.createBubbleChart(
            TITLE, "X", "Y",  dataset, 
            PlotOrientation.VERTICAL, 
            true,
            true, false);

        chart.setBackgroundPaint(new GradientPaint(0, 0, Color.white, 0,
                1000, Color.blue));

        final XYPlot plot = chart.getXYPlot();
        plot.setForegroundAlpha(0.5f);

        final NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        domainAxis.setLowerBound(0);
        domainAxis.setUpperBound(300);
        
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();

       // rangeAxis.setInverted(true);  // uncoment to reproduce a bug in jFreeChart
        rangeAxis.setLowerBound(0);
        rangeAxis.setUpperBound(5000);

        final ChartPanel chartPanel = new ChartPanel(chart);
//        chartPanel.setVerticalZoom(true);
  //      chartPanel.setHorizontalZoom(true);
        setContentPane(chartPanel);
    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    public static void main(final String[] args) {
        final BubblyBubblesDemo demo = new BubblyBubblesDemo(TITLE);
        demo.pack();
        demo.setSize(800, 600);
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

        final Thread updater = demo.new UpdaterThread();
        updater.setDaemon(true);
        updater.start();
    }

    
   
    private class UpdaterThread extends Thread {
        /**
         * @see java.lang.Runnable#run()
         */
        public void run() {
            setPriority(MIN_PRIORITY); // be nice

        }
                            
            
      }
  }
    
