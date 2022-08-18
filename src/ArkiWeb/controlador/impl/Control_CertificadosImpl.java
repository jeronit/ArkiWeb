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

import ArkiWeb.controlador.Control_Certificados;
import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Tipo_Certificado;

/**
 * @author JTE
 *
 */
public class Control_CertificadosImpl implements Control_Certificados {

	/**
	 * 
	 */
	public Control_CertificadosImpl() {
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
	public void editarCertificado(int id_certificado, String descripcion_certificado, int cliente_certificado,
			int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado,
			Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado,
			Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado,
			double coste_certificado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asignarCertificado(int id_certificado_certificado_asignado, int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarAsignacionCertificado(int id_certificado_asignado, int id_certificado_certificado_asignado,
			int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crearCertificado(String descripcion_certificado, Certificado cliente_certificado,
			int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado,
			Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado,
			Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado,
			double coste_certificado) {
		// TODO Auto-generated method stub

	}

}
