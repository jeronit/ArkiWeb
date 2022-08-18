/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Viviendas</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Viviendas()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Viviendas extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 * @generated
	 */
	void crearVivienda(String descripcion_vivienda, String direccion_vivienda, int id_inmueble_vivienda, double superficie_terreno_vivienda, double superficie_vivienda, int plantas_vivienda, int habitaciones_vivienda, int banyos_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false" descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 * @generated
	 */
	void editarVivienda(int id_vivienda, String descripcion_vivienda, String direccion_vivienda, int id_inmueble_vivienda, double superficie_terreno_vivienda, double superficie_vivienda, int plantas_vivienda, int habitaciones_vivienda, int banyos_vivienda);

} // Control_Viviendas
