/**
 */
package ArkiWeb.modelo.util;

import ArkiWeb.modelo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ArkiWeb.modelo.ModeloPackage
 * @generated
 */
public class ModeloAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeloPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModeloPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloSwitch<Adapter> modelSwitch =
		new ModeloSwitch<Adapter>() {
			@Override
			public Adapter casePermiso(Permiso object) {
				return createPermisoAdapter();
			}
			@Override
			public Adapter caseRol(Rol object) {
				return createRolAdapter();
			}
			@Override
			public Adapter caseUsuario(Usuario object) {
				return createUsuarioAdapter();
			}
			@Override
			public Adapter caseProyecto(Proyecto object) {
				return createProyectoAdapter();
			}
			@Override
			public Adapter caseVivienda(Vivienda object) {
				return createViviendaAdapter();
			}
			@Override
			public Adapter caseInmueble(Inmueble object) {
				return createInmuebleAdapter();
			}
			@Override
			public Adapter caseCertificado(Certificado object) {
				return createCertificadoAdapter();
			}
			@Override
			public Adapter caseHSQLDB(HSQLDB object) {
				return createHSQLDBAdapter();
			}
			@Override
			public Adapter caseProyectos_Asignados(Proyectos_Asignados object) {
				return createProyectos_AsignadosAdapter();
			}
			@Override
			public Adapter caseCertificados_Asignados(Certificados_Asignados object) {
				return createCertificados_AsignadosAdapter();
			}
			@Override
			public Adapter caseProyectos_En_Ejecucion(Proyectos_En_Ejecucion object) {
				return createProyectos_En_EjecucionAdapter();
			}
			@Override
			public Adapter caseFactory(Factory object) {
				return createFactoryAdapter();
			}
			@Override
			public Adapter caseConcreteFactory(ConcreteFactory object) {
				return createConcreteFactoryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Permiso <em>Permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Permiso
	 * @generated
	 */
	public Adapter createPermisoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Rol
	 * @generated
	 */
	public Adapter createRolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Proyecto <em>Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Proyecto
	 * @generated
	 */
	public Adapter createProyectoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Vivienda <em>Vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Vivienda
	 * @generated
	 */
	public Adapter createViviendaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Inmueble <em>Inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Inmueble
	 * @generated
	 */
	public Adapter createInmuebleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Certificado <em>Certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Certificado
	 * @generated
	 */
	public Adapter createCertificadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.HSQLDB <em>HSQLDB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.HSQLDB
	 * @generated
	 */
	public Adapter createHSQLDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Proyectos_Asignados <em>Proyectos Asignados</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Proyectos_Asignados
	 * @generated
	 */
	public Adapter createProyectos_AsignadosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Certificados_Asignados <em>Certificados Asignados</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Certificados_Asignados
	 * @generated
	 */
	public Adapter createCertificados_AsignadosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion <em>Proyectos En Ejecucion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion
	 * @generated
	 */
	public Adapter createProyectos_En_EjecucionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.Factory
	 * @generated
	 */
	public Adapter createFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.modelo.ConcreteFactory <em>Concrete Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.modelo.ConcreteFactory
	 * @generated
	 */
	public Adapter createConcreteFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModeloAdapterFactory
