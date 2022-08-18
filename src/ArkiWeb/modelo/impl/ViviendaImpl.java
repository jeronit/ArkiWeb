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

import ArkiWeb.modelo.Vivienda;

/**
 * @author JTE
 *
 */
public class ViviendaImpl implements Vivienda {

	private int id_vivienda;
	private String descripcion_vivienda;
	private String direccion_vivienda;
	private int id_inmueble_vivienda;
	private double superficie_vivienda;
	private double superficie_terreno_vivienda;
	private int plantas_vivienda;
	private int habitaciones_vivienda;
	private int banyos_vivienda;
	
	/**
	 * 
	 */
	public ViviendaImpl() {
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
	 * @return the id_vivienda
	 */
	@Override
	public int getId_vivienda() {
		return id_vivienda;
	}

	/**
	 * @param id_vivienda the id_vivienda to set
	 */
	@Override
	public void setId_vivienda(int id_vivienda) {
		this.id_vivienda = id_vivienda;
	}

	/**
	 * @return the descripcion_vivienda
	 */
	@Override
	public String getDescripcion_vivienda() {
		return descripcion_vivienda;
	}

	/**
	 * @param descripcion_vivienda the descripcion_vivienda to set
	 */
	@Override
	public void setDescripcion_vivienda(String descripcion_vivienda) {
		this.descripcion_vivienda = descripcion_vivienda;
	}

	/**
	 * @return the direccion_vivienda
	 */
	@Override
	public String getDireccion_vivienda() {
		return direccion_vivienda;
	}

	/**
	 * @param direccion_vivienda the direccion_vivienda to set
	 */
	@Override
	public void setDireccion_vivienda(String direccion_vivienda) {
		this.direccion_vivienda = direccion_vivienda;
	}

	/**
	 * @return the id_inmueble_vivienda
	 */
	@Override
	public int getId_inmueble_vivienda() {
		return id_inmueble_vivienda;
	}

	/**
	 * @param id_inmueble_vivienda the id_inmueble_vivienda to set
	 */
	@Override
	public void setId_inmueble_vivienda(int id_inmueble_vivienda) {
		this.id_inmueble_vivienda = id_inmueble_vivienda;
	}

	/**
	 * @return the superficie_vivienda
	 */
	@Override
	public double getSuperficie_vivienda() {
		return superficie_vivienda;
	}

	/**
	 * @param superficie_vivienda the superficie_vivienda to set
	 */
	@Override
	public void setSuperficie_vivienda(double superficie_vivienda) {
		this.superficie_vivienda = superficie_vivienda;
	}

	/**
	 * @return the superficie_terreno_vivienda
	 */
	@Override
	public double getSuperficie_terreno_vivienda() {
		return superficie_terreno_vivienda;
	}

	/**
	 * @param superficie_terreno_vivienda the superficie_terreno_vivienda to set
	 */
	@Override
	public void setSuperficie_terreno_vivienda(double superficie_terreno_vivienda) {
		this.superficie_terreno_vivienda = superficie_terreno_vivienda;
	}

	/**
	 * @return the plantas_vivienda
	 */
	@Override
	public int getPlantas_vivienda() {
		return plantas_vivienda;
	}

	/**
	 * @param plantas_vivienda the plantas_vivienda to set
	 */
	@Override
	public void setPlantas_vivienda(int plantas_vivienda) {
		this.plantas_vivienda = plantas_vivienda;
	}

	/**
	 * @return the habitaciones_vivienda
	 */
	@Override
	public int getHabitaciones_vivienda() {
		return habitaciones_vivienda;
	}

	/**
	 * @param habitaciones_vivienda the habitaciones_vivienda to set
	 */
	@Override
	public void setHabitaciones_vivienda(int habitaciones_vivienda) {
		this.habitaciones_vivienda = habitaciones_vivienda;
	}

	/**
	 * @return the banyos_vivienda
	 */
	@Override
	public int getBanyos_vivienda() {
		return banyos_vivienda;
	}

	/**
	 * @param banyos_vivienda the banyos_vivienda to set
	 */
	@Override
	public void setBanyos_vivienda(int banyos_vivienda) {
		this.banyos_vivienda = banyos_vivienda;
	}

	

}
