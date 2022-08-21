/**
 * 	@purpose:	Implementación de la Interface Certificado
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

import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

/**
 * @author JTE
 *
 */
public class CertificadoImpl implements Certificado {

	private int id_certificado;
	private String descripcion_certificado;
	private int id_cliente_certificado;
	private int id_vivienda_certificado;
	private int id_inmueble_certificado;
	private Tipo_Certificado tipo_certificado;
	private Date fecha_solicitud_certificado;
	private Date fecha_entrega_certificado;
	private Date fecha_visita_certificado;
	private Date fecha_emision_certificado;
	private Categoria_Certificado categoria_certificado;
	private int id_arquitecto_certificado;
	private double coste_certificado;
	
	/**
	 * 
	 */
	public CertificadoImpl() {
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
	public Inmueble getInmueble() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInmueble(Inmueble value) {
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

	/**
	 * @return the id_certificado
	 */
	@Override
	public int getId_certificado() {
		return id_certificado;
	}

	/**
	 * @param id_certificado the id_certificado to set
	 */
	@Override
	public void setId_certificado(int id_certificado) {
		this.id_certificado = id_certificado;
	}

	/**
	 * @return the descripcion_certificado
	 */
	@Override
	public String getDescripcion_certificado() {
		return descripcion_certificado;
	}

	/**
	 * @param descripcion_certificado the descripcion_certificado to set
	 */
	@Override
	public void setDescripcion_certificado(String descripcion_certificado) {
		this.descripcion_certificado = descripcion_certificado;
	}

	/**
	 * @return the id_cliente_certificado
	 */
	@Override
	public int getId_cliente_certificado() {
		return id_cliente_certificado;
	}

	/**
	 * @param id_cliente_certificado the id_cliente_certificado to set
	 */
	@Override
	public void setId_cliente_certificado(int id_cliente_certificado) {
		this.id_cliente_certificado = id_cliente_certificado;
	}

	/**
	 * @return the id_vivienda_certificado
	 */
	@Override
	public int getId_vivienda_certificado() {
		return id_vivienda_certificado;
	}

	/**
	 * @param id_vivienda_certificado the id_vivienda_certificado to set
	 */
	@Override
	public void setId_vivienda_certificado(int id_vivienda_certificado) {
		this.id_vivienda_certificado = id_vivienda_certificado;
	}

	/**
	 * @return the id_inmueble_certificado
	 */
	@Override
	public int getId_inmueble_certificado() {
		return id_inmueble_certificado;
	}

	/**
	 * @param id_inmueble_certificado the id_inmueble_certificado to set
	 */
	@Override
	public void setId_inmueble_certificado(int id_inmueble_certificado) {
		this.id_inmueble_certificado = id_inmueble_certificado;
	}
	
	/**
	 * @return the tipo_certificado
	 */
	@Override
	public Tipo_Certificado getTipo_certificado() {
		return tipo_certificado;
	}

	/**
	 * @param tipo_certificado the tipo_certificado to set
	 */
	@Override
	public void setTipo_certificado(Tipo_Certificado tipo_certificado) {
		this.tipo_certificado = tipo_certificado;
	}

	/**
	 * @return the fecha_solicitud_certificado
	 */
	@Override
	public Date getFecha_solicitud_certificado() {
		return fecha_solicitud_certificado;
	}

	/**
	 * @param fecha_solicitud_certificado the fecha_solicitud_certificado to set
	 */
	@Override
	public void setFecha_solicitud_certificado(Date fecha_solicitud_certificado) {
		this.fecha_solicitud_certificado = fecha_solicitud_certificado;
	}

	/**
	 * @return the fecha_entrega_certificado
	 */
	@Override
	public Date getFecha_entrega_certificado() {
		return fecha_entrega_certificado;
	}

	/**
	 * @param fecha_entrega_certificado the fecha_entrega_certificado to set
	 */
	@Override
	public void setFecha_entrega_certificado(Date fecha_entrega_certificado) {
		this.fecha_entrega_certificado = fecha_entrega_certificado;
	}

	/**
	 * @return the fecha_visita_certificado
	 */
	@Override
	public Date getFecha_visita_certificado() {
		return fecha_visita_certificado;
	}

	/**
	 * @param fecha_visita_certificado the fecha_visita_certificado to set
	 */
	@Override
	public void setFecha_visita_certificado(Date fecha_visita_certificado) {
		this.fecha_visita_certificado = fecha_visita_certificado;
	}

	/**
	 * @return the fecha_emision_certificado
	 */
	@Override
	public Date getFecha_emision_certificado() {
		return fecha_emision_certificado;
	}

	/**
	 * @param fecha_emision_certificado the fecha_emision_certificado to set
	 */
	@Override
	public void setFecha_emision_certificado(Date fecha_emision_certificado) {
		this.fecha_emision_certificado = fecha_emision_certificado;
	}

	/**
	 * @return the categoria_certificado
	 */
	@Override
	public Categoria_Certificado getCategoria_certificado() {
		return categoria_certificado;
	}

	/**
	 * @param categoria_certificado the categoria_certificado to set
	 */
	@Override
	public void setCategoria_certificado(Categoria_Certificado categoria_certificado) {
		this.categoria_certificado = categoria_certificado;
	}

	/**
	 * @return the id_arquitecto_certificado
	 */
	@Override
	public int getId_arquitecto_certificado() {
		return id_arquitecto_certificado;
	}

	/**
	 * @param id_arquitecto_certificado the id_arquitecto_certificado to set
	 */
	@Override
	public void setId_arquitecto_certificado(int id_arquitecto_certificado) {
		this.id_arquitecto_certificado = id_arquitecto_certificado;
	}

	/**
	 * @return the coste_certificado
	 */
	@Override
	public double getCoste_certificado() {
		return coste_certificado;
	}

	/**
	 * @param coste_certificado the coste_certificado to set
	 */
	@Override
	public void setCoste_certificado(double coste_certificado) {
		this.coste_certificado = coste_certificado;
	}
	
}
