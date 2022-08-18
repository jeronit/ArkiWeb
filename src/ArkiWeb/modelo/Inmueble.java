/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inmueble</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Inmueble#getVivienda <em>Vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Inmueble#getId_inmueble <em>Id inmueble</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Inmueble#getDescripcion_inmueble <em>Descripcion inmueble</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Inmueble#getDireccion_inmueble <em>Direccion inmueble</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Inmueble#getSuperficie_terreno_inmueble <em>Superficie terreno inmueble</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Inmueble#getSuperficie_inmueble <em>Superficie inmueble</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getInmueble()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Inmueble extends EObject {
	/**
	 * Returns the value of the '<em><b>Vivienda</b></em>' containment reference list.
	 * The list contents are of type {@link ArkiWeb.modelo.Vivienda}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vivienda</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vivienda</em>' containment reference list.
	 * @see ArkiWeb.modelo.ModeloPackage#getInmueble_Vivienda()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Vivienda> getVivienda();

	/**
	 * Returns the value of the '<em><b>Id inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id inmueble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id inmueble</em>' attribute.
	 * @see #setId_inmueble(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getInmueble_Id_inmueble()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_inmueble();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Inmueble#getId_inmueble <em>Id inmueble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id inmueble</em>' attribute.
	 * @see #getId_inmueble()
	 * @generated
	 */
	void setId_inmueble(int value);

	/**
	 * Returns the value of the '<em><b>Descripcion inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion inmueble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion inmueble</em>' attribute.
	 * @see #setDescripcion_inmueble(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getInmueble_Descripcion_inmueble()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescripcion_inmueble();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Inmueble#getDescripcion_inmueble <em>Descripcion inmueble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion inmueble</em>' attribute.
	 * @see #getDescripcion_inmueble()
	 * @generated
	 */
	void setDescripcion_inmueble(String value);

	/**
	 * Returns the value of the '<em><b>Direccion inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion inmueble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion inmueble</em>' attribute.
	 * @see #setDireccion_inmueble(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getInmueble_Direccion_inmueble()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDireccion_inmueble();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Inmueble#getDireccion_inmueble <em>Direccion inmueble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion inmueble</em>' attribute.
	 * @see #getDireccion_inmueble()
	 * @generated
	 */
	void setDireccion_inmueble(String value);

	/**
	 * Returns the value of the '<em><b>Superficie terreno inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superficie terreno inmueble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superficie terreno inmueble</em>' attribute.
	 * @see #setSuperficie_terreno_inmueble(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getInmueble_Superficie_terreno_inmueble()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSuperficie_terreno_inmueble();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Inmueble#getSuperficie_terreno_inmueble <em>Superficie terreno inmueble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superficie terreno inmueble</em>' attribute.
	 * @see #getSuperficie_terreno_inmueble()
	 * @generated
	 */
	void setSuperficie_terreno_inmueble(double value);

	/**
	 * Returns the value of the '<em><b>Superficie inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superficie inmueble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superficie inmueble</em>' attribute.
	 * @see #setSuperficie_inmueble(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getInmueble_Superficie_inmueble()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSuperficie_inmueble();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Inmueble#getSuperficie_inmueble <em>Superficie inmueble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superficie inmueble</em>' attribute.
	 * @see #getSuperficie_inmueble()
	 * @generated
	 */
	void setSuperficie_inmueble(double value);

} // Inmueble
