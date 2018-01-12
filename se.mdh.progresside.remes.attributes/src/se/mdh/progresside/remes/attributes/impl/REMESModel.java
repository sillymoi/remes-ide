package se.mdh.progresside.remes.attributes.impl;

import se.mdh.progresside.components.ComponentsPlugin;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.core.IModel;
import se.mdh.progresside.components.core.IProComElement;
import se.mdh.progresside.components.core.IProComModelManager;
import se.mdh.progresside.components.internal.core.Model;
import se.mdh.progresside.remes.attributes.REMESCst;
import se.mdh.progresside.remes.attributes.IREMESModel;

public class REMESModel extends Model implements IREMESModel {

	/**
     * Returns value range constraints model for specific component.
     * @param c Component
     * @return value range constraints model
     */
	public static IREMESModel getForComponent(IComponent c){
		IREMESModel remesModel = null;
		for (IModel model : c.getModels()) {
			if (model instanceof IREMESModel) {
				remesModel = (IREMESModel) model;
			}
		}
		if (remesModel == null) {
			try {
				remesModel = new REMESModel(c);
			} catch (IllegalArgumentException e) {
				// do nothing
				remesModel = null;
			}
		}
		return remesModel;
	}
	
	public REMESModel(IComponent component) {    
        IProComModelManager modelManager = ComponentsPlugin.getDefault().getProComModelManager();
        this.resource = modelManager.getModelsFolder(component).getFolder(REMESCst.REMES_MODEL_SUBFOLDER_NAME).getFile(REMESCst.REMES_FILE);
        if (!resource.exists())
        	throw new IllegalArgumentException("REMES model does not exist.");
        component.getModels().add(this);
        this.parent = component;
        this.name = this.resource.getName();
    }

    public int getType() {
        return IProComElement.TYPE_MODEL;
    }
}
