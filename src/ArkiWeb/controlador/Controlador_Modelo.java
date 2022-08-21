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
import org.eclipse.emf.ecore.EObject;

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
	 * <!-- end-user-doc -->
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated
	 */
	void crearUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated
	 */
	void editarUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated
	 */
	Usuario bajaUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated
	 */
	void crearPermiso(Permiso permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated
	 */
	void editarPermiso(Permiso permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated
	 */
	void crearCertificado(Certificado certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated
	 */
	void editarCertificado(Certificado certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated
	 */
	Certificado buscarCertificado(int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated
	 */
	void crearProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated
	 */
	void editarProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated
	 */
	Proyecto buscarProyecto(int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated
	 */
	void crearVivienda(Vivienda vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated
	 */
	void editarVivienda(Vivienda vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated
	 */
	Vivienda buscarVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated
	 */
	void crearInmueble(Inmueble inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated
	 */
	void editarInmueble(Inmueble inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 * @generated
	 */
	Inmueble buscarInmueble(int id_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model asignacionCertificadoRequired="true" asignacionCertificadoOrdered="false"
	 * @generated
	 */
	void asignarCertificado(Certificados_Asignados asignacionCertificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model asignacionCertificadoRequired="true" asignacionCertificadoOrdered="false"
	 * @generated
	 */
	void editarAsignacionCertificado(Certificados_Asignados asignacionCertificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated
	 */
	void asignarProyecto(Proyectos_Asignados asignacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated
	 */
	void editarAsignacionProyecto(Proyectos_Asignados asignacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated
	 */
	void contratarProyecto(Proyectos_En_Ejecucion contratacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated
	 */
	void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean login(String email, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void cambiarContrasenya(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ListUsuario listarUsuarios();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ListPermiso listarPermisos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ListProyecto listarProyectos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ListCertificado listarCertificados();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ListVivienda listarViviendas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ListInmueble listarInmuebles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated
	 */
	Usuario buscarUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	ListProyecto buscarMisProyectos(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	ListProyecto buscarProyectosPorUsuario(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	ListCertificado buscarMisCertificados(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	ListCertificado buscarCertificadosPorUsuario(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated
	 */
	ListCertificado buscarCertificadosPorVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_InmuebleDataType="org.eclipse.uml2.types.Integer" id_InmuebleRequired="true" id_InmuebleOrdered="false"
	 * @generated
	 */
	ListCertificado buscarCertificadosPorInmueble(int id_Inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated
	 */
	ListCertificado buscarCertificadosPorEdadInmueble(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated
	 */
	ListCertificado buscarCertificadosPorEdadCertificadoHabitabilidad(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated
	 */
	Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated
	 */
	Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated
	 */
	Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto);

} // Controlador_Modelo
