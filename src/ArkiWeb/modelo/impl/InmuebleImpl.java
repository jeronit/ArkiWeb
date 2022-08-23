/**
 * 	@purpose:	Implementación de la Interface Inmueble
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo.impl;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;

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

// TODO: Auto-generated Javadoc
/**
 * The Class InmuebleImpl.
 *
 * @author JTE
 */
public class InmuebleImpl implements Inmueble {

	/** The id inmueble. */
	private int id_inmueble;
	
	/** The descripcion inmueble. */
	private String descripcion_inmueble;
	
	/** The direccion inmueble. */
	private String direccion_inmueble;
	
	/** The superficie inmueble. */
	private double superficie_inmueble;
	
	/** The superficie terreno inmueble. */
	private double superficie_terreno_inmueble;
		
	/**
	 * Instantiates a new inmueble impl.
	 */
	public InmuebleImpl() {
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
	 * Gets the vivienda.
	 *
	 * @return the vivienda
	 */
	@Override
	public EList<Vivienda> getVivienda() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gets the id inmueble.
	 *
	 * @return the id_inmueble
	 */
	@Override
	public int getId_inmueble() {
		return id_inmueble;
	}

	/**
	 * Sets the id inmueble.
	 *
	 * @param id_inmueble the id_inmueble to set
	 */
	@Override
	public void setId_inmueble(int id_inmueble) {
		this.id_inmueble = id_inmueble;
	}

	/**
	 * Gets the descripcion inmueble.
	 *
	 * @return the descripcion_inmueble
	 */
	@Override
	public String getDescripcion_inmueble() {
		return descripcion_inmueble;
	}

	/**
	 * Sets the descripcion inmueble.
	 *
	 * @param descripcion_inmueble the descripcion_inmueble to set
	 */
	@Override
	public void setDescripcion_inmueble(String descripcion_inmueble) {
		this.descripcion_inmueble = descripcion_inmueble;
	}

	/**
	 * Gets the direccion inmueble.
	 *
	 * @return the direccion_inmueble
	 */
	@Override
	public String getDireccion_inmueble() {
		return direccion_inmueble;
	}

	/**
	 * Sets the direccion inmueble.
	 *
	 * @param direccion_inmueble the direccion_inmueble to set
	 */
	@Override
	public void setDireccion_inmueble(String direccion_inmueble) {
		this.direccion_inmueble = direccion_inmueble;
	}

	/**
	 * Gets the superficie inmueble.
	 *
	 * @return the superficie_inmueble
	 */
	@Override
	public double getSuperficie_inmueble() {
		return superficie_inmueble;
	}

	/**
	 * Sets the superficie inmueble.
	 *
	 * @param superficie_inmueble the superficie_inmueble to set
	 */
	@Override
	public void setSuperficie_inmueble(double superficie_inmueble) {
		this.superficie_inmueble = superficie_inmueble;
	}

	/**
	 * Gets the superficie terreno inmueble.
	 *
	 * @return the superficie_terreno_inmueble
	 */
	@Override
	public double getSuperficie_terreno_inmueble() {
		return superficie_terreno_inmueble;
	}

	/**
	 * Sets the superficie terreno inmueble.
	 *
	 * @param superficie_terreno_inmueble the superficie_terreno_inmueble to set
	 */
	@Override
	public void setSuperficie_terreno_inmueble(double superficie_terreno_inmueble) {
		this.superficie_terreno_inmueble = superficie_terreno_inmueble;
	}

	/**
	 * Gets the fecha construccion inmueble.
	 *
	 * @return the fecha construccion inmueble
	 */
	@Override
	public LocalDateTime getFecha_construccion_inmueble() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Sets the fecha construccion inmueble.
	 *
	 * @param fecha_construccion_inmueble the new fecha construccion inmueble
	 */
	@Override
	public void setFecha_construccion_inmueble(LocalDateTime fecha_construccion_inmueble) {
		// TODO Auto-generated method stub
		
	}

	

}
