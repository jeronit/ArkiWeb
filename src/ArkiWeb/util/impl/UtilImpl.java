/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.util.impl;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

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
		
//		String rootPath = System.getProperty("user.dir");
		String rootPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		System.out.println(rootPath);   // <-- Parent of parent directory
		Path path = null;
		try {
			path = Paths.get(this.getClass().getResource(".").toURI());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(path);   // <-- Parent of parent directory
		System.out.println(path.getParent());               // <-- Parent directory
		System.out.println(path.getParent().getParent());   // <-- Parent of parent directory
		System.out.println(path.getParent().getParent().getParent().getParent().getParent()); 
		rootPath = path.getParent().getParent().getParent().getParent().getParent().toString();
		
		System.out.println(new File(".").getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
		
		
		System.out.println(path.getRoot());
		
		URL url = getClass().getResource("UtilImpl.class");
		File file2 = new File(url.getPath());
		System.out.println(url.toString());
		
		String filePath = null;
		try {
			filePath = file2.getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(filePath);
		
		setRootPath(rootPath);
		return getRootPath();
		
	}
	
	

}
