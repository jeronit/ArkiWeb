/**
 */
package ArkiWeb.impl;

import ArkiWeb.ArkiWebFactory;
import ArkiWeb.ArkiWebPackage;
import ArkiWeb.ListCertificado;
import ArkiWeb.ListCertificados_Asignados;
import ArkiWeb.ListInmueble;
import ArkiWeb.ListPermiso;
import ArkiWeb.ListProyecto;
import ArkiWeb.ListProyectos_Asignados;
import ArkiWeb.ListProyectos_En_Ejecucion;
import ArkiWeb.ListString;
import ArkiWeb.ListUsuario;
import ArkiWeb.ListVivienda;

import ArkiWeb.controlador.ControladorPackage;

import ArkiWeb.controlador.impl.ControladorPackageImpl;

import ArkiWeb.modelo.ModeloPackage;

import ArkiWeb.modelo.impl.ModeloPackageImpl;

import org.eclipse.emf.ecore.EClass;
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
public class ArkiWebPackageImpl extends EPackageImpl implements ArkiWebPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listUsuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPermisoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listProyectoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listCertificadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listViviendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listInmuebleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listCertificados_AsignadosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listProyectos_AsignadosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listProyectos_En_EjecucionEClass = null;

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
	 * @see ArkiWeb.ArkiWebPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArkiWebPackageImpl() {
		super(eNS_URI, ArkiWebFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArkiWebPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArkiWebPackage init() {
		if (isInited) return (ArkiWebPackage)EPackage.Registry.INSTANCE.getEPackage(ArkiWebPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArkiWebPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArkiWebPackageImpl theArkiWebPackage = registeredArkiWebPackage instanceof ArkiWebPackageImpl ? (ArkiWebPackageImpl)registeredArkiWebPackage : new ArkiWebPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModeloPackage.eNS_URI);
		ModeloPackageImpl theModeloPackage = (ModeloPackageImpl)(registeredPackage instanceof ModeloPackageImpl ? registeredPackage : ModeloPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArkiWeb.vista.struts2mvc.modelo.ModeloPackage.eNS_URI);
		ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl theModeloPackage_1 = (ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl)(registeredPackage instanceof ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl ? registeredPackage : ArkiWeb.vista.struts2mvc.modelo.ModeloPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControladorPackage.eNS_URI);
		ControladorPackageImpl theControladorPackage = (ControladorPackageImpl)(registeredPackage instanceof ControladorPackageImpl ? registeredPackage : ControladorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theArkiWebPackage.createPackageContents();
		theModeloPackage.createPackageContents();
		theModeloPackage_1.createPackageContents();
		theControladorPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theArkiWebPackage.initializePackageContents();
		theModeloPackage.initializePackageContents();
		theModeloPackage_1.initializePackageContents();
		theControladorPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArkiWebPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArkiWebPackage.eNS_URI, theArkiWebPackage);
		return theArkiWebPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListString() {
		return listStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListUsuario() {
		return listUsuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListPermiso() {
		return listPermisoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListProyecto() {
		return listProyectoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListCertificado() {
		return listCertificadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListVivienda() {
		return listViviendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListInmueble() {
		return listInmuebleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListCertificados_Asignados() {
		return listCertificados_AsignadosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListProyectos_Asignados() {
		return listProyectos_AsignadosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListProyectos_En_Ejecucion() {
		return listProyectos_En_EjecucionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArkiWebFactory getArkiWebFactory() {
		return (ArkiWebFactory)getEFactoryInstance();
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
		listStringEClass = createEClass(LIST_STRING);

		listUsuarioEClass = createEClass(LIST_USUARIO);

		listPermisoEClass = createEClass(LIST_PERMISO);

		listProyectoEClass = createEClass(LIST_PROYECTO);

		listCertificadoEClass = createEClass(LIST_CERTIFICADO);

		listViviendaEClass = createEClass(LIST_VIVIENDA);

		listInmuebleEClass = createEClass(LIST_INMUEBLE);

		listCertificados_AsignadosEClass = createEClass(LIST_CERTIFICADOS_ASIGNADOS);

		listProyectos_AsignadosEClass = createEClass(LIST_PROYECTOS_ASIGNADOS);

		listProyectos_En_EjecucionEClass = createEClass(LIST_PROYECTOS_EN_EJECUCION);
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
		ModeloPackage theModeloPackage = (ModeloPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloPackage.eNS_URI);
		ArkiWeb.vista.struts2mvc.modelo.ModeloPackage theModeloPackage_1 = (ArkiWeb.vista.struts2mvc.modelo.ModeloPackage)EPackage.Registry.INSTANCE.getEPackage(ArkiWeb.vista.struts2mvc.modelo.ModeloPackage.eNS_URI);
		ControladorPackage theControladorPackage = (ControladorPackage)EPackage.Registry.INSTANCE.getEPackage(ControladorPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theModeloPackage);
		getESubpackages().add(theModeloPackage_1);
		getESubpackages().add(theControladorPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(listStringEClass, ListString.class, "ListString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listUsuarioEClass, ListUsuario.class, "ListUsuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listPermisoEClass, ListPermiso.class, "ListPermiso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listProyectoEClass, ListProyecto.class, "ListProyecto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listCertificadoEClass, ListCertificado.class, "ListCertificado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listViviendaEClass, ListVivienda.class, "ListVivienda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listInmuebleEClass, ListInmueble.class, "ListInmueble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listCertificados_AsignadosEClass, ListCertificados_Asignados.class, "ListCertificados_Asignados", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listProyectos_AsignadosEClass, ListProyectos_Asignados.class, "ListProyectos_Asignados", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listProyectos_En_EjecucionEClass, ListProyectos_En_Ejecucion.class, "ListProyectos_En_Ejecucion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (listStringEClass,
		   source,
		   new String[] {
			   "originalName", "List<String>"
		   });
		addAnnotation
		  (listUsuarioEClass,
		   source,
		   new String[] {
			   "originalName", "List<Usuario>"
		   });
		addAnnotation
		  (listPermisoEClass,
		   source,
		   new String[] {
			   "originalName", "List<Permiso>"
		   });
		addAnnotation
		  (listProyectoEClass,
		   source,
		   new String[] {
			   "originalName", "List<Proyecto>"
		   });
		addAnnotation
		  (listCertificadoEClass,
		   source,
		   new String[] {
			   "originalName", "List<Certificado>"
		   });
		addAnnotation
		  (listViviendaEClass,
		   source,
		   new String[] {
			   "originalName", "List<Vivienda>"
		   });
		addAnnotation
		  (listInmuebleEClass,
		   source,
		   new String[] {
			   "originalName", "List<Inmueble>"
		   });
		addAnnotation
		  (listCertificados_AsignadosEClass,
		   source,
		   new String[] {
			   "originalName", "List<Certificados_Asignados>"
		   });
		addAnnotation
		  (listProyectos_AsignadosEClass,
		   source,
		   new String[] {
			   "originalName", "List<Proyectos_Asignados>"
		   });
		addAnnotation
		  (listProyectos_En_EjecucionEClass,
		   source,
		   new String[] {
			   "originalName", "List<Proyectos_En_Ejecucion>"
		   });
	}

} //ArkiWebPackageImpl
