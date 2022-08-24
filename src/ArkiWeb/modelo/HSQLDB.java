/**
 * 	@purpose:	Interacción entre la aplicación y la BBDD.
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import ArkiWeb.ListString;
import ArkiWeb.server.Server_Connection;
import ArkiWeb.server.impl.Server_ConnectionImpl;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HSQLDB</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.modelo.ModeloPackage#getHSQLDB()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HSQLDB extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo usuario.
	 * <!-- end-user-doc -->
	 * @param	usuario					Usuario		Objeto usuario
	 * @model ususarioRequired="true" ususarioOrdered="false"
	 * @generated NOT
	 */
	void crearUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un usuario.
	 * <!-- end-user-doc -->
	 * @param	usuario					Usuario		Objeto usuario
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated NOT
	 */
	void editarUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Elimina los datos de un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario				int			Id
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	public void bajaUsuario(int id_usuario) ;

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo rol.
	 * <!-- end-user-doc -->
	 * @param 		rol 		Rol			Rol
	 * @generated NOT
	 */
	void crearRol(Rol rol);

	/**
	 * <!-- begin-user-doc -->
	 *  Registra un nuevo permiso.
	 * <!-- end-user-doc -->
	 * @param	permiso					Permiso		Permiso
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated NOT
	 */
	void crearPermiso(Permiso permiso);

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un permiso.
	 * <!-- end-user-doc -->
	 * @param	permiso					Permiso		Permiso
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated NOT
	 */
	void editarPermiso(Permiso permiso);

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo certificado.
	 * <!-- end-user-doc -->
	 * @param	certificado						Certificado				Certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated NOT
	 */
	void crearCertificado(Certificado certificado);

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un certificado.
	 * <!-- end-user-doc -->
	 * @param	certificado						Certificado				Certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated NOT
	 */
	void editarCertificado(Certificado certificado);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un certificado.
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated NOT
	 */
	Certificado buscarCertificado(int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyecto						Proyecto				Proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated NOT
	 */
	void crearProyecto(Proyecto proyecto);

	/**
	 * !-- begin-user-doc -->
	 * Edita los datos de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyecto						Proyecto				Proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated NOT
	 */
	void editarProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un proyecto.
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated NOT
	 */
	Proyecto buscarProyecto(int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Registra una nueva vivienda.
	 * <!-- end-user-doc -->
	 * @param	vivienda						Vivienda				Vivienda
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated NOT
	 */
	void crearVivienda(Vivienda vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de una vivienda.
	 * <!-- end-user-doc -->
	 * @param	vivienda						Vivienda				Vivienda
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated NOT
	 */
	void editarVivienda(Vivienda vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve una vivienda.
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated NOT
	 */
	Vivienda buscarVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo inmueble.
	 * <!-- end-user-doc -->
	 * @param	inmueble						Inmueble				Inmueble
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated NOT
	 */
	void crearInmueble(Inmueble inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un inmueble.
	 * <!-- end-user-doc -->
	 * @param	inmueble						Inmueble				Inmueble
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated NOT
	 */
	void editarInmueble(Inmueble inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un inmueble.
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 * @generated NOT
	 */
	Inmueble buscarInmueble(int id_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	asignacionCertificado					Certificados_Asignados			Certificados_Asignados
	 * @model asignacionCertificadoRequired="true" asignacionCertificadoOrdered="false"
	 * @generated NOT
	 */
	void asignarCertificado(Certificados_Asignados asignacionCertificado);

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	asignacionCertificado					Certificados_Asignados			Certificados_Asignados
	 * @model asignacionCertificadoRequired="true" asignacionCertificadoOrdered="false"
	 * @generated NOT
	 */
	void editarAsignacionCertificado(Certificados_Asignados asignacionCertificado);

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyectoCertificado						Proyectos_Asignados				Proyectos_Asignados
	 * @model proyectoCertificadoRequired="true" proyectoCertificadoOrdered="false"
	 * @generated NOT
	 */
	void asignarProyecto(Proyectos_Asignados proyectoAsignado);

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyectoCertificado						Proyectos_Asignados				Proyectos_Asignados
	 * @model proyectoCertificadoRequired="true" proyectoCertificadoOrdered="false"
	 * @generated NOT
	 */
	void editarAsignacionProyecto(Proyectos_Asignados proyectoAsignado);

	/**
	 * <!-- begin-user-doc -->
	 * Gestiona la contratación de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	contratacionCertificado					Proyectos_En_Ejecucion				Proyectos_En_Ejecucion 
	 * @model contratacionCertificadoRequired="true" contratacionCertificadoOrdered="false"
	 * @generated NOT
	 */
	void contratarProyecto(Proyectos_En_Ejecucion proyectoAsignado);

	/**
	 * <!-- begin-user-doc -->
	 * Edita la gestión sobre la contratación de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	contratacionCertificado					Proyectos_En_Ejecucion				Proyectos_En_Ejecucion 
	 * @model contratacionCertificadoRequired="true" contratacionCertificadoOrdered="false"
	 * @generated NOT
	 */
	void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una creación SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde añadir datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde insertar la información
	 * @param	valores_columnas		List<String>		Lista de los valores para las columnas/campos (en el mismo orden)
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false"
	 * @generated NOT
	 */
	String queryCrear(String tabla, List<String> columnas, List<String> valores_columnas);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una edición SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde editar datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde editar la información
	 * @param	valores_columnas		List<String>		Lista de los valores para las columnas/campos (en el mismo orden)
	 * @param	where_clause			String				Cadena con las condiciones de la query
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false" where_clauseDataType="org.eclipse.uml2.types.String" where_clauseRequired="true" where_clauseOrdered="false"
	 * @generated NOT
	 */
	String queryEditar(String tabla, List<String> columnas, List<String> valores_columnas, String where_clause);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una búsqueda SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde editar datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde editar la información
	 * @param	where_clause_01			String				Cadena con las condiciones de la query
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" where_clause_01DataType="org.eclipse.uml2.types.String" where_clause_01Required="true" where_clause_01Ordered="false"
	 * @generated NOT
	 */
	String queryBuscar(String tabla, List<String> columnas, String where_clause_01);

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla SQL.
	 * <!-- end-user-doc -->
	 * @param	nombreTabla				String				El nombre de la tabla a crear
	 * @param	columnas				List<String>		Lista de columnas/campos donde se insertará la información. Hay que especificar los tipos (p.ej.: varchar(255)...)
	 * @return							String				Cadena con la query SQL
	 * @generated NOT
	 */
	String queryCrearTabla(String nombreTabla, List<String> columnas);

	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Crea una tabla de USUARIOS.
	 * <!-- end-user-doc -->
	 *  
	 * @generated NOT
	 */
	void crearTablaUsuario();
	
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Crea una tabla de ROL.
	 * <!-- end-user-doc -->
	 *  
	 * @generated NOT
	 */
	void crearTablaRol();

	/**
	 * <!-- begin-user-doc -->
	 *  Crea una tabla de PERMISOS.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	void crearTablaPermiso();

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de CERTIFICADOS.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	void crearTablaCertificado();

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de PROYECTOS.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	void crearTablaProyecto();

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de VIVIENDAS.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	void crearTablaVivienda();

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de INMUEBLES.
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	void crearTablaInmueble();

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de ASIGNACION_CERTIFICADOS.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	void crearTablaAsignarCertificado();

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de ASIGNACION_PROYECTOS.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	void crearTablaAsignarProyecto();

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de PROYECTOS_CONTRATADOS.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	void crearTablaContratarProyecto();

	/**
	 * <!-- begin-user-doc -->
	 * Conecta con la BBDD.
	 * <!-- end-user-doc -->
	 *
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 * @return the server connection
	 */
	Server_ConnectionImpl connect2Server(String url, String user, String password);
	
	/**
	 * <!-- begin-user-doc -->
	 * Ejecuta la query que se le pasa como parámetro.
	 * <!-- end-user-doc -->
	 *
	 * @param server_connection 	Server_Connection	Conexión al server
	 * @param queryString 			String				Cadena con la query SQL
	 * @return 						Object				Objeto de retorno de la BBDD
	 * @model required="true" ordered="false" queryStringDataType="org.eclipse.uml2.types.String" queryStringRequired="true" queryStringOrdered="false"
	 * @generated NOT
	 */
	Object queryEjecutar(Server_ConnectionImpl server_connection, String queryString);
	
	/**
	 * <!-- begin-user-doc -->
	 * Finaliza la query y conexión al server.
	 * <!-- end-user-doc -->
	 * @param server_connection the server connection
	 */
	void queryCerrar(Server_Connection server_connection);
	
	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	String getUrl();
	
	/**
	 * Sets the url.
	 *
	 * @param url the new url
	 */
	void setUrl(String url);
	
	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	String getUser();
	
	/**
	 * Sets the user.
	 *
	 * @param url the new user
	 */
	void setUser(String url);
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	String getPassword();
	
	/**
	 * Sets the password.
	 *
	 * @param url the new password
	 */
	void setPassword(String url);
	
} // HSQLDB
