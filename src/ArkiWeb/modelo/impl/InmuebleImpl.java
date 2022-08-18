/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo.impl;

import java.lang.reflect.InvocationTargetException;

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

import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Vivienda;

/**
 * @author JTE
 *
 */
public class InmuebleImpl implements Inmueble {

	private int id_inmueble;
	private String descripcion_inmueble;
	private String direccion_inmueble;
	private double superficie_inmueble;
	private double superficie_terreno_inmueble;
		
	/**
	 * 
	 */
	public InmuebleImpl() {
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
	public EList<Vivienda> getVivienda() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the id_inmueble
	 */
	@Override
	public int getId_inmueble() {
		return id_inmueble;
	}

	/**
	 * @param id_inmueble the id_inmueble to set
	 */
	@Override
	public void setId_inmueble(int id_inmueble) {
		this.id_inmueble = id_inmueble;
	}

	/**
	 * @return the descripcion_inmueble
	 */
	@Override
	public String getDescripcion_inmueble() {
		return descripcion_inmueble;
	}

	/**
	 * @param descripcion_inmueble the descripcion_inmueble to set
	 */
	@Override
	public void setDescripcion_inmueble(String descripcion_inmueble) {
		this.descripcion_inmueble = descripcion_inmueble;
	}

	/**
	 * @return the direccion_inmueble
	 */
	@Override
	public String getDireccion_inmueble() {
		return direccion_inmueble;
	}

	/**
	 * @param direccion_inmueble the direccion_inmueble to set
	 */
	@Override
	public void setDireccion_inmueble(String direccion_inmueble) {
		this.direccion_inmueble = direccion_inmueble;
	}

	/**
	 * @return the superficie_inmueble
	 */
	@Override
	public double getSuperficie_inmueble() {
		return superficie_inmueble;
	}

	/**
	 * @param superficie_inmueble the superficie_inmueble to set
	 */
	@Override
	public void setSuperficie_inmueble(double superficie_inmueble) {
		this.superficie_inmueble = superficie_inmueble;
	}

	/**
	 * @return the superficie_terreno_inmueble
	 */
	@Override
	public double getSuperficie_terreno_inmueble() {
		return superficie_terreno_inmueble;
	}

	/**
	 * @param superficie_terreno_inmueble the superficie_terreno_inmueble to set
	 */
	@Override
	public void setSuperficie_terreno_inmueble(double superficie_terreno_inmueble) {
		this.superficie_terreno_inmueble = superficie_terreno_inmueble;
	}

	

}
