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
 * A representation of the model object '<em><b>Proyectos En Ejecucion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_ejecucion_proyecto <em>Id ejecucion proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_proyecto_ejecucion_proyecto <em>Id proyecto ejecucion proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_inicio_ejecucion_proyecto <em>Fecha inicio ejecucion proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getDuracion_prevista_ejecucion_proyecto <em>Duracion prevista ejecucion proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_fin_ejecucion_proyecto <em>Fecha fin ejecucion proyecto</em>}</li>
 *   <li>{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getProyecto <em>Proyecto</em>}</li>
 * </ul>
 *
 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_En_Ejecucion()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Proyectos_En_Ejecucion extends EObject {
	/**
	 * Returns the value of the '<em><b>Id ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id ejecucion proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id ejecucion proyecto</em>' attribute.
	 * @see #setId_ejecucion_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_En_Ejecucion_Id_ejecucion_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_ejecucion_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_ejecucion_proyecto <em>Id ejecucion proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id ejecucion proyecto</em>' attribute.
	 * @see #getId_ejecucion_proyecto()
	 * @generated
	 */
	void setId_ejecucion_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Id proyecto ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id proyecto ejecucion proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id proyecto ejecucion proyecto</em>' attribute.
	 * @see #setId_proyecto_ejecucion_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_En_Ejecucion_Id_proyecto_ejecucion_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId_proyecto_ejecucion_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_proyecto_ejecucion_proyecto <em>Id proyecto ejecucion proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id proyecto ejecucion proyecto</em>' attribute.
	 * @see #getId_proyecto_ejecucion_proyecto()
	 * @generated
	 */
	void setId_proyecto_ejecucion_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Fecha inicio ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha inicio ejecucion proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha inicio ejecucion proyecto</em>' attribute.
	 * @see #setFecha_inicio_ejecucion_proyecto(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_En_Ejecucion_Fecha_inicio_ejecucion_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_inicio_ejecucion_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_inicio_ejecucion_proyecto <em>Fecha inicio ejecucion proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha inicio ejecucion proyecto</em>' attribute.
	 * @see #getFecha_inicio_ejecucion_proyecto()
	 * @generated
	 */
	void setFecha_inicio_ejecucion_proyecto(Date value);

	/**
	 * Returns the value of the '<em><b>Duracion prevista ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duracion prevista ejecucion proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duracion prevista ejecucion proyecto</em>' attribute.
	 * @see #setDuracion_prevista_ejecucion_proyecto(int)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_En_Ejecucion_Duracion_prevista_ejecucion_proyecto()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDuracion_prevista_ejecucion_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getDuracion_prevista_ejecucion_proyecto <em>Duracion prevista ejecucion proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duracion prevista ejecucion proyecto</em>' attribute.
	 * @see #getDuracion_prevista_ejecucion_proyecto()
	 * @generated
	 */
	void setDuracion_prevista_ejecucion_proyecto(int value);

	/**
	 * Returns the value of the '<em><b>Fecha fin ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha fin ejecucion proyecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha fin ejecucion proyecto</em>' attribute.
	 * @see #setFecha_fin_ejecucion_proyecto(Date)
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_En_Ejecucion_Fecha_fin_ejecucion_proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFecha_fin_ejecucion_proyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_fin_ejecucion_proyecto <em>Fecha fin ejecucion proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha fin ejecucion proyecto</em>' attribute.
	 * @see #getFecha_fin_ejecucion_proyecto()
	 * @generated
	 */
	void setFecha_fin_ejecucion_proyecto(Date value);

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
	 * @see ArkiWeb.modelo.ModeloPackage#getProyectos_En_Ejecucion_Proyecto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Proyecto getProyecto();

	/**
	 * Sets the value of the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getProyecto <em>Proyecto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proyecto</em>' reference.
	 * @see #getProyecto()
	 * @generated
	 */
	void setProyecto(Proyecto value);

} // Proyectos_En_Ejecucion
