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
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Tipo_Certificado;

// TODO: Auto-generated Javadoc
/**
 * The Class Control_CertificadosImpl.
 *
 * @author JTE
 */
public class Control_CertificadosImpl implements Control_Certificados {

	/**
	 * Instantiates a new control certificados impl.
	 */
	public Control_CertificadosImpl() {
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
	 * <!-- begin-user-doc -->
	 * Edita un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado			Certificado			Certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 */
	@Override
	public void editarCertificado(Certificado certificado) {
		
		ArkiWeb.controlador.Borrar.db.editarCertificado(certificado);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado			Certificado			Certificado
	 * @param		id_arquitecto		Integer				Id arquitecto
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 */
	@Override
	public void asignarCertificado(Certificado certificado, Integer id_arquitecto) {

		Certificados_Asignados certificado_Asignado = (Certificados_Asignados) ArkiWeb.controlador.Borrar.factory.crearObjeto("Certificados_Asignados");
		
		certificado_Asignado.setId_arquitecto_certificado_asignado(id_arquitecto);
		certificado_Asignado.setId_certificado_certificado_asignado(certificado.getId_certificado());
		
		ArkiWeb.controlador.Borrar.db.asignarCertificado(certificado_Asignado);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un arquitecto a un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado			Certificado			Certificado
	 * @param		id_arquitecto		Integer				Id arquitecto
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 */
	@Override
	public void editarAsignacionCertificado(Certificado certificado, Integer id_arquitecto) {

		Certificados_Asignados certificado_Asignado = (Certificados_Asignados) ArkiWeb.controlador.Borrar.factory.crearObjeto("Certificados_Asignados");
		
		certificado_Asignado.setId_arquitecto_certificado_asignado(id_arquitecto);
		certificado_Asignado.setId_certificado_certificado_asignado(certificado.getId_certificado());
		
		ArkiWeb.controlador.Borrar.db.editarCertificado(certificado);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado			Certificado			Certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 */
	@Override
	public void crearCertificado(Certificado certificado) {
		
		ArkiWeb.controlador.Borrar.db.crearCertificado(certificado);
		
	}

}
