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
	 * @model nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.String" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 * @generated
	 */
	void crearUsuario(String nombre_usuario, String apellido_usuario, String dni_usuario, int telefono_usuario, String email_usuario, String domicilio_usuario, String contrasenya_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.String" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 * @generated
	 */
	void editarUsuario_1(int id_usuario, String nombre_usuario, String apellido_usuario, String dni_usuario, int telefono_usuario, String email_usuario, String domicilio_usuario, String contrasenya_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	void bajaUsuario(int id_Usuario);

} // Control_Usuarios
