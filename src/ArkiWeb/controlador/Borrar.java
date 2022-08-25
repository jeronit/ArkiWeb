/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.controlador.impl.BBDD_Generar_Datos_DemoImpl;
import ArkiWeb.controlador.impl.BBDD_Generar_TablasImpl;
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
	public Launch_Server launchServer;
	
	/**
	 * 
	 */
	public Borrar() {
		db = HSQLDBImpl.getInstance();
		factory = new ConcreteFactoryImpl();
		launchServer = new Launch_Server("run_hsqldb.bat");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BBDD_Generar_Tablas generarTablas = new BBDD_Generar_TablasImpl();
		BBDD_Generar_Datos_Demo generarDatos = new BBDD_Generar_Datos_DemoImpl();
		generarTablas.crearTablaCertificado();
		generarTablas.crearTablaCertificados_Asignados();
		generarTablas.crearTablaInmueble();
		generarTablas.crearTablaPermiso();
		generarTablas.crearTablaProyecto();
		generarTablas.crearTablaProyectos_Asignados();
		generarTablas.crearTablaProyectos_En_Ejecucion();
		generarTablas.crearTablaRol();
		generarTablas.crearTablaUsuarios();
		generarTablas.crearTablaVivienda();
		generarDatos.insertarRoles();
		generarDatos.insertarUsuarios();
//		generarDatos.insertarPermisos();
		generarDatos.insertarInmuebles();
		generarDatos.insertarViviendas();
		generarDatos.insertarCertificados();
		generarDatos.insertarProyectos();
		generarDatos.insertarCertificados_Asignados();
		generarDatos.insertarProyectos_Asignados();
		generarDatos.insertarProyectos_Contratados();
	}

}
