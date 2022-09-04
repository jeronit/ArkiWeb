/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
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

import ArkiWeb.controlador.Gestor_Busquedas;
import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;
import ArkiWeb.modelo.impl.CertificadoImpl;
import ArkiWeb.modelo.impl.Certificados_AsignadosImpl;
import ArkiWeb.modelo.impl.InmuebleImpl;
import ArkiWeb.modelo.impl.PermisoImpl;
import ArkiWeb.modelo.impl.ProyectoImpl;
import ArkiWeb.modelo.impl.Proyectos_AsignadosImpl;
import ArkiWeb.modelo.impl.Proyectos_En_EjecucionImpl;
import ArkiWeb.modelo.impl.RolImpl;
import ArkiWeb.modelo.impl.UsuarioImpl;
import ArkiWeb.modelo.impl.ViviendaImpl;
import ArkiWeb.server.impl.Server_ConnectionImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class Gestor_BusquedasImpl.
 *
 * @author JTE
 */
public class Gestor_BusquedasImpl implements Gestor_Busquedas {

	/**
	 * Instantiates a new gestor busquedas impl.
	 */
	public Gestor_BusquedasImpl() {
		// TODO Auto-generated constructor stub
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
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de usuarios.
	 * <!-- end-user-doc -->
	 * @return			List<Usuario>		Listado de usuarios
	 * @model required="true" ordered="false"
	 */
	@Override
	public List<Usuario> listarUsuarios() {
		
		List<Usuario> resultado = new ArrayList<Usuario>();
		String tabla = "USUARIOS";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, null);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Usuario(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de Rol.
	 * <!-- end-user-doc -->
	 * @return			List<Rol>		Listado de Rol
	 */
	@Override
	public List<Rol> listarRoles() {
		
		List<Rol> resultado = new ArrayList<Rol>();
		String tabla = "ROL";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, null);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Rol(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un inmueble.
	 * <!-- end-user-doc -->
	 *
	 * @param id_inmueble the id inmueble
	 * @return 		Inmueble			Inmueble
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 */
	@Override
	public Inmueble buscarInmueble(int id_inmueble) {
		
		return ArkiWeb.controlador.Arkiweb_Initializer.db.buscarInmueble(id_inmueble);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de permisos.
	 * <!-- end-user-doc -->
	 * @return			List<Permiso>		Listado de permisos
	 * @model required="true" ordered="false"
	 */
	@Override
	public List<Permiso> listarPermisos() {
		
		List<Permiso> resultado = new ArrayList<Permiso>();
		String tabla = "PERMISOS";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, null);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Permiso(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de proyectos.
	 * <!-- end-user-doc -->
	 * @return			List<Proyecto>			Listado de proyectos
	 * @model required="true" ordered="false"
	 */
	@Override
	public List<Proyecto> listarProyectos() {
		
		List<Proyecto> resultado = new ArrayList<Proyecto>();
		String tabla = "PROYECTOS";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, null);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Proyecto(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de certificados.
	 * <!-- end-user-doc -->
	 * @return			List<Certificado>			Listado de certificados
	 * @model required="true" ordered="false"
	 */
	@Override
	public List<Certificado> listarCertificados() {
		
		List<Certificado> resultado = new ArrayList<Certificado>();
		String tabla = "CERTIFICADOS";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, null);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Certificado(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de viviendas.
	 * <!-- end-user-doc -->
	 * @return			List<Vivienda>		Listado de viviendas
	 * @model required="true" ordered="false"
	 */
	@Override
	public List<Vivienda> listarViviendas() {
		
		List<Vivienda> resultado = new ArrayList<Vivienda>();
		String tabla = "VIVIENDAS";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, null);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Vivienda(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de inmuebles.
	 * <!-- end-user-doc -->
	 * @return			List<Inmueble>		Listado de inmuebles
	 * @model required="true" ordered="false"
	 */
	@Override
	public List<Inmueble> listarInmuebles() {
		
		List<Inmueble> resultado = new ArrayList<Inmueble>();
		String tabla = "INMUEBLES";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, null);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Inmueble(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un listado de permisos concedidos al usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id	
	 * @return					List<Permiso>		Listado de permisos concedidos al usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public List<Permiso> listarPermisosUsuario(int id_usuario) {
		
		List<Permiso> resultado = new ArrayList<Permiso>();
		// Obteniendo usuario
		Usuario usuario = buscarUsuario(id_usuario);
		
		String tabla = "PERMISOS";
		String where_clause = "id_rol_permiso = " + usuario.getRol_usuario();
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Permiso(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve una usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return			Usuario			Usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public Usuario buscarUsuario(int id_usuario) {
		
		Usuario resultado = null;
		String tabla = "USUARIOS";
		String where_clause = "id_usuario = " + id_usuario;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado = this.addResultData2Usuario(results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca un usuario por email
	 * <!-- end-user-doc -->.
	 *
	 * @param email the email
	 * @return 						Usuario			Usuario
	 * @throws SQLException the SQL exception
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 */
	@Override
	public Usuario buscarUsuarioPorEmail(String email) throws SQLException {
		
		String tabla = "USUARIOS";
		String where_clause = "email_usuario = '" + email +"'";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			results.next();						
			if(results == null) {
				Usuario usuario = null;
				ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
				return usuario;
//				throw new ArithmeticException("El email no está en nuestra base de datos.");
			} else if(results.isFirst() && results.isLast()) {				
				Usuario usuario = this.addResultData2Usuario(results);
				ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
				return usuario;
			} else {
				Usuario usuario = null;
				ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
				return usuario;
//				throw new ArithmeticException("Se ha encontrado más de un usuario con el mismo email.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("El email no está en nuestra base de datos.");
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Devuelve una vivienda.
	 * <!-- end-user-doc -->
	 * @param	id_vivienda		int					Id
	 * @return			Vivienda			Vivienda
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 */
	@Override
	public Vivienda buscarVivienda(int id_vivienda) {

		return ArkiWeb.controlador.Arkiweb_Initializer.db.buscarVivienda(id_vivienda);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto		int					Id
	 * @return			Proyecto			Proyecto
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 */
	@Override
	public Proyecto buscarProyecto(int id_proyecto) {
		
		Proyecto resultado = null;
		String tabla = "PROYECTOS";
		String where_clause = "id_proyecto = " + id_proyecto;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado = this.addResultData2Proyecto(results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un certificado.
	 * <!-- end-user-doc -->
	 * @param	id_certificado		int					Id
	 * @return			Certificado			Certificado
	 * @model required="true" ordered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 */
	@Override
	public Certificado buscarCertificado(int id_certificado) {
		
		return ArkiWeb.controlador.Arkiweb_Initializer.db.buscarCertificado(id_certificado);

	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los proyectos asignados a un usuario. 
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return			List<Proyecto>		Listado de proyectos asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public List<Proyecto> buscarMisProyectos(int id_usuario) {
		
		return buscarProyectosPorUsuario(id_usuario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los proyectos asignados a un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return		List<Proyecto>			Listado de proyectos asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public List<Proyecto> buscarProyectosPorUsuario(int id_usuario) {
		
		List<Proyecto> resultado = new ArrayList<Proyecto>();
		
		String tabla = "PROYECTOS";
		String where_clause = "cliente_proyecto = " + id_usuario;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Proyecto(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public List<Certificado> buscarMisCertificados(int id_usuario) {
		
		return buscarCertificadosPorUsuario(id_usuario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a un usuario
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public List<Certificado> buscarCertificadosPorUsuario(int id_usuario) {
		
		List<Certificado> resultado = new ArrayList<Certificado>();
		
		String tabla = "CERTIFICADOS";
		String where_clause = "cliente_certificado = " + id_usuario;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Certificado(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a una vivienda.
	 * <!-- end-user-doc -->
	 * @param	id_vivienda		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a una vivienda
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 */
	@Override
	public List<Certificado> buscarCertificadosPorVivienda(int id_vivienda) {
		
		List<Certificado> resultado = new ArrayList<Certificado>();
		
		String tabla = "CERTIFICADOS";
		String where_clause = "vivienda_certificado = " + id_vivienda;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Certificado(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un inmueble.
	 * <!-- end-user-doc -->
	 * @param	id_inmueble		int					Id
	 * @return		List<Certificado>			Listado de certificados asignados a un inmueble
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 */
	@Override
	public List<Certificado> buscarCertificadosPorInmueble(int id_inmueble) {
		
		List<Certificado> resultado = new ArrayList<Certificado>();
		
		String tabla = "CERTIFICADOS";
		String where_clause = "inmueble_certificado = " + id_inmueble;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Certificado(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados asignados a un inmueble con una edad igual o superior a la indicada en la entrada.
	 * <!-- end-user-doc -->
	 * @param	edad		int					Edad inmueble
	 * @return		List<Certificado>			Listado de certificados asignados a un inmueble con una edad igual o superior a la indicada en la entrada
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 */
	@Override
	public List<Certificado> buscarCertificadosPorEdadInmueble(int edad) {
		
		List<Certificado> resultado = new ArrayList<Certificado>();
		
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		c.setTime(date);
		c.add(date.getYear(), -edad);
		
		String tablaInnerQuery = "INMUEBLES";
		List<String> columnasInnerQuery = new ArrayList<String>();
		columnasInnerQuery.add("id_inmueble");
		String where_clauseInnerQuery = "fecha_construccion_inmueble <= " + c;
		String innerQueryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tablaInnerQuery, columnasInnerQuery, where_clauseInnerQuery);
		
		String tabla = "CERTIFICADOS";
		String where_clause = "inmueble_certificado IN (" + innerQueryString + ")";
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Certificado(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve los certificados de un inmueble con una edad del certificado de habitabilidad igual o superior a la indicada en la entrada.
	 * <!-- end-user-doc -->
	 * @param	edad		int					Edad certificados de habitabilidad
	 * @return		List<Certificado>			Listado de certificados asignados a un inmueble con una edad del certificado de habitabilidad igual o superior a la indicada en la entrada
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 */
	@Override
	public List<Certificado> buscarCertificadosPorEdadCertificadoHabitabilidad(int edad) {
		
		List<Certificado> resultado = new ArrayList<Certificado>();
		
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		c.setTime(date);
		c.add(date.getYear(), -edad);
		
		String tabla = "CERTIFICADOS";
		String where_clause = "tipo_certificado = " + Tipo_Certificado.HABITABILIDAD_VALUE + " AND fecha_emision_certificado <= " + edad;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2Certificado(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca la asignaci�n de un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @param	id_proyecto		int					Id
	 * @return			Proyectos_Asignados			Asignaci�n de un arquitecto a un proyecto
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 */
	@Override
	public Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto) {
		
		Proyectos_Asignados resultado = new Proyectos_AsignadosImpl();
		
		String tabla = "ASIGNACION_PROYECTOS";
		String where_clause = "id_proyecto_proyecto_asignado = " + id_proyecto + " AND arquitecto_proyecto_asignado = " + id_usuario;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado = this.addResultData2AsignarProyecto(results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca la contrataci�n de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto		int					Id
	 * @return			Proyectos_En_Ejecucion		Contrataci�n de un proyecto
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 */
	@Override
	public Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto) {
		
		Proyectos_En_Ejecucion resultado = new Proyectos_En_EjecucionImpl();
		
		String tabla = "PROYECTOS_CONTRATADOS";
		String where_clause = "id_proyecto_ejecucion_proyecto = " + id_proyecto;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado = this.addResultData2ContratarProyecto(results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca la asignaci�n de un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	id_usuario			int					Id
	 * @param	id_certificado		int					Id
	 * @return			List<Certificados_Asignados>		Asignaci�n de un arquitecto a un certificado
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 */
	@Override
	public Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado) {
		
		Certificados_Asignados resultado = new Certificados_AsignadosImpl();
		
		String tabla = "ASIGNACION_CERTIFICADOS";
		String where_clause = "id_certificado_certificado_asignado = " + id_certificado + " AND arquitecto_certificado_asignado = " + id_usuario;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado = this.addResultData2AsignarCertificado(results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca los certificados asignados a un usuario
	 * <!-- end-user-doc -->
	 * @param	id_usuario			int						Id
	 * @return			List<Proyectos_Asignados>			Listado asignaciones de un arquitecto a un proyecto
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 */
	@Override
	public List<Proyectos_Asignados> buscarAsignacionProyectoAUsuario(int id_usuario) {
		List<Proyectos_Asignados> resultado = new ArrayList<Proyectos_Asignados>();
		
		String tabla = "ASIGNACION_PROYECTOS";
		String where_clause = "arquitecto_proyecto_asignado = " + id_usuario;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2AsignarProyecto(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca los certificados asignados a un usuario
	 * <!-- end-user-doc -->
	 * @param	id_usuario			int						Id
	 * @return			List<Certificados_Asignados>		Listado de asignaciones de un arquitecto a un certificado
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public List<Certificados_Asignados> buscarAsignacionCertificadoAUsuario(int id_usuario) {
		
		List<Certificados_Asignados> resultado = new ArrayList<Certificados_Asignados>();
		
		String tabla = "ASIGNACION_CERTIFICADOS";
		String where_clause = "arquitecto_certificado_asignado = " + id_usuario;
		String queryString = ArkiWeb.controlador.Arkiweb_Initializer.db.queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = ArkiWeb.controlador.Arkiweb_Initializer.db.connect2Server(ArkiWeb.controlador.Arkiweb_Initializer.db.getUrl(), ArkiWeb.controlador.Arkiweb_Initializer.db.getUser(), ArkiWeb.controlador.Arkiweb_Initializer.db.getPassword());
		ResultSet results = (ResultSet) ArkiWeb.controlador.Arkiweb_Initializer.db.queryEjecutar(server_connection, queryString);
		
		try {
			while(results.next()) {
				resultado.add(this.addResultData2AsignarCertificado(results));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArkiWeb.controlador.Arkiweb_Initializer.db.queryCerrar(server_connection);
		return resultado;
	}

	/**
	 * Adds the result data 2 usuario.
	 *
	 * @param results the results
	 * @return the usuario
	 */
	private Usuario addResultData2Usuario(ResultSet results) {
		Usuario usuario = new UsuarioImpl();
		try {
			usuario.setId_usuario(results.getInt("id_usuario"));
			usuario.setNombre_usuario(results.getString("nombre_usuario"));
			usuario.setApellidos_usuario(results.getString("apellidos_usuario"));
			usuario.setDni_usuario(results.getString("dni_usuario"));
			usuario.setTelefono_usuario(results.getString("telefono_usuario"));
			usuario.setEmail_usuario(results.getString("email_usuario"));
			usuario.setDomicilio_usuario(results.getString("domicilio_usuario"));
			usuario.setRol_usuario(results.getInt("rol_usuario"));
			usuario.setContrasenya_usuario(results.getString("contrasenya_usuario"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}
	
	
	/**
	 * Adds the result data 2 rol.
	 *
	 * @param results the results
	 * @return the rol
	 */
	private Rol addResultData2Rol(ResultSet results) {
		Rol rol = new RolImpl();
		try {
			rol.setId_rol(results.getInt("id_rol"));
			rol.setDescripcion_rol(results.getString("descripcion_rol"));
					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rol;
	}

	/**
	 * Adds the result data 2 permiso.
	 *
	 * @param results the results
	 * @return the permiso
	 */
	private Permiso addResultData2Permiso(ResultSet results) {
		Permiso permiso = new PermisoImpl();
		try {
			permiso.setId_permiso(results.getInt("id_permiso"));
			permiso.setId_rol(results.getInt("id_rol_permiso"));
			permiso.setObjeto_permiso(results.getString("objeto_permiso"));
			permiso.setLectura_permiso(results.getBoolean("lectura_permiso"));
			permiso.setEscritura_permiso(results.getBoolean("escritura_permiso"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return permiso;
	}
	
	/**
	 * Adds the result data 2 certificado.
	 *
	 * @param results the results
	 * @return the certificado
	 */
	private Certificado addResultData2Certificado(ResultSet results) {
		Certificado certificado = new CertificadoImpl();
		try {
			certificado.setId_certificado(results.getInt("id_certificado"));
			certificado.setDescripcion_certificado(results.getString("descripcion_certificado"));
			certificado.setId_cliente_certificado(results.getInt("cliente_certificado"));
			certificado.setId_vivienda_certificado(results.getInt("vivienda_certificado"));
			certificado.setId_inmueble_certificado(results.getInt("inmueble_certificado"));
			certificado.setTipo_certificado(Tipo_Certificado.get(results.getString("tipo_certificado")));
			
			if(results.getString("fecha_solicitud_certificado").equals("null")) {
				certificado.setFecha_solicitud_certificado(null);
			} else {
				certificado.setFecha_solicitud_certificado(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_solicitud_certificado")));
			}
			if(results.getString("fecha_entrega_certificado").equals("null")) {
				certificado.setFecha_entrega_certificado(null);
			} else {
				certificado.setFecha_entrega_certificado(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_entrega_certificado")));
			}
			if(results.getString("fecha_visita_certificado").equals("null")) {
				certificado.setFecha_visita_certificado(null);
			} else {
				certificado.setFecha_visita_certificado(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_visita_certificado")));
			}
			if(results.getString("fecha_emision_certificado").equals("null")) {
				certificado.setFecha_emision_certificado(null);
			} else {
				certificado.setFecha_emision_certificado(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_emision_certificado")));			
			}
			
			certificado.setCategoria_certificado(Categoria_Certificado.get(results.getString("categoria_certificado")));
			certificado.setCoste_certificado(results.getDouble("coste_certificado"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return certificado;
	}

	/**
	 * Adds the result data 2 proyecto.
	 *
	 * @param results the results
	 * @return the proyecto
	 */
	private Proyecto addResultData2Proyecto(ResultSet results) {
		Proyecto proyecto = new ProyectoImpl();
		try {
			proyecto.setId_proyecto(results.getInt("id_proyecto"));
			proyecto.setDescripcion_proyecto(results.getString("descripcion_proyecto"));
			proyecto.setId_cliente_proyecto(results.getInt("cliente_proyecto"));
			proyecto.setId_vivienda_proyecto(results.getInt("vivienda_proyecto"));
			proyecto.setId_inmueble_proyecto(results.getInt("inmueble_proyecto"));
			proyecto.setTipo_proyecto(Tipo_Proyecto.get(results.getString("tipo_proyecto")));
			if(results.getString("fecha_solicitud_proyecto").equals("null")) {
				proyecto.setFecha_solicitud_proyecto(null);
			} else {
				proyecto.setFecha_solicitud_proyecto(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_solicitud_proyecto")));			
			}
			if(results.getString("fecha_entrega_proyecto").equals("null")) {
				proyecto.setFecha_entrega_proyecto(null);
			} else {
				proyecto.setFecha_entrega_proyecto(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_entrega_proyecto")));			
			}
			proyecto.setDuracion_prevista_proyecto(results.getInt("duracion_prevista_proyecto"));
			proyecto.setPresupuesto_ejecucion_proyecto(results.getDouble("presupuesto_ejecucion_proyecto"));
			proyecto.setSuperficie_proyecto(results.getDouble("superficie_proyecto"));
			proyecto.setCoste_proyecto(results.getDouble("coste_proyecto"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proyecto;
	}
	
	/**
	 * Adds the result data 2 vivienda.
	 *
	 * @param results the results
	 * @return the vivienda
	 */
	private Vivienda addResultData2Vivienda(ResultSet results) {
		Vivienda vivienda = new ViviendaImpl();
		try {
			vivienda.setId_vivienda(results.getInt("id_vivienda"));
			vivienda.setDescripcion_vivienda(results.getString("descripcion_vivienda"));
			vivienda.setDireccion_vivienda(results.getString("direccion_vivienda"));
			vivienda.setId_inmueble_vivienda(results.getInt("id_inmueble_vivienda"));
			vivienda.setSuperficie_terreno_vivienda(results.getDouble("superficie_terreno_vivienda"));
			vivienda.setSuperficie_vivienda(results.getDouble("superficie_vivienda"));
			vivienda.setPlantas_vivienda(results.getInt("plantas_vivienda"));
			vivienda.setHabitaciones_vivienda(results.getInt("habitaciones_vivienda"));
			vivienda.setBanyos_vivienda(results.getInt("banyos_vivienda"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vivienda;
	}
	
	/**
	 * Adds the result data 2 inmueble.
	 *
	 * @param results the results
	 * @return the inmueble
	 */
	private Inmueble addResultData2Inmueble(ResultSet results) {
		Inmueble inmueble = new InmuebleImpl();
		try {
			inmueble.setId_inmueble(results.getInt("id_inmueble"));
			inmueble.setDescripcion_inmueble(results.getString("descripcion_inmueble"));
			inmueble.setDireccion_inmueble(results.getString("direccion_inmueble"));
			inmueble.setSuperficie_terreno_inmueble(results.getDouble("superficie_terreno_inmueble"));
			inmueble.setSuperficie_inmueble(results.getDouble("superficie_inmueble"));
			if(results.getString("fecha_construccion_inmueble").equals("null")) {
				inmueble.setFecha_construccion_inmueble(null);
			} else {
				inmueble.setFecha_construccion_inmueble(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_construccion_inmueble")));			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inmueble;
	}
	
	/**
	 * Adds the result data 2 asignar certificado.
	 *
	 * @param results the results
	 * @return the certificados asignados
	 */
	private Certificados_Asignados addResultData2AsignarCertificado(ResultSet results) {
		Certificados_Asignados certificados_Asignados = new Certificados_AsignadosImpl();
		try {
			certificados_Asignados.setId_certificado_asignado(results.getInt("id_certificado_asignado"));
			certificados_Asignados.setId_certificado_certificado_asignado(results.getInt("id_certificado_certificado_asignado"));
			certificados_Asignados.setId_arquitecto_certificado_asignado(results.getInt("arquitecto_certificado_asignado"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return certificados_Asignados;
	}
	
	/**
	 * Adds the result data 2 asignar proyecto.
	 *
	 * @param results the results
	 * @return the proyectos asignados
	 */
	private Proyectos_Asignados addResultData2AsignarProyecto(ResultSet results) {
		Proyectos_Asignados proyectos_Asignados = new Proyectos_AsignadosImpl();
		try {
			proyectos_Asignados.setId_proyecto_asignado(results.getInt("id_proyecto_asignado"));
			proyectos_Asignados.setId_proyecto_proyecto_asignado(results.getInt("id_proyecto_proyecto_asignado"));
			proyectos_Asignados.setId_arquitecto_proyecto_asignado(results.getInt("arquitecto_proyecto_asignado"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proyectos_Asignados;
	}
	
	/**
	 * Adds the result data 2 contratar proyecto.
	 *
	 * @param results the results
	 * @return the proyectos en ejecucion
	 */
	private Proyectos_En_Ejecucion addResultData2ContratarProyecto(ResultSet results) {
		Proyectos_En_Ejecucion proyectos_En_Ejecucion = new Proyectos_En_EjecucionImpl();
		try {
			proyectos_En_Ejecucion.setId_ejecucion_proyecto(results.getInt("id_ejecucion_proyecto"));
			proyectos_En_Ejecucion.setId_proyecto_ejecucion_proyecto(results.getInt("id_proyecto_ejecucion_proyecto"));
			if(results.getString("fecha_inicio_ejecucion_proyecto").equals("null")) {
				proyectos_En_Ejecucion.setFecha_inicio_ejecucion_proyecto(null);
			} else {
				proyectos_En_Ejecucion.setFecha_inicio_ejecucion_proyecto(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_inicio_ejecucion_proyecto")));			
			}
			
			proyectos_En_Ejecucion.setDuracion_prevista_ejecucion_proyecto(results.getInt("duracion_prevista_ejecucion_proyecto"));
			
			if(results.getString("fecha_fin_ejecucion_proyecto").equals("null")) {
				proyectos_En_Ejecucion.setFecha_fin_ejecucion_proyecto(null);
			} else {
				proyectos_En_Ejecucion.setFecha_fin_ejecucion_proyecto(new SimpleDateFormat("dd-MM-yyyy").parse((String) results.getString("fecha_fin_ejecucion_proyecto")));			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proyectos_En_Ejecucion;
	}
}
