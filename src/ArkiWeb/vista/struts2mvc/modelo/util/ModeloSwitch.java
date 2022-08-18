/**
 */
package ArkiWeb.vista.struts2mvc.modelo.util;

import ArkiWeb.vista.struts2mvc.modelo.*;

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
 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloPackage
 * @generated
 */
public class ModeloSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeloPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloSwitch() {
		if (modelPackage == null) {
			modelPackage = ModeloPackage.eINSTANCE;
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
			case ModeloPackage.LOGIN_ACTION_SUPPORT: {
				LoginActionSupport loginActionSupport = (LoginActionSupport)theEObject;
				T result = caseLoginActionSupport(loginActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.ALTA_USUARIO_ACTION_SUPPORT: {
				AltaUsuarioActionSupport altaUsuarioActionSupport = (AltaUsuarioActionSupport)theEObject;
				T result = caseAltaUsuarioActionSupport(altaUsuarioActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.PORTAL_CLIENTE_ACTION_SUPPORT: {
				PortalClienteActionSupport portalClienteActionSupport = (PortalClienteActionSupport)theEObject;
				T result = casePortalClienteActionSupport(portalClienteActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.PORTAL_ADMINISTRADOR_ACTION_SUPPORT: {
				PortalAdministradorActionSupport portalAdministradorActionSupport = (PortalAdministradorActionSupport)theEObject;
				T result = casePortalAdministradorActionSupport(portalAdministradorActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.PORTAL_ARQUITECTO_ACTION_SUPPORT: {
				PortalArquitectoActionSupport portalArquitectoActionSupport = (PortalArquitectoActionSupport)theEObject;
				T result = casePortalArquitectoActionSupport(portalArquitectoActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.EDITAR_USUARIO_ACTION_SUPPORT: {
				EditarUsuarioActionSupport editarUsuarioActionSupport = (EditarUsuarioActionSupport)theEObject;
				T result = caseEditarUsuarioActionSupport(editarUsuarioActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.EDITAR_PERMISO_ACTION_SUPPORT: {
				EditarPermisoActionSupport editarPermisoActionSupport = (EditarPermisoActionSupport)theEObject;
				T result = caseEditarPermisoActionSupport(editarPermisoActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.EDITAR_CERTIFICADO_ACTION_SUPPORT: {
				EditarCertificadoActionSupport editarCertificadoActionSupport = (EditarCertificadoActionSupport)theEObject;
				T result = caseEditarCertificadoActionSupport(editarCertificadoActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.EDITAR_PROYECTO_ACTION_SUPPORT: {
				EditarProyectoActionSupport editarProyectoActionSupport = (EditarProyectoActionSupport)theEObject;
				T result = caseEditarProyectoActionSupport(editarProyectoActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT: {
				EditarEjecucionProyectoActionSupport editarEjecucionProyectoActionSupport = (EditarEjecucionProyectoActionSupport)theEObject;
				T result = caseEditarEjecucionProyectoActionSupport(editarEjecucionProyectoActionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginActionSupport(LoginActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alta Usuario Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alta Usuario Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltaUsuarioActionSupport(AltaUsuarioActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portal Cliente Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portal Cliente Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortalClienteActionSupport(PortalClienteActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portal Administrador Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portal Administrador Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortalAdministradorActionSupport(PortalAdministradorActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portal Arquitecto Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portal Arquitecto Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortalArquitectoActionSupport(PortalArquitectoActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editar Usuario Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editar Usuario Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditarUsuarioActionSupport(EditarUsuarioActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editar Permiso Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editar Permiso Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditarPermisoActionSupport(EditarPermisoActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editar Certificado Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editar Certificado Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditarCertificadoActionSupport(EditarCertificadoActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editar Proyecto Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editar Proyecto Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditarProyectoActionSupport(EditarProyectoActionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editar Ejecucion Proyecto Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editar Ejecucion Proyecto Action Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditarEjecucionProyectoActionSupport(EditarEjecucionProyectoActionSupport object) {
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

} //ModeloSwitch
