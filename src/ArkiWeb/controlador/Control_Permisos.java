/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Permiso;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Permisos</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Permisos()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Permisos extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void concederAcceso();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated
	 */
	void crearPermiso(Permiso permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model permisoRequired="true" permisoOrdered="false"
	 * @generated
	 */
	void editarPermiso(Permiso permiso);

} // Control_Permisos
