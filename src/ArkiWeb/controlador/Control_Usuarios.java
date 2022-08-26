/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Usuario;

import java.sql.SQLException;

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
	 * Registra un nuevo usuario
	 * <!-- end-user-doc -->
	 * @param		usuario			Usuario			Usuario
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated NOT
	 */
	void crearUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un usuario
	 * <!-- end-user-doc -->
	 * @param		usuario			Usuario			Usuario
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 * @generated NOT
	 */
	void editarUsuario(Usuario usuario);

	/**
	 * <!-- begin-user-doc -->
	 * Elimina los datos de un usuario (manteniendo el id para no crear problemas de integridad referencial)
	 * <!-- end-user-doc -->
	 * @param		id_Usuario			int			Id de usuario
	 * @model id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated NOT
	 */
	void bajaUsuario(int id_Usuario);
	
} // Control_Usuarios
