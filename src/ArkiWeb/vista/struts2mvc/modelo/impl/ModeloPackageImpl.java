/**
 */
package ArkiWeb.vista.struts2mvc.modelo.impl;

import ArkiWeb.ArkiWebPackage;

import ArkiWeb.controlador.ControladorPackage;

import ArkiWeb.controlador.impl.ControladorPackageImpl;

import ArkiWeb.impl.ArkiWebPackageImpl;

import ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.EditarCertificadoActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.EditarEjecucionProyectoActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.EditarPermisoActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.EditarProyectoActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.EditarUsuarioActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.ModeloFactory;
import ArkiWeb.vista.struts2mvc.modelo.ModeloPackage;
import ArkiWeb.vista.struts2mvc.modelo.PortalAdministradorActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.PortalClienteActionSupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloPackageImpl extends EPackageImpl implements ModeloPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altaUsuarioActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portalClienteActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portalAdministradorActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portalArquitectoActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editarUsuarioActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editarPermisoActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editarCertificadoActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editarProyectoActionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editarEjecucionProyectoActionSupportEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeloPackageImpl() {
		super(eNS_URI, ModeloFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModeloPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeloPackage init() {
		if (isInited) return (ModeloPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModeloPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModeloPackageImpl theModeloPackage = registeredModeloPackage instanceof ModeloPackageImpl ? (ModeloPackageImpl)registeredModeloPackage : new ModeloPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArkiWebPackage.eNS_URI);
		ArkiWebPackageImpl theArkiWebPackage = (ArkiWebPackageImpl)(registeredPackage instanceof ArkiWebPackageImpl ? registeredPackage : ArkiWebPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArkiWeb.modelo.ModeloPackage.eNS_URI);
		ArkiWeb.modelo.impl.ModeloPackageImpl theModeloPackage_1 = (ArkiWeb.modelo.impl.ModeloPackageImpl)(registeredPackage instanceof ArkiWeb.modelo.impl.ModeloPackageImpl ? registeredPackage : ArkiWeb.modelo.ModeloPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControladorPackage.eNS_URI);
		ControladorPackageImpl theControladorPackage = (ControladorPackageImpl)(registeredPackage instanceof ControladorPackageImpl ? registeredPackage : ControladorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModeloPackage.createPackageContents();
		theArkiWebPackage.createPackageContents();
		theModeloPackage_1.createPackageContents();
		theControladorPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModeloPackage.initializePackageContents();
		theArkiWebPackage.initializePackageContents();
		theModeloPackage_1.initializePackageContents();
		theControladorPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeloPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeloPackage.eNS_URI, theModeloPackage);
		return theModeloPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoginActionSupport() {
		return loginActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLoginActionSupport__Execute() {
		return loginActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAltaUsuarioActionSupport() {
		return altaUsuarioActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAltaUsuarioActionSupport__Execute() {
		return altaUsuarioActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAltaUsuarioActionSupport__Execute_1() {
		return altaUsuarioActionSupportEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortalClienteActionSupport() {
		return portalClienteActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPortalClienteActionSupport__Execute() {
		return portalClienteActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortalAdministradorActionSupport() {
		return portalAdministradorActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPortalAdministradorActionSupport__Execute() {
		return portalAdministradorActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortalArquitectoActionSupport() {
		return portalArquitectoActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPortalArquitectoActionSupport__Execute() {
		return portalArquitectoActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditarUsuarioActionSupport() {
		return editarUsuarioActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEditarUsuarioActionSupport__Execute() {
		return editarUsuarioActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditarPermisoActionSupport() {
		return editarPermisoActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEditarPermisoActionSupport__Execute() {
		return editarPermisoActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditarCertificadoActionSupport() {
		return editarCertificadoActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEditarCertificadoActionSupport__Execute() {
		return editarCertificadoActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditarProyectoActionSupport() {
		return editarProyectoActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEditarProyectoActionSupport__Execute() {
		return editarProyectoActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditarEjecucionProyectoActionSupport() {
		return editarEjecucionProyectoActionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEditarEjecucionProyectoActionSupport__Execute() {
		return editarEjecucionProyectoActionSupportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeloFactory getModeloFactory() {
		return (ModeloFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		loginActionSupportEClass = createEClass(LOGIN_ACTION_SUPPORT);
		createEOperation(loginActionSupportEClass, LOGIN_ACTION_SUPPORT___EXECUTE);

		altaUsuarioActionSupportEClass = createEClass(ALTA_USUARIO_ACTION_SUPPORT);
		createEOperation(altaUsuarioActionSupportEClass, ALTA_USUARIO_ACTION_SUPPORT___EXECUTE);
		createEOperation(altaUsuarioActionSupportEClass, ALTA_USUARIO_ACTION_SUPPORT___EXECUTE);

		portalClienteActionSupportEClass = createEClass(PORTAL_CLIENTE_ACTION_SUPPORT);
		createEOperation(portalClienteActionSupportEClass, PORTAL_CLIENTE_ACTION_SUPPORT___EXECUTE);

		portalAdministradorActionSupportEClass = createEClass(PORTAL_ADMINISTRADOR_ACTION_SUPPORT);
		createEOperation(portalAdministradorActionSupportEClass, PORTAL_ADMINISTRADOR_ACTION_SUPPORT___EXECUTE);

		portalArquitectoActionSupportEClass = createEClass(PORTAL_ARQUITECTO_ACTION_SUPPORT);
		createEOperation(portalArquitectoActionSupportEClass, PORTAL_ARQUITECTO_ACTION_SUPPORT___EXECUTE);

		editarUsuarioActionSupportEClass = createEClass(EDITAR_USUARIO_ACTION_SUPPORT);
		createEOperation(editarUsuarioActionSupportEClass, EDITAR_USUARIO_ACTION_SUPPORT___EXECUTE);

		editarPermisoActionSupportEClass = createEClass(EDITAR_PERMISO_ACTION_SUPPORT);
		createEOperation(editarPermisoActionSupportEClass, EDITAR_PERMISO_ACTION_SUPPORT___EXECUTE);

		editarCertificadoActionSupportEClass = createEClass(EDITAR_CERTIFICADO_ACTION_SUPPORT);
		createEOperation(editarCertificadoActionSupportEClass, EDITAR_CERTIFICADO_ACTION_SUPPORT___EXECUTE);

		editarProyectoActionSupportEClass = createEClass(EDITAR_PROYECTO_ACTION_SUPPORT);
		createEOperation(editarProyectoActionSupportEClass, EDITAR_PROYECTO_ACTION_SUPPORT___EXECUTE);

		editarEjecucionProyectoActionSupportEClass = createEClass(EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT);
		createEOperation(editarEjecucionProyectoActionSupportEClass, EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT___EXECUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(loginActionSupportEClass, LoginActionSupport.class, "LoginActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLoginActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(altaUsuarioActionSupportEClass, AltaUsuarioActionSupport.class, "AltaUsuarioActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAltaUsuarioActionSupport__Execute(), null, "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAltaUsuarioActionSupport__Execute_1(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(portalClienteActionSupportEClass, PortalClienteActionSupport.class, "PortalClienteActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPortalClienteActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(portalAdministradorActionSupportEClass, PortalAdministradorActionSupport.class, "PortalAdministradorActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPortalAdministradorActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(portalArquitectoActionSupportEClass, PortalArquitectoActionSupport.class, "PortalArquitectoActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPortalArquitectoActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(editarUsuarioActionSupportEClass, EditarUsuarioActionSupport.class, "EditarUsuarioActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEditarUsuarioActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(editarPermisoActionSupportEClass, EditarPermisoActionSupport.class, "EditarPermisoActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEditarPermisoActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(editarCertificadoActionSupportEClass, EditarCertificadoActionSupport.class, "EditarCertificadoActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEditarCertificadoActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(editarProyectoActionSupportEClass, EditarProyectoActionSupport.class, "EditarProyectoActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEditarProyectoActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(editarEjecucionProyectoActionSupportEClass, EditarEjecucionProyectoActionSupport.class, "EditarEjecucionProyectoActionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEditarEjecucionProyectoActionSupport__Execute(), theTypesPackage.getString(), "execute", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //ModeloPackageImpl
