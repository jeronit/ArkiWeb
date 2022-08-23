/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.ListCertificado;
import ArkiWeb.ListInmueble;
import ArkiWeb.ListPermiso;
import ArkiWeb.ListProyecto;
import ArkiWeb.ListUsuario;
import ArkiWeb.ListVivienda;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

// TODO: Auto-generated Javadoc
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlador Modelo</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControlador_Modelo()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Controlador_Modelo extends EObject {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param usuario the usuario
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated 
	 */
	void crearUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param usuario the usuario
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated 
	 */
	void editarUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_usuario the id usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated 
	 */
	void bajaUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param permiso the permiso
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated 
	 */
	void crearPermiso(Permiso permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param permiso the permiso
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated 
	 */
	void editarPermiso(Permiso permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param certificado the certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated 
	 */
	void crearCertificado(Certificado certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param certificado the certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated 
	 */
	void editarCertificado(Certificado certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_certificado the id certificado
	 * @return the certificado
	 * @model required="true" ordered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated 
	 */
	Certificado buscarCertificado(int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param proyecto the proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated 
	 */
	void crearProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param proyecto the proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated 
	 */
	void editarProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_proyecto the id proyecto
	 * @return the proyecto
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated 
	 */
	Proyecto buscarProyecto(int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param vivienda the vivienda
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated 
	 */
	void crearVivienda(Vivienda vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param vivienda the vivienda
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated 
	 */
	void editarVivienda(Vivienda vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_vivienda the id vivienda
	 * @return the vivienda
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated 
	 */
	Vivienda buscarVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param inmueble the inmueble
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated 
	 */
	void crearInmueble(Inmueble inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param inmueble the inmueble
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated 
	 */
	void editarInmueble(Inmueble inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_inmueble the id inmueble
	 * @return the inmueble
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 * @generated 
	 */
	Inmueble buscarInmueble(int id_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param asignacionCertificado the asignacion certificado
	 * @model asignacionCertificadoRequired="true" asignacionCertificadoOrdered="false"
	 * @generated 
	 */
	void asignarCertificado(Certificado certificado, int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param asignacionCertificado the asignacion certificado
	 * @model asignacionCertificadoRequired="true" asignacionCertificadoOrdered="false"
	 * @generated 
	 */
	void editarAsignacionCertificado(Certificados_Asignados certificado_Asignado, int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param asignacionProyecto the asignacion proyecto
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated 
	 */
	void asignarProyecto(Proyecto proyecto, int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param asignacionProyecto the asignacion proyecto
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated 
	 */
	void editarAsignacionProyecto(Proyectos_Asignados asignacionProyecto, int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param contratacionProyecto the contratacion proyecto
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated 
	 */
	void contratarProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param contratacionProyecto the contratacion proyecto
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated 
	 */
	void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param email the email
	 * @param password the password
	 * @return true, if successful
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated 
	 */
	boolean login(String email, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param email the email
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated 
	 */
	void cambiarContrasenya(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the list usuario
	 * @model required="true" ordered="false"
	 * @generated 
	 */
	List<Usuario> listarUsuarios();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the list permiso
	 * @model required="true" ordered="false"
	 * @generated 
	 */
	List<Permiso> listarPermisos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the list proyecto
	 * @model required="true" ordered="false"
	 * @generated 
	 */
	List<Proyecto> listarProyectos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the list certificado
	 * @model required="true" ordered="false"
	 * @generated 
	 */
	List<Certificado> listarCertificados();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the list vivienda
	 * @model required="true" ordered="false"
	 * @generated 
	 */
	List<Vivienda> listarViviendas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the list inmueble
	 * @model required="true" ordered="false"
	 * @generated 
	 */
	List<Inmueble> listarInmuebles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_usuario the id usuario
	 * @return the usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated 
	 */
	Usuario buscarUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list proyecto
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated 
	 */
	List<Proyecto> buscarMisProyectos(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list proyecto
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated 
	 */
	List<Proyecto> buscarProyectosPorUsuario(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list certificado
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated 
	 */
	List<Certificado> buscarMisCertificados(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list certificado
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated 
	 */
	List<Certificado> buscarCertificadosPorUsuario(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_vivienda the id vivienda
	 * @return the list certificado
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated 
	 */
	List<Certificado> buscarCertificadosPorVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_Inmueble the id inmueble
	 * @return the list certificado
	 * @model required="true" ordered="false" id_InmuebleDataType="org.eclipse.uml2.types.Integer" id_InmuebleRequired="true" id_InmuebleOrdered="false"
	 * @generated 
	 */
	List<Certificado> buscarCertificadosPorInmueble(int id_Inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param edad the edad
	 * @return the list certificado
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated 
	 */
	List<Certificado> buscarCertificadosPorEdadInmueble(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param edad the edad
	 * @return the list certificado
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated 
	 */
	List<Certificado> buscarCertificadosPorEdadCertificadoHabitabilidad(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_usuario the id usuario
	 * @param id_certificado the id certificado
	 * @return the certificados asignados
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated 
	 */
	Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_usuario the id usuario
	 * @param id_proyecto the id proyecto
	 * @return the proyectos asignados
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated 
	 */
	Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param id_proyecto the id proyecto
	 * @return the proyectos en ejecucion
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated 
	 */
	Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto);

} // Controlador_Modelo
