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
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;
import ArkiWeb.modelo.impl.Certificados_AsignadosImpl;
import ArkiWeb.modelo.impl.Proyectos_AsignadosImpl;
import ArkiWeb.modelo.impl.Proyectos_En_EjecucionImpl;

/**
 * @author JTE
 *
 */
public class Gestor_BusquedasImpl implements Gestor_Busquedas {

	/**
	 * 
	 */
	public Gestor_BusquedasImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eInvoke(EOperation arg0, EList<?> arg1) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eIsSet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eUnset(EStructuralFeature arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eNotify(Notification arg0) {
		// TODO Auto-generated method stub

	}

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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, null);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Usuario) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un inmueble.
	 * <!-- end-user-doc -->
	 * @return			Inmueble			Inmueble
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 */
	@Override
	public Inmueble buscarInmueble(int id_inmueble) {
		
		return ArkiWeb.controlador.Borrar.db.buscarInmueble(id_inmueble);
		
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, null);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Permiso) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, null);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Proyecto) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, null);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Certificado) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, null);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Vivienda) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, null);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Inmueble) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Permiso) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado = (Usuario) results;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
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

		return ArkiWeb.controlador.Borrar.db.buscarVivienda(id_vivienda);
		
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado = (Proyecto) results;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		return ArkiWeb.controlador.Borrar.db.buscarCertificado(id_certificado);

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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Proyecto) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Certificado) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Certificado) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Certificado) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String innerQueryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tablaInnerQuery, columnasInnerQuery, where_clauseInnerQuery);
		
		String tabla = "CERTIFICADOS";
		String where_clause = "inmueble_certificado IN (" + innerQueryString + ")";
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Certificado) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado.add((Certificado) results);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca la asignación de un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_usuario		int					Id
	 * @param	id_proyecto		int					Id
	 * @return			Proyectos_Asignados			Asignación de un arquitecto a un proyecto
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 */
	@Override
	public Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto) {
		
		Proyectos_Asignados resultado = new Proyectos_AsignadosImpl();
		
		String tabla = "ASIGNACION_PROYECTOS";
		String where_clause = "id_proyecto_proyecto_asignado = " + id_proyecto + " AND arquitecto_proyecto_asignado = " + id_usuario;
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado = (Proyectos_Asignados) results;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca la contratación de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto		int					Id
	 * @return			Proyectos_En_Ejecucion		Contratación de un proyecto
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 */
	@Override
	public Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto) {
		
		Proyectos_En_Ejecucion resultado = new Proyectos_En_EjecucionImpl();
		
		String tabla = "PROYECTOS_CONTRATADOS";
		String where_clause = "id_proyecto_ejecucion_proyecto = " + id_proyecto;
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado = (Proyectos_En_Ejecucion) results;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Busca la asignación de un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	id_usuario			int					Id
	 * @param	id_certificado		int					Id
	 * @return			List<Certificados_Asignados>		Asignación de un arquitecto a un certificado
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 */
	@Override
	public Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado) {
		
		Certificados_Asignados resultado = new Certificados_AsignadosImpl();
		
		String tabla = "ASIGNACION_CERTIFICADOS";
		String where_clause = "id_certificado_certificado_asignado = " + id_certificado + " AND arquitecto_certificado_asignado = " + id_usuario;
		String queryString = ArkiWeb.controlador.Borrar.db.queryBuscar(tabla, null, where_clause);
		ResultSet results = (ResultSet) ArkiWeb.controlador.Borrar.db.queryEjecutar(queryString);
		
		try {
			while(results.next()) {
				resultado = (Certificados_Asignados) results;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	

}
