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
 * A representation of the model object '<em><b>Certificados Asignados</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getId_proyecto_asignado <em>Id proyecto asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getId_proyecto_proyecto_asignado <em>Id proyecto proyecto asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getId_arquitecto_proyecto_asignado <em>Id arquitecto proyecto asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getId_certificado_asignado <em>Id certificado asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getId_certificado_certificado_asignado <em>Id certificado certificado asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getId_arquitecto_certificado_asignado <em>Id arquitecto certificado asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getCertificado <em>Certificado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Certificados_Asignados#getUsuario <em>Usuario</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getCertificados_Asignados()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface Certificados_Asignados extends EObject {
		/**
	 * Returns the value of the '<em><b>Id certificado asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id certificado asignado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id certificado asignado</em>' attribute.
	 * @see #setId_certificado_asignado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificados_Asignados_Id_certificado_asignado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_certificado_asignado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificados_Asignados#getId_certificado_asignado <em>Id certificado asignado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id certificado asignado</em>' attribute.
	 * @see #getId_certificado_asignado()
	 * @generated
	 */
	void setId_certificado_asignado(int value);

	/**
	 * Returns the value of the '<em><b>Id certificado certificado asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id certificado certificado asignado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id certificado certificado asignado</em>' attribute.
	 * @see #setId_certificado_certificado_asignado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificados_Asignados_Id_certificado_certificado_asignado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_certificado_certificado_asignado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificados_Asignados#getId_certificado_certificado_asignado <em>Id certificado certificado asignado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id certificado certificado asignado</em>' attribute.
	 * @see #getId_certificado_certificado_asignado()
	 * @generated
	 */
	void setId_certificado_certificado_asignado(int value);

	/**
	 * Returns the value of the '<em><b>Id arquitecto certificado asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id arquitecto certificado asignado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id arquitecto certificado asignado</em>' attribute.
	 * @see #setId_arquitecto_certificado_asignado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificados_Asignados_Id_arquitecto_certificado_asignado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_arquitecto_certificado_asignado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificados_Asignados#getId_arquitecto_certificado_asignado <em>Id arquitecto certificado asignado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id arquitecto certificado asignado</em>' attribute.
	 * @see #getId_arquitecto_certificado_asignado()
	 * @generated
	 */
	void setId_arquitecto_certificado_asignado(int value);

	/**
	 * Returns the value of the '<em><b>Certificado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificado</em>' reference.
	 * @see #setCertificado(Certificado)
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificados_Asignados_Certificado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Certificado getCertificado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificados_Asignados#getCertificado <em>Certificado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificado</em>' reference.
	 * @see #getCertificado()
	 * @generated
	 */
	void setCertificado(Certificado value);

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
	 * @see ArkiWeb.modelo.ModeloPackage#getCertificados_Asignados_Usuario()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Certificados_Asignados#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

} // Certificados_Asignados
