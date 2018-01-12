package se.mdh.progresside.remes.attributes.viewers;

import org.eclipse.emf.ecore.resource.Resource;

import se.mdh.progresside.analysis.framework.util.EMFProSysSubsystem;
import se.mdh.progresside.analysis.framework.util.ProComUtil;
import se.mdh.progresside.proComMetamodel.proSys.Subsystem;
import se.mdh.progresside.remes.attributes.impl.ProComToREMESTransformation;

public class RemesProSysModelViewer extends REMESModelFileViewer {

	@Override
	protected void generateRemesModel(Resource remesModelRes) {		
		EMFProSysSubsystem emfSubsystem = ProComUtil.getProSysSubsystem(ProComUtil.getComponent((Subsystem) getAttributable()));
		ProComToREMESTransformation.performProSysGeneration(emfSubsystem.getResource(), emfSubsystem.getSubsystem(), remesModelRes);
	}

}
