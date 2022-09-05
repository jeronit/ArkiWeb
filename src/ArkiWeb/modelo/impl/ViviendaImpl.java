/**
 * 	@purpose:	Implementaci�n de la Interface Vivienda
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

import ArkiWeb.modelo.Vivienda;

// TODO: Auto-generated Javadoc
/**
 * The Class ViviendaImpl.
 *
 * @author JTE
 */
public class ViviendaImpl implements Vivienda {

	/** The id vivienda. */
	private int id_vivienda;
	
	/** The descripcion vivienda. */
	private String descripcion_vivienda;
	
	/** The direccion vivienda. */
	private String direccion_vivienda;
	
	/** The id inmueble vivienda. */
	private int id_inmueble_vivienda;
	
	/** The superficie vivienda. */
	private double superficie_vivienda;
	
	/** The superficie terreno vivienda. */
	private double superficie_terreno_vivienda;
	
	/** The plantas vivienda. */
	private int plantas_vivienda;
	
	/** The habitaciones vivienda. */
	private int habitaciones_vivienda;
	
	/** The banyos vivienda. */
	private int banyos_vivienda;
	
	/**
	 * Instantiates a new vivienda impl.
	 */
	public ViviendaImpl() {
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
	 * Gets the id vivienda.
	 *
	 * @return the id_vivienda
	 */
	@Override
	public int getId_vivienda() {
		return id_vivienda;
	}

	/**
	 * Sets the id vivienda.
	 *
	 * @param id_vivienda the id_vivienda to set
	 */
	@Override
	public void setId_vivienda(int id_vivienda) {
		this.id_vivienda = id_vivienda;
	}

	/**
	 * Gets the descripcion vivienda.
	 *
	 * @return the descripcion_vivienda
	 */
	@Override
	public String getDescripcion_vivienda() {
		return descripcion_vivienda;
	}

	/**
	 * Sets the descripcion vivienda.
	 *
	 * @param descripcion_vivienda the descripcion_vivienda to set
	 */
	@Override
	public void setDescripcion_vivienda(String descripcion_vivienda) {
		this.descripcion_vivienda = descripcion_vivienda;
	}

	/**
	 * Gets the direccion vivienda.
	 *
	 * @return the direccion_vivienda
	 */
	@Override
	public String getDireccion_vivienda() {
		return direccion_vivienda;
	}

	/**
	 * Sets the direccion vivienda.
	 *
	 * @param direccion_vivienda the direccion_vivienda to set
	 */
	@Override
	public void setDireccion_vivienda(String direccion_vivienda) {
		this.direccion_vivienda = direccion_vivienda;
	}

	/**
	 * Gets the id inmueble vivienda.
	 *
	 * @return the id_inmueble_vivienda
	 */
	@Override
	public int getId_inmueble_vivienda() {
		return id_inmueble_vivienda;
	}

	/**
	 * Sets the id inmueble vivienda.
	 *
	 * @param id_inmueble_vivienda the id_inmueble_vivienda to set
	 */
	@Override
	public void setId_inmueble_vivienda(int id_inmueble_vivienda) {
		this.id_inmueble_vivienda = id_inmueble_vivienda;
	}

	/**
	 * Gets the superficie vivienda.
	 *
	 * @return the superficie_vivienda
	 */
	@Override
	public double getSuperficie_vivienda() {
		return superficie_vivienda;
	}

	/**
	 * Sets the superficie vivienda.
	 *
	 * @param superficie_vivienda the superficie_vivienda to set
	 */
	@Override
	public void setSuperficie_vivienda(double superficie_vivienda) {
		this.superficie_vivienda = superficie_vivienda;
	}

	/**
	 * Gets the superficie terreno vivienda.
	 *
	 * @return the superficie_terreno_vivienda
	 */
	@Override
	public double getSuperficie_terreno_vivienda() {
		return superficie_terreno_vivienda;
	}

	/**
	 * Sets the superficie terreno vivienda.
	 *
	 * @param superficie_terreno_vivienda the superficie_terreno_vivienda to set
	 */
	@Override
	public void setSuperficie_terreno_vivienda(double superficie_terreno_vivienda) {
		this.superficie_terreno_vivienda = superficie_terreno_vivienda;
	}

	/**
	 * Gets the plantas vivienda.
	 *
	 * @return the plantas_vivienda
	 */
	@Override
	public int getPlantas_vivienda() {
		return plantas_vivienda;
	}

	/**
	 * Sets the plantas vivienda.
	 *
	 * @param plantas_vivienda the plantas_vivienda to set
	 */
	@Override
	public void setPlantas_vivienda(int plantas_vivienda) {
		this.plantas_vivienda = plantas_vivienda;
	}

	/**
	 * Gets the habitaciones vivienda.
	 *
	 * @return the habitaciones_vivienda
	 */
	@Override
	public int getHabitaciones_vivienda() {
		return habitaciones_vivienda;
	}

	/**
	 * Sets the habitaciones vivienda.
	 *
	 * @param habitaciones_vivienda the habitaciones_vivienda to set
	 */
	@Override
	public void setHabitaciones_vivienda(int habitaciones_vivienda) {
		this.habitaciones_vivienda = habitaciones_vivienda;
	}

	/**
	 * Gets the banyos vivienda.
	 *
	 * @return the banyos_vivienda
	 */
	@Override
	public int getBanyos_vivienda() {
		return banyos_vivienda;
	}

	/**
	 * Sets the banyos vivienda.
	 *
	 * @param banyos_vivienda the banyos_vivienda to set
	 */
	@Override
	public void setBanyos_vivienda(int banyos_vivienda) {
		this.banyos_vivienda = banyos_vivienda;
	}

	

}
