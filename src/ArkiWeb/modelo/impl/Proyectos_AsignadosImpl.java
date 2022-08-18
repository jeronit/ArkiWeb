/**
 * 	@purpose:	
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
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Usuario;

/**
 * @author JTE
 *
 */
public class Proyectos_AsignadosImpl implements Proyectos_Asignados {

	private int id_proyecto_asignado;
	private int id_proyecto_proyecto_asignado;
	private int id_arquitecto_proyecto_asignado;
	
	/**
	 * 
	 */
	public Proyectos_AsignadosImpl() {
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

	@Override
	public Usuario getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsuario(Usuario value) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the id_proyecto_asignado
	 */
	@Override
	public int getId_proyecto_asignado() {
		return id_proyecto_asignado;
	}

	/**
	 * @param id_proyecto_asignado the id_proyecto_asignado to set
	 */
	@Override
	public void setId_proyecto_asignado(int id_proyecto_asignado) {
		this.id_proyecto_asignado = id_proyecto_asignado;
	}

	/**
	 * @return the id_proyecto_proyecto_asignado
	 */
	@Override
	public int getId_proyecto_proyecto_asignado() {
		return id_proyecto_proyecto_asignado;
	}

	/**
	 * @param id_proyecto_proyecto_asignado the id_proyecto_proyecto_asignado to set
	 */
	@Override
	public void setId_proyecto_proyecto_asignado(int id_proyecto_proyecto_asignado) {
		this.id_proyecto_proyecto_asignado = id_proyecto_proyecto_asignado;
	}

	/**
	 * @return the id_arquitecto_proyecto_asignado
	 */
	@Override
	public int getId_arquitecto_proyecto_asignado() {
		return id_arquitecto_proyecto_asignado;
	}

	/**
	 * @param id_arquitecto_proyecto_asignado the id_arquitecto_proyecto_asignado to set
	 */
	@Override
	public void setId_arquitecto_proyecto_asignado(int id_arquitecto_proyecto_asignado) {
		this.id_arquitecto_proyecto_asignado = id_arquitecto_proyecto_asignado;
	}

}
