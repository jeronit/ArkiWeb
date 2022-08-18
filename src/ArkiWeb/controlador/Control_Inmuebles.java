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
 * A representation of the model object '<em><b>Control Inmuebles</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Inmuebles()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Inmuebles extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 * @generated
	 */
	void crearInmueble(String descripcion_inmueble, String direccion_inmueble, double superficie_terreno_inmueble, double superficie_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false" descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 * @generated
	 */
	void editarInmueble(int id_inmueble, String descripcion_inmueble, String direccion_inmueble, double superficie_terreno_inmueble, double superficie_inmueble);

} // Control_Inmuebles
