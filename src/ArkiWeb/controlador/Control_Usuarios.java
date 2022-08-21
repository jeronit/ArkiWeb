/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Usuario;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Usuarios</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Usuarios()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Usuarios extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated
	 */
	void crearUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated
	 */
	void editarUsuario_1(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	void bajaUsuario(int id_Usuario);

} // Control_Usuarios
