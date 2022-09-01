/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import java.sql.ResultSet;

import ArkiWeb.controlador.impl.BBDD_Generar_Datos_DemoImpl;
import ArkiWeb.controlador.impl.BBDD_Generar_TablasImpl;
import ArkiWeb.modelo.ConcreteFactory;
import ArkiWeb.modelo.HSQLDB;
import ArkiWeb.modelo.impl.ConcreteFactoryImpl;
import ArkiWeb.modelo.impl.HSQLDBImpl;
import ArkiWeb.server.impl.Server_ConnectionImpl;

/**
 * @author JTE
 *
 */
public class Arkiweb_Initializer {

	private static Arkiweb_Initializer firstInstance = null;
	private static boolean initialized;
	public static HSQLDB db;
	public static ConcreteFactory factory;
	public Launch_Server launchServer;
	
	/**
	 * 
	 */
	private Arkiweb_Initializer() {
		db = HSQLDBImpl.getInstance();
		factory = new ConcreteFactoryImpl();
		launchServer = new Launch_Server("run_hsqldb.bat");
		this.setInitialized(false);
	}

	/**
	 * SINGLETON: Gets the single instance of HSQLDBImpl.
	 *
	 * @return single instance of HSQLDBImpl
	 */
	public static Arkiweb_Initializer getInstance() {
		if(firstInstance == null) {
			firstInstance = new Arkiweb_Initializer();
		}
		return firstInstance;
	}

	/**
	 * @param args
	 */
	public void init() {
		// Asegurando que la BBDD está vacía
		HSQLDB hsqldb = HSQLDBImpl.getInstance();
		String queryString = "DROP SCHEMA PUBLIC CASCADE";
		Server_ConnectionImpl server_connection = hsqldb.connect2Server(hsqldb.getUrl(), hsqldb.getUser(), hsqldb.getPassword());
		hsqldb.queryEjecutar(server_connection, queryString);
		hsqldb.queryCerrar(server_connection);
		
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
		
		this.setInitialized(true);
	}

	/**
	 * @return the initialized
	 */
	public static boolean isInitialized() {
		return initialized;
	}

	/**
	 * @param initialized the initialized to set
	 */
	public static void setInitialized(boolean initialized) {
		Arkiweb_Initializer.initialized = initialized;
	}

	
}
