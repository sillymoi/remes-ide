package hr.fer.rasip.remes.datastore.framework.impl;

import hr.fer.rasip.remes.datastore.framework.Activator;

import java.io.IOException;
import java.net.ServerSocket;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.QualifiedName;

/**
 * Load and save server connection parameters from a Project
 * 
 * TODO - methods to get JDBC URI
 * 
 * @author Fernando Lozano (www.lozano.eti.br)
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class DataStoreServerParams implements IDataStoreServerParams {
	// File locations
	private static final String DATA_BASE = "/store";
	private static final String DATA_DIR = ".data";

	// Property names
	public static final String P_PORT = "serverPort";
	public static final String P_USER = "serverUser";
	public static final String P_PASSWD = "serverPasswd";
	public static final String P_DATABASE = "serverDatabase";	
	
	private int port = 9001;
	private String user = "sa";
	private String passwd = "";
	private String database = "";
	
	public DataStoreServerParams() {
		
	}
	
	public DataStoreServerParams(IProject project) throws CoreException {
		load(project);
	}
	
	public void save(IProject project) throws CoreException {
		if(project == null)
			return;
		
		project.setPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_PORT), Integer.toString(port));
		project.setPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_USER), user);
		project.setPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_PASSWD), passwd);
		project.setPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_DATABASE), database);
	}
	
	public void load(IProject project) throws CoreException {
		if(project == null)
			return;
		
		String property = project.getPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_PORT));
		port = (property != null && property.length() > 0) ? Integer.parseInt(property) : getFreePort(port);
		
		property = project.getPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_USER));
		user = (property != null && property.length() > 0) ? property : user;
		
		property = project.getPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_PASSWD));
		passwd = (property != null && property.length() > 0) ? property : passwd;
		
		property = project.getPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, P_DATABASE));
		database = (property != null && property.length() > 0) ? property : getDefaultDatabase(project);	
	}
	
	/**
	 * Finds a free port (TCP) for database server.
	 * @param port - base port (unused)
	 * @return free port.
	 */
	private int getFreePort(int port) {
		ServerSocket ss = null;
		port = 0;
		try {
	        ss = new ServerSocket(0);
	        ss.setReuseAddress(true);
	    } catch (IOException e) {
	    	Activator.log(IStatus.ERROR, "Unable to open server socket", e);
	    } finally {
	        if (ss != null) {
	            try {
	            	port = ss.getLocalPort();
	                ss.close();
	            } catch (IOException e) {
	                /* should not be thrown */
	            }
	        }
	    }
	    return port;
	}

	private String getDefaultDatabase(IProject project) {
		return project.getFolder(DATA_DIR).getLocation() + DATA_BASE;
	}
	
	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * @param passwd the passwd to set
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * @return the database
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * @param database the database to set
	 */
	public void setDatabase(String database) {
		this.database = database;
	}

//	/**
//	 * Checks to see if a specific port is available.
//	 *
//	 * @param port the port to check for availability
//	 */
//	public static boolean available(int port) {
//	    if (port < MIN_PORT_NUMBER || port > MAX_PORT_NUMBER) {
//	        throw new IllegalArgumentException("Invalid start port: " + port);
//	    }
//
//	    ServerSocket ss = null;
//	    DatagramSocket ds = null;
//	    try {
//	        ss = new ServerSocket(port);
//	        ss.setReuseAddress(true);
//	        ds = new DatagramSocket(port);
//	        ds.setReuseAddress(true);
//	        return true;
//	    } catch (IOException e) {
//	    } finally {
//	        if (ds != null) {
//	            ds.close();
//	        }
//
//	        if (ss != null) {
//	            try {
//	                ss.close();
//	            } catch (IOException e) {
//	                /* should not be thrown */
//	            }
//	        }
//	    }
//
//	    return false;
//	}


}

