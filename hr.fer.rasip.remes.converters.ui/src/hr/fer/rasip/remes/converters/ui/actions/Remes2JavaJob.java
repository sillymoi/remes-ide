/**
 * 
 */
package hr.fer.rasip.remes.converters.ui.actions;

import hr.fer.rasip.remes.converters.Remes2JavaConverter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class Remes2JavaJob extends Job {

	/** Behavior model file. */
	private IFile modelFile;

	/** Package name for generated code. */
	private String packageName;
	
	/** Target folder. */
	private IFolder targetFolder;
	
	/** Main type for the generated code. */
	private String mainType;
	
	public Remes2JavaJob(String name, IFile model, IFolder target, String mainType, String packageName) {
		super(name);
		this.modelFile = model;
		this.targetFolder = target;
		this.mainType = mainType;
		this.packageName = packageName;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// Do not set profile
		return Remes2JavaConverter.remes2java(monitor, modelFile, null, targetFolder, mainType, packageName, ""); 
	} 

}
