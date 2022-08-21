/**
 * 	@purpose:	Interface para insertar datos Demo en la BBDD
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

// TODO: Auto-generated Javadoc
/**
 * The Interface BBDD_Generar_Datos_Demo.
 *
 * @author JTE
 */
public interface BBDD_Generar_Datos_Demo {

	
	/**
	 * Insertar roles.
	 */
	void insertarRoles();
	
	/**
	 * Insertar usuarios.
	 */
	void insertarUsuarios();
	
	/**
	 * Insertar permisos.
	 */
	void insertarPermisos();
	
	/**
	 * Insertar inmuebles.
	 */
	void insertarInmuebles();
	
	/**
	 * Insertar viviendas.
	 */
	void insertarViviendas();
	
	/**
	 * Insertar certificados.
	 */
	void insertarCertificados();
	
	/**
	 * Insertar certificados asignados.
	 */
	void insertarCertificados_Asignados();
	
	/**
	 * Insertar proyectos.
	 */
	void insertarProyectos();
	
	/**
	 * Insertar proyectos asignados.
	 */
	void insertarProyectos_Asignados();
	
	/**
	 * Insertar proyectos contratados.
	 */
	void insertarProyectos_Contratados();
}
