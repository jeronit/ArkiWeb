/**
 * 	@purpose:	Implementación de la Interface Proyectos_En_Ejecucion
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo.impl;

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

import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;

/**
 * @author JTE
 *
 */
public class Proyectos_En_EjecucionImpl implements Proyectos_En_Ejecucion {

	private int id_ejecucion_proyecto;
	private int id_proyecto_ejecucion_proyecto;
	private Date fecha_inicio_ejecucion_proyecto;
	private int duracion_prevista_ejecucion_proyecto;
	private Date fecha_fin_ejecucion_proyecto;
	
	
	/**
	 * 
	 */
	public Proyectos_En_EjecucionImpl() {
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
	public Proyecto getProyecto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProyecto(Proyecto value) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the id_ejecucion_proyecto
	 */
	@Override
	public int getId_ejecucion_proyecto() {
		return id_ejecucion_proyecto;
	}

	/**
	 * @param id_ejecucion_proyecto the id_ejecucion_proyecto to set
	 */
	@Override
	public void setId_ejecucion_proyecto(int id_ejecucion_proyecto) {
		this.id_ejecucion_proyecto = id_ejecucion_proyecto;
	}

	/**
	 * @return the id_proyecto_ejecucion_proyecto
	 */
	@Override
	public int getId_proyecto_ejecucion_proyecto() {
		return id_proyecto_ejecucion_proyecto;
	}

	/**
	 * @param id_proyecto_ejecucion_proyecto the id_proyecto_ejecucion_proyecto to set
	 */
	@Override
	public void setId_proyecto_ejecucion_proyecto(int id_proyecto_ejecucion_proyecto) {
		this.id_proyecto_ejecucion_proyecto = id_proyecto_ejecucion_proyecto;
	}

	/**
	 * @return the fecha_inicio_ejecucion_proyecto
	 */
	@Override
	public Date getFecha_inicio_ejecucion_proyecto() {
		return fecha_inicio_ejecucion_proyecto;
	}

	/**
	 * @param fecha_inicio_ejecucion_proyecto the fecha_inicio_ejecucion_proyecto to set
	 */
	@Override
	public void setFecha_inicio_ejecucion_proyecto(Date fecha_inicio_ejecucion_proyecto) {
		this.fecha_inicio_ejecucion_proyecto = fecha_inicio_ejecucion_proyecto;
	}

	/**
	 * @return the duracion_prevista_ejecucion_proyecto
	 */
	@Override
	public int getDuracion_prevista_ejecucion_proyecto() {
		return duracion_prevista_ejecucion_proyecto;
	}

	/**
	 * @param duracion_prevista_ejecucion_proyecto the duracion_prevista_ejecucion_proyecto to set
	 */
	@Override
	public void setDuracion_prevista_ejecucion_proyecto(int duracion_prevista_ejecucion_proyecto) {
		this.duracion_prevista_ejecucion_proyecto = duracion_prevista_ejecucion_proyecto;
	}

	/**
	 * @return the fecha_fin_ejecucion_proyecto
	 */
	@Override
	public Date getFecha_fin_ejecucion_proyecto() {
		return fecha_fin_ejecucion_proyecto;
	}

	/**
	 * @param fecha_fin_ejecucion_proyecto the fecha_fin_ejecucion_proyecto to set
	 */
	@Override
	public void setFecha_fin_ejecucion_proyecto(Date fecha_fin_ejecucion_proyecto) {
		this.fecha_fin_ejecucion_proyecto = fecha_fin_ejecucion_proyecto;
	}

}
