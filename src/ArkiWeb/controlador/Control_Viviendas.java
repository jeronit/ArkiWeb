/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Vivienda;
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
	 * Registra una nueva vivienda
	 * <!-- end-user-doc -->
	 * @param		vivienda			Vivienda			Vivienda
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated NOT
	 */
	void crearVivienda(Vivienda vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de una vivienda
	 * <!-- end-user-doc -->
	 * @param		vivienda			Vivienda			Vivienda
	 * @model viviendaRequired="true" viviendaOrdered="false"
	 * @generated NOT
	 */
	void editarVivienda(Vivienda vivienda);

} // Control_Viviendas
