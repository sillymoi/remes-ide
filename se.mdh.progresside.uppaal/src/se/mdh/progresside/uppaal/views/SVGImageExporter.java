package se.mdh.progresside.uppaal.views;
 
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
 
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.render.awt.internal.svg.export.GraphicsSVG;

import se.mdh.progresside.uppaal.Activator;
 
/**
 * SVG exporter.
 */
@SuppressWarnings("restriction")
public class SVGImageExporter {
 
    public static void export(IFigure viewer, OutputStream outputStream) {
        /*
         * 1. First get the figure whose visuals we want to save as image. So we
         * would like to save the rooteditpart which actually hosts all the
         * printable layers.
         * 
         * NOTE: ScalableRootEditPart manages layers and is registered
         * graphicalviewer's editpartregistry with the key LayerManager.ID ...
         * well that is because ScalableRootEditPart manages all layers that are
         * hosted on a FigureCanvas. Many layers exist for doing different
         * things
         */
        
        Rectangle bounds = viewer.getBounds();
        GraphicsSVG graphics = GraphicsSVG.getInstance(bounds.getTranslated(bounds.getLocation().negate()));
        graphics.translate(bounds.getLocation().negate());
        viewer.paint(graphics);
        try {
            graphics.getSVGGraphics2D().stream(new BufferedWriter(new OutputStreamWriter(outputStream)));
        } catch (Exception e) {
        	Activator.getDefault().logError("Unable to export figure", e);
        }
    }
}