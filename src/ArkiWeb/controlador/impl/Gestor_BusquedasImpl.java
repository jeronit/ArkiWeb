/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
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
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

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

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inmueble buscarInmueble(int id_inmueble) {
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
	public List<Permiso> listarPermisosUsuario(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarUsuario(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vivienda buscarVivienda(int id_vivienda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto buscarProyecto(int id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certificado buscarCertificado(int id_certificado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> buscarMisProyectos(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> buscarProyectosPorUsuario(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarMisCertificados(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorUsuario(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorVivienda(int id_vivienda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificado> buscarCertificadosPorInmueble(int id_inmueble) {
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
	public Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certificados_Asignados> buscarAsignacionCertificado(int id_usuario, int id_certificado) {
		// TODO Auto-generated method stub
		return null;
	}

}
