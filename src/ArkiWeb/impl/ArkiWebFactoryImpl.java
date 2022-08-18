/**
 */
package ArkiWeb.impl;

import ArkiWeb.*;

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
public class ArkiWebFactoryImpl extends EFactoryImpl implements ArkiWebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArkiWebFactory init() {
		try {
			ArkiWebFactory theArkiWebFactory = (ArkiWebFactory)EPackage.Registry.INSTANCE.getEFactory(ArkiWebPackage.eNS_URI);
			if (theArkiWebFactory != null) {
				return theArkiWebFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArkiWebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArkiWebFactoryImpl() {
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
			case ArkiWebPackage.LIST_STRING: return createListString();
			case ArkiWebPackage.LIST_USUARIO: return createListUsuario();
			case ArkiWebPackage.LIST_PERMISO: return createListPermiso();
			case ArkiWebPackage.LIST_PROYECTO: return createListProyecto();
			case ArkiWebPackage.LIST_CERTIFICADO: return createListCertificado();
			case ArkiWebPackage.LIST_VIVIENDA: return createListVivienda();
			case ArkiWebPackage.LIST_INMUEBLE: return createListInmueble();
			case ArkiWebPackage.LIST_CERTIFICADOS_ASIGNADOS: return createListCertificados_Asignados();
			case ArkiWebPackage.LIST_PROYECTOS_ASIGNADOS: return createListProyectos_Asignados();
			case ArkiWebPackage.LIST_PROYECTOS_EN_EJECUCION: return createListProyectos_En_Ejecucion();
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
	public ListString createListString() {
		ListStringImpl listString = new ListStringImpl();
		return listString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListUsuario createListUsuario() {
		ListUsuarioImpl listUsuario = new ListUsuarioImpl();
		return listUsuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListPermiso createListPermiso() {
		ListPermisoImpl listPermiso = new ListPermisoImpl();
		return listPermiso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListProyecto createListProyecto() {
		ListProyectoImpl listProyecto = new ListProyectoImpl();
		return listProyecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListCertificado createListCertificado() {
		ListCertificadoImpl listCertificado = new ListCertificadoImpl();
		return listCertificado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListVivienda createListVivienda() {
		ListViviendaImpl listVivienda = new ListViviendaImpl();
		return listVivienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListInmueble createListInmueble() {
		ListInmuebleImpl listInmueble = new ListInmuebleImpl();
		return listInmueble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListCertificados_Asignados createListCertificados_Asignados() {
		ListCertificados_AsignadosImpl listCertificados_Asignados = new ListCertificados_AsignadosImpl();
		return listCertificados_Asignados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListProyectos_Asignados createListProyectos_Asignados() {
		ListProyectos_AsignadosImpl listProyectos_Asignados = new ListProyectos_AsignadosImpl();
		return listProyectos_Asignados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListProyectos_En_Ejecucion createListProyectos_En_Ejecucion() {
		ListProyectos_En_EjecucionImpl listProyectos_En_Ejecucion = new ListProyectos_En_EjecucionImpl();
		return listProyectos_En_Ejecucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArkiWebPackage getArkiWebPackage() {
		return (ArkiWebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArkiWebPackage getPackage() {
		return ArkiWebPackage.eINSTANCE;
	}

} //ArkiWebFactoryImpl
