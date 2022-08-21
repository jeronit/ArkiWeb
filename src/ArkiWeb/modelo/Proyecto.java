/**
 * 	@purpose:	Interface para gestionar el objeto
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proyecto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getId_proyecto <em>Id proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getDescripcion_proyecto <em>Descripcion proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getId_cliente_proyecto <em>Id cliente proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getId_vivienda_proyecto <em>Id vivienda proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getId_inmueble_proyecto <em>Id inmueble proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getTipo_proyecto <em>Tipo proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getFecha_solicitud_proyecto <em>Fecha solicitud proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getFecha_entrega_proyecto <em>Fecha entrega proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getDuracion_prevista_proyecto <em>Duracion prevista proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getPresupuesto_ejecucion_proyecto <em>Presupuesto ejecucion proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getVivienda <em>Vivienda</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getInmueble <em>Inmueble</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getSuperficie_proyecto <em>Superficie proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyecto#getCoste_proyecto <em>Coste proyecto</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getProyecto()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Proyecto extends EObject {
	/**
	 * Returns the value of the '<em><b>Id proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id proyecto</em>' attribute.
	 * @see #setId_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Id_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getId_proyecto <em>Id proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id proyecto</em>' attribute.
	 * @see #getId_proyecto()
	 * @generated
	 */
	void setId_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Descripcion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion proyecto</em>' attribute.
	 * @see #setDescripcion_proyecto(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Descripcion_proyecto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescripcion_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getDescripcion_proyecto <em>Descripcion proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion proyecto</em>' attribute.
	 * @see #getDescripcion_proyecto()
	 * @generated
	 */
	void setDescripcion_proyecto(String value);

	/**
	 * Returns the value of the '<em><b>Id cliente proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id cliente proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id cliente proyecto</em>' attribute.
	 * @see #setId_cliente_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Id_cliente_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_cliente_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getId_cliente_proyecto <em>Id cliente proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id cliente proyecto</em>' attribute.
	 * @see #getId_cliente_proyecto()
	 * @generated
	 */
	void setId_cliente_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Id vivienda proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id vivienda proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id vivienda proyecto</em>' attribute.
	 * @see #setId_vivienda_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Id_vivienda_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_vivienda_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getId_vivienda_proyecto <em>Id vivienda proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id vivienda proyecto</em>' attribute.
	 * @see #getId_vivienda_proyecto()
	 * @generated
	 */
	void setId_vivienda_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Id inmueble proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id inmueble proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id inmueble proyecto</em>' attribute.
	 * @see #setId_inmueble_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Id_inmueble_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_inmueble_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getId_inmueble_proyecto <em>Id inmueble proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id inmueble proyecto</em>' attribute.
	 * @see #getId_inmueble_proyecto()
	 * @generated
	 */
	void setId_inmueble_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Tipo proyecto</b></em>' attribute.
	 * The literals are from the enumeration {@link ArkiWeb.modelo.Tipo_Proyecto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo proyecto</em>' attribute.
	 * @see ArkiWeb.modelo.Tipo_Proyecto
	 * @see #setTipo_proyecto(Tipo_Proyecto)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Tipo_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Tipo_Proyecto getTipo_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getTipo_proyecto <em>Tipo proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo proyecto</em>' attribute.
	 * @see ArkiWeb.modelo.Tipo_Proyecto
	 * @see #getTipo_proyecto()
	 * @generated
	 */
	void setTipo_proyecto(Tipo_Proyecto value);

	/**
	 * Returns the value of the '<em><b>Fecha solicitud proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha solicitud proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha solicitud proyecto</em>' attribute.
	 * @see #setFecha_solicitud_proyecto(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Fecha_solicitud_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_solicitud_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getFecha_solicitud_proyecto <em>Fecha solicitud proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha solicitud proyecto</em>' attribute.
	 * @see #getFecha_solicitud_proyecto()
	 * @generated
	 */
	void setFecha_solicitud_proyecto(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha entrega proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha entrega proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha entrega proyecto</em>' attribute.
	 * @see #setFecha_entrega_proyecto(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Fecha_entrega_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_entrega_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getFecha_entrega_proyecto <em>Fecha entrega proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha entrega proyecto</em>' attribute.
	 * @see #getFecha_entrega_proyecto()
	 * @generated
	 */
	void setFecha_entrega_proyecto(Date value);

	/**
	 * Returns the value of the '<em><b>Duracion prevista proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duracion prevista proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duracion prevista proyecto</em>' attribute.
	 * @see #setDuracion_prevista_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Duracion_prevista_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDuracion_prevista_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getDuracion_prevista_proyecto <em>Duracion prevista proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duracion prevista proyecto</em>' attribute.
	 * @see #getDuracion_prevista_proyecto()
	 * @generated
	 */
	void setDuracion_prevista_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Presupuesto ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presupuesto ejecucion proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presupuesto ejecucion proyecto</em>' attribute.
	 * @see #setPresupuesto_ejecucion_proyecto(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Presupuesto_ejecucion_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPresupuesto_ejecucion_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getPresupuesto_ejecucion_proyecto <em>Presupuesto ejecucion proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presupuesto ejecucion proyecto</em>' attribute.
	 * @see #getPresupuesto_ejecucion_proyecto()
	 * @generated
	 */
	void setPresupuesto_ejecucion_proyecto(double value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' reference.
	 * @see #setUsuario(Usuario)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Usuario()
	 * @model ordered="false"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

	/**
	 * Returns the value of the '<em><b>Vivienda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vivienda</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vivienda</em>' reference.
	 * @see #setVivienda(Vivienda)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Vivienda()
	 * @model ordered="false"
	 * @generated
	 */
	Vivienda getVivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getVivienda <em>Vivienda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vivienda</em>' reference.
	 * @see #getVivienda()
	 * @generated
	 */
	void setVivienda(Vivienda value);

	/**
	 * Returns the value of the '<em><b>Inmueble</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inmueble</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inmueble</em>' reference.
	 * @see #setInmueble(Inmueble)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Inmueble()
	 * @model ordered="false"
	 * @generated
	 */
	Inmueble getInmueble();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getInmueble <em>Inmueble</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inmueble</em>' reference.
	 * @see #getInmueble()
	 * @generated
	 */
	void setInmueble(Inmueble value);

	/**
	 * Returns the value of the '<em><b>Superficie proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superficie proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superficie proyecto</em>' attribute.
	 * @see #setSuperficie_proyecto(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Superficie_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSuperficie_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getSuperficie_proyecto <em>Superficie proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superficie proyecto</em>' attribute.
	 * @see #getSuperficie_proyecto()
	 * @generated
	 */
	void setSuperficie_proyecto(double value);

	/**
	 * Returns the value of the '<em><b>Coste proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coste proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coste proyecto</em>' attribute.
	 * @see #setCoste_proyecto(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyecto_Coste_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getCoste_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyecto#getCoste_proyecto <em>Coste proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coste proyecto</em>' attribute.
	 * @see #getCoste_proyecto()
	 * @generated
	 */
	void setCoste_proyecto(double value);

} // Proyecto
