/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

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

import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;

/**
 * @author JTE
 *
 */
public class Control_ProyectosImpl implements ArkiWeb.controlador.Control_Proyectos {

	/**
	 * 
	 */
	public Control_ProyectosImpl() {
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
	public void editarProyecto(int id_proyecto, String descripcion_proyecto, Certificado cliente_proyecto,
			int vivienda_proyecto, int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto,
			Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto,
			double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarContratacionProyecto(int id_ejecucion_proyecto, int id_proyecto_ejecucion_proyecto,
			Date fecha_inicio_ejecucion_proyecto, int duracion_prevista_ejecucion_proyecto,
			Date fecha_fin_ejecucion_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asignarProyecto(int id_proyecto_proyecto_asignado, int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contratarProyecto(int id_proyecto_ejecucion_proyecto, Date fecha_inicio_ejecucion_proyecto,
			int duracion_prevista_ejecucion_proyecto, Date fecha_fin_ejecucion_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crearProyecto(String descripcion_proyecto, Certificado cliente_proyecto, int vivienda_proyecto,
			int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto,
			Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto,
			double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarAsignacionProyecto(int id_proyecto_asignado, int id_proyecto_proyecto_asignado,
			int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

}
