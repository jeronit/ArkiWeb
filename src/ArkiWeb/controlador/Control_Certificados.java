/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
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
	 * <!-- end-user-doc -->
	 * @model id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false" descripcion_certificadoDataType="org.eclipse.uml2.types.String" descripcion_certificadoRequired="true" descripcion_certificadoOrdered="false" cliente_certificadoDataType="org.eclipse.uml2.types.Integer" cliente_certificadoRequired="true" cliente_certificadoOrdered="false" vivienda_certificadoDataType="org.eclipse.uml2.types.Integer" vivienda_certificadoRequired="true" vivienda_certificadoOrdered="false" inmueble_certificadoDataType="org.eclipse.uml2.types.Integer" inmueble_certificadoRequired="true" inmueble_certificadoOrdered="false" tipo_certificadoRequired="true" tipo_certificadoOrdered="false" fecha_solicitud_certificadoRequired="true" fecha_solicitud_certificadoOrdered="false" fecha_entrega_certificadoRequired="true" fecha_entrega_certificadoOrdered="false" fecha_visita_certificadoRequired="true" fecha_visita_certificadoOrdered="false" fecha_emision_certificadoRequired="true" fecha_emision_certificadoOrdered="false" categoria_certificadoRequired="true" categoria_certificadoOrdered="false" arquitecto_certificadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificadoRequired="true" arquitecto_certificadoOrdered="false" coste_certificadoRequired="true" coste_certificadoOrdered="false"
	 * @generated
	 */
	void editarCertificado(int id_certificado, String descripcion_certificado, int cliente_certificado, int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado, Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado, Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado, double coste_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void asignarCertificado(int id_certificado_certificado_asignado, int arquitecto_certificado_asignado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_asignadoRequired="true" id_certificado_asignadoOrdered="false" id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void editarAsignacionCertificado(int id_certificado_asignado, int id_certificado_certificado_asignado, int arquitecto_certificado_asignado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_certificadoDataType="org.eclipse.uml2.types.String" descripcion_certificadoRequired="true" descripcion_certificadoOrdered="false" cliente_certificadoRequired="true" cliente_certificadoOrdered="false" vivienda_certificadoDataType="org.eclipse.uml2.types.Integer" vivienda_certificadoRequired="true" vivienda_certificadoOrdered="false" inmueble_certificadoDataType="org.eclipse.uml2.types.Integer" inmueble_certificadoRequired="true" inmueble_certificadoOrdered="false" tipo_certificadoRequired="true" tipo_certificadoOrdered="false" fecha_solicitud_certificadoRequired="true" fecha_solicitud_certificadoOrdered="false" fecha_entrega_certificadoRequired="true" fecha_entrega_certificadoOrdered="false" fecha_visita_certificadoRequired="true" fecha_visita_certificadoOrdered="false" fecha_emision_certificadoRequired="true" fecha_emision_certificadoOrdered="false" categoria_certificadoRequired="true" categoria_certificadoOrdered="false" arquitecto_certificadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificadoRequired="true" arquitecto_certificadoOrdered="false" coste_certificadoRequired="true" coste_certificadoOrdered="false"
	 * @generated
	 */
	void crearCertificado(String descripcion_certificado, Certificado cliente_certificado, int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado, Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado, Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado, double coste_certificado);

} // Control_Certificados
