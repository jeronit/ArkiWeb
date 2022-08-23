/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Tipo_Certificado;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Certificados</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Certificados()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Certificados extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Edita un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado			Certificado			Certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated NOT
	 */
	void editarCertificado(Certificado certificado);

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado			Certificado			Certificado
	 * @param		id_arquitecto		Integer				Id arquitecto
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated NOT
	 */
	void asignarCertificado(Certificado certificado, Integer id_arquitecto);

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un arquitecto a un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado_Asignado			Certificados_Asignados			Certificados Asignados 
	 * @param		id_arquitecto					Integer							Id arquitecto
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated NOT
	 */
	void editarAsignacionCertificado(Certificados_Asignados certificado_Asignado, Integer id_arquitecto);

	/**
	 * <!-- begin-user-doc -->
	 * Registra un certificado
	 * <!-- end-user-doc -->
	 * @param 		certificado			Certificado			Certificado
	 * @model certificadoRequired="true" certificadoOrdered="false"
	 * @generated NOT
	 */
	void crearCertificado(Certificado certificado);

} // Control_Certificados
