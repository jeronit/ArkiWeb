/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import ArkiWeb.ListCertificado;
import ArkiWeb.ListInmueble;
import ArkiWeb.ListPermiso;
import ArkiWeb.ListProyecto;
import ArkiWeb.ListUsuario;
import ArkiWeb.ListVivienda;
import ArkiWeb.controlador.Arkiweb_Initialiazer;
import ArkiWeb.controlador.Control_Certificados;
import ArkiWeb.controlador.Control_Inmuebles;
import ArkiWeb.controlador.Control_Login;
import ArkiWeb.controlador.Control_Permisos;
import ArkiWeb.controlador.Control_Proyectos;
import ArkiWeb.controlador.Control_Usuarios;
import ArkiWeb.controlador.Control_Viviendas;
import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.Gestor_Busquedas;
import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

// TODO: Auto-generated Javadoc
/**
 * The Class Controlador_ModeloImpl.
 *
 * @author JTE
 */
public class Controlador_ModeloImpl implements Controlador_Modelo {
	
	/** The initializer. */
	Arkiweb_Initialiazer initializer;
	
	/** The control certificados. */
	Control_Certificados control_Certificados;
	
	/** The control inmuebles. */
	Control_Inmuebles control_Inmuebles;
	
	/** The control login. */
	Control_Login control_Login;
	
	/** The control permisos. */
	Control_Permisos control_Permisos;
	
	/** The control proyectos. */
	Control_Proyectos control_Proyectos;
	
	/** The control usuarios. */
	Control_Usuarios control_Usuarios;
	
	/** The control viviendas. */
	Control_Viviendas control_Viviendas;
	
	/** The gestor busquedas. */
	Gestor_Busquedas gestor_Busquedas;
	
	/**
	 * Instantiates a new controlador modelo impl.
	 */
	public Controlador_ModeloImpl() {
		initializer = Arkiweb_Initialiazer.getInstance();
		if(!Arkiweb_Initialiazer.isInitialized()) initializer.init();
		control_Certificados = new Control_CertificadosImpl();
		control_Inmuebles = new Control_InmueblesImpl(); 
		control_Login = new Control_LoginImpl(); 
		control_Permisos = new Control_PermisosImpl(); 
		control_Proyectos = new Control_ProyectosImpl(); 
		control_Usuarios = new Control_UsuariosImpl(); 
		control_Viviendas = new Control_ViviendasImpl(); 
		gestor_Busquedas = new Gestor_BusquedasImpl(); 
	}

