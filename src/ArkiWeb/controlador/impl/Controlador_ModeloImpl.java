/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
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

import ArkiWeb.controlador.Controlador_Modelo;
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

/**
 * @author JTE
 *
 */
public class Controlador_ModeloImpl implements Controlador_Modelo {

	/**
	 * 
	 */
	public Controlador_ModeloImpl() {
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

	@Override
	public void crearUsuario(String nombre_usuario, String apellido_usuario, String dni_usuario, int telefono_usuario,
			String email_usuario, String domicilio_usuario, String contrasenya_usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarUsuario_1(int id_usuario, String nombre_usuario, String apellido_usuario, String dni_usuario,
			int telefono_usuario, String email_usuario, String domicilio_usuario, String contrasenya_usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario bajaUsuario(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearPermiso(String descripcion_permiso, String objeto_permiso, boolean lectura_permiso,
			boolean escritura_permiso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarPermiso(int id_permiso, String descripcion_permiso, String objeto_permiso,
			boolean lectura_permiso, boolean escritura_permiso) {
		// TODO Auto-generated method stub

	}

	@Override
	public Permiso buscarPermiso(int id_permiso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearCertificado(String descripcion_certificado, Certificado cliente_certificado,
			int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado,
			Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado,
			Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado,
			double coste_certificado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarCertificado(int id_certificado, String descripcion_certificado, int cliente_certificado,
			int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado,
			Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado,
			Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado,
			double coste_certificado) {
		// TODO Auto-generated method stub

	}

	@Override
	public Certificado buscarCertificado(int id_certificado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearProyecto(String descripcion_proyecto, Certificado cliente_proyecto, int vivienda_proyecto,
			int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto,
			Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto,
			double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarProyecto(int id_proyecto, String descripcion_proyecto, Certificado cliente_proyecto,
			int vivienda_proyecto, int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto,
			Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto,
			double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public Proyecto buscarProyecto(int id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearVivienda(String descripcion_vivienda, String direccion_vivienda, int id_inmueble_vivienda,
			double superficie_terreno_vivienda, double superficie_vivienda, int plantas_vivienda,
			int habitaciones_vivienda, int banyos_vivienda) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarVivienda(int id_vivienda, String descripcion_vivienda, String direccion_vivienda,
			int id_inmueble_vivienda, double superficie_terreno_vivienda, double superficie_vivienda,
			int plantas_vivienda, int habitaciones_vivienda, int banyos_vivienda) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vivienda buscarVivienda(int id_vivienda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearInmueble(String descripcion_inmueble, String direccion_inmueble,
			double superficie_terreno_inmueble, double superficie_inmueble) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarInmueble(int id_inmueble, String descripcion_inmueble, String direccion_inmueble,
			double superficie_terreno_inmueble, double superficie_inmueble) {
		// TODO Auto-generated method stub

	}

	@Override
	public Inmueble buscarInmueble(int id_inmueble) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void asignarCertificado(int id_certificado_certificado_asignado, int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarAsignacionCertificado(int id_certificado_asignado, int id_certificado_certificado_asignado,
			int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asignarProyecto(int id_proyecto_proyecto_asignado, int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarAsignacionProyecto(int id_proyecto_asignado, int id_proyecto_proyecto_asignado,
			int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contratarProyecto(int id_proyecto_ejecucion_proyecto, Date fecha_inicio_ejecucion_proyecto,
			int duracion_prevista_ejecucion_proyecto, Date fecha_fin_ejecucion_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarContratacionProyecto(int id_ejecucion_proyecto, int id_proyecto_ejecucion_proyecto,
			Date fecha_inicio_ejecucion_proyecto, int duracion_prevista_ejecucion_proyecto,
			Date fecha_fin_ejecucion_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void queryCrear(String tabla, List<String> columnas, List<String> valores_columnas) {
		// TODO Auto-generated method stub

	}

	@Override
	public void queryEditar(String tabla, List<String> columnas, List<String> valores_columnas, String where_clause) {
		// TODO Auto-generated method stub

	}

	@Override
	public void queryBuscar(String tabla, List<String> columnas, String where_clause_01) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cambiarContrasenya(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permiso> listarPermisos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> listarProyectos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> listarCertificados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vivienda> listarViviendas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inmueble> listarInmuebles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarUsuario(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> buscarMisProyectos(int id_Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> buscarProyectosPorUsuario(int id_Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarMisCertificados(int id_Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorUsuario(int id_Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorVivienda(int id_vivienda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorInmueble(int id_Inmueble) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorEdadInmueble(int edad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorEdadCertificadoHabitabilidad(int edad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

}
