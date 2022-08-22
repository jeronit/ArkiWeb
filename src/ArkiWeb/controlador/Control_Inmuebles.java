/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Inmueble;
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
	 * Registra un nuevo inmueble.
	 * <!-- end-user-doc -->
	 * @param		inmueble			Inmueble			Inmueble
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated NOT
	 */
	void crearInmueble(Inmueble inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * Edita un registro de un inmueble.
	 * <!-- end-user-doc -->
	 * @param		inmueble			Inmueble			Inmueble
	 * @model inmuebleRequired="true" inmuebleOrdered="false"
	 * @generated NOT
	 */
	void editarInmueble(Inmueble inmueble);

} // Control_Inmuebles
