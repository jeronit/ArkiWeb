/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.ListCertificado;
import ArkiWeb.ListCertificados_Asignados;
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestor Busquedas</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getGestor_Busquedas()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Gestor_Busquedas extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de usuarios.
	 * <!-- end-user-doc -->
	 * @return			List<Usuario>		Listado de usuarios
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	List<Usuario> listarUsuarios();

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un inmueble.
	 * <!-- end-user-doc -->
	 * @return			Inmueble			Inmueble
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 * @generated NOT
	 */
	Inmueble buscarInmueble(int id_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de permisos.
	 * <!-- end-user-doc -->
	 * @return			List<Permiso>		Listado de permisos
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	List<Permiso> listarPermisos();

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de proyectos.
	 * <!-- end-user-doc -->
	 * @return			List<Proyecto>			Listado de proyectos
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	List<Proyecto> listarProyectos();

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de certificados.
	 * <!-- end-user-doc -->
	 * @return			List<Certificado>			Listado de certificados
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	List<Certificado> listarCertificados();

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de viviendas.
	 * <!-- end-user-doc -->
	 * @return			List<Vivienda>		Listado de viviendas
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	List<Vivienda> listarViviendas();

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de inmuebles.
	 * <!-- end-user-doc -->
	 * @return			List<Inmueble>		Listado de inmuebles
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	List<Inmueble> listarInmuebles();

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de permisos concedidos al usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id	
	 * @return					List<Permiso>		Listado de permisos concedidos al usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated NOT
	 */
	List<Permiso> listarPermisosUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve una usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return			Usuario			Usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated NOT
	 */
	Usuario buscarUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve una vivienda.
	 * <!-- end-user-doc -->
	 * @param	id_vivienda		int					Id
	 * @return			Vivienda			Vivienda
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated NOT
	 */
	Vivienda buscarVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto		int					Id
	 * @return			Proyecto			Proyecto
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated NOT
	 */
	Proyecto buscarProyecto(int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un certificado.
	 * <!-- end-user-doc -->
	 * @param	id_certificado		int					Id
	 * @return			Certificado			Certificado
	 * @model required="true" ordered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated NOT
	 */
	Certificado buscarCertificado(int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los proyectos asignados a un usuario. 
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return			List<Proyecto>		Listado de proyectos asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated NOT
	 */
	List<Proyecto> buscarMisProyectos(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los proyectos asignados a un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return		List<Proyecto>			Listado de proyectos asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated NOT
	 */
	List<Proyecto> buscarProyectosPorUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated NOT
	 */
	List<Certificado> buscarMisCertificados(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated NOT
	 */
	List<Certificado> buscarCertificadosPorUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a una vivienda.
	 * <!-- end-user-doc -->
	 * @param	id_vivienda		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a una vivienda
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated NOT
	 */
	List<Certificado> buscarCertificadosPorVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un inmueble.
	 * <!-- end-user-doc -->
	 * @param	id_inmueble		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a un inmueble
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 * @generated NOT
	 */
	List<Certificado> buscarCertificadosPorInmueble(int id_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un inmueble con una edad igual o superior a la indicada en la entrada.
	 * <!-- end-user-doc -->
	 * @param	edad		int					Edad inmueble
	 * @return		List<Certificado>			Listado de certificados asignados a un inmueble con una edad igual o superior a la indicada en la entrada
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated NOT
	 */
	List<Certificado> buscarCertificadosPorEdadInmueble(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados de un inmueble con una edad del certificado de habitabilidad igual o superior a la indicada en la entrada.
	 * <!-- end-user-doc -->
	 * @param	edad		int					Edad certificados de habitabilidad
	 * @return		List<Certificado>			Listado de certificados asignados a un inmueble con una edad del certificado de habitabilidad igual o superior a la indicada en la entrada
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated NOT
	 */
	List<Certificado> buscarCertificadosPorEdadCertificadoHabitabilidad(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * Busca la asignación de un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @param	id_proyecto		int					Id
	 * @return			Proyectos_Asignados			Asignación de un arquitecto a un proyecto
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated NOT
	 */
	Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Busca la contratación de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto		int					Id
	 * @return			Proyectos_En_Ejecucion		Contratación de un proyecto
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated NOT
	 */
	Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Busca la asignación de un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	id_usuario			int					Id
	 * @param	id_certificado		int					Id
	 * @return			List<Certificados_Asignados>		Asignación de un arquitecto a un certificado
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated NOT
	 */
	Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado);

} // Gestor_Busquedas
