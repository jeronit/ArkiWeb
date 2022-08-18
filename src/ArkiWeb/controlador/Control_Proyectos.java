/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Proyectos</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Proyectos()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Proyectos extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false" descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 * @generated
	 */
	void editarProyecto(int id_proyecto, String descripcion_proyecto, Certificado cliente_proyecto, int vivienda_proyecto, int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto, Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto, double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_ejecucion_proyectoRequired="true" id_ejecucion_proyectoOrdered="false" id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 * @generated
	 */
	void editarContratacionProyecto(int id_ejecucion_proyecto, int id_proyecto_ejecucion_proyecto, Date fecha_inicio_ejecucion_proyecto, int duracion_prevista_ejecucion_proyecto, Date fecha_fin_ejecucion_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void asignarProyecto(int id_proyecto_proyecto_asignado, int arquitecto_certificado_asignado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 * @generated
	 */
	void contratarProyecto(int id_proyecto_ejecucion_proyecto, Date fecha_inicio_ejecucion_proyecto, int duracion_prevista_ejecucion_proyecto, Date fecha_fin_ejecucion_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 * @generated
	 */
	void crearProyecto(String descripcion_proyecto, Certificado cliente_proyecto, int vivienda_proyecto, int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto, Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto, double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_asignadoRequired="true" id_proyecto_asignadoOrdered="false" id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void editarAsignacionProyecto(int id_proyecto_asignado, int id_proyecto_proyecto_asignado, int arquitecto_certificado_asignado);

} // Control_Proyectos
