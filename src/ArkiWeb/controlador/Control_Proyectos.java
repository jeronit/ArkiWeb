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
	 * <!-- end-user-doc -->
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated
	 */
	void crearProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 * @generated
	 */
	void editarProyecto(Proyecto proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated
	 */
	void asignarProyecto(Proyectos_Asignados asignacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 * @generated
	 */
	void editarAsignacionProyecto(Proyectos_Asignados asignacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated
	 */
	void contratarProyecto(Proyectos_En_Ejecucion contratacionProyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 * @generated
	 */
	void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto);

} // Control_Proyectos
