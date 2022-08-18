/**
 */
package ArkiWeb.util;

import ArkiWeb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ArkiWeb.ArkiWebPackage
 * @generated
 */
public class ArkiWebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArkiWebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkiWebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArkiWebPackage.eINSTANCE;
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
	protected ArkiWebSwitch<Adapter> modelSwitch =
		new ArkiWebSwitch<Adapter>() {
			@Override
			public Adapter caseListString(ListString object) {
				return createListStringAdapter();
			}
			@Override
			public Adapter caseListUsuario(ListUsuario object) {
				return createListUsuarioAdapter();
			}
			@Override
			public Adapter caseListPermiso(ListPermiso object) {
				return createListPermisoAdapter();
			}
			@Override
			public Adapter caseListProyecto(ListProyecto object) {
				return createListProyectoAdapter();
			}
			@Override
			public Adapter caseListCertificado(ListCertificado object) {
				return createListCertificadoAdapter();
			}
			@Override
			public Adapter caseListVivienda(ListVivienda object) {
				return createListViviendaAdapter();
			}
			@Override
			public Adapter caseListInmueble(ListInmueble object) {
				return createListInmuebleAdapter();
			}
			@Override
			public Adapter caseListCertificados_Asignados(ListCertificados_Asignados object) {
				return createListCertificados_AsignadosAdapter();
			}
			@Override
			public Adapter caseListProyectos_Asignados(ListProyectos_Asignados object) {
				return createListProyectos_AsignadosAdapter();
			}
			@Override
			public Adapter caseListProyectos_En_Ejecucion(ListProyectos_En_Ejecucion object) {
				return createListProyectos_En_EjecucionAdapter();
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
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListString <em>List String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListString
	 * @generated
	 */
	public Adapter createListStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListUsuario <em>List Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListUsuario
	 * @generated
	 */
	public Adapter createListUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListPermiso <em>List Permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListPermiso
	 * @generated
	 */
	public Adapter createListPermisoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListProyecto <em>List Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListProyecto
	 * @generated
	 */
	public Adapter createListProyectoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListCertificado <em>List Certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListCertificado
	 * @generated
	 */
	public Adapter createListCertificadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListVivienda <em>List Vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListVivienda
	 * @generated
	 */
	public Adapter createListViviendaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListInmueble <em>List Inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListInmueble
	 * @generated
	 */
	public Adapter createListInmuebleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListCertificados_Asignados <em>List Certificados Asignados</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListCertificados_Asignados
	 * @generated
	 */
	public Adapter createListCertificados_AsignadosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListProyectos_Asignados <em>List Proyectos Asignados</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListProyectos_Asignados
	 * @generated
	 */
	public Adapter createListProyectos_AsignadosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.ListProyectos_En_Ejecucion <em>List Proyectos En Ejecucion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.ListProyectos_En_Ejecucion
	 * @generated
	 */
	public Adapter createListProyectos_En_EjecucionAdapter() {
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

} //ArkiWebAdapterFactory
