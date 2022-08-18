/**
 */
package ArkiWeb.controlador.util;

import ArkiWeb.controlador.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ArkiWeb.controlador.ControladorPackage
 * @generated
 */
public class ControladorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControladorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControladorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ControladorPackage.eINSTANCE;
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
	protected ControladorSwitch<Adapter> modelSwitch =
		new ControladorSwitch<Adapter>() {
			@Override
			public Adapter caseControlador_Modelo(Controlador_Modelo object) {
				return createControlador_ModeloAdapter();
			}
			@Override
			public Adapter caseControl_Login(Control_Login object) {
				return createControl_LoginAdapter();
			}
			@Override
			public Adapter caseControl_Permisos(Control_Permisos object) {
				return createControl_PermisosAdapter();
			}
			@Override
			public Adapter caseControl_Usuarios(Control_Usuarios object) {
				return createControl_UsuariosAdapter();
			}
			@Override
			public Adapter caseControl_Certificados(Control_Certificados object) {
				return createControl_CertificadosAdapter();
			}
			@Override
			public Adapter caseControl_Proyectos(Control_Proyectos object) {
				return createControl_ProyectosAdapter();
			}
			@Override
			public Adapter caseControl_Viviendas(Control_Viviendas object) {
				return createControl_ViviendasAdapter();
			}
			@Override
			public Adapter caseControl_Inmuebles(Control_Inmuebles object) {
				return createControl_InmueblesAdapter();
			}
			@Override
			public Adapter caseGestor_Busquedas(Gestor_Busquedas object) {
				return createGestor_BusquedasAdapter();
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
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Controlador_Modelo <em>Controlador Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Controlador_Modelo
	 * @generated
	 */
	public Adapter createControlador_ModeloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Control_Login <em>Control Login</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Control_Login
	 * @generated
	 */
	public Adapter createControl_LoginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Control_Permisos <em>Control Permisos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Control_Permisos
	 * @generated
	 */
	public Adapter createControl_PermisosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Control_Usuarios <em>Control Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Control_Usuarios
	 * @generated
	 */
	public Adapter createControl_UsuariosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Control_Certificados <em>Control Certificados</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Control_Certificados
	 * @generated
	 */
	public Adapter createControl_CertificadosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Control_Proyectos <em>Control Proyectos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Control_Proyectos
	 * @generated
	 */
	public Adapter createControl_ProyectosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Control_Viviendas <em>Control Viviendas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Control_Viviendas
	 * @generated
	 */
	public Adapter createControl_ViviendasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Control_Inmuebles <em>Control Inmuebles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Control_Inmuebles
	 * @generated
	 */
	public Adapter createControl_InmueblesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.controlador.Gestor_Busquedas <em>Gestor Busquedas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.controlador.Gestor_Busquedas
	 * @generated
	 */
	public Adapter createGestor_BusquedasAdapter() {
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

} //ControladorAdapterFactory
