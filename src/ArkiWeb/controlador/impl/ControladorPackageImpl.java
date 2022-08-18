/**
 */
package ArkiWeb.controlador.impl;

import ArkiWeb.ArkiWebPackage;

import ArkiWeb.controlador.Control_Certificados;
import ArkiWeb.controlador.Control_Inmuebles;
import ArkiWeb.controlador.Control_Login;
import ArkiWeb.controlador.Control_Permisos;
import ArkiWeb.controlador.Control_Proyectos;
import ArkiWeb.controlador.Control_Usuarios;
import ArkiWeb.controlador.Control_Viviendas;
import ArkiWeb.controlador.ControladorFactory;
import ArkiWeb.controlador.ControladorPackage;
import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.Gestor_Busquedas;

import ArkiWeb.impl.ArkiWebPackageImpl;

import ArkiWeb.modelo.ModeloPackage;

import ArkiWeb.modelo.impl.ModeloPackageImpl;

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
public class ControladorPackageImpl extends EPackageImpl implements ControladorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlador_ModeloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass control_LoginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass control_PermisosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass control_UsuariosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass control_CertificadosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass control_ProyectosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass control_ViviendasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass control_InmueblesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestor_BusquedasEClass = null;

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
	 * @see ArkiWeb.controlador.ControladorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControladorPackageImpl() {
		super(eNS_URI, ControladorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControladorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControladorPackage init() {
		if (isInited) return (ControladorPackage)EPackage.Registry.INSTANCE.getEPackage(ControladorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredControladorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ControladorPackageImpl theControladorPackage = registeredControladorPackage instanceof ControladorPackageImpl ? (ControladorPackageImpl)registeredControladorPackage : new ControladorPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArkiWebPackage.eNS_URI);
		ArkiWebPackageImpl theArkiWebPackage = (ArkiWebPackageImpl)(registeredPackage instanceof ArkiWebPackageImpl ? registeredPackage : ArkiWebPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModeloPackage.eNS_URI);
		ModeloPackageImpl theModeloPackage = (ModeloPackageImpl)(registeredPackage instanceof ModeloPackageImpl ? registeredPackage : ModeloPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArkiWeb.vista.struts2mvc.modelo.ModeloPackage.eNS_URI);
		ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl theModeloPackage_1 = (ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl)(registeredPackage instanceof ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl ? registeredPackage : ArkiWeb.vista.struts2mvc.modelo.ModeloPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theControladorPackage.createPackageContents();
		theArkiWebPackage.createPackageContents();
		theModeloPackage.createPackageContents();
		theModeloPackage_1.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theControladorPackage.initializePackageContents();
		theArkiWebPackage.initializePackageContents();
		theModeloPackage.initializePackageContents();
		theModeloPackage_1.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControladorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControladorPackage.eNS_URI, theControladorPackage);
		return theControladorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlador_Modelo() {
		return controlador_ModeloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__CrearUsuario__String_String_String_int_String_String_String() {
		return controlador_ModeloEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarUsuario_1__int_String_String_String_int_String_String_String() {
		return controlador_ModeloEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BajaUsuario__int() {
		return controlador_ModeloEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__CrearPermiso__String_String_boolean_boolean() {
		return controlador_ModeloEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarPermiso__int_String_String_boolean_boolean() {
		return controlador_ModeloEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarPermiso__int() {
		return controlador_ModeloEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double() {
		return controlador_ModeloEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double() {
		return controlador_ModeloEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarCertificado__int() {
		return controlador_ModeloEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double() {
		return controlador_ModeloEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double() {
		return controlador_ModeloEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarProyecto__int() {
		return controlador_ModeloEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__CrearVivienda__String_String_int_double_double_int_int_int() {
		return controlador_ModeloEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarVivienda__int_String_String_int_double_double_int_int_int() {
		return controlador_ModeloEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarVivienda__int() {
		return controlador_ModeloEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__CrearInmueble__String_String_double_double() {
		return controlador_ModeloEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarInmueble__int_String_String_double_double() {
		return controlador_ModeloEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarInmueble__int() {
		return controlador_ModeloEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__AsignarCertificado__int_int() {
		return controlador_ModeloEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarAsignacionCertificado__int_int_int() {
		return controlador_ModeloEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__AsignarProyecto__int_int() {
		return controlador_ModeloEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarAsignacionProyecto__int_int_int() {
		return controlador_ModeloEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__ContratarProyecto__int_Date_int_Date() {
		return controlador_ModeloEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__EditarContratacionProyecto__int_int_Date_int_Date() {
		return controlador_ModeloEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__QueryCrear__String_ListString_ListString() {
		return controlador_ModeloEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__QueryEditar__String_ListString_ListString_String() {
		return controlador_ModeloEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__QueryBuscar__String_ListString_String() {
		return controlador_ModeloEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__Login__String_String() {
		return controlador_ModeloEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__CambiarContrasenya__String() {
		return controlador_ModeloEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__ListarUsuarios() {
		return controlador_ModeloEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__ListarPermisos() {
		return controlador_ModeloEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__ListarProyectos() {
		return controlador_ModeloEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__ListarCertificados() {
		return controlador_ModeloEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__ListarViviendas() {
		return controlador_ModeloEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__ListarInmuebles() {
		return controlador_ModeloEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarUsuario__int() {
		return controlador_ModeloEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarMisProyectos__int() {
		return controlador_ModeloEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarProyectosPorUsuario__int() {
		return controlador_ModeloEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarMisCertificados__int() {
		return controlador_ModeloEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarCertificadosPorUsuario__int() {
		return controlador_ModeloEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarCertificadosPorVivienda__int() {
		return controlador_ModeloEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarCertificadosPorInmueble__int() {
		return controlador_ModeloEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarCertificadosPorEdadInmueble__int() {
		return controlador_ModeloEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarCertificadosPorEdadCertificadoHabitabilidad__int() {
		return controlador_ModeloEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarAsignacionCertificado__int_int() {
		return controlador_ModeloEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarAsignacionProyecto__int_int() {
		return controlador_ModeloEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControlador_Modelo__BuscarContratacionProyecto__int() {
		return controlador_ModeloEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl_Login() {
		return control_LoginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Login__Login__String_String() {
		return control_LoginEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Login__CambiarContrasenya__String() {
		return control_LoginEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl_Permisos() {
		return control_PermisosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Permisos__ConcederAcceso() {
		return control_PermisosEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Permisos__CrearPermiso__String_String_boolean_boolean() {
		return control_PermisosEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Permisos__EditarPermiso__int_String_String_boolean_boolean() {
		return control_PermisosEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl_Usuarios() {
		return control_UsuariosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Usuarios__CrearUsuario__String_String_String_int_String_String_String() {
		return control_UsuariosEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Usuarios__EditarUsuario_1__int_String_String_String_int_String_String_String() {
		return control_UsuariosEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Usuarios__BajaUsuario__int() {
		return control_UsuariosEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl_Certificados() {
		return control_CertificadosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Certificados__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double() {
		return control_CertificadosEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Certificados__AsignarCertificado__int_int() {
		return control_CertificadosEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Certificados__EditarAsignacionCertificado__int_int_int() {
		return control_CertificadosEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Certificados__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double() {
		return control_CertificadosEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl_Proyectos() {
		return control_ProyectosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Proyectos__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double() {
		return control_ProyectosEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Proyectos__EditarContratacionProyecto__int_int_Date_int_Date() {
		return control_ProyectosEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Proyectos__AsignarProyecto__int_int() {
		return control_ProyectosEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Proyectos__ContratarProyecto__int_Date_int_Date() {
		return control_ProyectosEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Proyectos__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double() {
		return control_ProyectosEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Proyectos__EditarAsignacionProyecto__int_int_int() {
		return control_ProyectosEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl_Viviendas() {
		return control_ViviendasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Viviendas__CrearVivienda__String_String_int_double_double_int_int_int() {
		return control_ViviendasEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Viviendas__EditarVivienda__int_String_String_int_double_double_int_int_int() {
		return control_ViviendasEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl_Inmuebles() {
		return control_InmueblesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Inmuebles__CrearInmueble__String_String_double_double() {
		return control_InmueblesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getControl_Inmuebles__EditarInmueble__int_String_String_double_double() {
		return control_InmueblesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGestor_Busquedas() {
		return gestor_BusquedasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__ListarUsuarios() {
		return gestor_BusquedasEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarInmueble__int() {
		return gestor_BusquedasEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__ListarPermisos() {
		return gestor_BusquedasEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__ListarProyectos() {
		return gestor_BusquedasEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__ListarCertificados() {
		return gestor_BusquedasEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__ListarViviendas() {
		return gestor_BusquedasEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__ListarInmuebles() {
		return gestor_BusquedasEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__ListarPermisosUsuario__int() {
		return gestor_BusquedasEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarUsuario__int() {
		return gestor_BusquedasEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarVivienda__int() {
		return gestor_BusquedasEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarProyecto__int() {
		return gestor_BusquedasEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarCertificado__int() {
		return gestor_BusquedasEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarMisProyectos__int() {
		return gestor_BusquedasEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarProyectosPorUsuario__int() {
		return gestor_BusquedasEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarMisCertificados__int() {
		return gestor_BusquedasEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarCertificadosPorUsuario__int() {
		return gestor_BusquedasEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarCertificadosPorVivienda__int() {
		return gestor_BusquedasEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarCertificadosPorInmueble__int() {
		return gestor_BusquedasEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarCertificadosPorEdadInmueble__int() {
		return gestor_BusquedasEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarCertificadosPorEdadCertificadoHabitabilidad__int() {
		return gestor_BusquedasEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarAsignacionProyecto__int_int() {
		return gestor_BusquedasEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarContratacionProyecto__int() {
		return gestor_BusquedasEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGestor_Busquedas__BuscarAsignacionCertificado__int_int() {
		return gestor_BusquedasEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControladorFactory getControladorFactory() {
		return (ControladorFactory)getEFactoryInstance();
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
		controlador_ModeloEClass = createEClass(CONTROLADOR_MODELO);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_USUARIO_1__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BAJA_USUARIO__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_PERMISO__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CREAR_CERTIFICADO__STRING_CERTIFICADO_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_CERTIFICADO__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CREAR_PROYECTO__STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_PROYECTO__INT_STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_PROYECTO__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_VIVIENDA__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_INMUEBLE__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___ASIGNAR_CERTIFICADO__INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___ASIGNAR_PROYECTO__INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CONTRATAR_PROYECTO__INT_DATE_INT_DATE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___QUERY_CREAR__STRING_LISTSTRING_LISTSTRING);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___QUERY_EDITAR__STRING_LISTSTRING_LISTSTRING_STRING);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___QUERY_BUSCAR__STRING_LISTSTRING_STRING);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___LOGIN__STRING_STRING);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___CAMBIAR_CONTRASENYA__STRING);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___LISTAR_USUARIOS);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___LISTAR_PERMISOS);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___LISTAR_PROYECTOS);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___LISTAR_CERTIFICADOS);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___LISTAR_VIVIENDAS);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___LISTAR_INMUEBLES);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_USUARIO__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_MIS_PROYECTOS__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_PROYECTOS_POR_USUARIO__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_MIS_CERTIFICADOS__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_USUARIO__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_VIVIENDA__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_INMUEBLE__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_EDAD_INMUEBLE__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_EDAD_CERTIFICADO_HABITABILIDAD__INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_ASIGNACION_CERTIFICADO__INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_ASIGNACION_PROYECTO__INT_INT);
		createEOperation(controlador_ModeloEClass, CONTROLADOR_MODELO___BUSCAR_CONTRATACION_PROYECTO__INT);

		control_LoginEClass = createEClass(CONTROL_LOGIN);
		createEOperation(control_LoginEClass, CONTROL_LOGIN___LOGIN__STRING_STRING);
		createEOperation(control_LoginEClass, CONTROL_LOGIN___CAMBIAR_CONTRASENYA__STRING);

		control_PermisosEClass = createEClass(CONTROL_PERMISOS);
		createEOperation(control_PermisosEClass, CONTROL_PERMISOS___CONCEDER_ACCESO);
		createEOperation(control_PermisosEClass, CONTROL_PERMISOS___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN);
		createEOperation(control_PermisosEClass, CONTROL_PERMISOS___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN);

		control_UsuariosEClass = createEClass(CONTROL_USUARIOS);
		createEOperation(control_UsuariosEClass, CONTROL_USUARIOS___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING);
		createEOperation(control_UsuariosEClass, CONTROL_USUARIOS___EDITAR_USUARIO_1__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING);
		createEOperation(control_UsuariosEClass, CONTROL_USUARIOS___BAJA_USUARIO__INT);

		control_CertificadosEClass = createEClass(CONTROL_CERTIFICADOS);
		createEOperation(control_CertificadosEClass, CONTROL_CERTIFICADOS___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE);
		createEOperation(control_CertificadosEClass, CONTROL_CERTIFICADOS___ASIGNAR_CERTIFICADO__INT_INT);
		createEOperation(control_CertificadosEClass, CONTROL_CERTIFICADOS___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT);
		createEOperation(control_CertificadosEClass, CONTROL_CERTIFICADOS___CREAR_CERTIFICADO__STRING_CERTIFICADO_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE);

		control_ProyectosEClass = createEClass(CONTROL_PROYECTOS);
		createEOperation(control_ProyectosEClass, CONTROL_PROYECTOS___EDITAR_PROYECTO__INT_STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE);
		createEOperation(control_ProyectosEClass, CONTROL_PROYECTOS___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE);
		createEOperation(control_ProyectosEClass, CONTROL_PROYECTOS___ASIGNAR_PROYECTO__INT_INT);
		createEOperation(control_ProyectosEClass, CONTROL_PROYECTOS___CONTRATAR_PROYECTO__INT_DATE_INT_DATE);
		createEOperation(control_ProyectosEClass, CONTROL_PROYECTOS___CREAR_PROYECTO__STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE);
		createEOperation(control_ProyectosEClass, CONTROL_PROYECTOS___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT);

		control_ViviendasEClass = createEClass(CONTROL_VIVIENDAS);
		createEOperation(control_ViviendasEClass, CONTROL_VIVIENDAS___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT);
		createEOperation(control_ViviendasEClass, CONTROL_VIVIENDAS___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT);

		control_InmueblesEClass = createEClass(CONTROL_INMUEBLES);
		createEOperation(control_InmueblesEClass, CONTROL_INMUEBLES___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE);
		createEOperation(control_InmueblesEClass, CONTROL_INMUEBLES___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE);

		gestor_BusquedasEClass = createEClass(GESTOR_BUSQUEDAS);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___LISTAR_USUARIOS);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_INMUEBLE__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___LISTAR_PERMISOS);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___LISTAR_PROYECTOS);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___LISTAR_CERTIFICADOS);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___LISTAR_VIVIENDAS);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___LISTAR_INMUEBLES);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___LISTAR_PERMISOS_USUARIO__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_USUARIO__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_VIVIENDA__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_PROYECTO__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADO__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_MIS_PROYECTOS__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_PROYECTOS_POR_USUARIO__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_MIS_CERTIFICADOS__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_USUARIO__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_VIVIENDA__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_INMUEBLE__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_EDAD_INMUEBLE__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_EDAD_CERTIFICADO_HABITABILIDAD__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_ASIGNACION_PROYECTO__INT_INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_CONTRATACION_PROYECTO__INT);
		createEOperation(gestor_BusquedasEClass, GESTOR_BUSQUEDAS___BUSCAR_ASIGNACION_CERTIFICADO__INT_INT);
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
		ModeloPackage theModeloPackage = (ModeloPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloPackage.eNS_URI);
		ArkiWebPackage theArkiWebPackage = (ArkiWebPackage)EPackage.Registry.INSTANCE.getEPackage(ArkiWebPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(controlador_ModeloEClass, Controlador_Modelo.class, "Controlador_Modelo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getControlador_Modelo__CrearUsuario__String_String_String_int_String_String_String(), null, "crearUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nombre_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "apellido_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "dni_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "telefono_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "domicilio_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "contrasenya_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarUsuario_1__int_String_String_String_int_String_String_String(), null, "editarUsuario_1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nombre_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "apellido_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "dni_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "telefono_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "domicilio_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "contrasenya_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BajaUsuario__int(), theModeloPackage.getUsuario(), "bajaUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__CrearPermiso__String_String_boolean_boolean(), null, "crearPermiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "objeto_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "lectura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "escritura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarPermiso__int_String_String_boolean_boolean(), null, "editarPermiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "objeto_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "lectura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "escritura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarPermiso__int(), theModeloPackage.getPermiso(), "buscarPermiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double(), null, "crearCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCertificado(), "cliente_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Certificado(), "tipo_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_visita_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_emision_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCategoria_Certificado(), "categoria_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double(), null, "editarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "cliente_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Certificado(), "tipo_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_visita_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_emision_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCategoria_Certificado(), "categoria_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarCertificado__int(), theModeloPackage.getCertificado(), "buscarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double(), null, "crearProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCertificado(), "cliente_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Proyecto(), "tipo_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "presupuesto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double(), null, "editarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCertificado(), "cliente_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Proyecto(), "tipo_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "presupuesto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarProyecto__int(), theModeloPackage.getProyecto(), "buscarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__CrearVivienda__String_String_int_double_double_int_int_int(), null, "crearVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "plantas_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "habitaciones_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "banyos_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarVivienda__int_String_String_int_double_double_int_int_int(), null, "editarVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "plantas_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "habitaciones_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "banyos_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarVivienda__int(), theModeloPackage.getVivienda(), "buscarVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__CrearInmueble__String_String_double_double(), null, "crearInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarInmueble__int_String_String_double_double(), null, "editarInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarInmueble__int(), theModeloPackage.getInmueble(), "buscarInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__AsignarCertificado__int_int(), null, "asignarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarAsignacionCertificado__int_int_int(), null, "editarAsignacionCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__AsignarProyecto__int_int(), null, "asignarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_proyecto_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarAsignacionProyecto__int_int_int(), null, "editarAsignacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_proyecto_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__ContratarProyecto__int_Date_int_Date(), null, "contratarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_inicio_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_fin_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__EditarContratacionProyecto__int_int_Date_int_Date(), null, "editarContratacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_inicio_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_fin_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__QueryCrear__String_ListString_ListString(), null, "queryCrear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tabla", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "valores_columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__QueryEditar__String_ListString_ListString_String(), null, "queryEditar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tabla", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "valores_columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "where_clause", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__QueryBuscar__String_ListString_String(), null, "queryBuscar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tabla", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "where_clause_01", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__Login__String_String(), theTypesPackage.getBoolean(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__CambiarContrasenya__String(), null, "cambiarContrasenya", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getControlador_Modelo__ListarUsuarios(), theArkiWebPackage.getListUsuario(), "listarUsuarios", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getControlador_Modelo__ListarPermisos(), theArkiWebPackage.getListPermiso(), "listarPermisos", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getControlador_Modelo__ListarProyectos(), theArkiWebPackage.getListProyecto(), "listarProyectos", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getControlador_Modelo__ListarCertificados(), theArkiWebPackage.getListCertificado(), "listarCertificados", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getControlador_Modelo__ListarViviendas(), theArkiWebPackage.getListVivienda(), "listarViviendas", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getControlador_Modelo__ListarInmuebles(), theArkiWebPackage.getListInmueble(), "listarInmuebles", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarUsuario__int(), theModeloPackage.getUsuario(), "buscarUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarMisProyectos__int(), theArkiWebPackage.getListProyecto(), "buscarMisProyectos", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_Usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarProyectosPorUsuario__int(), theArkiWebPackage.getListProyecto(), "buscarProyectosPorUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_Usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarMisCertificados__int(), theArkiWebPackage.getListCertificado(), "buscarMisCertificados", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_Usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarCertificadosPorUsuario__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_Usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarCertificadosPorVivienda__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarCertificadosPorInmueble__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_Inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarCertificadosPorEdadInmueble__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorEdadInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "edad", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarCertificadosPorEdadCertificadoHabitabilidad__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorEdadCertificadoHabitabilidad", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "edad", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarAsignacionCertificado__int_int(), theModeloPackage.getCertificados_Asignados(), "buscarAsignacionCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarAsignacionProyecto__int_int(), theModeloPackage.getProyectos_Asignados(), "buscarAsignacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControlador_Modelo__BuscarContratacionProyecto__int(), theModeloPackage.getProyectos_En_Ejecucion(), "buscarContratacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(control_LoginEClass, Control_Login.class, "Control_Login", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControl_Login__Login__String_String(), null, "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "contrasenya", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Login__CambiarContrasenya__String(), null, "cambiarContrasenya", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(control_PermisosEClass, Control_Permisos.class, "Control_Permisos", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getControl_Permisos__ConcederAcceso(), null, "concederAcceso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Permisos__CrearPermiso__String_String_boolean_boolean(), null, "crearPermiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "objeto_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "lectura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "escritura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Permisos__EditarPermiso__int_String_String_boolean_boolean(), null, "editarPermiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "objeto_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "lectura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "escritura_permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(control_UsuariosEClass, Control_Usuarios.class, "Control_Usuarios", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControl_Usuarios__CrearUsuario__String_String_String_int_String_String_String(), null, "crearUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nombre_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "apellido_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "dni_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "telefono_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "domicilio_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "contrasenya_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Usuarios__EditarUsuario_1__int_String_String_String_int_String_String_String(), null, "editarUsuario_1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nombre_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "apellido_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "dni_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "telefono_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "domicilio_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "contrasenya_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Usuarios__BajaUsuario__int(), null, "bajaUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_Usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(control_CertificadosEClass, Control_Certificados.class, "Control_Certificados", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControl_Certificados__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double(), null, "editarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "cliente_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Certificado(), "tipo_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_visita_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_emision_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCategoria_Certificado(), "categoria_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Certificados__AsignarCertificado__int_int(), null, "asignarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Certificados__EditarAsignacionCertificado__int_int_int(), null, "editarAsignacionCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Certificados__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double(), null, "crearCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCertificado(), "cliente_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Certificado(), "tipo_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_visita_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_emision_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCategoria_Certificado(), "categoria_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(control_ProyectosEClass, Control_Proyectos.class, "Control_Proyectos", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControl_Proyectos__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double(), null, "editarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCertificado(), "cliente_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Proyecto(), "tipo_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "presupuesto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Proyectos__EditarContratacionProyecto__int_int_Date_int_Date(), null, "editarContratacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_inicio_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_fin_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Proyectos__AsignarProyecto__int_int(), null, "asignarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_proyecto_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Proyectos__ContratarProyecto__int_Date_int_Date(), null, "contratarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_inicio_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_fin_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Proyectos__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double(), null, "crearProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getCertificado(), "cliente_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "vivienda_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "inmueble_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theModeloPackage.getTipo_Proyecto(), "tipo_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_solicitud_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fecha_entrega_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "duracion_prevista_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "presupuesto_ejecucion_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "coste_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Proyectos__EditarAsignacionProyecto__int_int_int(), null, "editarAsignacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto_proyecto_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "arquitecto_certificado_asignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(control_ViviendasEClass, Control_Viviendas.class, "Control_Viviendas", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControl_Viviendas__CrearVivienda__String_String_int_double_double_int_int_int(), null, "crearVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "plantas_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "habitaciones_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "banyos_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Viviendas__EditarVivienda__int_String_String_int_double_double_int_int_int(), null, "editarVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "plantas_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "habitaciones_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "banyos_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(control_InmueblesEClass, Control_Inmuebles.class, "Control_Inmuebles", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControl_Inmuebles__CrearInmueble__String_String_double_double(), null, "crearInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getControl_Inmuebles__EditarInmueble__int_String_String_double_double(), null, "editarInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "descripcion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "direccion_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_terreno_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "superficie_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(gestor_BusquedasEClass, Gestor_Busquedas.class, "Gestor_Busquedas", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGestor_Busquedas__ListarUsuarios(), theArkiWebPackage.getListUsuario(), "listarUsuarios", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarInmueble__int(), theModeloPackage.getInmueble(), "buscarInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGestor_Busquedas__ListarPermisos(), theArkiWebPackage.getListPermiso(), "listarPermisos", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGestor_Busquedas__ListarProyectos(), theArkiWebPackage.getListProyecto(), "listarProyectos", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGestor_Busquedas__ListarCertificados(), theArkiWebPackage.getListCertificado(), "listarCertificados", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGestor_Busquedas__ListarViviendas(), theArkiWebPackage.getListVivienda(), "listarViviendas", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGestor_Busquedas__ListarInmuebles(), theArkiWebPackage.getListInmueble(), "listarInmuebles", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__ListarPermisosUsuario__int(), theArkiWebPackage.getListPermiso(), "listarPermisosUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarUsuario__int(), theModeloPackage.getUsuario(), "buscarUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarVivienda__int(), theModeloPackage.getVivienda(), "buscarVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarProyecto__int(), theModeloPackage.getProyecto(), "buscarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarCertificado__int(), theModeloPackage.getCertificado(), "buscarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarMisProyectos__int(), theArkiWebPackage.getListProyecto(), "buscarMisProyectos", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarProyectosPorUsuario__int(), theArkiWebPackage.getListProyecto(), "buscarProyectosPorUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarMisCertificados__int(), theArkiWebPackage.getListCertificado(), "buscarMisCertificados", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarCertificadosPorUsuario__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarCertificadosPorVivienda__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarCertificadosPorInmueble__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarCertificadosPorEdadInmueble__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorEdadInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "edad", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarCertificadosPorEdadCertificadoHabitabilidad__int(), theArkiWebPackage.getListCertificado(), "buscarCertificadosPorEdadCertificadoHabitabilidad", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "edad", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarAsignacionProyecto__int_int(), theModeloPackage.getProyectos_Asignados(), "buscarAsignacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarContratacionProyecto__int(), theModeloPackage.getProyectos_En_Ejecucion(), "buscarContratacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGestor_Busquedas__BuscarAsignacionCertificado__int_int(), theArkiWebPackage.getListCertificados_Asignados(), "buscarAsignacionCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //ControladorPackageImpl
