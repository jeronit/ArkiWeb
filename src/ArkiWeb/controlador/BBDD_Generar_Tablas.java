/**
 * 	@purpose:	Interface para generar las tablas de la BBDD.
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

/**
 * @author JTE
 *
 */
public interface BBDD_Generar_Tablas {

	/**
	 * Crea Tabla CERTIFICADOS
	 */
	void crearTablaCertificado();
	
	/**
	 * Crea Tabla CERTIFICADOS_ASIGNADOS
	 */
	void crearTablaCertificados_Asignados();
	
	/**
	 * Crea Tabla INMUEBLES
	 */
	void crearTablaInmueble();
	
	/**
	 * Crea Tabla PERMISOS
	 */
	void crearTablaPermiso();
	
	/**
	 * Crea Tabla PROYECTOS
	 */
	void crearTablaProyecto();
	
	/**
	 * Crea Tabla PROYECTOS_ASIGNADOS
	 */
	void crearTablaProyectos_Asignados();
	
	/**
	 * Crea Tabla PROYECTOS_CONTRATADOS
	 */
	void crearTablaProyectos_En_Ejecucion();
	
	/**
	 * Crea Tabla ROL
	 */
	void crearTablaRol();
	
	/**
	 * Crea Tabla USUARIOS
	 */
	void crearTablaUsuarios();
	
	/**
	 * Crea Tabla VIVIENDAS
	 */
	void crearTablaVivienda();
}
