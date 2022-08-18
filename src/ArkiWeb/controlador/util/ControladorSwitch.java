/**
 */
package ArkiWeb.controlador.util;

import ArkiWeb.controlador.*;

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
 * @see ArkiWeb.controlador.ControladorPackage
 * @generated
 */
public class ControladorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControladorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControladorSwitch() {
		if (modelPackage == null) {
			modelPackage = ControladorPackage.eINSTANCE;
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
			case ControladorPackage.CONTROLADOR_MODELO: {
				Controlador_Modelo controlador_Modelo = (Controlador_Modelo)theEObject;
				T result = caseControlador_Modelo(controlador_Modelo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.CONTROL_LOGIN: {
				Control_Login control_Login = (Control_Login)theEObject;
				T result = caseControl_Login(control_Login);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.CONTROL_PERMISOS: {
				Control_Permisos control_Permisos = (Control_Permisos)theEObject;
				T result = caseControl_Permisos(control_Permisos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.CONTROL_USUARIOS: {
				Control_Usuarios control_Usuarios = (Control_Usuarios)theEObject;
				T result = caseControl_Usuarios(control_Usuarios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.CONTROL_CERTIFICADOS: {
				Control_Certificados control_Certificados = (Control_Certificados)theEObject;
				T result = caseControl_Certificados(control_Certificados);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.CONTROL_PROYECTOS: {
				Control_Proyectos control_Proyectos = (Control_Proyectos)theEObject;
				T result = caseControl_Proyectos(control_Proyectos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.CONTROL_VIVIENDAS: {
				Control_Viviendas control_Viviendas = (Control_Viviendas)theEObject;
				T result = caseControl_Viviendas(control_Viviendas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.CONTROL_INMUEBLES: {
				Control_Inmuebles control_Inmuebles = (Control_Inmuebles)theEObject;
				T result = caseControl_Inmuebles(control_Inmuebles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControladorPackage.GESTOR_BUSQUEDAS: {
				Gestor_Busquedas gestor_Busquedas = (Gestor_Busquedas)theEObject;
				T result = caseGestor_Busquedas(gestor_Busquedas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controlador Modelo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controlador Modelo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlador_Modelo(Controlador_Modelo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Login</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Login</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl_Login(Control_Login object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Permisos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Permisos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl_Permisos(Control_Permisos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Usuarios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Usuarios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl_Usuarios(Control_Usuarios object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Certificados</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Certificados</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl_Certificados(Control_Certificados object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Proyectos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Proyectos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl_Proyectos(Control_Proyectos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Viviendas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Viviendas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl_Viviendas(Control_Viviendas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Inmuebles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Inmuebles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl_Inmuebles(Control_Inmuebles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gestor Busquedas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gestor Busquedas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestor_Busquedas(Gestor_Busquedas object) {
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

} //ControladorSwitch
