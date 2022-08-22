/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Proyectos</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Proyectos()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Proyectos extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo proyecto
	 * <!-- end-user-doc -->
	 * @param		proyecto		Proyecto		Proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated NOT
	 */
	void crearProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Edita un proyecto
	 * <!-- end-user-doc -->
	 * @param		proyecto		Proyecto		Proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated NOT
	 */
	void editarProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nueva asignación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		asignacionProyecto			Proyectos_Asignados					Asignación de un proyecto
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated NOT
	 */
	void asignarProyecto(Proyectos_Asignados asignacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		asignacionProyecto			Proyectos_Asignados					Asignación de un proyecto
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated NOT
	 */
	void editarAsignacionProyecto(Proyectos_Asignados asignacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nueva contratación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		contratacionProyecto			Proyectos_En_Ejecucion			Contratación de un proyecto
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated NOT
	 */
	void contratarProyecto(Proyectos_En_Ejecucion contratacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * Edita la contratación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		contratacionProyecto			Proyectos_En_Ejecucion			Contratación de un proyecto
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated NOT
	 */
	void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto);

} // Control_Proyectos
