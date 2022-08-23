/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.util.impl;

import ArkiWeb.util.Util;

// TODO: Auto-generated Javadoc
/**
 * The Class UtilImpl.
 *
 * @author JTE
 */
public class UtilImpl implements Util {

	/** The root path. */
	private String rootPath;
	
	/**
	 * Instantiates a new util impl.
	 */
	public UtilImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the root path.
	 *
	 * @return the root path
	 */
	@Override
	public String getRootPath() {
		return this.rootPath;
	}

	/**
	 * Sets the root path.
	 *
	 * @param rootPath the new root path
	 */
	@Override
	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}

	public String returnRootPath() {
		
		String rootPath = System.getProperty("user.dir");
		setRootPath(rootPath);
		return getRootPath();
		
	}
	
	

}
