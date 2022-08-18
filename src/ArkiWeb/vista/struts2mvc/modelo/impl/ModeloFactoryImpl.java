/**
 */
package ArkiWeb.vista.struts2mvc.modelo.impl;

import ArkiWeb.vista.struts2mvc.modelo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloFactoryImpl extends EFactoryImpl implements ModeloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeloFactory init() {
		try {
			ModeloFactory theModeloFactory = (ModeloFactory)EPackage.Registry.INSTANCE.getEFactory(ModeloPackage.eNS_URI);
			if (theModeloFactory != null) {
				return theModeloFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModeloPackage.LOGIN_ACTION_SUPPORT: return createLoginActionSupport();
			case ModeloPackage.ALTA_USUARIO_ACTION_SUPPORT: return createAltaUsuarioActionSupport();
			case ModeloPackage.PORTAL_CLIENTE_ACTION_SUPPORT: return createPortalClienteActionSupport();
			case ModeloPackage.PORTAL_ADMINISTRADOR_ACTION_SUPPORT: return createPortalAdministradorActionSupport();
			case ModeloPackage.PORTAL_ARQUITECTO_ACTION_SUPPORT: return createPortalArquitectoActionSupport();
			case ModeloPackage.EDITAR_USUARIO_ACTION_SUPPORT: return createEditarUsuarioActionSupport();
			case ModeloPackage.EDITAR_PERMISO_ACTION_SUPPORT: return createEditarPermisoActionSupport();
			case ModeloPackage.EDITAR_CERTIFICADO_ACTION_SUPPORT: return createEditarCertificadoActionSupport();
			case ModeloPackage.EDITAR_PROYECTO_ACTION_SUPPORT: return createEditarProyectoActionSupport();
			case ModeloPackage.EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT: return createEditarEjecucionProyectoActionSupport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoginActionSupport createLoginActionSupport() {
		LoginActionSupportImpl loginActionSupport = new LoginActionSupportImpl();
		return loginActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltaUsuarioActionSupport createAltaUsuarioActionSupport() {
		AltaUsuarioActionSupportImpl altaUsuarioActionSupport = new AltaUsuarioActionSupportImpl();
		return altaUsuarioActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalClienteActionSupport createPortalClienteActionSupport() {
		PortalClienteActionSupportImpl portalClienteActionSupport = new PortalClienteActionSupportImpl();
		return portalClienteActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalAdministradorActionSupport createPortalAdministradorActionSupport() {
		PortalAdministradorActionSupportImpl portalAdministradorActionSupport = new PortalAdministradorActionSupportImpl();
		return portalAdministradorActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalArquitectoActionSupport createPortalArquitectoActionSupport() {
		PortalArquitectoActionSupportImpl portalArquitectoActionSupport = new PortalArquitectoActionSupportImpl();
		return portalArquitectoActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditarUsuarioActionSupport createEditarUsuarioActionSupport() {
		EditarUsuarioActionSupportImpl editarUsuarioActionSupport = new EditarUsuarioActionSupportImpl();
		return editarUsuarioActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditarPermisoActionSupport createEditarPermisoActionSupport() {
		EditarPermisoActionSupportImpl editarPermisoActionSupport = new EditarPermisoActionSupportImpl();
		return editarPermisoActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditarCertificadoActionSupport createEditarCertificadoActionSupport() {
		EditarCertificadoActionSupportImpl editarCertificadoActionSupport = new EditarCertificadoActionSupportImpl();
		return editarCertificadoActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditarProyectoActionSupport createEditarProyectoActionSupport() {
		EditarProyectoActionSupportImpl editarProyectoActionSupport = new EditarProyectoActionSupportImpl();
		return editarProyectoActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditarEjecucionProyectoActionSupport createEditarEjecucionProyectoActionSupport() {
		EditarEjecucionProyectoActionSupportImpl editarEjecucionProyectoActionSupport = new EditarEjecucionProyectoActionSupportImpl();
		return editarEjecucionProyectoActionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeloPackage getModeloPackage() {
		return (ModeloPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeloPackage getPackage() {
		return ModeloPackage.eINSTANCE;
	}

} //ModeloFactoryImpl
