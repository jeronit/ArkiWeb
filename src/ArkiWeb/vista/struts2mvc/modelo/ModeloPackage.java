/**
 */
package ArkiWeb.vista.struts2mvc.modelo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ArkiWeb/vista/struts2mvc/modelo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ArkiWeb.vista.struts2mvc.modelo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloPackage eINSTANCE = ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl.init();

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.LoginActionSupportImpl <em>Login Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.LoginActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getLoginActionSupport()
	 * @generated
	 */
	int LOGIN_ACTION_SUPPORT = 0;

	/**
	 * The number of structural features of the '<em>Login Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Login Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.AltaUsuarioActionSupportImpl <em>Alta Usuario Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.AltaUsuarioActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getAltaUsuarioActionSupport()
	 * @generated
	 */
	int ALTA_USUARIO_ACTION_SUPPORT = 1;

	/**
	 * The number of structural features of the '<em>Alta Usuario Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTA_USUARIO_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTA_USUARIO_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered NOT
	 */
	int ALTA_USUARIO_ACTION_SUPPORT___EXECUTE1 = 1;

	/**
	 * The number of operations of the '<em>Alta Usuario Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTA_USUARIO_ACTION_SUPPORT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.PortalClienteActionSupportImpl <em>Portal Cliente Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.PortalClienteActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getPortalClienteActionSupport()
	 * @generated
	 */
	int PORTAL_CLIENTE_ACTION_SUPPORT = 2;

	/**
	 * The number of structural features of the '<em>Portal Cliente Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_CLIENTE_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_CLIENTE_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Portal Cliente Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_CLIENTE_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.PortalAdministradorActionSupportImpl <em>Portal Administrador Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.PortalAdministradorActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getPortalAdministradorActionSupport()
	 * @generated
	 */
	int PORTAL_ADMINISTRADOR_ACTION_SUPPORT = 3;

	/**
	 * The number of structural features of the '<em>Portal Administrador Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_ADMINISTRADOR_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_ADMINISTRADOR_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Portal Administrador Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_ADMINISTRADOR_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.PortalArquitectoActionSupportImpl <em>Portal Arquitecto Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.PortalArquitectoActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getPortalArquitectoActionSupport()
	 * @generated
	 */
	int PORTAL_ARQUITECTO_ACTION_SUPPORT = 4;

	/**
	 * The number of structural features of the '<em>Portal Arquitecto Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_ARQUITECTO_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_ARQUITECTO_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Portal Arquitecto Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_ARQUITECTO_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarUsuarioActionSupportImpl <em>Editar Usuario Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarUsuarioActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarUsuarioActionSupport()
	 * @generated
	 */
	int EDITAR_USUARIO_ACTION_SUPPORT = 5;

	/**
	 * The number of structural features of the '<em>Editar Usuario Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_USUARIO_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_USUARIO_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Editar Usuario Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_USUARIO_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarPermisoActionSupportImpl <em>Editar Permiso Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarPermisoActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarPermisoActionSupport()
	 * @generated
	 */
	int EDITAR_PERMISO_ACTION_SUPPORT = 6;

	/**
	 * The number of structural features of the '<em>Editar Permiso Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERMISO_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERMISO_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Editar Permiso Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERMISO_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarCertificadoActionSupportImpl <em>Editar Certificado Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarCertificadoActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarCertificadoActionSupport()
	 * @generated
	 */
	int EDITAR_CERTIFICADO_ACTION_SUPPORT = 7;

	/**
	 * The number of structural features of the '<em>Editar Certificado Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_CERTIFICADO_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_CERTIFICADO_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Editar Certificado Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_CERTIFICADO_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarProyectoActionSupportImpl <em>Editar Proyecto Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarProyectoActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarProyectoActionSupport()
	 * @generated
	 */
	int EDITAR_PROYECTO_ACTION_SUPPORT = 8;

	/**
	 * The number of structural features of the '<em>Editar Proyecto Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PROYECTO_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PROYECTO_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Editar Proyecto Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PROYECTO_ACTION_SUPPORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarEjecucionProyectoActionSupportImpl <em>Editar Ejecucion Proyecto Action Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarEjecucionProyectoActionSupportImpl
	 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarEjecucionProyectoActionSupport()
	 * @generated
	 */
	int EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT = 9;

	/**
	 * The number of structural features of the '<em>Editar Ejecucion Proyecto Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Editar Ejecucion Proyecto Action Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport <em>Login Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport
	 * @generated
	 */
	EClass getLoginActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport#execute()
	 * @generated
	 */
	EOperation getLoginActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport <em>Alta Usuario Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alta Usuario Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport
	 * @generated
	 */
	EClass getAltaUsuarioActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport#execute()
	 * @generated
	 */
	EOperation getAltaUsuarioActionSupport__Execute();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.AltaUsuarioActionSupport#execute()
	 * @generated
	 */
	EOperation getAltaUsuarioActionSupport__Execute_1();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.PortalClienteActionSupport <em>Portal Cliente Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portal Cliente Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalClienteActionSupport
	 * @generated
	 */
	EClass getPortalClienteActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.PortalClienteActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalClienteActionSupport#execute()
	 * @generated
	 */
	EOperation getPortalClienteActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.PortalAdministradorActionSupport <em>Portal Administrador Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portal Administrador Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalAdministradorActionSupport
	 * @generated
	 */
	EClass getPortalAdministradorActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.PortalAdministradorActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalAdministradorActionSupport#execute()
	 * @generated
	 */
	EOperation getPortalAdministradorActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport <em>Portal Arquitecto Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portal Arquitecto Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport
	 * @generated
	 */
	EClass getPortalArquitectoActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport#execute()
	 * @generated
	 */
	EOperation getPortalArquitectoActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarUsuarioActionSupport <em>Editar Usuario Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editar Usuario Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarUsuarioActionSupport
	 * @generated
	 */
	EClass getEditarUsuarioActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.EditarUsuarioActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarUsuarioActionSupport#execute()
	 * @generated
	 */
	EOperation getEditarUsuarioActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarPermisoActionSupport <em>Editar Permiso Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editar Permiso Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarPermisoActionSupport
	 * @generated
	 */
	EClass getEditarPermisoActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.EditarPermisoActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarPermisoActionSupport#execute()
	 * @generated
	 */
	EOperation getEditarPermisoActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarCertificadoActionSupport <em>Editar Certificado Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editar Certificado Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarCertificadoActionSupport
	 * @generated
	 */
	EClass getEditarCertificadoActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.EditarCertificadoActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarCertificadoActionSupport#execute()
	 * @generated
	 */
	EOperation getEditarCertificadoActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarProyectoActionSupport <em>Editar Proyecto Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editar Proyecto Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarProyectoActionSupport
	 * @generated
	 */
	EClass getEditarProyectoActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.EditarProyectoActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarProyectoActionSupport#execute()
	 * @generated
	 */
	EOperation getEditarProyectoActionSupport__Execute();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.vista.struts2mvc.modelo.EditarEjecucionProyectoActionSupport <em>Editar Ejecucion Proyecto Action Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editar Ejecucion Proyecto Action Support</em>'.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarEjecucionProyectoActionSupport
	 * @generated
	 */
	EClass getEditarEjecucionProyectoActionSupport();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.vista.struts2mvc.modelo.EditarEjecucionProyectoActionSupport#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ArkiWeb.vista.struts2mvc.modelo.EditarEjecucionProyectoActionSupport#execute()
	 * @generated
	 */
	EOperation getEditarEjecucionProyectoActionSupport__Execute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloFactory getModeloFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.LoginActionSupportImpl <em>Login Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.LoginActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getLoginActionSupport()
		 * @generated
		 */
		EClass LOGIN_ACTION_SUPPORT = eINSTANCE.getLoginActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_ACTION_SUPPORT___EXECUTE = eINSTANCE.getLoginActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.AltaUsuarioActionSupportImpl <em>Alta Usuario Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.AltaUsuarioActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getAltaUsuarioActionSupport()
		 * @generated
		 */
		EClass ALTA_USUARIO_ACTION_SUPPORT = eINSTANCE.getAltaUsuarioActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALTA_USUARIO_ACTION_SUPPORT___EXECUTE = eINSTANCE.getAltaUsuarioActionSupport__Execute();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		EOperation ALTA_USUARIO_ACTION_SUPPORT___EXECUTE1 = eINSTANCE.getAltaUsuarioActionSupport__Execute_1();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.PortalClienteActionSupportImpl <em>Portal Cliente Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.PortalClienteActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getPortalClienteActionSupport()
		 * @generated
		 */
		EClass PORTAL_CLIENTE_ACTION_SUPPORT = eINSTANCE.getPortalClienteActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTAL_CLIENTE_ACTION_SUPPORT___EXECUTE = eINSTANCE.getPortalClienteActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.PortalAdministradorActionSupportImpl <em>Portal Administrador Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.PortalAdministradorActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getPortalAdministradorActionSupport()
		 * @generated
		 */
		EClass PORTAL_ADMINISTRADOR_ACTION_SUPPORT = eINSTANCE.getPortalAdministradorActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTAL_ADMINISTRADOR_ACTION_SUPPORT___EXECUTE = eINSTANCE.getPortalAdministradorActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.PortalArquitectoActionSupportImpl <em>Portal Arquitecto Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.PortalArquitectoActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getPortalArquitectoActionSupport()
		 * @generated
		 */
		EClass PORTAL_ARQUITECTO_ACTION_SUPPORT = eINSTANCE.getPortalArquitectoActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTAL_ARQUITECTO_ACTION_SUPPORT___EXECUTE = eINSTANCE.getPortalArquitectoActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarUsuarioActionSupportImpl <em>Editar Usuario Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarUsuarioActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarUsuarioActionSupport()
		 * @generated
		 */
		EClass EDITAR_USUARIO_ACTION_SUPPORT = eINSTANCE.getEditarUsuarioActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITAR_USUARIO_ACTION_SUPPORT___EXECUTE = eINSTANCE.getEditarUsuarioActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarPermisoActionSupportImpl <em>Editar Permiso Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarPermisoActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarPermisoActionSupport()
		 * @generated
		 */
		EClass EDITAR_PERMISO_ACTION_SUPPORT = eINSTANCE.getEditarPermisoActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITAR_PERMISO_ACTION_SUPPORT___EXECUTE = eINSTANCE.getEditarPermisoActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarCertificadoActionSupportImpl <em>Editar Certificado Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarCertificadoActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarCertificadoActionSupport()
		 * @generated
		 */
		EClass EDITAR_CERTIFICADO_ACTION_SUPPORT = eINSTANCE.getEditarCertificadoActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITAR_CERTIFICADO_ACTION_SUPPORT___EXECUTE = eINSTANCE.getEditarCertificadoActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarProyectoActionSupportImpl <em>Editar Proyecto Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarProyectoActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarProyectoActionSupport()
		 * @generated
		 */
		EClass EDITAR_PROYECTO_ACTION_SUPPORT = eINSTANCE.getEditarProyectoActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITAR_PROYECTO_ACTION_SUPPORT___EXECUTE = eINSTANCE.getEditarProyectoActionSupport__Execute();

		/**
		 * The meta object literal for the '{@link ArkiWeb.vista.struts2mvc.modelo.impl.EditarEjecucionProyectoActionSupportImpl <em>Editar Ejecucion Proyecto Action Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.EditarEjecucionProyectoActionSupportImpl
		 * @see ArkiWeb.vista.struts2mvc.modelo.impl.ModeloPackageImpl#getEditarEjecucionProyectoActionSupport()
		 * @generated
		 */
		EClass EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT = eINSTANCE.getEditarEjecucionProyectoActionSupport();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITAR_EJECUCION_PROYECTO_ACTION_SUPPORT___EXECUTE = eINSTANCE.getEditarEjecucionProyectoActionSupport__Execute();

	}

} //ModeloPackage
