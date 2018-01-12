package se.mdh.progresside.remes.attributes.viewers;

import org.eclipse.emf.ecore.resource.Resource;

import se.mdh.progresside.analysis.framework.util.EMFProSaveComp;
import se.mdh.progresside.analysis.framework.util.ProComUtil;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.remes.attributes.impl.ProComToREMESTransformation;

public class RemesProSaveModelViewer extends REMESModelFileViewer {

	@Override
	protected void generateRemesModel(Resource remesModelRes) {
		EMFProSaveComp emfComp = ProComUtil.getProSaveComp(ProComUtil.getComponent((Component) getAttributable()));
		ProComToREMESTransformation.performProSaveGeneration(emfComp.getResource(), emfComp.getComp(), remesModelRes);
	}

}
