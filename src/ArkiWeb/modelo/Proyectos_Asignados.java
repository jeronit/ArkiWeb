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
 * A representation of the model object '<em><b>Proyectos Asignados</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_asignado <em>Id proyecto asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_proyecto_asignado <em>Id proyecto proyecto asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_Asignados#getId_arquitecto_proyecto_asignado <em>Id arquitecto proyecto asignado</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_Asignados#getProyecto <em>Proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_Asignados#getUsuario <em>Usuario</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_Asignados()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Proyectos_Asignados extends EObject {
	/**
	 * Returns the value of the '<em><b>Id proyecto asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id proyecto asignado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id proyecto asignado</em>' attribute.
	 * @see #setId_proyecto_asignado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_Asignados_Id_proyecto_asignado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_proyecto_asignado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_asignado <em>Id proyecto asignado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id proyecto asignado</em>' attribute.
	 * @see #getId_proyecto_asignado()
	 * @generated
	 */
	void setId_proyecto_asignado(int value);

	/**
	 * Returns the value of the '<em><b>Id proyecto proyecto asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id proyecto proyecto asignado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id proyecto proyecto asignado</em>' attribute.
	 * @see #setId_proyecto_proyecto_asignado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_Asignados_Id_proyecto_proyecto_asignado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_proyecto_proyecto_asignado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_proyecto_asignado <em>Id proyecto proyecto asignado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id proyecto proyecto asignado</em>' attribute.
	 * @see #getId_proyecto_proyecto_asignado()
	 * @generated
	 */
	void setId_proyecto_proyecto_asignado(int value);

	/**
	 * Returns the value of the '<em><b>Id arquitecto proyecto asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id arquitecto proyecto asignado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id arquitecto proyecto asignado</em>' attribute.
	 * @see #setId_arquitecto_proyecto_asignado(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_Asignados_Id_arquitecto_proyecto_asignado()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_arquitecto_proyecto_asignado();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_Asignados#getId_arquitecto_proyecto_asignado <em>Id arquitecto proyecto asignado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id arquitecto proyecto asignado</em>' attribute.
	 * @see #getId_arquitecto_proyecto_asignado()
	 * @generated
	 */
	void setId_arquitecto_proyecto_asignado(int value);

	/**
	 * Returns the value of the '<em><b>Proyecto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proyecto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proyecto</em>' reference.
	 * @see #setProyecto(Proyecto)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_Asignados_Proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Proyecto getProyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_Asignados#getProyecto <em>Proyecto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proyecto</em>' reference.
	 * @see #getProyecto()
	 * @generated
	 */
	void setProyecto(Proyecto value);

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
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_Asignados_Usuario()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_Asignados#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

} // Proyectos_Asignados