	/**
	 * E all contents.
	 *
	 * @return the tree iterator
	 */
	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E class.
	 *
	 * @return the e class
	 */
	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E container.
	 *
	 * @return the e object
	 */
	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E containing feature.
	 *
	 * @return the e structural feature
	 */
	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E containment feature.
	 *
	 * @return the e reference
	 */
	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E contents.
	 *
	 * @return the e list
	 */
	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E cross references.
	 *
	 * @return the e list
	 */
	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E get.
	 *
	 * @param arg0 the arg 0
	 * @return the object
	 */
	@Override
	public Object eGet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E get.
	 *
	 * @param arg0 the arg 0
	 * @param arg1 the arg 1
	 * @return the object
	 */
	@Override
	public Object eGet(EStructuralFeature arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E invoke.
	 *
	 * @param arg0 the arg 0
	 * @param arg1 the arg 1
	 * @return the object
	 * @throws InvocationTargetException the invocation target exception
	 */
	@Override
	public Object eInvoke(EOperation arg0, EList<?> arg1) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E is proxy.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * E is set.
	 *
	 * @param arg0 the arg 0
	 * @return true, if successful
	 */
	@Override
	public boolean eIsSet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * E resource.
	 *
	 * @return the resource
	 */
	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E set.
	 *
	 * @param arg0 the arg 0
	 * @param arg1 the arg 1
	 */
	@Override
	public void eSet(EStructuralFeature arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	/**
	 * E unset.
	 *
	 * @param arg0 the arg 0
	 */
	@Override
	public void eUnset(EStructuralFeature arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * E adapters.
	 *
	 * @return the e list
	 */
	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E deliver.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * E notify.
	 *
	 * @param arg0 the arg 0
	 */
	@Override
	public void eNotify(Notification arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * E set deliver.
	 *
	 * @param arg0 the arg 0
	 */
	@Override
	public void eSetDeliver(boolean arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * Crear usuario.
	 *
	 * @param usuario the usuario
	 */
	@Override
	public void crearUsuario(Usuario usuario) {
		
		control_Usuarios.crearUsuario(usuario);
		
	}

	/**
	 * Editar usuario.
	 *
	 * @param usuario the usuario
	 */
	@Override
	public void editarUsuario(Usuario usuario) {
		
		control_Usuarios.editarUsuario(usuario);
		
	}

	/**
	 * Baja usuario.
	 *
	 * @param id_usuario the id usuario
	 * @return the usuario
	 */
	@Override
	public void bajaUsuario(int id_usuario) {
		
		control_Usuarios.bajaUsuario(id_usuario);
	}

	/**
	 * Crear permiso.
	 *
	 * @param permiso the permiso
	 */
	@Override
	public void crearPermiso(Permiso permiso) {
		
		control_Permisos.crearPermiso(permiso);
	}

	/**
	 * Editar permiso.
	 *
	 * @param permiso the permiso
	 */
	@Override
	public void editarPermiso(Permiso permiso) {
		
		control_Permisos.editarPermiso(permiso);
	}

	/**
	 * Crear certificado.
	 *
	 * @param certificado the certificado
	 */
	@Override
	public void crearCertificado(Certificado certificado) {
		
		control_Certificados.crearCertificado(certificado);
	}

	/**
	 * Editar certificado.
	 *
	 * @param certificado the certificado
	 */
	@Override
	public void editarCertificado(Certificado certificado) {
		
		control_Certificados.editarCertificado(certificado);
	}

	/**
	 * Buscar certificado.
	 *
	 * @param id_certificado the id certificado
	 * @return the certificado
	 */
	@Override
	public Certificado buscarCertificado(int id_certificado) {
		
		return gestor_Busquedas.buscarCertificado(id_certificado);
	}

	/**
	 * Crear proyecto.
	 *
	 * @param proyecto the proyecto
	 */
	@Override
	public void crearProyecto(Proyecto proyecto) {
		
		control_Proyectos.crearProyecto(proyecto);
	}

	/**
	 * Editar proyecto.
	 *
	 * @param proyecto the proyecto
	 */
	@Override
	public void editarProyecto(Proyecto proyecto) {
		
		control_Proyectos.editarProyecto(proyecto);
	}

	/**
	 * Buscar proyecto.
	 *
	 * @param id_proyecto the id proyecto
	 * @return the proyecto
	 */
	@Override
	public Proyecto buscarProyecto(int id_proyecto) {
		
		return gestor_Busquedas.buscarProyecto(id_proyecto);
	}

	/**
	 * Crear vivienda.
	 *
	 * @param vivienda the vivienda
	 */
	@Override
	public void crearVivienda(Vivienda vivienda) {
		
		control_Viviendas.crearVivienda(vivienda);
	}

	/**
	 * Editar vivienda.
	 *
	 * @param vivienda the vivienda
	 */
	@Override
	public void editarVivienda(Vivienda vivienda) {
		
		control_Viviendas.editarVivienda(vivienda);
	}

	/**
	 * Buscar vivienda.
	 *
	 * @param id_vivienda the id vivienda
	 * @return the vivienda
	 */
	@Override
	public Vivienda buscarVivienda(int id_vivienda) {
		
		return gestor_Busquedas.buscarVivienda(id_vivienda);
	}

	/**
	 * Crear inmueble.
	 *
	 * @param inmueble the inmueble
	 */
	@Override
	public void crearInmueble(Inmueble inmueble) {
		
		control_Inmuebles.crearInmueble(inmueble);
	}

	/**
	 * Editar inmueble.
	 *
	 * @param inmueble the inmueble
	 */
	@Override
	public void editarInmueble(Inmueble inmueble) {
		
		control_Inmuebles.editarInmueble(inmueble);
	}

	/**
	 * Buscar inmueble.
	 *
	 * @param id_inmueble the id inmueble
	 * @return the inmueble
	 */
	@Override
	public Inmueble buscarInmueble(int id_inmueble) {
		
		return gestor_Busquedas.buscarInmueble(id_inmueble);
	}

	/**
	 * Asignar certificado.
	 *
	 * @param asignacionCertificado the asignacion certificado
	 */
	@Override
	public void asignarCertificado(Certificado certificado, int id_usuario) {
		
		control_Certificados.asignarCertificado(certificado, id_usuario);
	}

	/**
	 * Editar asignacion certificado.
	 *
	 * @param asignacionCertificado the asignacion certificado
	 */
	@Override
	public void editarAsignacionCertificado(Certificados_Asignados certificado_Asignado, int id_usuario) {

		control_Certificados.editarAsignacionCertificado(certificado_Asignado, id_usuario);
		
	}

	/**
	 * Asignar proyecto.
	 *
	 * @param asignacionProyecto the asignacion proyecto
	 */
	@Override
	public void asignarProyecto(Proyecto proyecto, int id_usuario) {
		
		Proyectos_Asignados proyecto_asignado = (Proyectos_Asignados) this.initializer.factory.crearObjeto("Proyectos_Asignados");
		control_Proyectos.asignarProyecto(proyecto_asignado);
	}

	/**
	 * Editar asignacion proyecto.
	 *
	 * @param asignacionProyecto the asignacion proyecto
	 */
	@Override
	public void editarAsignacionProyecto(Proyectos_Asignados asignacionProyecto, int id_usuario) {
		
		control_Proyectos.editarAsignacionProyecto(asignacionProyecto);
	}

	/**
	 * Contratar proyecto.
	 *
	 * @param contratacionProyecto the contratacion proyecto
	 */
	@Override
	public void contratarProyecto(Proyecto proyecto) {
		
		control_Proyectos.contratarProyecto(proyecto);
	}

	/**
	 * Editar contratacion proyecto.
	 *
	 * @param contratacionProyecto the contratacion proyecto
	 */
	@Override
	public void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto) {
		
		control_Proyectos.editarContratacionProyecto(contratacionProyecto);
	}

	/**
	 * Login.
	 *
	 * @param email the email
	 * @param password the password
	 * @return true, if successful
	 */
	@Override
	public boolean login(String email, String password) {
		
		try {
			return control_Login.login(email, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Cambiar contrasenya.
	 *
	 * @param email the email
	 */
	@Override
	public void cambiarContrasenya(String email) {
		Usuario usuario;
		try {
			usuario = gestor_Busquedas.buscarUsuarioPorEmail(email);
			control_Login.cambiarContrasenya(usuario, email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	/**
	 * Listar usuarios.
	 *
	 * @return the list
	 */
	@Override
	public List<Usuario> listarUsuarios() {
		
		return gestor_Busquedas.listarUsuarios();
	}

	/**
	 * Listar permisos.
	 *
	 * @return the list
	 */
	@Override
	public List<Permiso> listarPermisos() {
		
		return gestor_Busquedas.listarPermisos();
	}

	/**
	 * Listar proyectos.
	 *
	 * @return the list
	 */
	@Override
	public List<Proyecto> listarProyectos() {
		
		return gestor_Busquedas.listarProyectos();
	}

	/**
	 * Listar certificados.
	 *
	 * @return the list
	 */
	@Override
	public List<Certificado> listarCertificados() {
		
		return gestor_Busquedas.listarCertificados();
	}

	/**
	 * Listar viviendas.
	 *
	 * @return the list
	 */
	@Override
	public List<Vivienda> listarViviendas() {
		
		return gestor_Busquedas.listarViviendas();
	}

	/**
	 * Listar inmuebles.
	 *
	 * @return the list
	 */
	@Override
	public List<Inmueble> listarInmuebles() {

		return gestor_Busquedas.listarInmuebles();
	}

	/**
	 * Buscar usuario.
	 *
	 * @param id_usuario the id usuario
	 * @return the usuario
	 */
	@Override
	public Usuario buscarUsuario(int id_usuario) {

		return gestor_Busquedas.buscarUsuario(id_usuario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param email_usuario the email usuario
	 * @return the usuario
	 * @throws SQLException 
	 * @model required="true" ordered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false"
	 */
	@Override
	public Usuario buscarUsuarioPorEmail(String email_usuario) throws SQLException {
		
		return gestor_Busquedas.buscarUsuarioPorEmail(email_usuario);
	}
	
	/**
	 * Buscar mis proyectos.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list
	 */
	@Override
	public List<Proyecto> buscarMisProyectos(int id_Usuario) {

		return gestor_Busquedas.buscarMisProyectos(id_Usuario);
	}

	/**
	 * Buscar proyectos por usuario.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list
	 */
	@Override
	public List<Proyecto> buscarProyectosPorUsuario(int id_Usuario) {

		return gestor_Busquedas.buscarProyectosPorUsuario(id_Usuario);
	}

	/**
	 * Buscar mis certificados.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list
	 */
	@Override
	public List<Certificado> buscarMisCertificados(int id_Usuario) {

		return gestor_Busquedas.buscarMisCertificados(id_Usuario);
	}

	/**
	 * Buscar certificados por usuario.
	 *
	 * @param id_Usuario the id usuario
	 * @return the list
	 */
	@Override
	public List<Certificado> buscarCertificadosPorUsuario(int id_Usuario) {

		return gestor_Busquedas.buscarCertificadosPorUsuario(id_Usuario);
	}

	/**
	 * Buscar certificados por vivienda.
	 *
	 * @param id_vivienda the id vivienda
	 * @return the list
	 */
	@Override
	public List<Certificado> buscarCertificadosPorVivienda(int id_vivienda) {

		return gestor_Busquedas.buscarCertificadosPorVivienda(id_vivienda);
	}

	/**
	 * Buscar certificados por inmueble.
	 *
	 * @param id_Inmueble the id inmueble
	 * @return the list
	 */
	@Override
	public List<Certificado> buscarCertificadosPorInmueble(int id_Inmueble) {

		return gestor_Busquedas.buscarCertificadosPorInmueble(id_Inmueble);
	}

	/**
	 * Buscar certificados por edad inmueble.
	 *
	 * @param edad the edad
	 * @return the list
	 */
	@Override
	public List<Certificado> buscarCertificadosPorEdadInmueble(int edad) {

		return gestor_Busquedas.buscarCertificadosPorEdadInmueble(edad);
	}

	/**
	 * Buscar certificados por edad certificado habitabilidad.
	 *
	 * @param edad the edad
	 * @return the list
	 */
	@Override
	public List<Certificado> buscarCertificadosPorEdadCertificadoHabitabilidad(int edad) {

		return gestor_Busquedas.buscarCertificadosPorEdadCertificadoHabitabilidad(edad);
	}

	/**
	 * Buscar asignacion certificado.
	 *
	 * @param id_usuario the id usuario
	 * @param id_certificado the id certificado
	 * @return the certificados asignados
	 */
	@Override
	public Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado) {

		return gestor_Busquedas.buscarAsignacionCertificado(id_usuario, id_certificado);
	}

	/**
	 * Buscar asignacion proyecto.
	 *
	 * @param id_usuario the id usuario
	 * @param id_proyecto the id proyecto
	 * @return the proyectos asignados
	 */
	@Override
	public Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto) {

		return gestor_Busquedas.buscarAsignacionProyecto(id_usuario, id_proyecto);
	}

	/**
	 * Buscar contratacion proyecto.
	 *
	 * @param id_proyecto the id proyecto
	 * @return the proyectos en ejecucion
	 */
	@Override
	public Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto) {

		return gestor_Busquedas.buscarContratacionProyecto(id_proyecto);
	}

	
}
