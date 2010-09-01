/**
 * 
 */
package hr.fer.rasip.remes.launcher.actions;

import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.launcher.Activator;
import hr.fer.rasip.remes.simulator.remes2java.files.GenerateModes;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.util.RemesResourceFactoryImpl;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class Remes2JavaJob extends Job {

	private IFile file;
	
	public Remes2JavaJob(String name, IFile file) {
		super(name);
		this.file = file;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			// Registriraj package
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("remes", new RemesResourceFactoryImpl());
			RemesPackage.eINSTANCE.eClass();
			AstPackage.eINSTANCE.eClass();
		} catch(Throwable t) {
			IStatus status = new Status(Status.ERROR, Activator.PLUGIN_ID, t.getMessage(), t);
			Activator.getDefault().getLog().log(status);
		}
		
		try 
		{
			URI modelURI =  URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			IContainer target = file.getProject().getFolder("src-gen");
			
	        GenerateModes generator = new GenerateModes(modelURI, target.getLocation().toFile(), new ArrayList());
	        generator.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1000));
		}
		catch (Throwable t) {
			IStatus status = new Status(Status.ERROR, Activator.PLUGIN_ID, t.getMessage(), t);
			Activator.getDefault().getLog().log(status);
		}
		finally
		{
			try {
				file.getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
		
		return Status.OK_STATUS; 
	} 

}
