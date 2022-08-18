/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Rol#getId_rol <em>Id rol</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Rol#getDescripcion_rol <em>Descripcion rol</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getRol()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Rol extends EObject {
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
	 * @see ArkiWeb.modelo.ModeloPackage#getRol_Id_rol()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_rol();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Rol#getId_rol <em>Id rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id rol</em>' attribute.
	 * @see #getId_rol()
	 * @generated
	 */
	void setId_rol(int value);

	/**
	 * Returns the value of the '<em><b>Descripcion rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion rol</em>' attribute.
	 * @see #setDescripcion_rol(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getRol_Descripcion_rol()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescripcion_rol();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Rol#getDescripcion_rol <em>Descripcion rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion rol</em>' attribute.
	 * @see #getDescripcion_rol()
	 * @generated
	 */
	void setDescripcion_rol(String value);

} // Rol
