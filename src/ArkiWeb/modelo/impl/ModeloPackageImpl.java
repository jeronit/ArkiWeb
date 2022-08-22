/**
 */
package ArkiWeb.modelo.impl;

import ArkiWeb.ArkiWebPackage;

import ArkiWeb.controlador.ControladorPackage;

import ArkiWeb.controlador.impl.ControladorPackageImpl;

import ArkiWeb.impl.ArkiWebPackageImpl;

import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.ConcreteFactory;
import ArkiWeb.modelo.Factory;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.ModeloFactory;
import ArkiWeb.modelo.ModeloPackage;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass permisoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proyectoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viviendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inmuebleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hsqldbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proyectos_AsignadosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificados_AsignadosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proyectos_En_EjecucionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipo_ProyectoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipo_CertificadoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoria_CertificadoEEnum = null;

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
	 * @see ArkiWeb.modelo.ModeloPackage#eNS_URI
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArkiWeb.vista.struts2mvc.modelo.ModeloPackage.eNS_URI);
		ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl theModeloPackage_1 = (ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl)(registeredPackage instanceof ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl ? registeredPackage : ArkiWeb.vista.struts2mvc.modelo.ModeloPackage.eINSTANCE);
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
	public EClass getPermiso() {
		return permisoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermiso_Id_permiso() {
		return (EAttribute)permisoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermiso_Id_rol() {
		return (EAttribute)permisoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermiso_Objeto_permiso() {
		return (EAttribute)permisoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermiso_Lectura_permiso() {
		return (EAttribute)permisoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermiso_Escritura_permiso() {
		return (EAttribute)permisoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermiso_Rol() {
		return (EReference)permisoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRol_Id_rol() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRol_Descripcion_rol() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Id_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Nombre_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Apellidos_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Dni_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Telefono_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Email_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Domicilio_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Contrasenya_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Rol_usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsuario_Rol() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProyecto() {
		return proyectoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Id_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Descripcion_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Id_cliente_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Id_vivienda_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Id_inmueble_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Tipo_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Fecha_solicitud_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Fecha_entrega_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Duracion_prevista_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Presupuesto_ejecucion_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProyecto_Usuario() {
		return (EReference)proyectoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProyecto_Vivienda() {
		return (EReference)proyectoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProyecto_Inmueble() {
		return (EReference)proyectoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Superficie_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyecto_Coste_proyecto() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVivienda() {
		return viviendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Id_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Descripcion_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Direccion_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Id_inmueble_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Superficie_terreno_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Superficie_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Plantas_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Habitaciones_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVivienda_Banyos_vivienda() {
		return (EAttribute)viviendaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInmueble() {
		return inmuebleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInmueble_Vivienda() {
		return (EReference)inmuebleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInmueble_Id_inmueble() {
		return (EAttribute)inmuebleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInmueble_Descripcion_inmueble() {
		return (EAttribute)inmuebleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInmueble_Direccion_inmueble() {
		return (EAttribute)inmuebleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInmueble_Superficie_terreno_inmueble() {
		return (EAttribute)inmuebleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInmueble_Superficie_inmueble() {
		return (EAttribute)inmuebleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificado() {
		return certificadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Id_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Descripcion_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Id_cliente_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Id_vivienda_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Id_inmueble_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Tipo_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Fecha_solicitud_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Fecha_entrega_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Fecha_visita_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Fecha_emision_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Categoria_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificado_Coste_certificado() {
		return (EAttribute)certificadoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertificado_Inmueble() {
		return (EReference)certificadoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertificado_Usuario() {
		return (EReference)certificadoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertificado_Vivienda() {
		return (EReference)certificadoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSQLDB() {
		return hsqldbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__CrearUsuario__Usuario() {
		return hsqldbEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarUsuario__Usuario() {
		return hsqldbEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__BajaUsuario__int() {
		return hsqldbEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__CrearPermiso__Permiso() {
		return hsqldbEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarPermiso__Permiso() {
		return hsqldbEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__CrearCertificado__Certificado() {
		return hsqldbEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarCertificado__Certificado() {
		return hsqldbEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__BuscarCertificado__int() {
		return hsqldbEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__CrearProyecto__Proyecto() {
		return hsqldbEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarProyecto__Proyecto() {
		return hsqldbEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__BuscarProyecto__int() {
		return hsqldbEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__CrearVivienda__Vivienda() {
		return hsqldbEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarVivienda__Vivienda() {
		return hsqldbEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__BuscarVivienda__int() {
		return hsqldbEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__CrearInmueble__Inmueble() {
		return hsqldbEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarInmueble__Inmueble() {
		return hsqldbEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__BuscarInmueble__int() {
		return hsqldbEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__AsignarCertificado__Certificados_Asignados() {
		return hsqldbEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarAsignacionCertificado__Certificados_Asignados() {
		return hsqldbEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__AsignarProyecto__Proyectos_Asignados() {
		return hsqldbEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarAsignacionProyecto__Proyectos_Asignados() {
		return hsqldbEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__ContratarProyecto__Proyectos_En_Ejecucion() {
		return hsqldbEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__EditarContratacionProyecto__Proyectos_En_Ejecucion() {
		return hsqldbEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__QueryCrear__String_ListString_ListString() {
		return hsqldbEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__QueryEditar__String_ListString_ListString_String() {
		return hsqldbEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__QueryBuscar__String_ListString_String() {
		return hsqldbEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHSQLDB__QueryEjecutar__String() {
		return hsqldbEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProyectos_Asignados() {
		return proyectos_AsignadosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_Asignados_Id_proyecto_asignado() {
		return (EAttribute)proyectos_AsignadosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_Asignados_Id_proyecto_proyecto_asignado() {
		return (EAttribute)proyectos_AsignadosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_Asignados_Id_arquitecto_proyecto_asignado() {
		return (EAttribute)proyectos_AsignadosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProyectos_Asignados_Proyecto() {
		return (EReference)proyectos_AsignadosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProyectos_Asignados_Usuario() {
		return (EReference)proyectos_AsignadosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificados_Asignados() {
		return certificados_AsignadosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificados_Asignados_Id_proyecto_asignado() {
		return (EAttribute)certificados_AsignadosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertificados_Asignados_Id_proyecto_proyecto_asignado() {
		return (EReference)certificados_AsignadosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertificados_Asignados_Id_arquitecto_proyecto_asignado() {
		return (EReference)certificados_AsignadosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificados_Asignados_Id_certificado_asignado() {
		return (EAttribute)certificados_AsignadosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificados_Asignados_Id_certificado_certificado_asignado() {
		return (EAttribute)certificados_AsignadosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificados_Asignados_Id_arquitecto_certificado_asignado() {
		return (EAttribute)certificados_AsignadosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertificados_Asignados_Certificado() {
		return (EReference)certificados_AsignadosEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertificados_Asignados_Usuario() {
		return (EReference)certificados_AsignadosEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProyectos_En_Ejecucion() {
		return proyectos_En_EjecucionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_En_Ejecucion_Id_ejecucion_proyecto() {
		return (EAttribute)proyectos_En_EjecucionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_En_Ejecucion_Id_proyecto_ejecucion_proyecto() {
		return (EAttribute)proyectos_En_EjecucionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_En_Ejecucion_Fecha_inicio_ejecucion_proyecto() {
		return (EAttribute)proyectos_En_EjecucionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_En_Ejecucion_Duracion_prevista_ejecucion_proyecto() {
		return (EAttribute)proyectos_En_EjecucionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProyectos_En_Ejecucion_Fecha_fin_ejecucion_proyecto() {
		return (EAttribute)proyectos_En_EjecucionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProyectos_En_Ejecucion_Proyecto() {
		return (EReference)proyectos_En_EjecucionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFactory() {
		return factoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFactory__CrearObjeto__String_Object() {
		return factoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcreteFactory() {
		return concreteFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipo_Proyecto() {
		return tipo_ProyectoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipo_Certificado() {
		return tipo_CertificadoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCategoria_Certificado() {
		return categoria_CertificadoEEnum;
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
		permisoEClass = createEClass(PERMISO);
		createEAttribute(permisoEClass, PERMISO__ID_PERMISO);
		createEAttribute(permisoEClass, PERMISO__ID_ROL);
		createEAttribute(permisoEClass, PERMISO__OBJETO_PERMISO);
		createEAttribute(permisoEClass, PERMISO__LECTURA_PERMISO);
		createEAttribute(permisoEClass, PERMISO__ESCRITURA_PERMISO);
		createEReference(permisoEClass, PERMISO__ROL);

		rolEClass = createEClass(ROL);
		createEAttribute(rolEClass, ROL__ID_ROL);
		createEAttribute(rolEClass, ROL__DESCRIPCION_ROL);

		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__ID_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__NOMBRE_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__APELLIDOS_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__DNI_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__TELEFONO_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__EMAIL_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__DOMICILIO_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__CONTRASENYA_USUARIO);
		createEAttribute(usuarioEClass, USUARIO__ROL_USUARIO);
		createEReference(usuarioEClass, USUARIO__ROL);

		proyectoEClass = createEClass(PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__ID_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__DESCRIPCION_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__ID_CLIENTE_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__ID_VIVIENDA_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__ID_INMUEBLE_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__TIPO_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__FECHA_SOLICITUD_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__FECHA_ENTREGA_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__DURACION_PREVISTA_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__PRESUPUESTO_EJECUCION_PROYECTO);
		createEReference(proyectoEClass, PROYECTO__USUARIO);
		createEReference(proyectoEClass, PROYECTO__VIVIENDA);
		createEReference(proyectoEClass, PROYECTO__INMUEBLE);
		createEAttribute(proyectoEClass, PROYECTO__SUPERFICIE_PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__COSTE_PROYECTO);

		viviendaEClass = createEClass(VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__ID_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__DESCRIPCION_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__DIRECCION_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__ID_INMUEBLE_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__SUPERFICIE_TERRENO_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__SUPERFICIE_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__PLANTAS_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__HABITACIONES_VIVIENDA);
		createEAttribute(viviendaEClass, VIVIENDA__BANYOS_VIVIENDA);

		inmuebleEClass = createEClass(INMUEBLE);
		createEReference(inmuebleEClass, INMUEBLE__VIVIENDA);
		createEAttribute(inmuebleEClass, INMUEBLE__ID_INMUEBLE);
		createEAttribute(inmuebleEClass, INMUEBLE__DESCRIPCION_INMUEBLE);
		createEAttribute(inmuebleEClass, INMUEBLE__DIRECCION_INMUEBLE);
		createEAttribute(inmuebleEClass, INMUEBLE__SUPERFICIE_TERRENO_INMUEBLE);
		createEAttribute(inmuebleEClass, INMUEBLE__SUPERFICIE_INMUEBLE);

		certificadoEClass = createEClass(CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__ID_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__DESCRIPCION_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__ID_CLIENTE_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__ID_VIVIENDA_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__ID_INMUEBLE_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__TIPO_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__FECHA_SOLICITUD_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__FECHA_ENTREGA_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__FECHA_VISITA_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__FECHA_EMISION_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__CATEGORIA_CERTIFICADO);
		createEAttribute(certificadoEClass, CERTIFICADO__COSTE_CERTIFICADO);
		createEReference(certificadoEClass, CERTIFICADO__INMUEBLE);
		createEReference(certificadoEClass, CERTIFICADO__USUARIO);
		createEReference(certificadoEClass, CERTIFICADO__VIVIENDA);

		hsqldbEClass = createEClass(HSQLDB);
		createEOperation(hsqldbEClass, HSQLDB___CREAR_USUARIO__USUARIO);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_USUARIO__USUARIO);
		createEOperation(hsqldbEClass, HSQLDB___BAJA_USUARIO__INT);
		createEOperation(hsqldbEClass, HSQLDB___CREAR_PERMISO__PERMISO);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_PERMISO__PERMISO);
		createEOperation(hsqldbEClass, HSQLDB___CREAR_CERTIFICADO__CERTIFICADO);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_CERTIFICADO__CERTIFICADO);
		createEOperation(hsqldbEClass, HSQLDB___BUSCAR_CERTIFICADO__INT);
		createEOperation(hsqldbEClass, HSQLDB___CREAR_PROYECTO__PROYECTO);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_PROYECTO__PROYECTO);
		createEOperation(hsqldbEClass, HSQLDB___BUSCAR_PROYECTO__INT);
		createEOperation(hsqldbEClass, HSQLDB___CREAR_VIVIENDA__VIVIENDA);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_VIVIENDA__VIVIENDA);
		createEOperation(hsqldbEClass, HSQLDB___BUSCAR_VIVIENDA__INT);
		createEOperation(hsqldbEClass, HSQLDB___CREAR_INMUEBLE__INMUEBLE);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_INMUEBLE__INMUEBLE);
		createEOperation(hsqldbEClass, HSQLDB___BUSCAR_INMUEBLE__INT);
		createEOperation(hsqldbEClass, HSQLDB___ASIGNAR_CERTIFICADO__CERTIFICADOS_ASIGNADOS);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_ASIGNACION_CERTIFICADO__CERTIFICADOS_ASIGNADOS);
		createEOperation(hsqldbEClass, HSQLDB___ASIGNAR_PROYECTO__PROYECTOS_ASIGNADOS);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_ASIGNACION_PROYECTO__PROYECTOS_ASIGNADOS);
		createEOperation(hsqldbEClass, HSQLDB___CONTRATAR_PROYECTO__PROYECTOS_EN_EJECUCION);
		createEOperation(hsqldbEClass, HSQLDB___EDITAR_CONTRATACION_PROYECTO__PROYECTOS_EN_EJECUCION);
		createEOperation(hsqldbEClass, HSQLDB___QUERY_CREAR__STRING_LISTSTRING_LISTSTRING);
		createEOperation(hsqldbEClass, HSQLDB___QUERY_EDITAR__STRING_LISTSTRING_LISTSTRING_STRING);
		createEOperation(hsqldbEClass, HSQLDB___QUERY_BUSCAR__STRING_LISTSTRING_STRING);
		createEOperation(hsqldbEClass, HSQLDB___QUERY_EJECUTAR__STRING);

		certificados_AsignadosEClass = createEClass(CERTIFICADOS_ASIGNADOS);
		createEAttribute(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__ID_PROYECTO_ASIGNADO);
		createEReference(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__ID_PROYECTO_PROYECTO_ASIGNADO);
		createEReference(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__ID_ARQUITECTO_PROYECTO_ASIGNADO);
		createEAttribute(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__ID_CERTIFICADO_ASIGNADO);
		createEAttribute(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__ID_CERTIFICADO_CERTIFICADO_ASIGNADO);
		createEAttribute(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__ID_ARQUITECTO_CERTIFICADO_ASIGNADO);
		createEReference(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__CERTIFICADO);
		createEReference(certificados_AsignadosEClass, CERTIFICADOS_ASIGNADOS__USUARIO);

		proyectos_AsignadosEClass = createEClass(PROYECTOS_ASIGNADOS);
		createEAttribute(proyectos_AsignadosEClass, PROYECTOS_ASIGNADOS__ID_PROYECTO_ASIGNADO);
		createEAttribute(proyectos_AsignadosEClass, PROYECTOS_ASIGNADOS__ID_PROYECTO_PROYECTO_ASIGNADO);
		createEAttribute(proyectos_AsignadosEClass, PROYECTOS_ASIGNADOS__ID_ARQUITECTO_PROYECTO_ASIGNADO);
		createEReference(proyectos_AsignadosEClass, PROYECTOS_ASIGNADOS__PROYECTO);
		createEReference(proyectos_AsignadosEClass, PROYECTOS_ASIGNADOS__USUARIO);

		proyectos_En_EjecucionEClass = createEClass(PROYECTOS_EN_EJECUCION);
		createEAttribute(proyectos_En_EjecucionEClass, PROYECTOS_EN_EJECUCION__ID_EJECUCION_PROYECTO);
		createEAttribute(proyectos_En_EjecucionEClass, PROYECTOS_EN_EJECUCION__ID_PROYECTO_EJECUCION_PROYECTO);
		createEAttribute(proyectos_En_EjecucionEClass, PROYECTOS_EN_EJECUCION__FECHA_INICIO_EJECUCION_PROYECTO);
		createEAttribute(proyectos_En_EjecucionEClass, PROYECTOS_EN_EJECUCION__DURACION_PREVISTA_EJECUCION_PROYECTO);
		createEAttribute(proyectos_En_EjecucionEClass, PROYECTOS_EN_EJECUCION__FECHA_FIN_EJECUCION_PROYECTO);
		createEReference(proyectos_En_EjecucionEClass, PROYECTOS_EN_EJECUCION__PROYECTO);

		factoryEClass = createEClass(FACTORY);
		createEOperation(factoryEClass, FACTORY___CREAR_OBJETO__STRING_OBJECT);

		concreteFactoryEClass = createEClass(CONCRETE_FACTORY);

		// Create enums
		tipo_ProyectoEEnum = createEEnum(TIPO_PROYECTO);
		tipo_CertificadoEEnum = createEEnum(TIPO_CERTIFICADO);
		categoria_CertificadoEEnum = createEEnum(CATEGORIA_CERTIFICADO);
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
		ArkiWebPackage theArkiWebPackage = (ArkiWebPackage)EPackage.Registry.INSTANCE.getEPackage(ArkiWebPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concreteFactoryEClass.getESuperTypes().add(this.getFactory());

		// Initialize classes, features, and operations; add parameters
		initEClass(permisoEClass, Permiso.class, "Permiso", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermiso_Id_permiso(), theTypesPackage.getInteger(), "id_permiso", null, 1, 1, Permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPermiso_Id_rol(), theTypesPackage.getInteger(), "id_rol", null, 1, 1, Permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPermiso_Objeto_permiso(), theTypesPackage.getString(), "objeto_permiso", null, 1, 1, Permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPermiso_Lectura_permiso(), theTypesPackage.getBoolean(), "lectura_permiso", null, 1, 1, Permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPermiso_Escritura_permiso(), theTypesPackage.getBoolean(), "escritura_permiso", null, 1, 1, Permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPermiso_Rol(), this.getRol(), null, "rol", null, 1, 1, Permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rolEClass, Rol.class, "Rol", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRol_Id_rol(), theTypesPackage.getInteger(), "id_rol", null, 1, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRol_Descripcion_rol(), theTypesPackage.getString(), "descripcion_rol", null, 1, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usuarioEClass, Usuario.class, "Usuario", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_Id_usuario(), theTypesPackage.getInteger(), "id_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Nombre_usuario(), theTypesPackage.getString(), "nombre_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Apellidos_usuario(), theTypesPackage.getString(), "apellidos_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Dni_usuario(), theTypesPackage.getString(), "dni_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Telefono_usuario(), theTypesPackage.getString(), "telefono_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Email_usuario(), theTypesPackage.getString(), "email_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Domicilio_usuario(), theTypesPackage.getString(), "domicilio_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Contrasenya_usuario(), theTypesPackage.getString(), "contrasenya_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Rol_usuario(), theTypesPackage.getInteger(), "rol_usuario", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUsuario_Rol(), this.getRol(), null, "rol", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(proyectoEClass, Proyecto.class, "Proyecto", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProyecto_Id_proyecto(), theTypesPackage.getInteger(), "id_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Descripcion_proyecto(), theTypesPackage.getString(), "descripcion_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Id_cliente_proyecto(), theTypesPackage.getInteger(), "id_cliente_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Id_vivienda_proyecto(), theTypesPackage.getInteger(), "id_vivienda_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Id_inmueble_proyecto(), theTypesPackage.getInteger(), "id_inmueble_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Tipo_proyecto(), this.getTipo_Proyecto(), "tipo_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Fecha_solicitud_proyecto(), ecorePackage.getEDate(), "fecha_solicitud_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Fecha_entrega_proyecto(), ecorePackage.getEDate(), "fecha_entrega_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Duracion_prevista_proyecto(), theTypesPackage.getInteger(), "duracion_prevista_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Presupuesto_ejecucion_proyecto(), ecorePackage.getEDouble(), "presupuesto_ejecucion_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProyecto_Usuario(), this.getUsuario(), null, "usuario", null, 0, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProyecto_Vivienda(), this.getVivienda(), null, "vivienda", null, 0, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProyecto_Inmueble(), this.getInmueble(), null, "inmueble", null, 0, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Superficie_proyecto(), ecorePackage.getEDouble(), "superficie_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyecto_Coste_proyecto(), ecorePackage.getEDouble(), "coste_proyecto", null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(viviendaEClass, Vivienda.class, "Vivienda", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVivienda_Id_vivienda(), theTypesPackage.getInteger(), "id_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Descripcion_vivienda(), theTypesPackage.getString(), "descripcion_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Direccion_vivienda(), theTypesPackage.getString(), "direccion_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Id_inmueble_vivienda(), theTypesPackage.getInteger(), "id_inmueble_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Superficie_terreno_vivienda(), ecorePackage.getEDouble(), "superficie_terreno_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Superficie_vivienda(), ecorePackage.getEDouble(), "superficie_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Plantas_vivienda(), theTypesPackage.getInteger(), "plantas_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Habitaciones_vivienda(), theTypesPackage.getInteger(), "habitaciones_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVivienda_Banyos_vivienda(), theTypesPackage.getInteger(), "banyos_vivienda", null, 1, 1, Vivienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inmuebleEClass, Inmueble.class, "Inmueble", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInmueble_Vivienda(), this.getVivienda(), null, "vivienda", null, 0, -1, Inmueble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInmueble_Id_inmueble(), theTypesPackage.getInteger(), "id_inmueble", null, 1, 1, Inmueble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInmueble_Descripcion_inmueble(), theTypesPackage.getString(), "descripcion_inmueble", null, 1, 1, Inmueble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInmueble_Direccion_inmueble(), theTypesPackage.getString(), "direccion_inmueble", null, 1, 1, Inmueble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInmueble_Superficie_terreno_inmueble(), ecorePackage.getEDouble(), "superficie_terreno_inmueble", null, 1, 1, Inmueble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInmueble_Superficie_inmueble(), ecorePackage.getEDouble(), "superficie_inmueble", null, 1, 1, Inmueble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(certificadoEClass, Certificado.class, "Certificado", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificado_Id_certificado(), theTypesPackage.getInteger(), "id_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Descripcion_certificado(), theTypesPackage.getString(), "descripcion_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Id_cliente_certificado(), theTypesPackage.getInteger(), "id_cliente_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Id_vivienda_certificado(), theTypesPackage.getInteger(), "id_vivienda_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Id_inmueble_certificado(), theTypesPackage.getInteger(), "id_inmueble_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Tipo_certificado(), this.getTipo_Certificado(), "tipo_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Fecha_solicitud_certificado(), ecorePackage.getEDate(), "fecha_solicitud_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Fecha_entrega_certificado(), ecorePackage.getEDate(), "fecha_entrega_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Fecha_visita_certificado(), ecorePackage.getEDate(), "fecha_visita_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Fecha_emision_certificado(), ecorePackage.getEDate(), "fecha_emision_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Categoria_certificado(), this.getCategoria_Certificado(), "categoria_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificado_Coste_certificado(), ecorePackage.getEDouble(), "coste_certificado", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCertificado_Inmueble(), this.getInmueble(), null, "inmueble", null, 1, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCertificado_Usuario(), this.getUsuario(), null, "usuario", null, 0, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCertificado_Vivienda(), this.getVivienda(), null, "vivienda", null, 0, 1, Certificado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hsqldbEClass, ArkiWeb.modelo.HSQLDB.class, "HSQLDB", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHSQLDB__CrearUsuario__Usuario(), null, "crearUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUsuario(), "usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarUsuario__Usuario(), null, "editarUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUsuario(), "usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__BajaUsuario__int(), null, "bajaUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_usuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__CrearPermiso__Permiso(), null, "crearPermiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPermiso(), "permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarPermiso__Permiso(), null, "editarPermiso", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPermiso(), "permiso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__CrearCertificado__Certificado(), null, "crearCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCertificado(), "certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarCertificado__Certificado(), null, "editarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCertificado(), "certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__BuscarCertificado__int(), this.getCertificado(), "buscarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_certificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__CrearProyecto__Proyecto(), null, "crearProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProyecto(), "proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarProyecto__Proyecto(), null, "editarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProyecto(), "proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__BuscarProyecto__int(), this.getProyecto(), "buscarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_proyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__CrearVivienda__Vivienda(), null, "crearVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVivienda(), "vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarVivienda__Vivienda(), null, "editarVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVivienda(), "vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__BuscarVivienda__int(), this.getVivienda(), "buscarVivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_vivienda", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__CrearInmueble__Inmueble(), null, "crearInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInmueble(), "inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarInmueble__Inmueble(), null, "editarInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInmueble(), "inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__BuscarInmueble__int(), this.getInmueble(), "buscarInmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "id_inmueble", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__AsignarCertificado__Certificados_Asignados(), null, "asignarCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCertificados_Asignados(), "asignacionCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarAsignacionCertificado__Certificados_Asignados(), null, "editarAsignacionCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCertificados_Asignados(), "asignacionCertificado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__AsignarProyecto__Proyectos_Asignados(), null, "asignarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProyectos_Asignados(), "proyectoAsignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarAsignacionProyecto__Proyectos_Asignados(), null, "editarAsignacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProyectos_Asignados(), "proyectoAsignado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__ContratarProyecto__Proyectos_En_Ejecucion(), null, "contratarProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProyectos_En_Ejecucion(), "contratacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__EditarContratacionProyecto__Proyectos_En_Ejecucion(), null, "editarContratacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProyectos_En_Ejecucion(), "contratacionProyecto", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__QueryCrear__String_ListString_ListString(), theTypesPackage.getString(), "queryCrear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tabla", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "valores_columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__QueryEditar__String_ListString_ListString_String(), theTypesPackage.getString(), "queryEditar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tabla", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "valores_columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "where_clause", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__QueryBuscar__String_ListString_String(), theTypesPackage.getString(), "queryBuscar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tabla", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theArkiWebPackage.getListString(), "columnas", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "where_clause_01", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHSQLDB__QueryEjecutar__String(), ecorePackage.getEJavaObject(), "queryEjecutar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "queryString", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(certificados_AsignadosEClass, Certificados_Asignados.class, "Certificados_Asignados", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificados_Asignados_Id_proyecto_asignado(), theTypesPackage.getInteger(), "id_proyecto_asignado", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCertificados_Asignados_Id_proyecto_proyecto_asignado(), this.getProyecto(), null, "id_proyecto_proyecto_asignado", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCertificados_Asignados_Id_arquitecto_proyecto_asignado(), this.getUsuario(), null, "id_arquitecto_proyecto_asignado", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificados_Asignados_Id_certificado_asignado(), theTypesPackage.getInteger(), "id_certificado_asignado", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificados_Asignados_Id_certificado_certificado_asignado(), theTypesPackage.getInteger(), "id_certificado_certificado_asignado", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificados_Asignados_Id_arquitecto_certificado_asignado(), theTypesPackage.getInteger(), "id_arquitecto_certificado_asignado", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCertificados_Asignados_Certificado(), this.getCertificado(), null, "certificado", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCertificados_Asignados_Usuario(), this.getUsuario(), null, "usuario", null, 1, 1, Certificados_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(proyectos_AsignadosEClass, Proyectos_Asignados.class, "Proyectos_Asignados", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProyectos_Asignados_Id_proyecto_asignado(), theTypesPackage.getInteger(), "id_proyecto_asignado", null, 1, 1, Proyectos_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyectos_Asignados_Id_proyecto_proyecto_asignado(), theTypesPackage.getInteger(), "id_proyecto_proyecto_asignado", null, 1, 1, Proyectos_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyectos_Asignados_Id_arquitecto_proyecto_asignado(), theTypesPackage.getInteger(), "id_arquitecto_proyecto_asignado", null, 1, 1, Proyectos_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProyectos_Asignados_Proyecto(), this.getProyecto(), null, "proyecto", null, 1, 1, Proyectos_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProyectos_Asignados_Usuario(), this.getUsuario(), null, "usuario", null, 1, 1, Proyectos_Asignados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(proyectos_En_EjecucionEClass, Proyectos_En_Ejecucion.class, "Proyectos_En_Ejecucion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProyectos_En_Ejecucion_Id_ejecucion_proyecto(), theTypesPackage.getInteger(), "id_ejecucion_proyecto", null, 1, 1, Proyectos_En_Ejecucion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyectos_En_Ejecucion_Id_proyecto_ejecucion_proyecto(), theTypesPackage.getInteger(), "id_proyecto_ejecucion_proyecto", null, 1, 1, Proyectos_En_Ejecucion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyectos_En_Ejecucion_Fecha_inicio_ejecucion_proyecto(), ecorePackage.getEDate(), "fecha_inicio_ejecucion_proyecto", null, 1, 1, Proyectos_En_Ejecucion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyectos_En_Ejecucion_Duracion_prevista_ejecucion_proyecto(), theTypesPackage.getInteger(), "duracion_prevista_ejecucion_proyecto", null, 1, 1, Proyectos_En_Ejecucion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProyectos_En_Ejecucion_Fecha_fin_ejecucion_proyecto(), ecorePackage.getEDate(), "fecha_fin_ejecucion_proyecto", null, 1, 1, Proyectos_En_Ejecucion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProyectos_En_Ejecucion_Proyecto(), this.getProyecto(), null, "proyecto", null, 1, 1, Proyectos_En_Ejecucion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(factoryEClass, Factory.class, "Factory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFactory__CrearObjeto__String_Object(), null, "crearObjeto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tipoObjeto", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(concreteFactoryEClass, ConcreteFactory.class, "ConcreteFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tipo_ProyectoEEnum, Tipo_Proyecto.class, "Tipo_Proyecto");
		addEEnumLiteral(tipo_ProyectoEEnum, Tipo_Proyecto.RESIDENCIAL_EDIFICIO);
		addEEnumLiteral(tipo_ProyectoEEnum, Tipo_Proyecto.RESIDENCIAL_VIVIENDA);
		addEEnumLiteral(tipo_ProyectoEEnum, Tipo_Proyecto.NO_RESIDENCIAL);
		addEEnumLiteral(tipo_ProyectoEEnum, Tipo_Proyecto.REHABILITACION);

		initEEnum(tipo_CertificadoEEnum, Tipo_Certificado.class, "Tipo_Certificado");
		addEEnumLiteral(tipo_CertificadoEEnum, Tipo_Certificado.HABITABILIDAD);
		addEEnumLiteral(tipo_CertificadoEEnum, Tipo_Certificado.ITE);
		addEEnumLiteral(tipo_CertificadoEEnum, Tipo_Certificado.EFIC_ENERG);
		addEEnumLiteral(tipo_CertificadoEEnum, Tipo_Certificado.PERICIAL);

		initEEnum(categoria_CertificadoEEnum, Categoria_Certificado.class, "Categoria_Certificado");
		addEEnumLiteral(categoria_CertificadoEEnum, Categoria_Certificado.A);
		addEEnumLiteral(categoria_CertificadoEEnum, Categoria_Certificado.B);
		addEEnumLiteral(categoria_CertificadoEEnum, Categoria_Certificado.C);
		addEEnumLiteral(categoria_CertificadoEEnum, Categoria_Certificado.D);
		addEEnumLiteral(categoria_CertificadoEEnum, Categoria_Certificado.E);
		addEEnumLiteral(categoria_CertificadoEEnum, Categoria_Certificado.F);
		addEEnumLiteral(categoria_CertificadoEEnum, Categoria_Certificado.G);
	}

} //ModeloPackageImpl
