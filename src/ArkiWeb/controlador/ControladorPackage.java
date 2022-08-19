/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

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
 * @see ArkiWeb.controlador.ControladorFactory
 * @model kind="package"
 * @generated
 */
public interface ControladorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controlador";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ArkiWeb/controlador.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ArkiWeb.controlador";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControladorPackage eINSTANCE = ArkiWeb.controlador.impl.ControladorPackageImpl.init();

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Controlador_Modelo <em>Controlador Modelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Controlador_Modelo
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControlador_Modelo()
	 * @generated
	 */
	int CONTROLADOR_MODELO = 0;

	/**
	 * The number of structural features of the '<em>Controlador Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Crear Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Editar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_USUARIO__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Baja Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BAJA_USUARIO__INT = 2;

	/**
	 * The operation id for the '<em>Crear Permiso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Editar Permiso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Crear Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CREAR_CERTIFICADO__STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = 5;

	/**
	 * The operation id for the '<em>Editar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Buscar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_CERTIFICADO__INT = 7;

	/**
	 * The operation id for the '<em>Crear Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CREAR_PROYECTO__STRING_INT_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = 8;

	/**
	 * The operation id for the '<em>Editar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_PROYECTO__INT_STRING_INT_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = 9;

	/**
	 * The operation id for the '<em>Buscar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_PROYECTO__INT = 10;

	/**
	 * The operation id for the '<em>Crear Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = 11;

	/**
	 * The operation id for the '<em>Editar Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = 12;

	/**
	 * The operation id for the '<em>Buscar Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_VIVIENDA__INT = 13;

	/**
	 * The operation id for the '<em>Crear Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE = 14;

	/**
	 * The operation id for the '<em>Editar Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE = 15;

	/**
	 * The operation id for the '<em>Buscar Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_INMUEBLE__INT = 16;

	/**
	 * The operation id for the '<em>Asignar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___ASIGNAR_CERTIFICADO__INT_INT = 17;

	/**
	 * The operation id for the '<em>Editar Asignacion Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT = 18;

	/**
	 * The operation id for the '<em>Asignar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___ASIGNAR_PROYECTO__INT_INT = 19;

	/**
	 * The operation id for the '<em>Editar Asignacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT = 20;

	/**
	 * The operation id for the '<em>Contratar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CONTRATAR_PROYECTO__INT_DATE_INT_DATE = 21;

	/**
	 * The operation id for the '<em>Editar Contratacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE = 22;

	/**
	 * The operation id for the '<em>Query Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___QUERY_CREAR__STRING_LISTSTRING_LISTSTRING = 23;

	/**
	 * The operation id for the '<em>Query Editar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___QUERY_EDITAR__STRING_LISTSTRING_LISTSTRING_STRING = 24;

	/**
	 * The operation id for the '<em>Query Buscar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___QUERY_BUSCAR__STRING_LISTSTRING_STRING = 25;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___LOGIN__STRING_STRING = 26;

	/**
	 * The operation id for the '<em>Cambiar Contrasenya</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___CAMBIAR_CONTRASENYA__STRING = 27;

	/**
	 * The operation id for the '<em>Listar Usuarios</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___LISTAR_USUARIOS = 28;

	/**
	 * The operation id for the '<em>Listar Permisos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___LISTAR_PERMISOS = 29;

	/**
	 * The operation id for the '<em>Listar Proyectos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___LISTAR_PROYECTOS = 30;

	/**
	 * The operation id for the '<em>Listar Certificados</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___LISTAR_CERTIFICADOS = 31;

	/**
	 * The operation id for the '<em>Listar Viviendas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___LISTAR_VIVIENDAS = 32;

	/**
	 * The operation id for the '<em>Listar Inmuebles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___LISTAR_INMUEBLES = 33;

	/**
	 * The operation id for the '<em>Buscar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_USUARIO__INT = 34;

	/**
	 * The operation id for the '<em>Buscar Mis Proyectos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_MIS_PROYECTOS__INT = 35;

	/**
	 * The operation id for the '<em>Buscar Proyectos Por Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_PROYECTOS_POR_USUARIO__INT = 36;

	/**
	 * The operation id for the '<em>Buscar Mis Certificados</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_MIS_CERTIFICADOS__INT = 37;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_USUARIO__INT = 38;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_VIVIENDA__INT = 39;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_INMUEBLE__INT = 40;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Edad Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_EDAD_INMUEBLE__INT = 41;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Edad Certificado Habitabilidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_EDAD_CERTIFICADO_HABITABILIDAD__INT = 42;

	/**
	 * The operation id for the '<em>Buscar Asignacion Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_ASIGNACION_CERTIFICADO__INT_INT = 43;

	/**
	 * The operation id for the '<em>Buscar Asignacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_ASIGNACION_PROYECTO__INT_INT = 44;

	/**
	 * The operation id for the '<em>Buscar Contratacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO___BUSCAR_CONTRATACION_PROYECTO__INT = 45;

	/**
	 * The number of operations of the '<em>Controlador Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_MODELO_OPERATION_COUNT = 46;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Control_Login <em>Control Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Control_Login
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Login()
	 * @generated
	 */
	int CONTROL_LOGIN = 1;

	/**
	 * The number of structural features of the '<em>Control Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOGIN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOGIN___LOGIN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Cambiar Contrasenya</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOGIN___CAMBIAR_CONTRASENYA__STRING = 1;

	/**
	 * The number of operations of the '<em>Control Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOGIN_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Control_Permisos <em>Control Permisos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Control_Permisos
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Permisos()
	 * @generated
	 */
	int CONTROL_PERMISOS = 2;

	/**
	 * The number of structural features of the '<em>Control Permisos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PERMISOS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Conceder Acceso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PERMISOS___CONCEDER_ACCESO = 0;

	/**
	 * The operation id for the '<em>Crear Permiso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PERMISOS___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Editar Permiso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PERMISOS___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN = 2;

	/**
	 * The number of operations of the '<em>Control Permisos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PERMISOS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Control_Usuarios <em>Control Usuarios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Control_Usuarios
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Usuarios()
	 * @generated
	 */
	int CONTROL_USUARIOS = 3;

	/**
	 * The number of structural features of the '<em>Control Usuarios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_USUARIOS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Crear Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_USUARIOS___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Editar Usuario 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_USUARIOS___EDITAR_USUARIO_1__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Baja Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_USUARIOS___BAJA_USUARIO__INT = 2;

	/**
	 * The number of operations of the '<em>Control Usuarios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_USUARIOS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Control_Certificados <em>Control Certificados</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Control_Certificados
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Certificados()
	 * @generated
	 */
	int CONTROL_CERTIFICADOS = 4;

	/**
	 * The number of structural features of the '<em>Control Certificados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CERTIFICADOS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Editar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CERTIFICADOS___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Asignar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CERTIFICADOS___ASIGNAR_CERTIFICADO__INT_INT = 1;

	/**
	 * The operation id for the '<em>Editar Asignacion Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CERTIFICADOS___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT = 2;

	/**
	 * The operation id for the '<em>Crear Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CERTIFICADOS___CREAR_CERTIFICADO__STRING_CERTIFICADO_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = 3;

	/**
	 * The number of operations of the '<em>Control Certificados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CERTIFICADOS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Control_Proyectos <em>Control Proyectos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Control_Proyectos
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Proyectos()
	 * @generated
	 */
	int CONTROL_PROYECTOS = 5;

	/**
	 * The number of structural features of the '<em>Control Proyectos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Editar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS___EDITAR_PROYECTO__INT_STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Editar Contratacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE = 1;

	/**
	 * The operation id for the '<em>Asignar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS___ASIGNAR_PROYECTO__INT_INT = 2;

	/**
	 * The operation id for the '<em>Contratar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS___CONTRATAR_PROYECTO__INT_DATE_INT_DATE = 3;

	/**
	 * The operation id for the '<em>Crear Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS___CREAR_PROYECTO__STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = 4;

	/**
	 * The operation id for the '<em>Editar Asignacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT = 5;

	/**
	 * The number of operations of the '<em>Control Proyectos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROYECTOS_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Control_Viviendas <em>Control Viviendas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Control_Viviendas
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Viviendas()
	 * @generated
	 */
	int CONTROL_VIVIENDAS = 6;

	/**
	 * The number of structural features of the '<em>Control Viviendas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VIVIENDAS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Crear Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VIVIENDAS___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = 0;

	/**
	 * The operation id for the '<em>Editar Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VIVIENDAS___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = 1;

	/**
	 * The number of operations of the '<em>Control Viviendas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_VIVIENDAS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Control_Inmuebles <em>Control Inmuebles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Control_Inmuebles
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Inmuebles()
	 * @generated
	 */
	int CONTROL_INMUEBLES = 7;

	/**
	 * The number of structural features of the '<em>Control Inmuebles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_INMUEBLES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Crear Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_INMUEBLES___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Editar Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_INMUEBLES___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE = 1;

	/**
	 * The number of operations of the '<em>Control Inmuebles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_INMUEBLES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ArkiWeb.controlador.Gestor_Busquedas <em>Gestor Busquedas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.controlador.Gestor_Busquedas
	 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getGestor_Busquedas()
	 * @generated
	 */
	int GESTOR_BUSQUEDAS = 8;

	/**
	 * The number of structural features of the '<em>Gestor Busquedas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Listar Usuarios</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___LISTAR_USUARIOS = 0;

	/**
	 * The operation id for the '<em>Buscar Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_INMUEBLE__INT = 1;

	/**
	 * The operation id for the '<em>Listar Permisos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___LISTAR_PERMISOS = 2;

	/**
	 * The operation id for the '<em>Listar Proyectos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___LISTAR_PROYECTOS = 3;

	/**
	 * The operation id for the '<em>Listar Certificados</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___LISTAR_CERTIFICADOS = 4;

	/**
	 * The operation id for the '<em>Listar Viviendas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___LISTAR_VIVIENDAS = 5;

	/**
	 * The operation id for the '<em>Listar Inmuebles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___LISTAR_INMUEBLES = 6;

	/**
	 * The operation id for the '<em>Listar Permisos Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___LISTAR_PERMISOS_USUARIO__INT = 7;

	/**
	 * The operation id for the '<em>Buscar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_USUARIO__INT = 8;

	/**
	 * The operation id for the '<em>Buscar Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_VIVIENDA__INT = 9;

	/**
	 * The operation id for the '<em>Buscar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_PROYECTO__INT = 10;

	/**
	 * The operation id for the '<em>Buscar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADO__INT = 11;

	/**
	 * The operation id for the '<em>Buscar Mis Proyectos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_MIS_PROYECTOS__INT = 12;

	/**
	 * The operation id for the '<em>Buscar Proyectos Por Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_PROYECTOS_POR_USUARIO__INT = 13;

	/**
	 * The operation id for the '<em>Buscar Mis Certificados</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_MIS_CERTIFICADOS__INT = 14;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_USUARIO__INT = 15;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_VIVIENDA__INT = 16;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_INMUEBLE__INT = 17;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Edad Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_EDAD_INMUEBLE__INT = 18;

	/**
	 * The operation id for the '<em>Buscar Certificados Por Edad Certificado Habitabilidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_EDAD_CERTIFICADO_HABITABILIDAD__INT = 19;

	/**
	 * The operation id for the '<em>Buscar Asignacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_ASIGNACION_PROYECTO__INT_INT = 20;

	/**
	 * The operation id for the '<em>Buscar Contratacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_CONTRATACION_PROYECTO__INT = 21;

	/**
	 * The operation id for the '<em>Buscar Asignacion Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS___BUSCAR_ASIGNACION_CERTIFICADO__INT_INT = 22;

	/**
	 * The number of operations of the '<em>Gestor Busquedas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTOR_BUSQUEDAS_OPERATION_COUNT = 23;


	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Controlador_Modelo <em>Controlador Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlador Modelo</em>'.
	 * @see ArkiWeb.controlador.Controlador_Modelo
	 * @generated
	 */
	EClass getControlador_Modelo();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#crearUsuario(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String) <em>Crear Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#crearUsuario(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getControlador_Modelo__CrearUsuario__String_String_String_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarUsuario(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String) <em>Editar Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarUsuario(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarUsuario__int_String_String_String_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#bajaUsuario(int) <em>Baja Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Baja Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#bajaUsuario(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BajaUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#crearPermiso(java.lang.String, java.lang.String, boolean, boolean) <em>Crear Permiso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Permiso</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#crearPermiso(java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getControlador_Modelo__CrearPermiso__String_String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarPermiso(int, java.lang.String, java.lang.String, boolean, boolean) <em>Editar Permiso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Permiso</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarPermiso(int, java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarPermiso__int_String_String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#crearCertificado(java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double) <em>Crear Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#crearCertificado(java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double)
	 * @generated
	 */
	EOperation getControlador_Modelo__CrearCertificado__String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarCertificado(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double) <em>Editar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarCertificado(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarCertificado(int) <em>Buscar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarCertificado(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarCertificado__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#crearProyecto(java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double) <em>Crear Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#crearProyecto(java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double)
	 * @generated
	 */
	EOperation getControlador_Modelo__CrearProyecto__String_int_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarProyecto(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double) <em>Editar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarProyecto(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarProyecto__int_String_int_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarProyecto(int) <em>Buscar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarProyecto(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarProyecto__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#crearVivienda(java.lang.String, java.lang.String, int, double, double, int, int, int) <em>Crear Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#crearVivienda(java.lang.String, java.lang.String, int, double, double, int, int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__CrearVivienda__String_String_int_double_double_int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarVivienda(int, java.lang.String, java.lang.String, int, double, double, int, int, int) <em>Editar Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarVivienda(int, java.lang.String, java.lang.String, int, double, double, int, int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarVivienda__int_String_String_int_double_double_int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarVivienda(int) <em>Buscar Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarVivienda(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarVivienda__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#crearInmueble(java.lang.String, java.lang.String, double, double) <em>Crear Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#crearInmueble(java.lang.String, java.lang.String, double, double)
	 * @generated
	 */
	EOperation getControlador_Modelo__CrearInmueble__String_String_double_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarInmueble(int, java.lang.String, java.lang.String, double, double) <em>Editar Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarInmueble(int, java.lang.String, java.lang.String, double, double)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarInmueble__int_String_String_double_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarInmueble(int) <em>Buscar Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarInmueble(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarInmueble__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#asignarCertificado(int, int) <em>Asignar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Asignar Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#asignarCertificado(int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__AsignarCertificado__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarAsignacionCertificado(int, int, int) <em>Editar Asignacion Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Asignacion Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarAsignacionCertificado(int, int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarAsignacionCertificado__int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#asignarProyecto(int, int) <em>Asignar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Asignar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#asignarProyecto(int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__AsignarProyecto__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarAsignacionProyecto(int, int, int) <em>Editar Asignacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Asignacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarAsignacionProyecto(int, int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarAsignacionProyecto__int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#contratarProyecto(int, java.util.Date, int, java.util.Date) <em>Contratar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contratar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#contratarProyecto(int, java.util.Date, int, java.util.Date)
	 * @generated
	 */
	EOperation getControlador_Modelo__ContratarProyecto__int_Date_int_Date();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#editarContratacionProyecto(int, int, java.util.Date, int, java.util.Date) <em>Editar Contratacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Contratacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#editarContratacionProyecto(int, int, java.util.Date, int, java.util.Date)
	 * @generated
	 */
	EOperation getControlador_Modelo__EditarContratacionProyecto__int_int_Date_int_Date();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#queryCrear(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString) <em>Query Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Crear</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#queryCrear(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString)
	 * @generated
	 */
	EOperation getControlador_Modelo__QueryCrear__String_ListString_ListString();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#queryEditar(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString, java.lang.String) <em>Query Editar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Editar</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#queryEditar(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString, java.lang.String)
	 * @generated
	 */
	EOperation getControlador_Modelo__QueryEditar__String_ListString_ListString_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#queryBuscar(java.lang.String, ArkiWeb.ListString, java.lang.String) <em>Query Buscar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Buscar</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#queryBuscar(java.lang.String, ArkiWeb.ListString, java.lang.String)
	 * @generated
	 */
	EOperation getControlador_Modelo__QueryBuscar__String_ListString_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getControlador_Modelo__Login__String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#cambiarContrasenya(java.lang.String) <em>Cambiar Contrasenya</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cambiar Contrasenya</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#cambiarContrasenya(java.lang.String)
	 * @generated
	 */
	EOperation getControlador_Modelo__CambiarContrasenya__String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#listarUsuarios() <em>Listar Usuarios</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Usuarios</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#listarUsuarios()
	 * @generated
	 */
	EOperation getControlador_Modelo__ListarUsuarios();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#listarPermisos() <em>Listar Permisos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Permisos</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#listarPermisos()
	 * @generated
	 */
	EOperation getControlador_Modelo__ListarPermisos();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#listarProyectos() <em>Listar Proyectos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Proyectos</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#listarProyectos()
	 * @generated
	 */
	EOperation getControlador_Modelo__ListarProyectos();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#listarCertificados() <em>Listar Certificados</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Certificados</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#listarCertificados()
	 * @generated
	 */
	EOperation getControlador_Modelo__ListarCertificados();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#listarViviendas() <em>Listar Viviendas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Viviendas</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#listarViviendas()
	 * @generated
	 */
	EOperation getControlador_Modelo__ListarViviendas();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#listarInmuebles() <em>Listar Inmuebles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Inmuebles</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#listarInmuebles()
	 * @generated
	 */
	EOperation getControlador_Modelo__ListarInmuebles();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarUsuario(int) <em>Buscar Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarUsuario(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarMisProyectos(int) <em>Buscar Mis Proyectos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Mis Proyectos</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarMisProyectos(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarMisProyectos__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarProyectosPorUsuario(int) <em>Buscar Proyectos Por Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Proyectos Por Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarProyectosPorUsuario(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarProyectosPorUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarMisCertificados(int) <em>Buscar Mis Certificados</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Mis Certificados</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarMisCertificados(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarMisCertificados__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorUsuario(int) <em>Buscar Certificados Por Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorUsuario(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarCertificadosPorUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorVivienda(int) <em>Buscar Certificados Por Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorVivienda(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarCertificadosPorVivienda__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorInmueble(int) <em>Buscar Certificados Por Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorInmueble(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarCertificadosPorInmueble__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorEdadInmueble(int) <em>Buscar Certificados Por Edad Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Edad Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorEdadInmueble(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarCertificadosPorEdadInmueble__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorEdadCertificadoHabitabilidad(int) <em>Buscar Certificados Por Edad Certificado Habitabilidad</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Edad Certificado Habitabilidad</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarCertificadosPorEdadCertificadoHabitabilidad(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarCertificadosPorEdadCertificadoHabitabilidad__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarAsignacionCertificado(int, int) <em>Buscar Asignacion Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Asignacion Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarAsignacionCertificado(int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarAsignacionCertificado__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarAsignacionProyecto(int, int) <em>Buscar Asignacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Asignacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarAsignacionProyecto(int, int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarAsignacionProyecto__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Controlador_Modelo#buscarContratacionProyecto(int) <em>Buscar Contratacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Contratacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Controlador_Modelo#buscarContratacionProyecto(int)
	 * @generated
	 */
	EOperation getControlador_Modelo__BuscarContratacionProyecto__int();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Control_Login <em>Control Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Login</em>'.
	 * @see ArkiWeb.controlador.Control_Login
	 * @generated
	 */
	EClass getControl_Login();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Login#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see ArkiWeb.controlador.Control_Login#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getControl_Login__Login__String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Login#cambiarContrasenya(java.lang.String) <em>Cambiar Contrasenya</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cambiar Contrasenya</em>' operation.
	 * @see ArkiWeb.controlador.Control_Login#cambiarContrasenya(java.lang.String)
	 * @generated
	 */
	EOperation getControl_Login__CambiarContrasenya__String();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Control_Permisos <em>Control Permisos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Permisos</em>'.
	 * @see ArkiWeb.controlador.Control_Permisos
	 * @generated
	 */
	EClass getControl_Permisos();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Permisos#concederAcceso() <em>Conceder Acceso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conceder Acceso</em>' operation.
	 * @see ArkiWeb.controlador.Control_Permisos#concederAcceso()
	 * @generated
	 */
	EOperation getControl_Permisos__ConcederAcceso();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Permisos#crearPermiso(java.lang.String, java.lang.String, boolean, boolean) <em>Crear Permiso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Permiso</em>' operation.
	 * @see ArkiWeb.controlador.Control_Permisos#crearPermiso(java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getControl_Permisos__CrearPermiso__String_String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Permisos#editarPermiso(int, java.lang.String, java.lang.String, boolean, boolean) <em>Editar Permiso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Permiso</em>' operation.
	 * @see ArkiWeb.controlador.Control_Permisos#editarPermiso(int, java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getControl_Permisos__EditarPermiso__int_String_String_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Control_Usuarios <em>Control Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Usuarios</em>'.
	 * @see ArkiWeb.controlador.Control_Usuarios
	 * @generated
	 */
	EClass getControl_Usuarios();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Usuarios#crearUsuario(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String) <em>Crear Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Control_Usuarios#crearUsuario(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getControl_Usuarios__CrearUsuario__String_String_String_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Usuarios#editarUsuario_1(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String) <em>Editar Usuario 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Usuario 1</em>' operation.
	 * @see ArkiWeb.controlador.Control_Usuarios#editarUsuario_1(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getControl_Usuarios__EditarUsuario_1__int_String_String_String_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Usuarios#bajaUsuario(int) <em>Baja Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Baja Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Control_Usuarios#bajaUsuario(int)
	 * @generated
	 */
	EOperation getControl_Usuarios__BajaUsuario__int();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Control_Certificados <em>Control Certificados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Certificados</em>'.
	 * @see ArkiWeb.controlador.Control_Certificados
	 * @generated
	 */
	EClass getControl_Certificados();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Certificados#editarCertificado(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double) <em>Editar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Control_Certificados#editarCertificado(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double)
	 * @generated
	 */
	EOperation getControl_Certificados__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Certificados#asignarCertificado(int, int) <em>Asignar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Asignar Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Control_Certificados#asignarCertificado(int, int)
	 * @generated
	 */
	EOperation getControl_Certificados__AsignarCertificado__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Certificados#editarAsignacionCertificado(int, int, int) <em>Editar Asignacion Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Asignacion Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Control_Certificados#editarAsignacionCertificado(int, int, int)
	 * @generated
	 */
	EOperation getControl_Certificados__EditarAsignacionCertificado__int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Certificados#crearCertificado(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double) <em>Crear Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Control_Certificados#crearCertificado(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double)
	 * @generated
	 */
	EOperation getControl_Certificados__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Control_Proyectos <em>Control Proyectos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Proyectos</em>'.
	 * @see ArkiWeb.controlador.Control_Proyectos
	 * @generated
	 */
	EClass getControl_Proyectos();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Proyectos#editarProyecto(int, java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double) <em>Editar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Control_Proyectos#editarProyecto(int, java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double)
	 * @generated
	 */
	EOperation getControl_Proyectos__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Proyectos#editarContratacionProyecto(int, int, java.util.Date, int, java.util.Date) <em>Editar Contratacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Contratacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Control_Proyectos#editarContratacionProyecto(int, int, java.util.Date, int, java.util.Date)
	 * @generated
	 */
	EOperation getControl_Proyectos__EditarContratacionProyecto__int_int_Date_int_Date();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Proyectos#asignarProyecto(int, int) <em>Asignar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Asignar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Control_Proyectos#asignarProyecto(int, int)
	 * @generated
	 */
	EOperation getControl_Proyectos__AsignarProyecto__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Proyectos#contratarProyecto(int, java.util.Date, int, java.util.Date) <em>Contratar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contratar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Control_Proyectos#contratarProyecto(int, java.util.Date, int, java.util.Date)
	 * @generated
	 */
	EOperation getControl_Proyectos__ContratarProyecto__int_Date_int_Date();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Proyectos#crearProyecto(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double) <em>Crear Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Control_Proyectos#crearProyecto(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double)
	 * @generated
	 */
	EOperation getControl_Proyectos__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Proyectos#editarAsignacionProyecto(int, int, int) <em>Editar Asignacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Asignacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Control_Proyectos#editarAsignacionProyecto(int, int, int)
	 * @generated
	 */
	EOperation getControl_Proyectos__EditarAsignacionProyecto__int_int_int();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Control_Viviendas <em>Control Viviendas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Viviendas</em>'.
	 * @see ArkiWeb.controlador.Control_Viviendas
	 * @generated
	 */
	EClass getControl_Viviendas();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Viviendas#crearVivienda(java.lang.String, java.lang.String, int, double, double, int, int, int) <em>Crear Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Control_Viviendas#crearVivienda(java.lang.String, java.lang.String, int, double, double, int, int, int)
	 * @generated
	 */
	EOperation getControl_Viviendas__CrearVivienda__String_String_int_double_double_int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Viviendas#editarVivienda(int, java.lang.String, java.lang.String, int, double, double, int, int, int) <em>Editar Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Control_Viviendas#editarVivienda(int, java.lang.String, java.lang.String, int, double, double, int, int, int)
	 * @generated
	 */
	EOperation getControl_Viviendas__EditarVivienda__int_String_String_int_double_double_int_int_int();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Control_Inmuebles <em>Control Inmuebles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Inmuebles</em>'.
	 * @see ArkiWeb.controlador.Control_Inmuebles
	 * @generated
	 */
	EClass getControl_Inmuebles();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Inmuebles#crearInmueble(java.lang.String, java.lang.String, double, double) <em>Crear Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Control_Inmuebles#crearInmueble(java.lang.String, java.lang.String, double, double)
	 * @generated
	 */
	EOperation getControl_Inmuebles__CrearInmueble__String_String_double_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Control_Inmuebles#editarInmueble(int, java.lang.String, java.lang.String, double, double) <em>Editar Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Control_Inmuebles#editarInmueble(int, java.lang.String, java.lang.String, double, double)
	 * @generated
	 */
	EOperation getControl_Inmuebles__EditarInmueble__int_String_String_double_double();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.controlador.Gestor_Busquedas <em>Gestor Busquedas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestor Busquedas</em>'.
	 * @see ArkiWeb.controlador.Gestor_Busquedas
	 * @generated
	 */
	EClass getGestor_Busquedas();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#listarUsuarios() <em>Listar Usuarios</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Usuarios</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#listarUsuarios()
	 * @generated
	 */
	EOperation getGestor_Busquedas__ListarUsuarios();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarInmueble(int) <em>Buscar Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarInmueble(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarInmueble__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#listarPermisos() <em>Listar Permisos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Permisos</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#listarPermisos()
	 * @generated
	 */
	EOperation getGestor_Busquedas__ListarPermisos();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#listarProyectos() <em>Listar Proyectos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Proyectos</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#listarProyectos()
	 * @generated
	 */
	EOperation getGestor_Busquedas__ListarProyectos();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#listarCertificados() <em>Listar Certificados</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Certificados</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#listarCertificados()
	 * @generated
	 */
	EOperation getGestor_Busquedas__ListarCertificados();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#listarViviendas() <em>Listar Viviendas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Viviendas</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#listarViviendas()
	 * @generated
	 */
	EOperation getGestor_Busquedas__ListarViviendas();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#listarInmuebles() <em>Listar Inmuebles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Inmuebles</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#listarInmuebles()
	 * @generated
	 */
	EOperation getGestor_Busquedas__ListarInmuebles();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#listarPermisosUsuario(int) <em>Listar Permisos Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listar Permisos Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#listarPermisosUsuario(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__ListarPermisosUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarUsuario(int) <em>Buscar Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarUsuario(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarVivienda(int) <em>Buscar Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarVivienda(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarVivienda__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarProyecto(int) <em>Buscar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarProyecto(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarProyecto__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarCertificado(int) <em>Buscar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarCertificado(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarCertificado__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarMisProyectos(int) <em>Buscar Mis Proyectos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Mis Proyectos</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarMisProyectos(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarMisProyectos__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarProyectosPorUsuario(int) <em>Buscar Proyectos Por Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Proyectos Por Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarProyectosPorUsuario(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarProyectosPorUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarMisCertificados(int) <em>Buscar Mis Certificados</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Mis Certificados</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarMisCertificados(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarMisCertificados__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorUsuario(int) <em>Buscar Certificados Por Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Usuario</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorUsuario(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarCertificadosPorUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorVivienda(int) <em>Buscar Certificados Por Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Vivienda</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorVivienda(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarCertificadosPorVivienda__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorInmueble(int) <em>Buscar Certificados Por Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorInmueble(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarCertificadosPorInmueble__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorEdadInmueble(int) <em>Buscar Certificados Por Edad Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Edad Inmueble</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorEdadInmueble(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarCertificadosPorEdadInmueble__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorEdadCertificadoHabitabilidad(int) <em>Buscar Certificados Por Edad Certificado Habitabilidad</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificados Por Edad Certificado Habitabilidad</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarCertificadosPorEdadCertificadoHabitabilidad(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarCertificadosPorEdadCertificadoHabitabilidad__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarAsignacionProyecto(int, int) <em>Buscar Asignacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Asignacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarAsignacionProyecto(int, int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarAsignacionProyecto__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarContratacionProyecto(int) <em>Buscar Contratacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Contratacion Proyecto</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarContratacionProyecto(int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarContratacionProyecto__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.controlador.Gestor_Busquedas#buscarAsignacionCertificado(int, int) <em>Buscar Asignacion Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Asignacion Certificado</em>' operation.
	 * @see ArkiWeb.controlador.Gestor_Busquedas#buscarAsignacionCertificado(int, int)
	 * @generated
	 */
	EOperation getGestor_Busquedas__BuscarAsignacionCertificado__int_int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControladorFactory getControladorFactory();

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
		 * The meta object literal for the '{@link ArkiWeb.controlador.Controlador_Modelo <em>Controlador Modelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Controlador_Modelo
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControlador_Modelo()
		 * @generated
		 */
		EClass CONTROLADOR_MODELO = eINSTANCE.getControlador_Modelo();

		/**
		 * The meta object literal for the '<em><b>Crear Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING = eINSTANCE.getControlador_Modelo__CrearUsuario__String_String_String_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Editar Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_USUARIO__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING = eINSTANCE.getControlador_Modelo__EditarUsuario__int_String_String_String_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Baja Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BAJA_USUARIO__INT = eINSTANCE.getControlador_Modelo__BajaUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Crear Permiso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getControlador_Modelo__CrearPermiso__String_String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Editar Permiso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getControlador_Modelo__EditarPermiso__int_String_String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Crear Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CREAR_CERTIFICADO__STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = eINSTANCE.getControlador_Modelo__CrearCertificado__String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

		/**
		 * The meta object literal for the '<em><b>Editar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = eINSTANCE.getControlador_Modelo__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_CERTIFICADO__INT = eINSTANCE.getControlador_Modelo__BuscarCertificado__int();

		/**
		 * The meta object literal for the '<em><b>Crear Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CREAR_PROYECTO__STRING_INT_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = eINSTANCE.getControlador_Modelo__CrearProyecto__String_int_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

		/**
		 * The meta object literal for the '<em><b>Editar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_PROYECTO__INT_STRING_INT_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = eINSTANCE.getControlador_Modelo__EditarProyecto__int_String_int_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

		/**
		 * The meta object literal for the '<em><b>Buscar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_PROYECTO__INT = eINSTANCE.getControlador_Modelo__BuscarProyecto__int();

		/**
		 * The meta object literal for the '<em><b>Crear Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = eINSTANCE.getControlador_Modelo__CrearVivienda__String_String_int_double_double_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = eINSTANCE.getControlador_Modelo__EditarVivienda__int_String_String_int_double_double_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Buscar Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_VIVIENDA__INT = eINSTANCE.getControlador_Modelo__BuscarVivienda__int();

		/**
		 * The meta object literal for the '<em><b>Crear Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE = eINSTANCE.getControlador_Modelo__CrearInmueble__String_String_double_double();

		/**
		 * The meta object literal for the '<em><b>Editar Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE = eINSTANCE.getControlador_Modelo__EditarInmueble__int_String_String_double_double();

		/**
		 * The meta object literal for the '<em><b>Buscar Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_INMUEBLE__INT = eINSTANCE.getControlador_Modelo__BuscarInmueble__int();

		/**
		 * The meta object literal for the '<em><b>Asignar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___ASIGNAR_CERTIFICADO__INT_INT = eINSTANCE.getControlador_Modelo__AsignarCertificado__int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Asignacion Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT = eINSTANCE.getControlador_Modelo__EditarAsignacionCertificado__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Asignar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___ASIGNAR_PROYECTO__INT_INT = eINSTANCE.getControlador_Modelo__AsignarProyecto__int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Asignacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT = eINSTANCE.getControlador_Modelo__EditarAsignacionProyecto__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Contratar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CONTRATAR_PROYECTO__INT_DATE_INT_DATE = eINSTANCE.getControlador_Modelo__ContratarProyecto__int_Date_int_Date();

		/**
		 * The meta object literal for the '<em><b>Editar Contratacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE = eINSTANCE.getControlador_Modelo__EditarContratacionProyecto__int_int_Date_int_Date();

		/**
		 * The meta object literal for the '<em><b>Query Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___QUERY_CREAR__STRING_LISTSTRING_LISTSTRING = eINSTANCE.getControlador_Modelo__QueryCrear__String_ListString_ListString();

		/**
		 * The meta object literal for the '<em><b>Query Editar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___QUERY_EDITAR__STRING_LISTSTRING_LISTSTRING_STRING = eINSTANCE.getControlador_Modelo__QueryEditar__String_ListString_ListString_String();

		/**
		 * The meta object literal for the '<em><b>Query Buscar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___QUERY_BUSCAR__STRING_LISTSTRING_STRING = eINSTANCE.getControlador_Modelo__QueryBuscar__String_ListString_String();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___LOGIN__STRING_STRING = eINSTANCE.getControlador_Modelo__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Cambiar Contrasenya</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___CAMBIAR_CONTRASENYA__STRING = eINSTANCE.getControlador_Modelo__CambiarContrasenya__String();

		/**
		 * The meta object literal for the '<em><b>Listar Usuarios</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___LISTAR_USUARIOS = eINSTANCE.getControlador_Modelo__ListarUsuarios();

		/**
		 * The meta object literal for the '<em><b>Listar Permisos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___LISTAR_PERMISOS = eINSTANCE.getControlador_Modelo__ListarPermisos();

		/**
		 * The meta object literal for the '<em><b>Listar Proyectos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___LISTAR_PROYECTOS = eINSTANCE.getControlador_Modelo__ListarProyectos();

		/**
		 * The meta object literal for the '<em><b>Listar Certificados</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___LISTAR_CERTIFICADOS = eINSTANCE.getControlador_Modelo__ListarCertificados();

		/**
		 * The meta object literal for the '<em><b>Listar Viviendas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___LISTAR_VIVIENDAS = eINSTANCE.getControlador_Modelo__ListarViviendas();

		/**
		 * The meta object literal for the '<em><b>Listar Inmuebles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___LISTAR_INMUEBLES = eINSTANCE.getControlador_Modelo__ListarInmuebles();

		/**
		 * The meta object literal for the '<em><b>Buscar Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_USUARIO__INT = eINSTANCE.getControlador_Modelo__BuscarUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Mis Proyectos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_MIS_PROYECTOS__INT = eINSTANCE.getControlador_Modelo__BuscarMisProyectos__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Proyectos Por Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_PROYECTOS_POR_USUARIO__INT = eINSTANCE.getControlador_Modelo__BuscarProyectosPorUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Mis Certificados</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_MIS_CERTIFICADOS__INT = eINSTANCE.getControlador_Modelo__BuscarMisCertificados__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_USUARIO__INT = eINSTANCE.getControlador_Modelo__BuscarCertificadosPorUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_VIVIENDA__INT = eINSTANCE.getControlador_Modelo__BuscarCertificadosPorVivienda__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_INMUEBLE__INT = eINSTANCE.getControlador_Modelo__BuscarCertificadosPorInmueble__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Edad Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_EDAD_INMUEBLE__INT = eINSTANCE.getControlador_Modelo__BuscarCertificadosPorEdadInmueble__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Edad Certificado Habitabilidad</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_CERTIFICADOS_POR_EDAD_CERTIFICADO_HABITABILIDAD__INT = eINSTANCE.getControlador_Modelo__BuscarCertificadosPorEdadCertificadoHabitabilidad__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Asignacion Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_ASIGNACION_CERTIFICADO__INT_INT = eINSTANCE.getControlador_Modelo__BuscarAsignacionCertificado__int_int();

		/**
		 * The meta object literal for the '<em><b>Buscar Asignacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_ASIGNACION_PROYECTO__INT_INT = eINSTANCE.getControlador_Modelo__BuscarAsignacionProyecto__int_int();

		/**
		 * The meta object literal for the '<em><b>Buscar Contratacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLADOR_MODELO___BUSCAR_CONTRATACION_PROYECTO__INT = eINSTANCE.getControlador_Modelo__BuscarContratacionProyecto__int();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Control_Login <em>Control Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Control_Login
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Login()
		 * @generated
		 */
		EClass CONTROL_LOGIN = eINSTANCE.getControl_Login();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_LOGIN___LOGIN__STRING_STRING = eINSTANCE.getControl_Login__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Cambiar Contrasenya</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_LOGIN___CAMBIAR_CONTRASENYA__STRING = eINSTANCE.getControl_Login__CambiarContrasenya__String();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Control_Permisos <em>Control Permisos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Control_Permisos
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Permisos()
		 * @generated
		 */
		EClass CONTROL_PERMISOS = eINSTANCE.getControl_Permisos();

		/**
		 * The meta object literal for the '<em><b>Conceder Acceso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PERMISOS___CONCEDER_ACCESO = eINSTANCE.getControl_Permisos__ConcederAcceso();

		/**
		 * The meta object literal for the '<em><b>Crear Permiso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PERMISOS___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getControl_Permisos__CrearPermiso__String_String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Editar Permiso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PERMISOS___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getControl_Permisos__EditarPermiso__int_String_String_boolean_boolean();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Control_Usuarios <em>Control Usuarios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Control_Usuarios
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Usuarios()
		 * @generated
		 */
		EClass CONTROL_USUARIOS = eINSTANCE.getControl_Usuarios();

		/**
		 * The meta object literal for the '<em><b>Crear Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_USUARIOS___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING = eINSTANCE.getControl_Usuarios__CrearUsuario__String_String_String_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Editar Usuario 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_USUARIOS___EDITAR_USUARIO_1__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING = eINSTANCE.getControl_Usuarios__EditarUsuario_1__int_String_String_String_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Baja Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_USUARIOS___BAJA_USUARIO__INT = eINSTANCE.getControl_Usuarios__BajaUsuario__int();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Control_Certificados <em>Control Certificados</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Control_Certificados
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Certificados()
		 * @generated
		 */
		EClass CONTROL_CERTIFICADOS = eINSTANCE.getControl_Certificados();

		/**
		 * The meta object literal for the '<em><b>Editar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_CERTIFICADOS___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = eINSTANCE.getControl_Certificados__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

		/**
		 * The meta object literal for the '<em><b>Asignar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_CERTIFICADOS___ASIGNAR_CERTIFICADO__INT_INT = eINSTANCE.getControl_Certificados__AsignarCertificado__int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Asignacion Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_CERTIFICADOS___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT = eINSTANCE.getControl_Certificados__EditarAsignacionCertificado__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Crear Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_CERTIFICADOS___CREAR_CERTIFICADO__STRING_CERTIFICADO_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = eINSTANCE.getControl_Certificados__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Control_Proyectos <em>Control Proyectos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Control_Proyectos
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Proyectos()
		 * @generated
		 */
		EClass CONTROL_PROYECTOS = eINSTANCE.getControl_Proyectos();

		/**
		 * The meta object literal for the '<em><b>Editar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PROYECTOS___EDITAR_PROYECTO__INT_STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = eINSTANCE.getControl_Proyectos__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

		/**
		 * The meta object literal for the '<em><b>Editar Contratacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PROYECTOS___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE = eINSTANCE.getControl_Proyectos__EditarContratacionProyecto__int_int_Date_int_Date();

		/**
		 * The meta object literal for the '<em><b>Asignar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PROYECTOS___ASIGNAR_PROYECTO__INT_INT = eINSTANCE.getControl_Proyectos__AsignarProyecto__int_int();

		/**
		 * The meta object literal for the '<em><b>Contratar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PROYECTOS___CONTRATAR_PROYECTO__INT_DATE_INT_DATE = eINSTANCE.getControl_Proyectos__ContratarProyecto__int_Date_int_Date();

		/**
		 * The meta object literal for the '<em><b>Crear Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PROYECTOS___CREAR_PROYECTO__STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = eINSTANCE.getControl_Proyectos__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

		/**
		 * The meta object literal for the '<em><b>Editar Asignacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_PROYECTOS___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT = eINSTANCE.getControl_Proyectos__EditarAsignacionProyecto__int_int_int();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Control_Viviendas <em>Control Viviendas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Control_Viviendas
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Viviendas()
		 * @generated
		 */
		EClass CONTROL_VIVIENDAS = eINSTANCE.getControl_Viviendas();

		/**
		 * The meta object literal for the '<em><b>Crear Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_VIVIENDAS___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = eINSTANCE.getControl_Viviendas__CrearVivienda__String_String_int_double_double_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_VIVIENDAS___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = eINSTANCE.getControl_Viviendas__EditarVivienda__int_String_String_int_double_double_int_int_int();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Control_Inmuebles <em>Control Inmuebles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Control_Inmuebles
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getControl_Inmuebles()
		 * @generated
		 */
		EClass CONTROL_INMUEBLES = eINSTANCE.getControl_Inmuebles();

		/**
		 * The meta object literal for the '<em><b>Crear Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_INMUEBLES___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE = eINSTANCE.getControl_Inmuebles__CrearInmueble__String_String_double_double();

		/**
		 * The meta object literal for the '<em><b>Editar Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_INMUEBLES___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE = eINSTANCE.getControl_Inmuebles__EditarInmueble__int_String_String_double_double();

		/**
		 * The meta object literal for the '{@link ArkiWeb.controlador.Gestor_Busquedas <em>Gestor Busquedas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.controlador.Gestor_Busquedas
		 * @see ArkiWeb.controlador.impl.ControladorPackageImpl#getGestor_Busquedas()
		 * @generated
		 */
		EClass GESTOR_BUSQUEDAS = eINSTANCE.getGestor_Busquedas();

		/**
		 * The meta object literal for the '<em><b>Listar Usuarios</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___LISTAR_USUARIOS = eINSTANCE.getGestor_Busquedas__ListarUsuarios();

		/**
		 * The meta object literal for the '<em><b>Buscar Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_INMUEBLE__INT = eINSTANCE.getGestor_Busquedas__BuscarInmueble__int();

		/**
		 * The meta object literal for the '<em><b>Listar Permisos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___LISTAR_PERMISOS = eINSTANCE.getGestor_Busquedas__ListarPermisos();

		/**
		 * The meta object literal for the '<em><b>Listar Proyectos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___LISTAR_PROYECTOS = eINSTANCE.getGestor_Busquedas__ListarProyectos();

		/**
		 * The meta object literal for the '<em><b>Listar Certificados</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___LISTAR_CERTIFICADOS = eINSTANCE.getGestor_Busquedas__ListarCertificados();

		/**
		 * The meta object literal for the '<em><b>Listar Viviendas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___LISTAR_VIVIENDAS = eINSTANCE.getGestor_Busquedas__ListarViviendas();

		/**
		 * The meta object literal for the '<em><b>Listar Inmuebles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___LISTAR_INMUEBLES = eINSTANCE.getGestor_Busquedas__ListarInmuebles();

		/**
		 * The meta object literal for the '<em><b>Listar Permisos Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___LISTAR_PERMISOS_USUARIO__INT = eINSTANCE.getGestor_Busquedas__ListarPermisosUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_USUARIO__INT = eINSTANCE.getGestor_Busquedas__BuscarUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_VIVIENDA__INT = eINSTANCE.getGestor_Busquedas__BuscarVivienda__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_PROYECTO__INT = eINSTANCE.getGestor_Busquedas__BuscarProyecto__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADO__INT = eINSTANCE.getGestor_Busquedas__BuscarCertificado__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Mis Proyectos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_MIS_PROYECTOS__INT = eINSTANCE.getGestor_Busquedas__BuscarMisProyectos__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Proyectos Por Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_PROYECTOS_POR_USUARIO__INT = eINSTANCE.getGestor_Busquedas__BuscarProyectosPorUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Mis Certificados</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_MIS_CERTIFICADOS__INT = eINSTANCE.getGestor_Busquedas__BuscarMisCertificados__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_USUARIO__INT = eINSTANCE.getGestor_Busquedas__BuscarCertificadosPorUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_VIVIENDA__INT = eINSTANCE.getGestor_Busquedas__BuscarCertificadosPorVivienda__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_INMUEBLE__INT = eINSTANCE.getGestor_Busquedas__BuscarCertificadosPorInmueble__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Edad Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_EDAD_INMUEBLE__INT = eINSTANCE.getGestor_Busquedas__BuscarCertificadosPorEdadInmueble__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificados Por Edad Certificado Habitabilidad</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_CERTIFICADOS_POR_EDAD_CERTIFICADO_HABITABILIDAD__INT = eINSTANCE.getGestor_Busquedas__BuscarCertificadosPorEdadCertificadoHabitabilidad__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Asignacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_ASIGNACION_PROYECTO__INT_INT = eINSTANCE.getGestor_Busquedas__BuscarAsignacionProyecto__int_int();

		/**
		 * The meta object literal for the '<em><b>Buscar Contratacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_CONTRATACION_PROYECTO__INT = eINSTANCE.getGestor_Busquedas__BuscarContratacionProyecto__int();

		/**
		 * The meta object literal for the '<em><b>Buscar Asignacion Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTOR_BUSQUEDAS___BUSCAR_ASIGNACION_CERTIFICADO__INT_INT = eINSTANCE.getGestor_Busquedas__BuscarAsignacionCertificado__int_int();

	}

} //ControladorPackage
