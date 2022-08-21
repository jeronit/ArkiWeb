/**
 * 	@purpose:	Implementación de la Interface Proyecto
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

import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

/**
 * @author JTE
 *
 */
public class ProyectoImpl implements Proyecto {

	private int id_proyecto;
	private String descripcion_proyecto;
	private int id_cliente_proyecto;
	private int id_vivienda_proyecto;
	private int id_inmueble_proyecto;
	private Tipo_Proyecto tipo_proyecto;
	private Date fecha_solicitud_proyecto;
	private Date fecha_entrega_proyecto;
	private int duracion_prevista_proyecto;
	private double presupuesto_ejecucion_proyecto;
	private double superficie_proyecto;
	private double coste_proyecto;
	
	/**
	 * 
	 */
	public ProyectoImpl() {
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
	public Usuario getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsuario(Usuario value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vivienda getVivienda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVivienda(Vivienda value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Inmueble getInmueble() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInmueble(Inmueble value) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the id_proyecto
	 */
	@Override
	public int getId_proyecto() {
		return id_proyecto;
	}

	/**
	 * @param id_proyecto the id_proyecto to set
	 */
	@Override
	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}

	/**
	 * @return the descripcion_proyecto
	 */
	@Override
	public String getDescripcion_proyecto() {
		return descripcion_proyecto;
	}

	/**
	 * @param descripcion_proyecto the descripcion_proyecto to set
	 */
	@Override
	public void setDescripcion_proyecto(String descripcion_proyecto) {
		this.descripcion_proyecto = descripcion_proyecto;
	}

	/**
	 * @return the id_cliente_proyecto
	 */
	@Override
	public int getId_cliente_proyecto() {
		return id_cliente_proyecto;
	}

	/**
	 * @param id_cliente_proyecto the id_cliente_proyecto to set
	 */
	@Override
	public void setId_cliente_proyecto(int id_cliente_proyecto) {
		this.id_cliente_proyecto = id_cliente_proyecto;
	}

	/**
	 * @return the id_vivienda_proyecto
	 */
	@Override
	public int getId_vivienda_proyecto() {
		return id_vivienda_proyecto;
	}

	/**
	 * @param id_vivienda_proyecto the id_vivienda_proyecto to set
	 */
	@Override
	public void setId_vivienda_proyecto(int id_vivienda_proyecto) {
		this.id_vivienda_proyecto = id_vivienda_proyecto;
	}

	/**
	 * @return the id_inmueble_proyecto
	 */
	@Override
	public int getId_inmueble_proyecto() {
		return id_inmueble_proyecto;
	}

	/**
	 * @param id_inmueble_proyecto the id_inmueble_proyecto to set
	 */
	@Override
	public void setId_inmueble_proyecto(int id_inmueble_proyecto) {
		this.id_inmueble_proyecto = id_inmueble_proyecto;
	}

	/**
	 * @return the tipo_proyecto
	 */
	@Override
	public Tipo_Proyecto getTipo_proyecto() {
		return tipo_proyecto;
	}

	/**
	 * @param tipo_proyecto the tipo_proyecto to set
	 */
	@Override
	public void setTipo_proyecto(Tipo_Proyecto tipo_proyecto) {
		this.tipo_proyecto = tipo_proyecto;
	}

	/**
	 * @return the fecha_solicitud_proyecto
	 */
	@Override
	public Date getFecha_solicitud_proyecto() {
		return fecha_solicitud_proyecto;
	}

	/**
	 * @param fecha_solicitud_proyecto the fecha_solicitud_proyecto to set
	 */
	@Override
	public void setFecha_solicitud_proyecto(Date fecha_solicitud_proyecto) {
		this.fecha_solicitud_proyecto = fecha_solicitud_proyecto;
	}

	/**
	 * @return the fecha_entregad_proyecto
	 */
	@Override
	public Date getFecha_entrega_proyecto() {
		return fecha_entrega_proyecto;
	}

	/**
	 * @param fecha_entregad_proyecto the fecha_entregad_proyecto to set
	 */
	@Override
	public void setFecha_entrega_proyecto(Date fecha_entrega_proyecto) {
		this.fecha_entrega_proyecto = fecha_entrega_proyecto;
	}

	/**
	 * @return the duracion_prevista_proyecto
	 */
	@Override
	public int getDuracion_prevista_proyecto() {
		return duracion_prevista_proyecto;
	}

	/**
	 * @param duracion_prevista_proyecto the duracion_prevista_proyecto to set
	 */
	@Override
	public void setDuracion_prevista_proyecto(int duracion_prevista_proyecto) {
		this.duracion_prevista_proyecto = duracion_prevista_proyecto;
	}

	/**
	 * @return the presupuesto_ejecucion_proyecto
	 */
	@Override
	public double getPresupuesto_ejecucion_proyecto() {
		return presupuesto_ejecucion_proyecto;
	}

	/**
	 * @param presupuesto_ejecucion_proyecto the presupuesto_ejecucion_proyecto to set
	 */
	@Override
	public void setPresupuesto_ejecucion_proyecto(double presupuesto_ejecucion_proyecto) {
		this.presupuesto_ejecucion_proyecto = presupuesto_ejecucion_proyecto;
	}

	/**
	 * @return the superficie_proyecto
	 */
	public double getSuperficie_proyecto() {
		return superficie_proyecto;
	}

	/**
	 * @param superficie_proyecto the superficie_proyecto to set
	 */
	public void setSuperficie_proyecto(double superficie_proyecto) {
		this.superficie_proyecto = superficie_proyecto;
	}

	/**
	 * @return the coste_proyecto
	 */
	public double getCoste_proyecto() {
		return coste_proyecto;
	}

	/**
	 * @param coste_proyecto the coste_proyecto to set
	 */
	public void setCoste_proyecto(double coste_proyecto) {
		this.coste_proyecto = coste_proyecto;
	}

}
