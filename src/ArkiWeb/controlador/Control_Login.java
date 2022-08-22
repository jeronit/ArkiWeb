/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import java.sql.SQLException;

import org.eclipse.emf.ecore.EObject;

import ArkiWeb.modelo.Usuario;

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
	 * Comprueba si el usuario puede acceder a la aplicación
	 * <!-- end-user-doc -->
	 * @param		email				String			Email
	 * @param		contrasenya			String			Contraseña
	 * @return							Boolean			Login success
	 * @throws SQLException
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" contrasenyaDataType="org.eclipse.uml2.types.String" contrasenyaRequired="true" contrasenyaOrdered="false"
	 * @generated NOT
	 */
	boolean login(String email, String contrasenya) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * Cambia la contraseña del usuario
	 * <!-- end-user-doc -->
	 * @param		usuario				Usuario 		Usuario
	 * @param		contrasenya			String			Contraseña nueva
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated NOT
	 */
	void cambiarContrasenya(Usuario usuario, String contrasenya);

	/**
	 * <!-- begin-user-doc -->
	 * Busca un usuario por email
	 * <!-- end-user-doc -->
	 * @param		email				String			Email
	 * @return							Usuario			Usuario
	 * @throws SQLException 
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated NOT
	 */
	Usuario buscarUsuarioPorEmail(String email) throws SQLException;

} // Control_Login
