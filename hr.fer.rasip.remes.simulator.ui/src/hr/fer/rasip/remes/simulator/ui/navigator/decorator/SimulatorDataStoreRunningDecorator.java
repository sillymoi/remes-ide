package hr.fer.rasip.remes.simulator.ui.navigator.decorator;

import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;
import org.hibernate.dialect.FirebirdDialect;

/**
 * Decorator for tagging running data stores
 * 
 * @author Fernando Lozano (www.lozano.eti.br)
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class SimulatorDataStoreRunningDecorator extends LabelProvider implements ILightweightLabelDecorator {

	private static final ImageDescriptor runningDescriptor = ImageDescriptor.
			createFromFile (SimulatorDataStoreRunningDecorator.class, "dec-running.gif");
			
    public void decorate(Object element, IDecoration decoration) {
    	if(element instanceof SimulatorDataStore) {
	    	SimulatorDataStore ds = (SimulatorDataStore) element;
			if (ds.isDataStoreServerRunning()) {
				decoration.addOverlay(runningDescriptor);
			}
    	}
    }

	public static void updateDecorators(SimulatorDataStore ds) {    
		IDecoratorManager dm = PlatformUI.getWorkbench().getDecoratorManager();
		SimulatorDataStoreRunningDecorator decorator = (SimulatorDataStoreRunningDecorator)dm.getBaseLabelProvider("hr.fer.rasip.remes.simulator.ui.ServerRunningDecorator");
		if(decorator != null)
			decorator.fireUpdateDecorators(ds);
	}
  
    private void fireUpdateDecorators(SimulatorDataStore ds) {
    	// I can generate my own event to update the decorators for a given resource
    	final LabelProviderChangedEvent ev = new LabelProviderChangedEvent(this, ds); 
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				fireLabelProviderChanged(ev);
			}
		});
    }

	public static void updateDecorators() {
		// I can also let the workbench generate events to update all resources affected by a decorator 
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				PlatformUI.getWorkbench().getDecoratorManager().update("hr.fer.rasip.remes.simulator.ui.ServerRunningDecorator");
			}
		});
	}
}
