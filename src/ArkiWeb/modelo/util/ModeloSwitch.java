/**
 */
package ArkiWeb.modelo.util;

import ArkiWeb.modelo.*;

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
 * @see ArkiWeb.modelo.ModeloPackage
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
			case ModeloPackage.PERMISO: {
				Permiso permiso = (Permiso)theEObject;
				T result = casePermiso(permiso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.ROL: {
				Rol rol = (Rol)theEObject;
				T result = caseRol(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				T result = caseUsuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.PROYECTO: {
				Proyecto proyecto = (Proyecto)theEObject;
				T result = caseProyecto(proyecto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.VIVIENDA: {
				Vivienda vivienda = (Vivienda)theEObject;
				T result = caseVivienda(vivienda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.INMUEBLE: {
				Inmueble inmueble = (Inmueble)theEObject;
				T result = caseInmueble(inmueble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.CERTIFICADO: {
				Certificado certificado = (Certificado)theEObject;
				T result = caseCertificado(certificado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.HSQLDB: {
				HSQLDB hsqldb = (HSQLDB)theEObject;
				T result = caseHSQLDB(hsqldb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.CERTIFICADOS_ASIGNADOS: {
				Certificados_Asignados certificados_Asignados = (Certificados_Asignados)theEObject;
				T result = caseCertificados_Asignados(certificados_Asignados);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.PROYECTOS_ASIGNADOS: {
				Proyectos_Asignados proyectos_Asignados = (Proyectos_Asignados)theEObject;
				T result = caseProyectos_Asignados(proyectos_Asignados);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.PROYECTOS_EN_EJECUCION: {
				Proyectos_En_Ejecucion proyectos_En_Ejecucion = (Proyectos_En_Ejecucion)theEObject;
				T result = caseProyectos_En_Ejecucion(proyectos_En_Ejecucion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.FACTORY: {
				Factory factory = (Factory)theEObject;
				T result = caseFactory(factory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloPackage.CONCRETE_FACTORY: {
				ConcreteFactory concreteFactory = (ConcreteFactory)theEObject;
				T result = caseConcreteFactory(concreteFactory);
				if (result == null) result = caseFactory(concreteFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permiso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permiso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermiso(Permiso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proyecto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proyecto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProyecto(Proyecto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vivienda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vivienda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVivienda(Vivienda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inmueble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inmueble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInmueble(Inmueble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificado(Certificado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSQLDB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSQLDB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSQLDB(HSQLDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proyectos Asignados</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proyectos Asignados</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProyectos_Asignados(Proyectos_Asignados object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificados Asignados</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificados Asignados</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificados_Asignados(Certificados_Asignados object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proyectos En Ejecucion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proyectos En Ejecucion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProyectos_En_Ejecucion(Proyectos_En_Ejecucion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactory(Factory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteFactory(ConcreteFactory object) {
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
