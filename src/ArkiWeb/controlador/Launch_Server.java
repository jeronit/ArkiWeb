/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import java.io.File;
import java.io.IOException;

import ArkiWeb.util.Util;
import ArkiWeb.util.impl.UtilImpl;

/**
 * @author JTE
 *
 */
public class Launch_Server {

	Util util;
	
	/**
	 * 
	 */
	public Launch_Server(String fileName) {
		
		util = new UtilImpl();
		launchWithCmd(fileName);
	}
	
	/**
	 * Launch with cmd.
	 *
	 * @param fileName the file name
	 */
	public void launchWithCmd(String fileName) {		
		
		try {
			Runtime.getRuntime().exec("cmd.exe /c start C:\\Users\\JTE\\eclipse-workspace\\ArkiWeb\\hsqldb\\bin\\run_hsqldb_BORRAR.bat");
//			Runtime.getRuntime().exec("cmd.exe /c start " + util.returnRootPath() + "\\hsqldb\\bin\\" + fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
