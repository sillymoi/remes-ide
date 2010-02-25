/**
 * 
 */
package se.mdh.progresside.behaviours.internal.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import se.mdh.progresside.behaviours.core.IBehaviourModel;
import se.mdh.progresside.components.ComponentsPlugin;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.core.IModel;
import se.mdh.progresside.components.core.IProComElement;
import se.mdh.progresside.components.core.IProComModelManager;
import se.mdh.progresside.components.internal.core.Model;

/**
 * Default implementation of the IBehaviourModel interface.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class BehaviourModel extends Model implements IBehaviourModel {

    /**
     * Returns architectural model for specific component. It the component doesn't have a model it creates a new one.
     * @param c Component
     * @return architectural model
     */
	public static IBehaviourModel getForComponent(IComponent c){
		IBehaviourModel behModel = null;
		for (IModel model : c.getModels()) {
			if (model instanceof IBehaviourModel) {
				behModel = (IBehaviourModel) model;
			}
		}
		if (behModel == null) {
			behModel = new BehaviourModel(c);
		}
		return behModel;
	}
	
	/**
     * Creates a default resource for an architectural model for a component.
     * 
     * @param component
     */
	public BehaviourModel(IComponent component) {        
        IProComModelManager modelManager = ComponentsPlugin.getDefault().getProComModelManager();
/*        if (component.getComponentType() == ComponentType.PROSAVE) {
            this.resource = modelManager.getModelsFolder(component).getFile("component.prosave");
        }
        if (component.getComponentType() == ComponentType.PROSYS) {
            this.resource = modelManager.getModelsFolder(component).getFile("component.prosys");
        }
*/
        this.resource = modelManager.getModelsFolder(component).getFile("component.remes"); // TODO: handle at service level
        component.getModels().add(this);
        
        this.parent = component;
        this.name = this.resource.getName();
    }

    public BehaviourModel(IProComElement parent, IResource resource) {
        super(parent, resource);
    }

    public boolean createResource() {
        try {
            ((IFile) this.resource).create(null, true, null);
            return true;
        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public int getType() {
        return IProComElement.TYPE_MODEL;
    }

}
