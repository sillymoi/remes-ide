package se.mdh.progresside.remes.attributes.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.StringBufferLog;

import se.mdh.progresside.analysis.framework.util.ProComUtil;
import se.mdh.progresside.base.util.FileUtils;
import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.internal.core.ArchModel;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.proComMetamodel.proSys.Subsystem;
import se.mdh.progresside.remes.attributes.REMESCst;

public class ProComToREMESTransformation {

	private static final String PROSAVE_TO_REMES_TRANSFORMATION_URI = "platform:/plugin/se.mdh.progresside.remes.attributes/transforms/mapsProSaveToREMES.qvto";
	private static final String PROSYS_TO_REMES_TRANSFORMATION_URI = "platform:/plugin/se.mdh.progresside.remes.attributes/transforms/mapsProSysToREMES.qvto";
	public static final String ERROR_LOG_FILE_NAME = "error.log";
	
	private static void performGeneration(Resource resource, EObject comp, Resource remesModelRes, String transfURI, IComponent procomComp) {
		
		URI transformationURI = URI.createURI(
				transfURI);

		// create executor for the given transformation
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		
		EList<EObject> inputModels = new BasicEList<EObject>();
		inputModels.add(comp);
		EList<EObject> outputModels = new BasicEList<EObject>();
		outputModels.addAll(remesModelRes.getContents());
		
		// create the input extent with its initial contents
		ModelExtent input = new BasicModelExtent(inputModels);
		ModelExtent output = new BasicModelExtent(outputModels);

		// setup the execution environment details -> 
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);
		StringBufferLog log = new StringBufferLog(); 
		context.setLog(log);

		// run the transformation assigned to the executor with the given 
		ExecutionDiagnostic result = executor.execute(context, input, output);
		
		IArchModel compArchModel = ArchModel.getForComponent(procomComp);
		IPath compFolderPath = compArchModel.getCorrespondingResource().getFullPath().removeLastSegments(1);
		IFolder compFolder = FileUtils.getFolder(compFolderPath);
		IFile errorFile = compFolder.getFolder(REMESCst.REMES_MODEL_SUBFOLDER_NAME).getFile(ERROR_LOG_FILE_NAME);

		// check the result for success
		boolean inError = (result.getSeverity() != Diagnostic.OK);
		if (!inError) {
			// the transformation has been performed successfully !
			// save the new version of the model
			saveResource(remesModelRes);
		}
		
		try {
			FileUtils.createFile(errorFile, "", false);
			FileWriter errorFileWriter = new FileWriter(FileUtils.resourceToFile(errorFile), true);
			PrintWriter out = new PrintWriter(errorFileWriter);
			out.println(new Date());
			if (inError) {
				IStatus status = BasicDiagnostic.toIStatus(result);
				out.println(status.toString().replace("Diagnostic ERROR", "\n"));
			}
			out.println();
			out.println(log.getContents());
			out.close();
			errorFile.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (Exception e) { 
			e.printStackTrace();
		}		
	}
	
	public static void performProSaveGeneration(Resource resource, EObject comp, Resource remesModelRes) {
		IComponent procomComp = ProComUtil.getComponent((Component) comp);
		performGeneration(resource, comp, remesModelRes, PROSAVE_TO_REMES_TRANSFORMATION_URI, procomComp);
	}
	
	public static void performProSysGeneration(Resource resource, EObject subsystem, Resource remesModelRes) {
		IComponent procomComp = ProComUtil.getComponent((Subsystem) subsystem);
		performGeneration(resource, subsystem, remesModelRes, PROSYS_TO_REMES_TRANSFORMATION_URI, procomComp);
	}

	/**
	 * Sets the specified resource as modified and saves it.
	 * @param resource Resource to be marked as dirty and saved.
	 */
	public static void saveResource(Resource resource)
	{
		// Set the modified flag.
		resource.setModified(true);
        
        try {
        	// Save the resource.
        	Map<Object, Object> saveOptions = new HashMap<Object, Object>();
            saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED , Boolean.TRUE);
            resource.save(saveOptions);
	    } catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static DateFormat _dateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");

	public static String getFormatedDate() {
		String dat = _dateFormat.format(new Date());
		return dat;
	}
}
