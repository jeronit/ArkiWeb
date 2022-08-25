/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.Date;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Tipo_Proyecto;

// TODO: Auto-generated Javadoc
/**
 * The Class Control_ProyectosImpl.
 *
 * @author JTE
 */
public class Control_ProyectosImpl implements ArkiWeb.controlador.Control_Proyectos {

	/**
	 * Instantiates a new control proyectos impl.
	 */
	public Control_ProyectosImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * E all contents.
	 *
	 * @return the tree iterator
	 */
	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E class.
	 *
	 * @return the e class
	 */
	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E container.
	 *
	 * @return the e object
	 */
	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E containing feature.
	 *
	 * @return the e structural feature
	 */
	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E containment feature.
	 *
	 * @return the e reference
	 */
	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E contents.
	 *
	 * @return the e list
	 */
	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E cross references.
	 *
	 * @return the e list
	 */
	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E get.
	 *
	 * @param arg0 the arg 0
	 * @return the object
	 */
	@Override
	public Object eGet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E get.
	 *
	 * @param arg0 the arg 0
	 * @param arg1 the arg 1
	 * @return the object
	 */
	@Override
	public Object eGet(EStructuralFeature arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E invoke.
	 *
	 * @param arg0 the arg 0
	 * @param arg1 the arg 1
	 * @return the object
	 * @throws InvocationTargetException the invocation target exception
	 */
	@Override
	public Object eInvoke(EOperation arg0, EList<?> arg1) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E is proxy.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * E is set.
	 *
	 * @param arg0 the arg 0
	 * @return true, if successful
	 */
	@Override
	public boolean eIsSet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * E resource.
	 *
	 * @return the resource
	 */
	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E set.
	 *
	 * @param arg0 the arg 0
	 * @param arg1 the arg 1
	 */
	@Override
	public void eSet(EStructuralFeature arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	/**
	 * E unset.
	 *
	 * @param arg0 the arg 0
	 */
	@Override
	public void eUnset(EStructuralFeature arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * E adapters.
	 *
	 * @return the e list
	 */
	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * E deliver.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * E notify.
	 *
	 * @param arg0 the arg 0
	 */
	@Override
	public void eNotify(Notification arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * E set deliver.
	 *
	 * @param arg0 the arg 0
	 */
	@Override
	public void eSetDeliver(boolean arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo proyecto
	 * <!-- end-user-doc -->
	 * @param		proyecto		Proyecto		Proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 */
	@Override
	public void crearProyecto(Proyecto proyecto) {
		
		ArkiWeb.controlador.Borrar.db.crearProyecto(proyecto);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita un proyecto
	 * <!-- end-user-doc -->
	 * @param		proyecto		Proyecto		Proyecto
	 * @model proyectoRequired="true" proyectoOrdered="false"
	 */
	@Override
	public void editarProyecto(Proyecto proyecto) {
		
		ArkiWeb.controlador.Borrar.db.editarProyecto(proyecto);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nueva asignación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		asignacionProyecto			Proyectos_Asignados					Asignación de un proyecto
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 */
	@Override
	public void asignarProyecto(Proyectos_Asignados asignacionProyecto) {
		
		ArkiWeb.controlador.Borrar.db.asignarProyecto(asignacionProyecto);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		asignacionProyecto			Proyectos_Asignados					Asignación de un proyecto
	 * @model asignacionProyectoRequired="true" asignacionProyectoOrdered="false"
	 */
	@Override
	public void editarAsignacionProyecto(Proyectos_Asignados asignacionProyecto) {

		ArkiWeb.controlador.Borrar.db.editarAsignacionProyecto(asignacionProyecto);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nueva contratación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		contratacionProyecto			Proyectos_En_Ejecucion			Contratación de un proyecto
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 */
	@Override
	public void contratarProyecto(Proyecto proyecto) {
		
		Proyectos_En_Ejecucion contratacionProyecto = (Proyectos_En_Ejecucion) ArkiWeb.controlador.Borrar.factory.crearObjeto("Proyectos_En_Ejecucion");
		contratacionProyecto.setId_proyecto_ejecucion_proyecto(proyecto.getId_proyecto());
		contratacionProyecto.setFecha_inicio_ejecucion_proyecto(new Date());
		contratacionProyecto.setDuracion_prevista_ejecucion_proyecto(proyecto.getDuracion_prevista_proyecto());
		
		ArkiWeb.controlador.Borrar.db.contratarProyecto(contratacionProyecto);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la contratación de un proyecto
	 * <!-- end-user-doc -->
	 * @param		contratacionProyecto			Proyectos_En_Ejecucion			Contratación de un proyecto
	 * @model contratacionProyectoRequired="true" contratacionProyectoOrdered="false"
	 */
	@Override
	public void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto) {

		ArkiWeb.controlador.Borrar.db.editarContratacionProyecto(contratacionProyecto);
		
	}

	
}
