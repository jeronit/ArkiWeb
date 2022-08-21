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
 * A representation of the model object '<em><b>Vivienda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getId_vivienda <em>Id vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getDescripcion_vivienda <em>Descripcion vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getDireccion_vivienda <em>Direccion vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getId_inmueble_vivienda <em>Id inmueble vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getSuperficie_terreno_vivienda <em>Superficie terreno vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getSuperficie_vivienda <em>Superficie vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getPlantas_vivienda <em>Plantas vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getHabitaciones_vivienda <em>Habitaciones vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Vivienda#getBanyos_vivienda <em>Banyos vivienda</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getVivienda()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Vivienda extends EObject {
	/**
	 * Returns the value of the '<em><b>Id vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id vivienda</em>' attribute.
	 * @see #setId_vivienda(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Id_vivienda()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getId_vivienda <em>Id vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id vivienda</em>' attribute.
	 * @see #getId_vivienda()
	 * @generated
	 */
	void setId_vivienda(int value);

	/**
	 * Returns the value of the '<em><b>Descripcion vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion vivienda</em>' attribute.
	 * @see #setDescripcion_vivienda(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Descripcion_vivienda()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescripcion_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getDescripcion_vivienda <em>Descripcion vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion vivienda</em>' attribute.
	 * @see #getDescripcion_vivienda()
	 * @generated
	 */
	void setDescripcion_vivienda(String value);

	/**
	 * Returns the value of the '<em><b>Direccion vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion vivienda</em>' attribute.
	 * @see #setDireccion_vivienda(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Direccion_vivienda()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDireccion_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getDireccion_vivienda <em>Direccion vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion vivienda</em>' attribute.
	 * @see #getDireccion_vivienda()
	 * @generated
	 */
	void setDireccion_vivienda(String value);

	/**
	 * Returns the value of the '<em><b>Id inmueble vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id inmueble vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id inmueble vivienda</em>' attribute.
	 * @see #setId_inmueble_vivienda(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Id_inmueble_vivienda()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_inmueble_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getId_inmueble_vivienda <em>Id inmueble vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id inmueble vivienda</em>' attribute.
	 * @see #getId_inmueble_vivienda()
	 * @generated
	 */
	void setId_inmueble_vivienda(int value);

	/**
	 * Returns the value of the '<em><b>Superficie terreno vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superficie terreno vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superficie terreno vivienda</em>' attribute.
	 * @see #setSuperficie_terreno_vivienda(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Superficie_terreno_vivienda()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSuperficie_terreno_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getSuperficie_terreno_vivienda <em>Superficie terreno vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superficie terreno vivienda</em>' attribute.
	 * @see #getSuperficie_terreno_vivienda()
	 * @generated
	 */
	void setSuperficie_terreno_vivienda(double value);

	/**
	 * Returns the value of the '<em><b>Superficie vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superficie vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superficie vivienda</em>' attribute.
	 * @see #setSuperficie_vivienda(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Superficie_vivienda()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSuperficie_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getSuperficie_vivienda <em>Superficie vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superficie vivienda</em>' attribute.
	 * @see #getSuperficie_vivienda()
	 * @generated
	 */
	void setSuperficie_vivienda(double value);

	/**
	 * Returns the value of the '<em><b>Plantas vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plantas vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantas vivienda</em>' attribute.
	 * @see #setPlantas_vivienda(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Plantas_vivienda()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPlantas_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getPlantas_vivienda <em>Plantas vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plantas vivienda</em>' attribute.
	 * @see #getPlantas_vivienda()
	 * @generated
	 */
	void setPlantas_vivienda(int value);

	/**
	 * Returns the value of the '<em><b>Habitaciones vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Habitaciones vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Habitaciones vivienda</em>' attribute.
	 * @see #setHabitaciones_vivienda(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Habitaciones_vivienda()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getHabitaciones_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getHabitaciones_vivienda <em>Habitaciones vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Habitaciones vivienda</em>' attribute.
	 * @see #getHabitaciones_vivienda()
	 * @generated
	 */
	void setHabitaciones_vivienda(int value);

	/**
	 * Returns the value of the '<em><b>Banyos vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Banyos vivienda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banyos vivienda</em>' attribute.
	 * @see #setBanyos_vivienda(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getVivienda_Banyos_vivienda()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBanyos_vivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Vivienda#getBanyos_vivienda <em>Banyos vivienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Banyos vivienda</em>' attribute.
	 * @see #getBanyos_vivienda()
	 * @generated
	 */
	void setBanyos_vivienda(int value);

} // Vivienda
