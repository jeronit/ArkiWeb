/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.ConcreteFactory;
import ArkiWeb.modelo.HSQLDB;
import ArkiWeb.modelo.impl.ConcreteFactoryImpl;
import ArkiWeb.modelo.impl.HSQLDBImpl;

/**
 * @author JTE
 *
 */
public class Borrar {

	public static HSQLDB db;
	public static ConcreteFactory factory;
	
	/**
	 * 
	 */
	public Borrar() {
		db = HSQLDBImpl.getInstance();
		factory = new ConcreteFactoryImpl();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
