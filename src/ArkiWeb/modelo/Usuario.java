/**
 * 	@purpose:	Interface para gestionar el objeto
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Usuario#getId_usuario <em>Id usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getNombre_usuario <em>Nombre usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getApellidos_usuario <em>Apellidos usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getDni_usuario <em>Dni usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getTelefono_usuario <em>Telefono usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getEmail_usuario <em>Email usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getDomicilio_usuario <em>Domicilio usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getContrasenya_usuario <em>Contrasenya usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getRol_usuario <em>Rol usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Usuario#getRol <em>Rol</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getUsuario()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Id usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id usuario</em>' attribute.
	 * @see #setId_usuario(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Id_usuario()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getId_usuario <em>Id usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id usuario</em>' attribute.
	 * @see #getId_usuario()
	 * @generated
	 */
	void setId_usuario(int value);

	/**
	 * Returns the value of the '<em><b>Nombre usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre usuario</em>' attribute.
	 * @see #setNombre_usuario(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Nombre_usuario()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNombre_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getNombre_usuario <em>Nombre usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre usuario</em>' attribute.
	 * @see #getNombre_usuario()
	 * @generated
	 */
	void setNombre_usuario(String value);

	/**
	 * Returns the value of the '<em><b>Apellidos usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apellidos usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apellidos usuario</em>' attribute.
	 * @see #setApellidos_usuario(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Apellidos_usuario()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getApellidos_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getApellidos_usuario <em>Apellidos usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apellidos usuario</em>' attribute.
	 * @see #getApellidos_usuario()
	 * @generated
	 */
	void setApellidos_usuario(String value);

	/**
	 * Returns the value of the '<em><b>Dni usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dni usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dni usuario</em>' attribute.
	 * @see #setDni_usuario(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Dni_usuario()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDni_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getDni_usuario <em>Dni usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dni usuario</em>' attribute.
	 * @see #getDni_usuario()
	 * @generated
	 */
	void setDni_usuario(String value);

	/**
	 * Returns the value of the '<em><b>Telefono usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono usuario</em>' attribute.
	 * @see #setTelefono_usuario(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Telefono_usuario()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTelefono_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getTelefono_usuario <em>Telefono usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono usuario</em>' attribute.
	 * @see #getTelefono_usuario()
	 * @generated
	 */
	void setTelefono_usuario(String value);

	/**
	 * Returns the value of the '<em><b>Email usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email usuario</em>' attribute.
	 * @see #setEmail_usuario(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Email_usuario()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getEmail_usuario <em>Email usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email usuario</em>' attribute.
	 * @see #getEmail_usuario()
	 * @generated
	 */
	void setEmail_usuario(String value);

	/**
	 * Returns the value of the '<em><b>Domicilio usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domicilio usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domicilio usuario</em>' attribute.
	 * @see #setDomicilio_usuario(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Domicilio_usuario()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDomicilio_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getDomicilio_usuario <em>Domicilio usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domicilio usuario</em>' attribute.
	 * @see #getDomicilio_usuario()
	 * @generated
	 */
	void setDomicilio_usuario(String value);

	/**
	 * Returns the value of the '<em><b>Contrasenya usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrasenya usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrasenya usuario</em>' attribute.
	 * @see #setContrasenya_usuario(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Contrasenya_usuario()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getContrasenya_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getContrasenya_usuario <em>Contrasenya usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrasenya usuario</em>' attribute.
	 * @see #getContrasenya_usuario()
	 * @generated
	 */
	void setContrasenya_usuario(String value);

	/**
	 * Returns the value of the '<em><b>Rol usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol usuario</em>' attribute.
	 * @see #setRol_usuario(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Rol_usuario()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRol_usuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getRol_usuario <em>Rol usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol usuario</em>' attribute.
	 * @see #getRol_usuario()
	 * @generated
	 */
	void setRol_usuario(int value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' reference.
	 * @see #setRol(Rol)
	 * @see ArkiWeb.modelo.ModeloPackage#getUsuario_Rol()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Rol getRol();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Usuario#getRol <em>Rol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' reference.
	 * @see #getRol()
	 * @generated
	 */
	void setRol(Rol value);

} // Usuario
