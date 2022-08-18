/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Certificado#getId_certificado <em>Id certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getDescripcion_certificado <em>Descripcion certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getId_cliente_certificado <em>Id cliente certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getId_vivienda_certificado <em>Id vivienda certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getId_inmueble_certificado <em>Id inmueble certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getTipo_certificado <em>Tipo certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getFecha_solicitud_certificado <em>Fecha solicitud certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getFecha_entrega_certificado <em>Fecha entrega certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getFecha_visita_certificado <em>Fecha visita certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getFecha_emision_certificado <em>Fecha emision certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getCategoria_certificado <em>Categoria certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getId_arquitecto_certificado <em>Id arquitecto certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getCoste_certificado <em>Coste certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getInmueble <em>Inmueble</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificado#getVivienda <em>Vivienda</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getCertificado()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Certificado extends EObject {
	/**
	 * Returns the value of the '<em><b>Id certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id certificado</em>' attribute.
	 * @see #setId_certificado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Id_certificado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getId_certificado <em>Id certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id certificado</em>' attribute.
	 * @see #getId_certificado()
	 * @generated
	 */
	void setId_certificado(int value);

	/**
	 * Returns the value of the '<em><b>Descripcion certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion certificado</em>' attribute.
	 * @see #setDescripcion_certificado(String)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Descripcion_certificado()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescripcion_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getDescripcion_certificado <em>Descripcion certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion certificado</em>' attribute.
	 * @see #getDescripcion_certificado()
	 * @generated
	 */
	void setDescripcion_certificado(String value);

	/**
	 * Returns the value of the '<em><b>Id cliente certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id cliente certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id cliente certificado</em>' attribute.
	 * @see #setId_cliente_certificado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Id_cliente_certificado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_cliente_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getId_cliente_certificado <em>Id cliente certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id cliente certificado</em>' attribute.
	 * @see #getId_cliente_certificado()
	 * @generated
	 */
	void setId_cliente_certificado(int value);

	/**
	 * Returns the value of the '<em><b>Id vivienda certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id vivienda certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id vivienda certificado</em>' attribute.
	 * @see #setId_vivienda_certificado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Id_vivienda_certificado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_vivienda_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getId_vivienda_certificado <em>Id vivienda certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id vivienda certificado</em>' attribute.
	 * @see #getId_vivienda_certificado()
	 * @generated
	 */
	void setId_vivienda_certificado(int value);

	/**
	 * Returns the value of the '<em><b>Id inmueble certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id inmueble certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id inmueble certificado</em>' attribute.
	 * @see #setId_inmueble_certificado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Id_inmueble_certificado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_inmueble_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getId_inmueble_certificado <em>Id inmueble certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id inmueble certificado</em>' attribute.
	 * @see #getId_inmueble_certificado()
	 * @generated
	 */
	void setId_inmueble_certificado(int value);

	/**
	 * Returns the value of the '<em><b>Tipo certificado</b></em>' attribute.
	 * The literals are from the enumeration {@link ArkiWeb.modelo.Tipo_Certificado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo certificado</em>' attribute.
	 * @see ArkiWeb.modelo.Tipo_Certificado
	 * @see #setTipo_certificado(Tipo_Certificado)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Tipo_certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Tipo_Certificado getTipo_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getTipo_certificado <em>Tipo certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo certificado</em>' attribute.
	 * @see ArkiWeb.modelo.Tipo_Certificado
	 * @see #getTipo_certificado()
	 * @generated
	 */
	void setTipo_certificado(Tipo_Certificado value);

	/**
	 * Returns the value of the '<em><b>Fecha solicitud certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha solicitud certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha solicitud certificado</em>' attribute.
	 * @see #setFecha_solicitud_certificado(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Fecha_solicitud_certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_solicitud_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getFecha_solicitud_certificado <em>Fecha solicitud certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha solicitud certificado</em>' attribute.
	 * @see #getFecha_solicitud_certificado()
	 * @generated
	 */
	void setFecha_solicitud_certificado(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha entrega certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha entrega certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha entrega certificado</em>' attribute.
	 * @see #setFecha_entrega_certificado(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Fecha_entrega_certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_entrega_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getFecha_entrega_certificado <em>Fecha entrega certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha entrega certificado</em>' attribute.
	 * @see #getFecha_entrega_certificado()
	 * @generated
	 */
	void setFecha_entrega_certificado(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha visita certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha visita certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha visita certificado</em>' attribute.
	 * @see #setFecha_visita_certificado(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Fecha_visita_certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_visita_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getFecha_visita_certificado <em>Fecha visita certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha visita certificado</em>' attribute.
	 * @see #getFecha_visita_certificado()
	 * @generated
	 */
	void setFecha_visita_certificado(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha emision certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha emision certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha emision certificado</em>' attribute.
	 * @see #setFecha_emision_certificado(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Fecha_emision_certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_emision_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getFecha_emision_certificado <em>Fecha emision certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha emision certificado</em>' attribute.
	 * @see #getFecha_emision_certificado()
	 * @generated
	 */
	void setFecha_emision_certificado(Date value);

	/**
	 * Returns the value of the '<em><b>Categoria certificado</b></em>' attribute.
	 * The literals are from the enumeration {@link ArkiWeb.modelo.Categoria_Certificado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categoria certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria certificado</em>' attribute.
	 * @see ArkiWeb.modelo.Categoria_Certificado
	 * @see #setCategoria_certificado(Categoria_Certificado)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Categoria_certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Categoria_Certificado getCategoria_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getCategoria_certificado <em>Categoria certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria certificado</em>' attribute.
	 * @see ArkiWeb.modelo.Categoria_Certificado
	 * @see #getCategoria_certificado()
	 * @generated
	 */
	void setCategoria_certificado(Categoria_Certificado value);

	/**
	 * Returns the value of the '<em><b>Id arquitecto certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id arquitecto certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id arquitecto certificado</em>' attribute.
	 * @see #setId_arquitecto_certificado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Id_arquitecto_certificado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_arquitecto_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getId_arquitecto_certificado <em>Id arquitecto certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id arquitecto certificado</em>' attribute.
	 * @see #getId_arquitecto_certificado()
	 * @generated
	 */
	void setId_arquitecto_certificado(int value);

	/**
	 * Returns the value of the '<em><b>Coste certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coste certificado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coste certificado</em>' attribute.
	 * @see #setCoste_certificado(double)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Coste_certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getCoste_certificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getCoste_certificado <em>Coste certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coste certificado</em>' attribute.
	 * @see #getCoste_certificado()
	 * @generated
	 */
	void setCoste_certificado(double value);

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
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Inmueble()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Inmueble getInmueble();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getInmueble <em>Inmueble</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inmueble</em>' reference.
	 * @see #getInmueble()
	 * @generated
	 */
	void setInmueble(Inmueble value);

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
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Usuario()
	 * @model ordered="false"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getUsuario <em>Usuario</em>}' reference.
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
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificado_Vivienda()
	 * @model ordered="false"
	 * @generated
	 */
	Vivienda getVivienda();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificado#getVivienda <em>Vivienda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vivienda</em>' reference.
	 * @see #getVivienda()
	 * @generated
	 */
	void setVivienda(Vivienda value);

} // Certificado
