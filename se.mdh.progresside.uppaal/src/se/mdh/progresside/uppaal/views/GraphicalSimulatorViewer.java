package se.mdh.progresside.uppaal.views;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

import com.uppaal.model.system.SystemLocation;

public class GraphicalSimulatorViewer extends Figure implements
		Trace.TraceModifiedListener {

	private static final String SOURCE_TARGET_DELIMITER = "-->";
	private Trace trace;

	public GraphicalSimulatorViewer() {
		setLayoutManager(new XYLayout());
		setBackgroundColor(ColorConstants.white);
		setOpaque(true);

	}

	public void setTrace(Trace trace) {
		if (this.trace != null) {
			this.trace.removeListener(this);
		}

		trace.addListener(this);

		this.trace = trace;

		removeAll();
		createContents();		
	}

	private void createContents() {

		Dimension size = getSize();

		int noOfProcesses = trace.getUppaalSystem().getNoOfProcesses();

		int columnWidth = size.width / noOfProcesses;
		final int rowHeight = 30;

		int margin = 5;

		int y = 0;
		int x = margin;

		int processLabelHeight = 25;
		int processTerminalHeight = 20;

		RectangleFigure[] starts = new RectangleFigure[noOfProcesses];

		// draw process starts
		for (int i = 0; i < noOfProcesses; i++) {
			Label lbl = new Label(trace.getUppaalSystem().getProcess(i)
					.getName());
			add(lbl);
			getLayoutManager().setConstraint(
					lbl,
					new Rectangle(x, margin, columnWidth - 2 * margin,
							processLabelHeight - 2 * margin));
			RectangleFigure rect = new RectangleFigure();
			starts[i] = rect;
			rect.setBorder(new LineBorder(1));
			add(rect);
			getLayoutManager().setConstraint(
					rect,
					new Rectangle(x, processLabelHeight + margin, columnWidth
							- 2 * margin, processTerminalHeight - 2 * margin));

			x += columnWidth;
		}

		y = processLabelHeight + processTerminalHeight;

		Label[] lastLabelForProcess = new Label[noOfProcesses];

		for (TraceElement element : trace.getTraceElements()) {

			x = margin;

			for (int i = 0; i < noOfProcesses; i++) {

				Label lbl = new Label();
				add(lbl);

				getLayoutManager().setConstraint(
						lbl,
						new Rectangle(x, y + margin, columnWidth - 2 * margin,
								rowHeight - 2 * margin));

				if (element.involvesProcess(i)) {

					SystemLocation systemLocation = element.getState()
							.getLocationVector()[i];

					String name = systemLocation.getName();
					lbl.setText(name.isEmpty() ? "-" : name);
					lbl.setBackgroundColor(ColorConstants.lightBlue);
					lbl.setOpaque(true);
					lbl.setBorder(new CompoundBorder(new LineBorder(1),
							new MarginBorder(3, 6, 3, 6)));

					if (lastLabelForProcess[i] != null) {
						Label srcLbl = lastLabelForProcess[i];
						if (srcLbl != null) {
							PolylineConnection c = new PolylineConnection();
							ChopboxAnchor sourceAnchor = new ChopboxAnchor(
									srcLbl);
							ChopboxAnchor targetAnchor = new ChopboxAnchor(lbl);
							c.setSourceAnchor(sourceAnchor);
							c.setTargetAnchor(targetAnchor);

							PolylineDecoration decoration = new PolylineDecoration();
							PointList decorationPointList = new PointList();
							decorationPointList.addPoint(-1, 1);
							decorationPointList.addPoint(0, 0);
							decorationPointList.addPoint(-1, -1);
							decoration.setTemplate(decorationPointList);
							c.setTargetDecoration(decoration);

							add(c);
						}
					} else {
						PolylineConnection c = new PolylineConnection();
						ChopboxAnchor sourceAnchor = new ChopboxAnchor(
								starts[i]);
						ChopboxAnchor targetAnchor = new ChopboxAnchor(lbl);
						c.setSourceAnchor(sourceAnchor);
						c.setTargetAnchor(targetAnchor);
						add(c);
					}
					lastLabelForProcess[i] = lbl;
				}
				x += columnWidth;
			}
			y += 2 * rowHeight;

			if (element.getTransition() != null) {
				String edgeDescription = element.getTransition()
						.getEdgeDescription();

				// for some reason the edge description contains new line?!
				edgeDescription = edgeDescription.replaceAll("\n", "");
				
				// we have syncronisation edge
				if (edgeDescription.indexOf(":") > 0 && edgeDescription.indexOf(SOURCE_TARGET_DELIMITER) > 0) {
					addSyncConnection(rowHeight, lastLabelForProcess, edgeDescription);
				}
			}

		}

		// draw process ends
		x = margin;
		for (int i = 0; i < noOfProcesses; i++) {
			RectangleFigure rect = new RectangleFigure();
			rect.setBorder(new LineBorder(1));
			rect.setBackgroundColor(ColorConstants.black);
			rect.setOpaque(true);
			add(rect);
			getLayoutManager().setConstraint(
					rect,
					new Rectangle(x, y + margin, columnWidth - 2 * margin,
							processTerminalHeight - 2 * margin));

			x += columnWidth;

			PolylineConnection c = new PolylineConnection();
			ChopboxAnchor sourceAnchor = new ChopboxAnchor(rect);
			ChopboxAnchor targetAnchor = new ChopboxAnchor(
					lastLabelForProcess[i]);
			c.setSourceAnchor(sourceAnchor);
			c.setTargetAnchor(targetAnchor);
			add(c);
		}
	}

	private void addSyncConnection(final int rowHeight, Label[] lastLabelForProcess,
			String edgeDescription) {
		
		String[] split = edgeDescription.split(":");
		String[] split2 = split[1].split(SOURCE_TARGET_DELIMITER);

		String sync = split[0];
		String src = split2[0].trim();
		String tgt = split2[1].trim();

		String[] targets = null;
		
		// broadcast channel - multiple targets
		if (tgt.indexOf(",") >= 0) {
			// broadcast channel - multiple targets
			targets = tgt.split(",");
		} else {
			targets = new String[1];
			targets[0] = tgt;
		}
		
		int srcProcessIndex = trace.getUppaalSystem()
				.getProcessIndex(src);
		Label srcLabel = lastLabelForProcess[srcProcessIndex];
		final Rectangle srcRect = (Rectangle) getLayoutManager().getConstraint(srcLabel);
		ChopboxAnchor sourceAnchor = new ChopboxAnchor(srcLabel) {
			@Override
			public Point getLocation(Point refPoint) {
				return super.getLocation(refPoint).getTranslated(srcRect.width/2, - srcRect.height/2 - 15);
			}
		};

		for (int i =0; i < targets.length; i++) {
			
			tgt = targets[i].trim();
			int tgtProcessIndex = trace.getUppaalSystem()
					.getProcessIndex(tgt);
	
			Label tgtLabel = lastLabelForProcess[tgtProcessIndex];
	
			PolylineConnection c = new PolylineConnection();
			c.setForegroundColor(ColorConstants.red);
	
			final Rectangle tgtRect = (Rectangle) getLayoutManager()
					.getConstraint(tgtLabel);
	
			ChopboxAnchor targetAnchor = new ChopboxAnchor(tgtLabel) {
				@Override
				public Point getLocation(Point refPoint) {
					return super.getLocation(refPoint).getTranslated(-tgtRect.width/2, - tgtRect.height/2 - 15);
				}
			};
	
			c.setSourceAnchor(sourceAnchor);
			c.setTargetAnchor(targetAnchor);
			c.add(new Label(sync), new MidpointLocator(c, 0) {
				@Override
				protected Point getReferencePoint() {
					return super.getReferencePoint().getTranslated(0, -10);
				}
			});
	
			PolylineDecoration decoration = new PolylineDecoration();
			PointList decorationPointList = new PointList();
			decorationPointList.addPoint(-1, 1);
			decorationPointList.addPoint(0, 0);
			decorationPointList.addPoint(-1, -1);
			decoration.setTemplate(decorationPointList);
			c.setTargetDecoration(decoration);
	
			add(c);
		}
	}

	public Trace getTrace() {
		return trace;
	}

	@Override
	public void traceModified() {
		removeAll();
		createContents();
		
		// scroll to bottom - fix needed, does not work good
		ScrollPane scrollpane = (ScrollPane) getParent().getParent();
		scrollpane.scrollVerticalTo(scrollpane.getSize().height);
	}

}