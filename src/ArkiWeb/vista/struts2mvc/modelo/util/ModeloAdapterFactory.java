/**
 */
package ArkiWeb.vista.struts2mvc.modelo.util;

import ArkiWeb.vista.struts2mvc.modelo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloPackage
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
			public Adapter caseLoginActionSupport(LoginActionSupport object) {
				return createLoginActionSupportAdapter();
			}
			@Override
			public Adapter caseAltaUsuarioActionSupport(AltaUsuarioActionSupport object) {
				return createAltaUsuarioActionSupportAdapter();
			}
			@Override
			public Adapter casePortalClienteActionSupport(PortalClienteActionSupport object) {
				return createPortalClienteActionSupportAdapter();
			}
			@Override
			public Adapter casePortalAdministradorActionSupport(PortalAdministradorActionSupport object) {
				return createPortalAdministradorActionSupportAdapter();
			}
			@Override
			public Adapter casePortalArquitectoActionSupport(PortalArquitectoActionSupport object) {
				return createPortalArquitectoActionSupportAdapter();
			}
			@Override
			public Adapter caseEditarUsuarioActionSupport(EditarUsuarioActionSupport object) {
				return createEditarUsuarioActionSupportAdapter();
			}
			@Override
			public Adapter caseEditarPermisoActionSupport(EditarPermisoActionSupport object) {
				return createEditarPermisoActionSupportAdapter();
			}
			@Override
			public Adapter caseEditarCertificadoActionSupport(EditarCertificadoActionSupport object) {
				return createEditarCertificadoActionSupportAdapter();
			}
			@Override
			public Adapter caseEditarProyectoActionSupport(EditarProyectoActionSupport object) {
				return createEditarProyectoActionSupportAdapter();
			}
			@Override
			public Adapter caseEditarEjecucionProyectoActionSupport(EditarEjecucionProyectoActionSupport object) {
				return createEditarEjecucionProyectoActionSupportAdapter();
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
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport <em>Login Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport
	 * @generated
	 */
	public Adapter createLoginActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport <em>Alta Usuario Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport
	 * @generated
	 */
	public Adapter createAltaUsuarioActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.PortalClienteActionSupport <em>Portal Cliente Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalClienteActionSupport
	 * @generated
	 */
	public Adapter createPortalClienteActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.PortalAdministradorActionSupport <em>Portal Administrador Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalAdministradorActionSupport
	 * @generated
	 */
	public Adapter createPortalAdministradorActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport <em>Portal Arquitecto Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport
	 * @generated
	 */
	public Adapter createPortalArquitectoActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarUsuarioActionSupport <em>Editar Usuario Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarUsuarioActionSupport
	 * @generated
	 */
	public Adapter createEditarUsuarioActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarPermisoActionSupport <em>Editar Permiso Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarPermisoActionSupport
	 * @generated
	 */
	public Adapter createEditarPermisoActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarCertificadoActionSupport <em>Editar Certificado Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarCertificadoActionSupport
	 * @generated
	 */
	public Adapter createEditarCertificadoActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarProyectoActionSupport <em>Editar Proyecto Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarProyectoActionSupport
	 * @generated
	 */
	public Adapter createEditarProyectoActionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarEjecucionProyectoActionSupport <em>Editar Ejecucion Proyecto Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarEjecucionProyectoActionSupport
	 * @generated
	 */
	public Adapter createEditarEjecucionProyectoActionSupportAdapter() {
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
