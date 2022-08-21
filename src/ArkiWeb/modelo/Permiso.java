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
 * A representation of the model object '<em><b>Permiso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Permiso#getId_permiso <em>Id permiso</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Permiso#getId_rol <em>Id rol</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Permiso#getObjeto_permiso <em>Objeto permiso</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Permiso#isLectura_permiso <em>Lectura permiso</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Permiso#isEscritura_permiso <em>Escritura permiso</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Permiso#getRol <em>Rol</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getPermiso()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Permiso extends EObject {
	/**
	 * Returns the value of the '<em><b>Id permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id permiso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id permiso</em>' attribute.
	 * @see #setId_permiso(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getPermiso_Id_permiso()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_permiso();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Permiso#getId_permiso <em>Id permiso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id permiso</em>' attribute.
	 * @see #getId_permiso()
	 * @generated
	 */
	void setId_permiso(int value);

	/**
	 * Returns the value of the '<em><b>Id rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id rol</em>' attribute.
	 * @see #setId_rol(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getPermiso_Id_rol()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_rol();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Permiso#getId_rol <em>Id rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id rol</em>' attribute.
	 * @see #getId_rol()
	 * @generated
	 */
	void setId_rol(int value);

	/**
	 * Returns the value of the '<em><b>Objeto permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objeto permiso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objeto permiso</em>' attribute.
	 * @see #setObjeto_permiso(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getPermiso_Objeto_permiso()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getObjeto_permiso();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Permiso#getObjeto_permiso <em>Objeto permiso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objeto permiso</em>' attribute.
	 * @see #getObjeto_permiso()
	 * @generated
	 */
	void setObjeto_permiso(String value);

	/**
	 * Returns the value of the '<em><b>Lectura permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lectura permiso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lectura permiso</em>' attribute.
	 * @see #setLectura_permiso(boolean)
	 * @see ArkiWeb.modelo.ModeloPackage#getPermiso_Lectura_permiso()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLectura_permiso();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Permiso#isLectura_permiso <em>Lectura permiso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lectura permiso</em>' attribute.
	 * @see #isLectura_permiso()
	 * @generated
	 */
	void setLectura_permiso(boolean value);

	/**
	 * Returns the value of the '<em><b>Escritura permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escritura permiso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escritura permiso</em>' attribute.
	 * @see #setEscritura_permiso(boolean)
	 * @see ArkiWeb.modelo.ModeloPackage#getPermiso_Escritura_permiso()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEscritura_permiso();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Permiso#isEscritura_permiso <em>Escritura permiso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escritura permiso</em>' attribute.
	 * @see #isEscritura_permiso()
	 * @generated
	 */
	void setEscritura_permiso(boolean value);

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
	 * @see ArkiWeb.modelo.ModeloPackage#getPermiso_Rol()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Rol getRol();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Permiso#getRol <em>Rol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' reference.
	 * @see #getRol()
	 * @generated
	 */
	void setRol(Rol value);

} // Permiso
