/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework.impl;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

/**
 * Interface for DB server params.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public interface IDataStoreServerParams {
	public int getPort();
	public void setPort(int port);
	
	public String getUser();	
	public void setUser(String user);
	
	public String getPasswd();
	public void setPasswd(String passwd);
	
	public String getDatabase();
	public void setDatabase(String database);
	
	public void load(IProject project) throws CoreException;
	public void save(IProject project) throws CoreException;	
}
