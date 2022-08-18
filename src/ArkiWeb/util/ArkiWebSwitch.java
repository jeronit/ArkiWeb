/**
 */
package ArkiWeb.util;

import ArkiWeb.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ArkiWeb.ArkiWebPackage
 * @generated
 */
public class ArkiWebSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArkiWebPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkiWebSwitch() {
		if (modelPackage == null) {
			modelPackage = ArkiWebPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArkiWebPackage.LIST_STRING: {
				ListString listString = (ListString)theEObject;
				T result = caseListString(listString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_USUARIO: {
				ListUsuario listUsuario = (ListUsuario)theEObject;
				T result = caseListUsuario(listUsuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_PERMISO: {
				ListPermiso listPermiso = (ListPermiso)theEObject;
				T result = caseListPermiso(listPermiso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_PROYECTO: {
				ListProyecto listProyecto = (ListProyecto)theEObject;
				T result = caseListProyecto(listProyecto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_CERTIFICADO: {
				ListCertificado listCertificado = (ListCertificado)theEObject;
				T result = caseListCertificado(listCertificado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_VIVIENDA: {
				ListVivienda listVivienda = (ListVivienda)theEObject;
				T result = caseListVivienda(listVivienda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_INMUEBLE: {
				ListInmueble listInmueble = (ListInmueble)theEObject;
				T result = caseListInmueble(listInmueble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_CERTIFICADOS_ASIGNADOS: {
				ListCertificados_Asignados listCertificados_Asignados = (ListCertificados_Asignados)theEObject;
				T result = caseListCertificados_Asignados(listCertificados_Asignados);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_PROYECTOS_ASIGNADOS: {
				ListProyectos_Asignados listProyectos_Asignados = (ListProyectos_Asignados)theEObject;
				T result = caseListProyectos_Asignados(listProyectos_Asignados);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArkiWebPackage.LIST_PROYECTOS_EN_EJECUCION: {
				ListProyectos_En_Ejecucion listProyectos_En_Ejecucion = (ListProyectos_En_Ejecucion)theEObject;
				T result = caseListProyectos_En_Ejecucion(listProyectos_En_Ejecucion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListString(ListString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListUsuario(ListUsuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Permiso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Permiso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListPermiso(ListPermiso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Proyecto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Proyecto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListProyecto(ListProyecto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Certificado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Certificado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListCertificado(ListCertificado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Vivienda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Vivienda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListVivienda(ListVivienda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Inmueble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Inmueble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListInmueble(ListInmueble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Certificados Asignados</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Certificados Asignados</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListCertificados_Asignados(ListCertificados_Asignados object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Proyectos Asignados</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Proyectos Asignados</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListProyectos_Asignados(ListProyectos_Asignados object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Proyectos En Ejecucion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Proyectos En Ejecucion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListProyectos_En_Ejecucion(ListProyectos_En_Ejecucion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArkiWebSwitch
