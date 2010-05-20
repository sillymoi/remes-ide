package hr.fer.rasip.uppaallite.transform.ui;

import hr.fer.rasip.uppaallite.transform.UppaalConverter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewUppaalliteFileFromUflatCreationWizard extends Wizard{
	
	private WizardNewFileCreationPage myFileCreationPage;
	
	private IFile mySourceFile;
	
	public NewUppaalliteFileFromUflatCreationWizard(IFile sourceFile){
		assert sourceFile != null : "Source file must be specified"; //$NON-NLS-1$
		
		myFileCreationPage = new WizardNewFileCreationPage("Uppaal to Uppaallite transformation Wizard", StructuredSelection.EMPTY);
		myFileCreationPage.setTitle("Uppaallite File");
		myFileCreationPage.setDescription("Create new Uppaallite file based on Uppaal model");
		
		IPath filePath;
		String fileName = sourceFile.getFullPath().removeFileExtension().lastSegment();
			filePath = sourceFile.getFullPath().removeLastSegments(1);
			
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(getUniqueFileName(filePath, fileName, "uppaallite")); //$NON-NLS-1$

		mySourceFile = sourceFile;
	}
	

	public void addPages() {
		addPage(myFileCreationPage);
	}
	
	public static String getUniqueFileName(IPath containerFullPath,
			String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new Path(""); //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default"; //$NON-NLS-1$
		}
		IPath filePath = containerFullPath.append(fileName);
		if (extension != null && !extension.equals(filePath.getFileExtension())) {
			filePath = filePath.addFileExtension(extension);
		}
		extension = filePath.getFileExtension();
		fileName = filePath.removeFileExtension().lastSegment();
		int i = 1;
		while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
			i++;
			filePath = containerFullPath.append(fileName + i);
			if (extension != null) {
				filePath = filePath.addFileExtension(extension);
			}
		}
		return filePath.lastSegment();
	}

	@Override
	public boolean performFinish() {
		IFile targetFile = myFileCreationPage.createNewFile();
		
		try {
			UppaalConverter.transformFlatToLite(mySourceFile, targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
