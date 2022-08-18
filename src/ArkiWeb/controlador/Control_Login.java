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
 * A representation of the model object '<em><b>Control Login</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Login()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Login extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" contrasenyaDataType="org.eclipse.uml2.types.String" contrasenyaRequired="true" contrasenyaOrdered="false"
	 * @generated
	 */
	void login(String email, String contrasenya);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void cambiarContrasenya(String email);

} // Control_Login
