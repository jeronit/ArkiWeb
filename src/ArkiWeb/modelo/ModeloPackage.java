/**
 */
package ArkiWeb.modelo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ArkiWeb.modelo.ModeloFactory
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
	String eNS_URI = "http:///ArkiWeb/modelo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ArkiWeb.modelo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloPackage eINSTANCE = ArkiWeb.modelo.impl.ModeloPackageImpl.init();

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Permiso <em>Permiso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Permiso
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getPermiso()
	 * @generated
	 */
	int PERMISO = 0;

	/**
	 * The feature id for the '<em><b>Id permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__ID_PERMISO = 0;

	/**
	 * The feature id for the '<em><b>Id rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__ID_ROL = 1;

	/**
	 * The feature id for the '<em><b>Objeto permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__OBJETO_PERMISO = 2;

	/**
	 * The feature id for the '<em><b>Lectura permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__LECTURA_PERMISO = 3;

	/**
	 * The feature id for the '<em><b>Escritura permiso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__ESCRITURA_PERMISO = 4;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__ROL = 5;

	/**
	 * The number of structural features of the '<em>Permiso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Permiso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Rol <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Rol
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 1;

	/**
	 * The feature id for the '<em><b>Id rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ID_ROL = 0;

	/**
	 * The feature id for the '<em><b>Descripcion rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__DESCRIPCION_ROL = 1;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Usuario <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Usuario
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 2;

	/**
	 * The feature id for the '<em><b>Id usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID_USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Nombre usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOMBRE_USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Apellidos usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__APELLIDOS_USUARIO = 2;

	/**
	 * The feature id for the '<em><b>Dni usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DNI_USUARIO = 3;

	/**
	 * The feature id for the '<em><b>Telefono usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TELEFONO_USUARIO = 4;

	/**
	 * The feature id for the '<em><b>Email usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL_USUARIO = 5;

	/**
	 * The feature id for the '<em><b>Domicilio usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DOMICILIO_USUARIO = 6;

	/**
	 * The feature id for the '<em><b>Contrasenya usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CONTRASENYA_USUARIO = 7;

	/**
	 * The feature id for the '<em><b>Rol usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ROL_USUARIO = 8;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ROL = 9;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Proyecto <em>Proyecto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Proyecto
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getProyecto()
	 * @generated
	 */
	int PROYECTO = 3;

	/**
	 * The feature id for the '<em><b>Id proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__ID_PROYECTO = 0;

	/**
	 * The feature id for the '<em><b>Descripcion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__DESCRIPCION_PROYECTO = 1;

	/**
	 * The feature id for the '<em><b>Id cliente proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__ID_CLIENTE_PROYECTO = 2;

	/**
	 * The feature id for the '<em><b>Id vivienda proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__ID_VIVIENDA_PROYECTO = 3;

	/**
	 * The feature id for the '<em><b>Id inmueble proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__ID_INMUEBLE_PROYECTO = 4;

	/**
	 * The feature id for the '<em><b>Tipo proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__TIPO_PROYECTO = 5;

	/**
	 * The feature id for the '<em><b>Fecha solicitud proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__FECHA_SOLICITUD_PROYECTO = 6;

	/**
	 * The feature id for the '<em><b>Fecha entrega proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__FECHA_ENTREGA_PROYECTO = 7;

	/**
	 * The feature id for the '<em><b>Duracion prevista proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__DURACION_PREVISTA_PROYECTO = 8;

	/**
	 * The feature id for the '<em><b>Presupuesto ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__PRESUPUESTO_EJECUCION_PROYECTO = 9;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__USUARIO = 10;

	/**
	 * The feature id for the '<em><b>Vivienda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__VIVIENDA = 11;

	/**
	 * The feature id for the '<em><b>Inmueble</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__INMUEBLE = 12;

	/**
	 * The number of structural features of the '<em>Proyecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Proyecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Vivienda <em>Vivienda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Vivienda
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getVivienda()
	 * @generated
	 */
	int VIVIENDA = 4;

	/**
	 * The feature id for the '<em><b>Id vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__ID_VIVIENDA = 0;

	/**
	 * The feature id for the '<em><b>Descripcion vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__DESCRIPCION_VIVIENDA = 1;

	/**
	 * The feature id for the '<em><b>Direccion vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__DIRECCION_VIVIENDA = 2;

	/**
	 * The feature id for the '<em><b>Id inmueble vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__ID_INMUEBLE_VIVIENDA = 3;

	/**
	 * The feature id for the '<em><b>Superficie terreno vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__SUPERFICIE_TERRENO_VIVIENDA = 4;

	/**
	 * The feature id for the '<em><b>Superficie vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__SUPERFICIE_VIVIENDA = 5;

	/**
	 * The feature id for the '<em><b>Plantas vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__PLANTAS_VIVIENDA = 6;

	/**
	 * The feature id for the '<em><b>Habitaciones vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__HABITACIONES_VIVIENDA = 7;

	/**
	 * The feature id for the '<em><b>Banyos vivienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA__BANYOS_VIVIENDA = 8;

	/**
	 * The number of structural features of the '<em>Vivienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Vivienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIVIENDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Inmueble <em>Inmueble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Inmueble
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getInmueble()
	 * @generated
	 */
	int INMUEBLE = 5;

	/**
	 * The feature id for the '<em><b>Vivienda</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE__VIVIENDA = 0;

	/**
	 * The feature id for the '<em><b>Id inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE__ID_INMUEBLE = 1;

	/**
	 * The feature id for the '<em><b>Descripcion inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE__DESCRIPCION_INMUEBLE = 2;

	/**
	 * The feature id for the '<em><b>Direccion inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE__DIRECCION_INMUEBLE = 3;

	/**
	 * The feature id for the '<em><b>Superficie terreno inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE__SUPERFICIE_TERRENO_INMUEBLE = 4;

	/**
	 * The feature id for the '<em><b>Superficie inmueble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE__SUPERFICIE_INMUEBLE = 5;

	/**
	 * The number of structural features of the '<em>Inmueble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Inmueble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INMUEBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Certificado <em>Certificado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Certificado
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getCertificado()
	 * @generated
	 */
	int CERTIFICADO = 6;

	/**
	 * The feature id for the '<em><b>Id certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__ID_CERTIFICADO = 0;

	/**
	 * The feature id for the '<em><b>Descripcion certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__DESCRIPCION_CERTIFICADO = 1;

	/**
	 * The feature id for the '<em><b>Id cliente certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__ID_CLIENTE_CERTIFICADO = 2;

	/**
	 * The feature id for the '<em><b>Id vivienda certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__ID_VIVIENDA_CERTIFICADO = 3;

	/**
	 * The feature id for the '<em><b>Id inmueble certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__ID_INMUEBLE_CERTIFICADO = 4;

	/**
	 * The feature id for the '<em><b>Tipo certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__TIPO_CERTIFICADO = 5;

	/**
	 * The feature id for the '<em><b>Fecha solicitud certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__FECHA_SOLICITUD_CERTIFICADO = 6;

	/**
	 * The feature id for the '<em><b>Fecha entrega certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__FECHA_ENTREGA_CERTIFICADO = 7;

	/**
	 * The feature id for the '<em><b>Fecha visita certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__FECHA_VISITA_CERTIFICADO = 8;

	/**
	 * The feature id for the '<em><b>Fecha emision certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__FECHA_EMISION_CERTIFICADO = 9;

	/**
	 * The feature id for the '<em><b>Categoria certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__CATEGORIA_CERTIFICADO = 10;

	/**
	 * The feature id for the '<em><b>Id arquitecto certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__ID_ARQUITECTO_CERTIFICADO = 11;

	/**
	 * The feature id for the '<em><b>Coste certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__COSTE_CERTIFICADO = 12;

	/**
	 * The feature id for the '<em><b>Inmueble</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__INMUEBLE = 13;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__USUARIO = 14;

	/**
	 * The feature id for the '<em><b>Vivienda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO__VIVIENDA = 15;

	/**
	 * The number of structural features of the '<em>Certificado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Certificado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.HSQLDB <em>HSQLDB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.HSQLDB
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getHSQLDB()
	 * @generated
	 */
	int HSQLDB = 7;

	/**
	 * The number of structural features of the '<em>HSQLDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Crear Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Editar Usuario 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_USUARIO_1__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Baja Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___BAJA_USUARIO__INT = 2;

	/**
	 * The operation id for the '<em>Crear Permiso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Editar Permiso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Buscar Permiso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___BUSCAR_PERMISO__INT = 5;

	/**
	 * The operation id for the '<em>Crear Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___CREAR_CERTIFICADO__STRING_CERTIFICADO_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Editar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = 7;

	/**
	 * The operation id for the '<em>Buscar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___BUSCAR_CERTIFICADO__INT = 8;

	/**
	 * The operation id for the '<em>Crear Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___CREAR_PROYECTO__STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = 9;

	/**
	 * The operation id for the '<em>Editar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_PROYECTO__INT_STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = 10;

	/**
	 * The operation id for the '<em>Buscar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___BUSCAR_PROYECTO__INT = 11;

	/**
	 * The operation id for the '<em>Crear Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = 12;

	/**
	 * The operation id for the '<em>Editar Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = 13;

	/**
	 * The operation id for the '<em>Buscar Vivienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___BUSCAR_VIVIENDA__INT = 14;

	/**
	 * The operation id for the '<em>Crear Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE = 15;

	/**
	 * The operation id for the '<em>Editar Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE = 16;

	/**
	 * The operation id for the '<em>Buscar Inmueble</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___BUSCAR_INMUEBLE__INT = 17;

	/**
	 * The operation id for the '<em>Asignar Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___ASIGNAR_CERTIFICADO__INT_INT = 18;

	/**
	 * The operation id for the '<em>Editar Asignacion Certificado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT = 19;

	/**
	 * The operation id for the '<em>Asignar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___ASIGNAR_PROYECTO__INT_INT = 20;

	/**
	 * The operation id for the '<em>Editar Asignacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT = 21;

	/**
	 * The operation id for the '<em>Contratar Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___CONTRATAR_PROYECTO__INT_DATE_INT_DATE = 22;

	/**
	 * The operation id for the '<em>Editar Contratacion Proyecto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE = 23;

	/**
	 * The operation id for the '<em>Query Crear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___QUERY_CREAR__STRING_LISTSTRING_LISTSTRING = 24;

	/**
	 * The operation id for the '<em>Query Editar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___QUERY_EDITAR__STRING_LISTSTRING_LISTSTRING_STRING = 25;

	/**
	 * The operation id for the '<em>Query Buscar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___QUERY_BUSCAR__STRING_LISTSTRING_STRING = 26;

	/**
	 * The operation id for the '<em>Query Ejecutar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB___QUERY_EJECUTAR__STRING = 27;

	/**
	 * The number of operations of the '<em>HSQLDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSQLDB_OPERATION_COUNT = 28;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Proyectos_Asignados <em>Proyectos Asignados</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Proyectos_Asignados
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getProyectos_Asignados()
	 * @generated
	 */
	int PROYECTOS_ASIGNADOS = 8;

	/**
	 * The feature id for the '<em><b>Id proyecto asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_ASIGNADOS__ID_PROYECTO_ASIGNADO = 0;

	/**
	 * The feature id for the '<em><b>Id proyecto proyecto asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_ASIGNADOS__ID_PROYECTO_PROYECTO_ASIGNADO = 1;

	/**
	 * The feature id for the '<em><b>Id arquitecto proyecto asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_ASIGNADOS__ID_ARQUITECTO_PROYECTO_ASIGNADO = 2;

	/**
	 * The feature id for the '<em><b>Proyecto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_ASIGNADOS__PROYECTO = 3;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_ASIGNADOS__USUARIO = 4;

	/**
	 * The number of structural features of the '<em>Proyectos Asignados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_ASIGNADOS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Proyectos Asignados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_ASIGNADOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Certificados_Asignados <em>Certificados Asignados</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Certificados_Asignados
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getCertificados_Asignados()
	 * @generated
	 */
	int CERTIFICADOS_ASIGNADOS = 9;

	/**
	 * The feature id for the '<em><b>Id proyecto asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__ID_PROYECTO_ASIGNADO = 0;

	/**
	 * The feature id for the '<em><b>Id proyecto proyecto asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__ID_PROYECTO_PROYECTO_ASIGNADO = 1;

	/**
	 * The feature id for the '<em><b>Id arquitecto proyecto asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__ID_ARQUITECTO_PROYECTO_ASIGNADO = 2;

	/**
	 * The feature id for the '<em><b>Id certificado asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__ID_CERTIFICADO_ASIGNADO = 3;

	/**
	 * The feature id for the '<em><b>Id certificado certificado asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__ID_CERTIFICADO_CERTIFICADO_ASIGNADO = 4;

	/**
	 * The feature id for the '<em><b>Id arquitecto certificado asignado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__ID_ARQUITECTO_CERTIFICADO_ASIGNADO = 5;

	/**
	 * The feature id for the '<em><b>Certificado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__CERTIFICADO = 6;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS__USUARIO = 7;

	/**
	 * The number of structural features of the '<em>Certificados Asignados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Certificados Asignados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICADOS_ASIGNADOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion <em>Proyectos En Ejecucion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getProyectos_En_Ejecucion()
	 * @generated
	 */
	int PROYECTOS_EN_EJECUCION = 10;

	/**
	 * The feature id for the '<em><b>Id ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION__ID_EJECUCION_PROYECTO = 0;

	/**
	 * The feature id for the '<em><b>Id proyecto ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION__ID_PROYECTO_EJECUCION_PROYECTO = 1;

	/**
	 * The feature id for the '<em><b>Fecha inicio ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION__FECHA_INICIO_EJECUCION_PROYECTO = 2;

	/**
	 * The feature id for the '<em><b>Duracion prevista ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION__DURACION_PREVISTA_EJECUCION_PROYECTO = 3;

	/**
	 * The feature id for the '<em><b>Fecha fin ejecucion proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION__FECHA_FIN_EJECUCION_PROYECTO = 4;

	/**
	 * The feature id for the '<em><b>Proyecto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION__PROYECTO = 5;

	/**
	 * The number of structural features of the '<em>Proyectos En Ejecucion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Proyectos En Ejecucion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTOS_EN_EJECUCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.impl.FactoryImpl
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 11;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Crear Objeto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY___CREAR_OBJETO = 0;

	/**
	 * The operation id for the '<em>Crear Objeto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY___CREAR_OBJETO__STRING = 1;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.impl.ConcreteFactoryImpl <em>Concrete Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.impl.ConcreteFactoryImpl
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getConcreteFactory()
	 * @generated
	 */
	int CONCRETE_FACTORY = 12;

	/**
	 * The number of structural features of the '<em>Concrete Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_FACTORY_FEATURE_COUNT = FACTORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Crear Objeto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_FACTORY___CREAR_OBJETO = FACTORY___CREAR_OBJETO;

	/**
	 * The operation id for the '<em>Crear Objeto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_FACTORY___CREAR_OBJETO__STRING = FACTORY___CREAR_OBJETO__STRING;

	/**
	 * The number of operations of the '<em>Concrete Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_FACTORY_OPERATION_COUNT = FACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Tipo_Proyecto <em>Tipo Proyecto</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Tipo_Proyecto
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getTipo_Proyecto()
	 * @generated
	 */
	int TIPO_PROYECTO = 13;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Tipo_Certificado <em>Tipo Certificado</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Tipo_Certificado
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getTipo_Certificado()
	 * @generated
	 */
	int TIPO_CERTIFICADO = 14;

	/**
	 * The meta object id for the '{@link ArkiWeb.modelo.Categoria_Certificado <em>Categoria Certificado</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArkiWeb.modelo.Categoria_Certificado
	 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getCategoria_Certificado()
	 * @generated
	 */
	int CATEGORIA_CERTIFICADO = 15;


	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Permiso <em>Permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permiso</em>'.
	 * @see ArkiWeb.modelo.Permiso
	 * @generated
	 */
	EClass getPermiso();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Permiso#getId_permiso <em>Id permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id permiso</em>'.
	 * @see ArkiWeb.modelo.Permiso#getId_permiso()
	 * @see #getPermiso()
	 * @generated
	 */
	EAttribute getPermiso_Id_permiso();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Permiso#getId_rol <em>Id rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id rol</em>'.
	 * @see ArkiWeb.modelo.Permiso#getId_rol()
	 * @see #getPermiso()
	 * @generated
	 */
	EAttribute getPermiso_Id_rol();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Permiso#getObjeto_permiso <em>Objeto permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objeto permiso</em>'.
	 * @see ArkiWeb.modelo.Permiso#getObjeto_permiso()
	 * @see #getPermiso()
	 * @generated
	 */
	EAttribute getPermiso_Objeto_permiso();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Permiso#isLectura_permiso <em>Lectura permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lectura permiso</em>'.
	 * @see ArkiWeb.modelo.Permiso#isLectura_permiso()
	 * @see #getPermiso()
	 * @generated
	 */
	EAttribute getPermiso_Lectura_permiso();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Permiso#isEscritura_permiso <em>Escritura permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escritura permiso</em>'.
	 * @see ArkiWeb.modelo.Permiso#isEscritura_permiso()
	 * @see #getPermiso()
	 * @generated
	 */
	EAttribute getPermiso_Escritura_permiso();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Permiso#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rol</em>'.
	 * @see ArkiWeb.modelo.Permiso#getRol()
	 * @see #getPermiso()
	 * @generated
	 */
	EReference getPermiso_Rol();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see ArkiWeb.modelo.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Rol#getId_rol <em>Id rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id rol</em>'.
	 * @see ArkiWeb.modelo.Rol#getId_rol()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_Id_rol();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Rol#getDescripcion_rol <em>Descripcion rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion rol</em>'.
	 * @see ArkiWeb.modelo.Rol#getDescripcion_rol()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_Descripcion_rol();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getId_usuario <em>Id usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getId_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Id_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getNombre_usuario <em>Nombre usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getNombre_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nombre_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getApellidos_usuario <em>Apellidos usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellidos usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getApellidos_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Apellidos_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getDni_usuario <em>Dni usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dni usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getDni_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Dni_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getTelefono_usuario <em>Telefono usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getTelefono_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Telefono_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getEmail_usuario <em>Email usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getEmail_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getDomicilio_usuario <em>Domicilio usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domicilio usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getDomicilio_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Domicilio_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getContrasenya_usuario <em>Contrasenya usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrasenya usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getContrasenya_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Contrasenya_usuario();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Usuario#getRol_usuario <em>Rol usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol usuario</em>'.
	 * @see ArkiWeb.modelo.Usuario#getRol_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Rol_usuario();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Usuario#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rol</em>'.
	 * @see ArkiWeb.modelo.Usuario#getRol()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Rol();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Proyecto <em>Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto
	 * @generated
	 */
	EClass getProyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getId_proyecto <em>Id proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getId_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Id_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getDescripcion_proyecto <em>Descripcion proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getDescripcion_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Descripcion_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getId_cliente_proyecto <em>Id cliente proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id cliente proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getId_cliente_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Id_cliente_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getId_vivienda_proyecto <em>Id vivienda proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id vivienda proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getId_vivienda_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Id_vivienda_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getId_inmueble_proyecto <em>Id inmueble proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id inmueble proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getId_inmueble_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Id_inmueble_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getTipo_proyecto <em>Tipo proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getTipo_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Tipo_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getFecha_solicitud_proyecto <em>Fecha solicitud proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha solicitud proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getFecha_solicitud_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Fecha_solicitud_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getFecha_entrega_proyecto <em>Fecha entrega proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha entrega proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getFecha_entrega_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Fecha_entrega_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getDuracion_prevista_proyecto <em>Duracion prevista proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duracion prevista proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getDuracion_prevista_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Duracion_prevista_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyecto#getPresupuesto_ejecucion_proyecto <em>Presupuesto ejecucion proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presupuesto ejecucion proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getPresupuesto_ejecucion_proyecto()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Presupuesto_ejecucion_proyecto();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Proyecto#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getUsuario()
	 * @see #getProyecto()
	 * @generated
	 */
	EReference getProyecto_Usuario();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Proyecto#getVivienda <em>Vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vivienda</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getVivienda()
	 * @see #getProyecto()
	 * @generated
	 */
	EReference getProyecto_Vivienda();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Proyecto#getInmueble <em>Inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inmueble</em>'.
	 * @see ArkiWeb.modelo.Proyecto#getInmueble()
	 * @see #getProyecto()
	 * @generated
	 */
	EReference getProyecto_Inmueble();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Vivienda <em>Vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda
	 * @generated
	 */
	EClass getVivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getId_vivienda <em>Id vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getId_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Id_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getDescripcion_vivienda <em>Descripcion vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getDescripcion_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Descripcion_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getDireccion_vivienda <em>Direccion vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getDireccion_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Direccion_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getId_inmueble_vivienda <em>Id inmueble vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id inmueble vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getId_inmueble_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Id_inmueble_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getSuperficie_terreno_vivienda <em>Superficie terreno vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superficie terreno vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getSuperficie_terreno_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Superficie_terreno_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getSuperficie_vivienda <em>Superficie vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superficie vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getSuperficie_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Superficie_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getPlantas_vivienda <em>Plantas vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plantas vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getPlantas_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Plantas_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getHabitaciones_vivienda <em>Habitaciones vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Habitaciones vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getHabitaciones_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Habitaciones_vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Vivienda#getBanyos_vivienda <em>Banyos vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Banyos vivienda</em>'.
	 * @see ArkiWeb.modelo.Vivienda#getBanyos_vivienda()
	 * @see #getVivienda()
	 * @generated
	 */
	EAttribute getVivienda_Banyos_vivienda();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Inmueble <em>Inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inmueble</em>'.
	 * @see ArkiWeb.modelo.Inmueble
	 * @generated
	 */
	EClass getInmueble();

	/**
	 * Returns the meta object for the containment reference list '{@link ArkiWeb.modelo.Inmueble#getVivienda <em>Vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vivienda</em>'.
	 * @see ArkiWeb.modelo.Inmueble#getVivienda()
	 * @see #getInmueble()
	 * @generated
	 */
	EReference getInmueble_Vivienda();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Inmueble#getId_inmueble <em>Id inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id inmueble</em>'.
	 * @see ArkiWeb.modelo.Inmueble#getId_inmueble()
	 * @see #getInmueble()
	 * @generated
	 */
	EAttribute getInmueble_Id_inmueble();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Inmueble#getDescripcion_inmueble <em>Descripcion inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion inmueble</em>'.
	 * @see ArkiWeb.modelo.Inmueble#getDescripcion_inmueble()
	 * @see #getInmueble()
	 * @generated
	 */
	EAttribute getInmueble_Descripcion_inmueble();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Inmueble#getDireccion_inmueble <em>Direccion inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion inmueble</em>'.
	 * @see ArkiWeb.modelo.Inmueble#getDireccion_inmueble()
	 * @see #getInmueble()
	 * @generated
	 */
	EAttribute getInmueble_Direccion_inmueble();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Inmueble#getSuperficie_terreno_inmueble <em>Superficie terreno inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superficie terreno inmueble</em>'.
	 * @see ArkiWeb.modelo.Inmueble#getSuperficie_terreno_inmueble()
	 * @see #getInmueble()
	 * @generated
	 */
	EAttribute getInmueble_Superficie_terreno_inmueble();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Inmueble#getSuperficie_inmueble <em>Superficie inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superficie inmueble</em>'.
	 * @see ArkiWeb.modelo.Inmueble#getSuperficie_inmueble()
	 * @see #getInmueble()
	 * @generated
	 */
	EAttribute getInmueble_Superficie_inmueble();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Certificado <em>Certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado
	 * @generated
	 */
	EClass getCertificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getId_certificado <em>Id certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getId_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Id_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getDescripcion_certificado <em>Descripcion certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getDescripcion_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Descripcion_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getId_cliente_certificado <em>Id cliente certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id cliente certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getId_cliente_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Id_cliente_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getId_vivienda_certificado <em>Id vivienda certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id vivienda certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getId_vivienda_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Id_vivienda_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getId_inmueble_certificado <em>Id inmueble certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id inmueble certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getId_inmueble_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Id_inmueble_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getTipo_certificado <em>Tipo certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getTipo_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Tipo_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getFecha_solicitud_certificado <em>Fecha solicitud certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha solicitud certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getFecha_solicitud_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Fecha_solicitud_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getFecha_entrega_certificado <em>Fecha entrega certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha entrega certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getFecha_entrega_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Fecha_entrega_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getFecha_visita_certificado <em>Fecha visita certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha visita certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getFecha_visita_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Fecha_visita_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getFecha_emision_certificado <em>Fecha emision certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha emision certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getFecha_emision_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Fecha_emision_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getCategoria_certificado <em>Categoria certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categoria certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getCategoria_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Categoria_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getId_arquitecto_certificado <em>Id arquitecto certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id arquitecto certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getId_arquitecto_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Id_arquitecto_certificado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificado#getCoste_certificado <em>Coste certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coste certificado</em>'.
	 * @see ArkiWeb.modelo.Certificado#getCoste_certificado()
	 * @see #getCertificado()
	 * @generated
	 */
	EAttribute getCertificado_Coste_certificado();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Certificado#getInmueble <em>Inmueble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inmueble</em>'.
	 * @see ArkiWeb.modelo.Certificado#getInmueble()
	 * @see #getCertificado()
	 * @generated
	 */
	EReference getCertificado_Inmueble();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Certificado#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see ArkiWeb.modelo.Certificado#getUsuario()
	 * @see #getCertificado()
	 * @generated
	 */
	EReference getCertificado_Usuario();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Certificado#getVivienda <em>Vivienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vivienda</em>'.
	 * @see ArkiWeb.modelo.Certificado#getVivienda()
	 * @see #getCertificado()
	 * @generated
	 */
	EReference getCertificado_Vivienda();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.HSQLDB <em>HSQLDB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSQLDB</em>'.
	 * @see ArkiWeb.modelo.HSQLDB
	 * @generated
	 */
	EClass getHSQLDB();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#crearUsuario(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String) <em>Crear Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Usuario</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#crearUsuario(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getHSQLDB__CrearUsuario__String_String_String_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarUsuario_1(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String) <em>Editar Usuario 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Usuario 1</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarUsuario_1(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getHSQLDB__EditarUsuario_1__int_String_String_String_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#bajaUsuario(int) <em>Baja Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Baja Usuario</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#bajaUsuario(int)
	 * @generated
	 */
	EOperation getHSQLDB__BajaUsuario__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#crearPermiso(java.lang.String, java.lang.String, boolean, boolean) <em>Crear Permiso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Permiso</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#crearPermiso(java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getHSQLDB__CrearPermiso__String_String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarPermiso(int, java.lang.String, java.lang.String, boolean, boolean) <em>Editar Permiso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Permiso</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarPermiso(int, java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getHSQLDB__EditarPermiso__int_String_String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#buscarPermiso(int) <em>Buscar Permiso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Permiso</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#buscarPermiso(int)
	 * @generated
	 */
	EOperation getHSQLDB__BuscarPermiso__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#crearCertificado(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double) <em>Crear Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Certificado</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#crearCertificado(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double)
	 * @generated
	 */
	EOperation getHSQLDB__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarCertificado(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double) <em>Editar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Certificado</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarCertificado(int, java.lang.String, int, int, int, ArkiWeb.modelo.Tipo_Certificado, java.util.Date, java.util.Date, java.util.Date, java.util.Date, ArkiWeb.modelo.Categoria_Certificado, int, double)
	 * @generated
	 */
	EOperation getHSQLDB__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#buscarCertificado(int) <em>Buscar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Certificado</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#buscarCertificado(int)
	 * @generated
	 */
	EOperation getHSQLDB__BuscarCertificado__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#crearProyecto(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double) <em>Crear Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Proyecto</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#crearProyecto(java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double)
	 * @generated
	 */
	EOperation getHSQLDB__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarProyecto(int, java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double) <em>Editar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Proyecto</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarProyecto(int, java.lang.String, ArkiWeb.modelo.Certificado, int, int, ArkiWeb.modelo.Tipo_Proyecto, java.util.Date, java.util.Date, int, double, double, int, double)
	 * @generated
	 */
	EOperation getHSQLDB__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#buscarProyecto(int) <em>Buscar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Proyecto</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#buscarProyecto(int)
	 * @generated
	 */
	EOperation getHSQLDB__BuscarProyecto__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#crearVivienda(java.lang.String, java.lang.String, int, double, double, int, int, int) <em>Crear Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Vivienda</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#crearVivienda(java.lang.String, java.lang.String, int, double, double, int, int, int)
	 * @generated
	 */
	EOperation getHSQLDB__CrearVivienda__String_String_int_double_double_int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarVivienda(int, java.lang.String, java.lang.String, int, double, double, int, int, int) <em>Editar Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Vivienda</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarVivienda(int, java.lang.String, java.lang.String, int, double, double, int, int, int)
	 * @generated
	 */
	EOperation getHSQLDB__EditarVivienda__int_String_String_int_double_double_int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#buscarVivienda(int) <em>Buscar Vivienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Vivienda</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#buscarVivienda(int)
	 * @generated
	 */
	EOperation getHSQLDB__BuscarVivienda__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#crearInmueble(java.lang.String, java.lang.String, double, double) <em>Crear Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Inmueble</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#crearInmueble(java.lang.String, java.lang.String, double, double)
	 * @generated
	 */
	EOperation getHSQLDB__CrearInmueble__String_String_double_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarInmueble(int, java.lang.String, java.lang.String, double, double) <em>Editar Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Inmueble</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarInmueble(int, java.lang.String, java.lang.String, double, double)
	 * @generated
	 */
	EOperation getHSQLDB__EditarInmueble__int_String_String_double_double();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#buscarInmueble(int) <em>Buscar Inmueble</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Inmueble</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#buscarInmueble(int)
	 * @generated
	 */
	EOperation getHSQLDB__BuscarInmueble__int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#asignarCertificado(int, int) <em>Asignar Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Asignar Certificado</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#asignarCertificado(int, int)
	 * @generated
	 */
	EOperation getHSQLDB__AsignarCertificado__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarAsignacionCertificado(int, int, int) <em>Editar Asignacion Certificado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Asignacion Certificado</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarAsignacionCertificado(int, int, int)
	 * @generated
	 */
	EOperation getHSQLDB__EditarAsignacionCertificado__int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#asignarProyecto(int, int) <em>Asignar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Asignar Proyecto</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#asignarProyecto(int, int)
	 * @generated
	 */
	EOperation getHSQLDB__AsignarProyecto__int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarAsignacionProyecto(int, int, int) <em>Editar Asignacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Asignacion Proyecto</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarAsignacionProyecto(int, int, int)
	 * @generated
	 */
	EOperation getHSQLDB__EditarAsignacionProyecto__int_int_int();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#contratarProyecto(int, java.util.Date, int, java.util.Date) <em>Contratar Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contratar Proyecto</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#contratarProyecto(int, java.util.Date, int, java.util.Date)
	 * @generated
	 */
	EOperation getHSQLDB__ContratarProyecto__int_Date_int_Date();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#editarContratacionProyecto(int, int, java.util.Date, int, java.util.Date) <em>Editar Contratacion Proyecto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editar Contratacion Proyecto</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#editarContratacionProyecto(int, int, java.util.Date, int, java.util.Date)
	 * @generated
	 */
	EOperation getHSQLDB__EditarContratacionProyecto__int_int_Date_int_Date();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#queryCrear(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString) <em>Query Crear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Crear</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#queryCrear(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString)
	 * @generated
	 */
	EOperation getHSQLDB__QueryCrear__String_ListString_ListString();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#queryEditar(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString, java.lang.String) <em>Query Editar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Editar</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#queryEditar(java.lang.String, ArkiWeb.ListString, ArkiWeb.ListString, java.lang.String)
	 * @generated
	 */
	EOperation getHSQLDB__QueryEditar__String_ListString_ListString_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#queryBuscar(java.lang.String, ArkiWeb.ListString, java.lang.String) <em>Query Buscar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Buscar</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#queryBuscar(java.lang.String, ArkiWeb.ListString, java.lang.String)
	 * @generated
	 */
	EOperation getHSQLDB__QueryBuscar__String_ListString_String();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.HSQLDB#queryEjecutar(java.lang.String) <em>Query Ejecutar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Ejecutar</em>' operation.
	 * @see ArkiWeb.modelo.HSQLDB#queryEjecutar(java.lang.String)
	 * @generated
	 */
	EOperation getHSQLDB__QueryEjecutar__String();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Proyectos_Asignados <em>Proyectos Asignados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proyectos Asignados</em>'.
	 * @see ArkiWeb.modelo.Proyectos_Asignados
	 * @generated
	 */
	EClass getProyectos_Asignados();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_asignado <em>Id proyecto asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id proyecto asignado</em>'.
	 * @see ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_asignado()
	 * @see #getProyectos_Asignados()
	 * @generated
	 */
	EAttribute getProyectos_Asignados_Id_proyecto_asignado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_proyecto_asignado <em>Id proyecto proyecto asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id proyecto proyecto asignado</em>'.
	 * @see ArkiWeb.modelo.Proyectos_Asignados#getId_proyecto_proyecto_asignado()
	 * @see #getProyectos_Asignados()
	 * @generated
	 */
	EAttribute getProyectos_Asignados_Id_proyecto_proyecto_asignado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_Asignados#getId_arquitecto_proyecto_asignado <em>Id arquitecto proyecto asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id arquitecto proyecto asignado</em>'.
	 * @see ArkiWeb.modelo.Proyectos_Asignados#getId_arquitecto_proyecto_asignado()
	 * @see #getProyectos_Asignados()
	 * @generated
	 */
	EAttribute getProyectos_Asignados_Id_arquitecto_proyecto_asignado();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Proyectos_Asignados#getProyecto <em>Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyectos_Asignados#getProyecto()
	 * @see #getProyectos_Asignados()
	 * @generated
	 */
	EReference getProyectos_Asignados_Proyecto();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Proyectos_Asignados#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see ArkiWeb.modelo.Proyectos_Asignados#getUsuario()
	 * @see #getProyectos_Asignados()
	 * @generated
	 */
	EReference getProyectos_Asignados_Usuario();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Certificados_Asignados <em>Certificados Asignados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificados Asignados</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados
	 * @generated
	 */
	EClass getCertificados_Asignados();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificados_Asignados#getId_proyecto_asignado <em>Id proyecto asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id proyecto asignado</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getId_proyecto_asignado()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EAttribute getCertificados_Asignados_Id_proyecto_asignado();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Certificados_Asignados#getId_proyecto_proyecto_asignado <em>Id proyecto proyecto asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id proyecto proyecto asignado</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getId_proyecto_proyecto_asignado()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EReference getCertificados_Asignados_Id_proyecto_proyecto_asignado();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Certificados_Asignados#getId_arquitecto_proyecto_asignado <em>Id arquitecto proyecto asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id arquitecto proyecto asignado</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getId_arquitecto_proyecto_asignado()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EReference getCertificados_Asignados_Id_arquitecto_proyecto_asignado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificados_Asignados#getId_certificado_asignado <em>Id certificado asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id certificado asignado</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getId_certificado_asignado()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EAttribute getCertificados_Asignados_Id_certificado_asignado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificados_Asignados#getId_certificado_certificado_asignado <em>Id certificado certificado asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id certificado certificado asignado</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getId_certificado_certificado_asignado()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EAttribute getCertificados_Asignados_Id_certificado_certificado_asignado();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Certificados_Asignados#getId_arquitecto_certificado_asignado <em>Id arquitecto certificado asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id arquitecto certificado asignado</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getId_arquitecto_certificado_asignado()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EAttribute getCertificados_Asignados_Id_arquitecto_certificado_asignado();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Certificados_Asignados#getCertificado <em>Certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Certificado</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getCertificado()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EReference getCertificados_Asignados_Certificado();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Certificados_Asignados#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see ArkiWeb.modelo.Certificados_Asignados#getUsuario()
	 * @see #getCertificados_Asignados()
	 * @generated
	 */
	EReference getCertificados_Asignados_Usuario();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion <em>Proyectos En Ejecucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proyectos En Ejecucion</em>'.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion
	 * @generated
	 */
	EClass getProyectos_En_Ejecucion();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_ejecucion_proyecto <em>Id ejecucion proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id ejecucion proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_ejecucion_proyecto()
	 * @see #getProyectos_En_Ejecucion()
	 * @generated
	 */
	EAttribute getProyectos_En_Ejecucion_Id_ejecucion_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_proyecto_ejecucion_proyecto <em>Id proyecto ejecucion proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id proyecto ejecucion proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion#getId_proyecto_ejecucion_proyecto()
	 * @see #getProyectos_En_Ejecucion()
	 * @generated
	 */
	EAttribute getProyectos_En_Ejecucion_Id_proyecto_ejecucion_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_inicio_ejecucion_proyecto <em>Fecha inicio ejecucion proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha inicio ejecucion proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_inicio_ejecucion_proyecto()
	 * @see #getProyectos_En_Ejecucion()
	 * @generated
	 */
	EAttribute getProyectos_En_Ejecucion_Fecha_inicio_ejecucion_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getDuracion_prevista_ejecucion_proyecto <em>Duracion prevista ejecucion proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duracion prevista ejecucion proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion#getDuracion_prevista_ejecucion_proyecto()
	 * @see #getProyectos_En_Ejecucion()
	 * @generated
	 */
	EAttribute getProyectos_En_Ejecucion_Duracion_prevista_ejecucion_proyecto();

	/**
	 * Returns the meta object for the attribute '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_fin_ejecucion_proyecto <em>Fecha fin ejecucion proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha fin ejecucion proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion#getFecha_fin_ejecucion_proyecto()
	 * @see #getProyectos_En_Ejecucion()
	 * @generated
	 */
	EAttribute getProyectos_En_Ejecucion_Fecha_fin_ejecucion_proyecto();

	/**
	 * Returns the meta object for the reference '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion#getProyecto <em>Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proyecto</em>'.
	 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion#getProyecto()
	 * @see #getProyectos_En_Ejecucion()
	 * @generated
	 */
	EReference getProyectos_En_Ejecucion_Proyecto();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see ArkiWeb.modelo.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.Factory#crearObjeto() <em>Crear Objeto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Objeto</em>' operation.
	 * @see ArkiWeb.modelo.Factory#crearObjeto()
	 * @generated
	 */
	EOperation getFactory__CrearObjeto();

	/**
	 * Returns the meta object for the '{@link ArkiWeb.modelo.Factory#crearObjeto(java.lang.String) <em>Crear Objeto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Objeto</em>' operation.
	 * @see ArkiWeb.modelo.Factory#crearObjeto(java.lang.String)
	 * @generated
	 */
	EOperation getFactory__CrearObjeto__String();

	/**
	 * Returns the meta object for class '{@link ArkiWeb.modelo.ConcreteFactory <em>Concrete Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Factory</em>'.
	 * @see ArkiWeb.modelo.ConcreteFactory
	 * @generated
	 */
	EClass getConcreteFactory();

	/**
	 * Returns the meta object for enum '{@link ArkiWeb.modelo.Tipo_Proyecto <em>Tipo Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Proyecto</em>'.
	 * @see ArkiWeb.modelo.Tipo_Proyecto
	 * @generated
	 */
	EEnum getTipo_Proyecto();

	/**
	 * Returns the meta object for enum '{@link ArkiWeb.modelo.Tipo_Certificado <em>Tipo Certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Certificado</em>'.
	 * @see ArkiWeb.modelo.Tipo_Certificado
	 * @generated
	 */
	EEnum getTipo_Certificado();

	/**
	 * Returns the meta object for enum '{@link ArkiWeb.modelo.Categoria_Certificado <em>Categoria Certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categoria Certificado</em>'.
	 * @see ArkiWeb.modelo.Categoria_Certificado
	 * @generated
	 */
	EEnum getCategoria_Certificado();

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
		 * The meta object literal for the '{@link ArkiWeb.modelo.Permiso <em>Permiso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Permiso
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getPermiso()
		 * @generated
		 */
		EClass PERMISO = eINSTANCE.getPermiso();

		/**
		 * The meta object literal for the '<em><b>Id permiso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISO__ID_PERMISO = eINSTANCE.getPermiso_Id_permiso();

		/**
		 * The meta object literal for the '<em><b>Id rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISO__ID_ROL = eINSTANCE.getPermiso_Id_rol();

		/**
		 * The meta object literal for the '<em><b>Objeto permiso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISO__OBJETO_PERMISO = eINSTANCE.getPermiso_Objeto_permiso();

		/**
		 * The meta object literal for the '<em><b>Lectura permiso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISO__LECTURA_PERMISO = eINSTANCE.getPermiso_Lectura_permiso();

		/**
		 * The meta object literal for the '<em><b>Escritura permiso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISO__ESCRITURA_PERMISO = eINSTANCE.getPermiso_Escritura_permiso();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISO__ROL = eINSTANCE.getPermiso_Rol();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Rol <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Rol
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Id rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__ID_ROL = eINSTANCE.getRol_Id_rol();

		/**
		 * The meta object literal for the '<em><b>Descripcion rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__DESCRIPCION_ROL = eINSTANCE.getRol_Descripcion_rol();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Usuario <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Usuario
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Id usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ID_USUARIO = eINSTANCE.getUsuario_Id_usuario();

		/**
		 * The meta object literal for the '<em><b>Nombre usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOMBRE_USUARIO = eINSTANCE.getUsuario_Nombre_usuario();

		/**
		 * The meta object literal for the '<em><b>Apellidos usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__APELLIDOS_USUARIO = eINSTANCE.getUsuario_Apellidos_usuario();

		/**
		 * The meta object literal for the '<em><b>Dni usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__DNI_USUARIO = eINSTANCE.getUsuario_Dni_usuario();

		/**
		 * The meta object literal for the '<em><b>Telefono usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TELEFONO_USUARIO = eINSTANCE.getUsuario_Telefono_usuario();

		/**
		 * The meta object literal for the '<em><b>Email usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL_USUARIO = eINSTANCE.getUsuario_Email_usuario();

		/**
		 * The meta object literal for the '<em><b>Domicilio usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__DOMICILIO_USUARIO = eINSTANCE.getUsuario_Domicilio_usuario();

		/**
		 * The meta object literal for the '<em><b>Contrasenya usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CONTRASENYA_USUARIO = eINSTANCE.getUsuario_Contrasenya_usuario();

		/**
		 * The meta object literal for the '<em><b>Rol usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ROL_USUARIO = eINSTANCE.getUsuario_Rol_usuario();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__ROL = eINSTANCE.getUsuario_Rol();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Proyecto <em>Proyecto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Proyecto
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getProyecto()
		 * @generated
		 */
		EClass PROYECTO = eINSTANCE.getProyecto();

		/**
		 * The meta object literal for the '<em><b>Id proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__ID_PROYECTO = eINSTANCE.getProyecto_Id_proyecto();

		/**
		 * The meta object literal for the '<em><b>Descripcion proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__DESCRIPCION_PROYECTO = eINSTANCE.getProyecto_Descripcion_proyecto();

		/**
		 * The meta object literal for the '<em><b>Id cliente proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__ID_CLIENTE_PROYECTO = eINSTANCE.getProyecto_Id_cliente_proyecto();

		/**
		 * The meta object literal for the '<em><b>Id vivienda proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__ID_VIVIENDA_PROYECTO = eINSTANCE.getProyecto_Id_vivienda_proyecto();

		/**
		 * The meta object literal for the '<em><b>Id inmueble proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__ID_INMUEBLE_PROYECTO = eINSTANCE.getProyecto_Id_inmueble_proyecto();

		/**
		 * The meta object literal for the '<em><b>Tipo proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__TIPO_PROYECTO = eINSTANCE.getProyecto_Tipo_proyecto();

		/**
		 * The meta object literal for the '<em><b>Fecha solicitud proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__FECHA_SOLICITUD_PROYECTO = eINSTANCE.getProyecto_Fecha_solicitud_proyecto();

		/**
		 * The meta object literal for the '<em><b>Fecha entrega proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__FECHA_ENTREGA_PROYECTO = eINSTANCE.getProyecto_Fecha_entrega_proyecto();

		/**
		 * The meta object literal for the '<em><b>Duracion prevista proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__DURACION_PREVISTA_PROYECTO = eINSTANCE.getProyecto_Duracion_prevista_proyecto();

		/**
		 * The meta object literal for the '<em><b>Presupuesto ejecucion proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__PRESUPUESTO_EJECUCION_PROYECTO = eINSTANCE.getProyecto_Presupuesto_ejecucion_proyecto();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROYECTO__USUARIO = eINSTANCE.getProyecto_Usuario();

		/**
		 * The meta object literal for the '<em><b>Vivienda</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROYECTO__VIVIENDA = eINSTANCE.getProyecto_Vivienda();

		/**
		 * The meta object literal for the '<em><b>Inmueble</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROYECTO__INMUEBLE = eINSTANCE.getProyecto_Inmueble();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Vivienda <em>Vivienda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Vivienda
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getVivienda()
		 * @generated
		 */
		EClass VIVIENDA = eINSTANCE.getVivienda();

		/**
		 * The meta object literal for the '<em><b>Id vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__ID_VIVIENDA = eINSTANCE.getVivienda_Id_vivienda();

		/**
		 * The meta object literal for the '<em><b>Descripcion vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__DESCRIPCION_VIVIENDA = eINSTANCE.getVivienda_Descripcion_vivienda();

		/**
		 * The meta object literal for the '<em><b>Direccion vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__DIRECCION_VIVIENDA = eINSTANCE.getVivienda_Direccion_vivienda();

		/**
		 * The meta object literal for the '<em><b>Id inmueble vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__ID_INMUEBLE_VIVIENDA = eINSTANCE.getVivienda_Id_inmueble_vivienda();

		/**
		 * The meta object literal for the '<em><b>Superficie terreno vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__SUPERFICIE_TERRENO_VIVIENDA = eINSTANCE.getVivienda_Superficie_terreno_vivienda();

		/**
		 * The meta object literal for the '<em><b>Superficie vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__SUPERFICIE_VIVIENDA = eINSTANCE.getVivienda_Superficie_vivienda();

		/**
		 * The meta object literal for the '<em><b>Plantas vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__PLANTAS_VIVIENDA = eINSTANCE.getVivienda_Plantas_vivienda();

		/**
		 * The meta object literal for the '<em><b>Habitaciones vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__HABITACIONES_VIVIENDA = eINSTANCE.getVivienda_Habitaciones_vivienda();

		/**
		 * The meta object literal for the '<em><b>Banyos vivienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIVIENDA__BANYOS_VIVIENDA = eINSTANCE.getVivienda_Banyos_vivienda();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Inmueble <em>Inmueble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Inmueble
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getInmueble()
		 * @generated
		 */
		EClass INMUEBLE = eINSTANCE.getInmueble();

		/**
		 * The meta object literal for the '<em><b>Vivienda</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INMUEBLE__VIVIENDA = eINSTANCE.getInmueble_Vivienda();

		/**
		 * The meta object literal for the '<em><b>Id inmueble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INMUEBLE__ID_INMUEBLE = eINSTANCE.getInmueble_Id_inmueble();

		/**
		 * The meta object literal for the '<em><b>Descripcion inmueble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INMUEBLE__DESCRIPCION_INMUEBLE = eINSTANCE.getInmueble_Descripcion_inmueble();

		/**
		 * The meta object literal for the '<em><b>Direccion inmueble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INMUEBLE__DIRECCION_INMUEBLE = eINSTANCE.getInmueble_Direccion_inmueble();

		/**
		 * The meta object literal for the '<em><b>Superficie terreno inmueble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INMUEBLE__SUPERFICIE_TERRENO_INMUEBLE = eINSTANCE.getInmueble_Superficie_terreno_inmueble();

		/**
		 * The meta object literal for the '<em><b>Superficie inmueble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INMUEBLE__SUPERFICIE_INMUEBLE = eINSTANCE.getInmueble_Superficie_inmueble();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Certificado <em>Certificado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Certificado
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getCertificado()
		 * @generated
		 */
		EClass CERTIFICADO = eINSTANCE.getCertificado();

		/**
		 * The meta object literal for the '<em><b>Id certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__ID_CERTIFICADO = eINSTANCE.getCertificado_Id_certificado();

		/**
		 * The meta object literal for the '<em><b>Descripcion certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__DESCRIPCION_CERTIFICADO = eINSTANCE.getCertificado_Descripcion_certificado();

		/**
		 * The meta object literal for the '<em><b>Id cliente certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__ID_CLIENTE_CERTIFICADO = eINSTANCE.getCertificado_Id_cliente_certificado();

		/**
		 * The meta object literal for the '<em><b>Id vivienda certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__ID_VIVIENDA_CERTIFICADO = eINSTANCE.getCertificado_Id_vivienda_certificado();

		/**
		 * The meta object literal for the '<em><b>Id inmueble certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__ID_INMUEBLE_CERTIFICADO = eINSTANCE.getCertificado_Id_inmueble_certificado();

		/**
		 * The meta object literal for the '<em><b>Tipo certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__TIPO_CERTIFICADO = eINSTANCE.getCertificado_Tipo_certificado();

		/**
		 * The meta object literal for the '<em><b>Fecha solicitud certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__FECHA_SOLICITUD_CERTIFICADO = eINSTANCE.getCertificado_Fecha_solicitud_certificado();

		/**
		 * The meta object literal for the '<em><b>Fecha entrega certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__FECHA_ENTREGA_CERTIFICADO = eINSTANCE.getCertificado_Fecha_entrega_certificado();

		/**
		 * The meta object literal for the '<em><b>Fecha visita certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__FECHA_VISITA_CERTIFICADO = eINSTANCE.getCertificado_Fecha_visita_certificado();

		/**
		 * The meta object literal for the '<em><b>Fecha emision certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__FECHA_EMISION_CERTIFICADO = eINSTANCE.getCertificado_Fecha_emision_certificado();

		/**
		 * The meta object literal for the '<em><b>Categoria certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__CATEGORIA_CERTIFICADO = eINSTANCE.getCertificado_Categoria_certificado();

		/**
		 * The meta object literal for the '<em><b>Id arquitecto certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__ID_ARQUITECTO_CERTIFICADO = eINSTANCE.getCertificado_Id_arquitecto_certificado();

		/**
		 * The meta object literal for the '<em><b>Coste certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADO__COSTE_CERTIFICADO = eINSTANCE.getCertificado_Coste_certificado();

		/**
		 * The meta object literal for the '<em><b>Inmueble</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICADO__INMUEBLE = eINSTANCE.getCertificado_Inmueble();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICADO__USUARIO = eINSTANCE.getCertificado_Usuario();

		/**
		 * The meta object literal for the '<em><b>Vivienda</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICADO__VIVIENDA = eINSTANCE.getCertificado_Vivienda();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.HSQLDB <em>HSQLDB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.HSQLDB
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getHSQLDB()
		 * @generated
		 */
		EClass HSQLDB = eINSTANCE.getHSQLDB();

		/**
		 * The meta object literal for the '<em><b>Crear Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___CREAR_USUARIO__STRING_STRING_STRING_INT_STRING_STRING_STRING = eINSTANCE.getHSQLDB__CrearUsuario__String_String_String_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Editar Usuario 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_USUARIO_1__INT_STRING_STRING_STRING_INT_STRING_STRING_STRING = eINSTANCE.getHSQLDB__EditarUsuario_1__int_String_String_String_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Baja Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___BAJA_USUARIO__INT = eINSTANCE.getHSQLDB__BajaUsuario__int();

		/**
		 * The meta object literal for the '<em><b>Crear Permiso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___CREAR_PERMISO__STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getHSQLDB__CrearPermiso__String_String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Editar Permiso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_PERMISO__INT_STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getHSQLDB__EditarPermiso__int_String_String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Buscar Permiso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___BUSCAR_PERMISO__INT = eINSTANCE.getHSQLDB__BuscarPermiso__int();

		/**
		 * The meta object literal for the '<em><b>Crear Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___CREAR_CERTIFICADO__STRING_CERTIFICADO_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = eINSTANCE.getHSQLDB__CrearCertificado__String_Certificado_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

		/**
		 * The meta object literal for the '<em><b>Editar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_CERTIFICADO__INT_STRING_INT_INT_INT_TIPO_CERTIFICADO_DATE_DATE_DATE_DATE_CATEGORIA_CERTIFICADO_INT_DOUBLE = eINSTANCE.getHSQLDB__EditarCertificado__int_String_int_int_int_Tipo_Certificado_Date_Date_Date_Date_Categoria_Certificado_int_double();

		/**
		 * The meta object literal for the '<em><b>Buscar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___BUSCAR_CERTIFICADO__INT = eINSTANCE.getHSQLDB__BuscarCertificado__int();

		/**
		 * The meta object literal for the '<em><b>Crear Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___CREAR_PROYECTO__STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = eINSTANCE.getHSQLDB__CrearProyecto__String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

		/**
		 * The meta object literal for the '<em><b>Editar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_PROYECTO__INT_STRING_CERTIFICADO_INT_INT_TIPO_PROYECTO_DATE_DATE_INT_DOUBLE_DOUBLE_INT_DOUBLE = eINSTANCE.getHSQLDB__EditarProyecto__int_String_Certificado_int_int_Tipo_Proyecto_Date_Date_int_double_double_int_double();

		/**
		 * The meta object literal for the '<em><b>Buscar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___BUSCAR_PROYECTO__INT = eINSTANCE.getHSQLDB__BuscarProyecto__int();

		/**
		 * The meta object literal for the '<em><b>Crear Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___CREAR_VIVIENDA__STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = eINSTANCE.getHSQLDB__CrearVivienda__String_String_int_double_double_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_VIVIENDA__INT_STRING_STRING_INT_DOUBLE_DOUBLE_INT_INT_INT = eINSTANCE.getHSQLDB__EditarVivienda__int_String_String_int_double_double_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Buscar Vivienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___BUSCAR_VIVIENDA__INT = eINSTANCE.getHSQLDB__BuscarVivienda__int();

		/**
		 * The meta object literal for the '<em><b>Crear Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___CREAR_INMUEBLE__STRING_STRING_DOUBLE_DOUBLE = eINSTANCE.getHSQLDB__CrearInmueble__String_String_double_double();

		/**
		 * The meta object literal for the '<em><b>Editar Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_INMUEBLE__INT_STRING_STRING_DOUBLE_DOUBLE = eINSTANCE.getHSQLDB__EditarInmueble__int_String_String_double_double();

		/**
		 * The meta object literal for the '<em><b>Buscar Inmueble</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___BUSCAR_INMUEBLE__INT = eINSTANCE.getHSQLDB__BuscarInmueble__int();

		/**
		 * The meta object literal for the '<em><b>Asignar Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___ASIGNAR_CERTIFICADO__INT_INT = eINSTANCE.getHSQLDB__AsignarCertificado__int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Asignacion Certificado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_ASIGNACION_CERTIFICADO__INT_INT_INT = eINSTANCE.getHSQLDB__EditarAsignacionCertificado__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Asignar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___ASIGNAR_PROYECTO__INT_INT = eINSTANCE.getHSQLDB__AsignarProyecto__int_int();

		/**
		 * The meta object literal for the '<em><b>Editar Asignacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_ASIGNACION_PROYECTO__INT_INT_INT = eINSTANCE.getHSQLDB__EditarAsignacionProyecto__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Contratar Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___CONTRATAR_PROYECTO__INT_DATE_INT_DATE = eINSTANCE.getHSQLDB__ContratarProyecto__int_Date_int_Date();

		/**
		 * The meta object literal for the '<em><b>Editar Contratacion Proyecto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___EDITAR_CONTRATACION_PROYECTO__INT_INT_DATE_INT_DATE = eINSTANCE.getHSQLDB__EditarContratacionProyecto__int_int_Date_int_Date();

		/**
		 * The meta object literal for the '<em><b>Query Crear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___QUERY_CREAR__STRING_LISTSTRING_LISTSTRING = eINSTANCE.getHSQLDB__QueryCrear__String_ListString_ListString();

		/**
		 * The meta object literal for the '<em><b>Query Editar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___QUERY_EDITAR__STRING_LISTSTRING_LISTSTRING_STRING = eINSTANCE.getHSQLDB__QueryEditar__String_ListString_ListString_String();

		/**
		 * The meta object literal for the '<em><b>Query Buscar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___QUERY_BUSCAR__STRING_LISTSTRING_STRING = eINSTANCE.getHSQLDB__QueryBuscar__String_ListString_String();

		/**
		 * The meta object literal for the '<em><b>Query Ejecutar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSQLDB___QUERY_EJECUTAR__STRING = eINSTANCE.getHSQLDB__QueryEjecutar__String();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Proyectos_Asignados <em>Proyectos Asignados</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Proyectos_Asignados
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getProyectos_Asignados()
		 * @generated
		 */
		EClass PROYECTOS_ASIGNADOS = eINSTANCE.getProyectos_Asignados();

		/**
		 * The meta object literal for the '<em><b>Id proyecto asignado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_ASIGNADOS__ID_PROYECTO_ASIGNADO = eINSTANCE.getProyectos_Asignados_Id_proyecto_asignado();

		/**
		 * The meta object literal for the '<em><b>Id proyecto proyecto asignado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_ASIGNADOS__ID_PROYECTO_PROYECTO_ASIGNADO = eINSTANCE.getProyectos_Asignados_Id_proyecto_proyecto_asignado();

		/**
		 * The meta object literal for the '<em><b>Id arquitecto proyecto asignado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_ASIGNADOS__ID_ARQUITECTO_PROYECTO_ASIGNADO = eINSTANCE.getProyectos_Asignados_Id_arquitecto_proyecto_asignado();

		/**
		 * The meta object literal for the '<em><b>Proyecto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROYECTOS_ASIGNADOS__PROYECTO = eINSTANCE.getProyectos_Asignados_Proyecto();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROYECTOS_ASIGNADOS__USUARIO = eINSTANCE.getProyectos_Asignados_Usuario();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Certificados_Asignados <em>Certificados Asignados</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Certificados_Asignados
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getCertificados_Asignados()
		 * @generated
		 */
		EClass CERTIFICADOS_ASIGNADOS = eINSTANCE.getCertificados_Asignados();

		/**
		 * The meta object literal for the '<em><b>Id proyecto asignado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADOS_ASIGNADOS__ID_PROYECTO_ASIGNADO = eINSTANCE.getCertificados_Asignados_Id_proyecto_asignado();

		/**
		 * The meta object literal for the '<em><b>Id proyecto proyecto asignado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICADOS_ASIGNADOS__ID_PROYECTO_PROYECTO_ASIGNADO = eINSTANCE.getCertificados_Asignados_Id_proyecto_proyecto_asignado();

		/**
		 * The meta object literal for the '<em><b>Id arquitecto proyecto asignado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICADOS_ASIGNADOS__ID_ARQUITECTO_PROYECTO_ASIGNADO = eINSTANCE.getCertificados_Asignados_Id_arquitecto_proyecto_asignado();

		/**
		 * The meta object literal for the '<em><b>Id certificado asignado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADOS_ASIGNADOS__ID_CERTIFICADO_ASIGNADO = eINSTANCE.getCertificados_Asignados_Id_certificado_asignado();

		/**
		 * The meta object literal for the '<em><b>Id certificado certificado asignado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADOS_ASIGNADOS__ID_CERTIFICADO_CERTIFICADO_ASIGNADO = eINSTANCE.getCertificados_Asignados_Id_certificado_certificado_asignado();

		/**
		 * The meta object literal for the '<em><b>Id arquitecto certificado asignado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICADOS_ASIGNADOS__ID_ARQUITECTO_CERTIFICADO_ASIGNADO = eINSTANCE.getCertificados_Asignados_Id_arquitecto_certificado_asignado();

		/**
		 * The meta object literal for the '<em><b>Certificado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICADOS_ASIGNADOS__CERTIFICADO = eINSTANCE.getCertificados_Asignados_Certificado();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICADOS_ASIGNADOS__USUARIO = eINSTANCE.getCertificados_Asignados_Usuario();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Proyectos_En_Ejecucion <em>Proyectos En Ejecucion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Proyectos_En_Ejecucion
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getProyectos_En_Ejecucion()
		 * @generated
		 */
		EClass PROYECTOS_EN_EJECUCION = eINSTANCE.getProyectos_En_Ejecucion();

		/**
		 * The meta object literal for the '<em><b>Id ejecucion proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_EN_EJECUCION__ID_EJECUCION_PROYECTO = eINSTANCE.getProyectos_En_Ejecucion_Id_ejecucion_proyecto();

		/**
		 * The meta object literal for the '<em><b>Id proyecto ejecucion proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_EN_EJECUCION__ID_PROYECTO_EJECUCION_PROYECTO = eINSTANCE.getProyectos_En_Ejecucion_Id_proyecto_ejecucion_proyecto();

		/**
		 * The meta object literal for the '<em><b>Fecha inicio ejecucion proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_EN_EJECUCION__FECHA_INICIO_EJECUCION_PROYECTO = eINSTANCE.getProyectos_En_Ejecucion_Fecha_inicio_ejecucion_proyecto();

		/**
		 * The meta object literal for the '<em><b>Duracion prevista ejecucion proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_EN_EJECUCION__DURACION_PREVISTA_EJECUCION_PROYECTO = eINSTANCE.getProyectos_En_Ejecucion_Duracion_prevista_ejecucion_proyecto();

		/**
		 * The meta object literal for the '<em><b>Fecha fin ejecucion proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTOS_EN_EJECUCION__FECHA_FIN_EJECUCION_PROYECTO = eINSTANCE.getProyectos_En_Ejecucion_Fecha_fin_ejecucion_proyecto();

		/**
		 * The meta object literal for the '<em><b>Proyecto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROYECTOS_EN_EJECUCION__PROYECTO = eINSTANCE.getProyectos_En_Ejecucion_Proyecto();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.impl.FactoryImpl
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Crear Objeto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACTORY___CREAR_OBJETO = eINSTANCE.getFactory__CrearObjeto();

		/**
		 * The meta object literal for the '<em><b>Crear Objeto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACTORY___CREAR_OBJETO__STRING = eINSTANCE.getFactory__CrearObjeto__String();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.impl.ConcreteFactoryImpl <em>Concrete Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.impl.ConcreteFactoryImpl
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getConcreteFactory()
		 * @generated
		 */
		EClass CONCRETE_FACTORY = eINSTANCE.getConcreteFactory();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Tipo_Proyecto <em>Tipo Proyecto</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Tipo_Proyecto
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getTipo_Proyecto()
		 * @generated
		 */
		EEnum TIPO_PROYECTO = eINSTANCE.getTipo_Proyecto();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Tipo_Certificado <em>Tipo Certificado</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Tipo_Certificado
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getTipo_Certificado()
		 * @generated
		 */
		EEnum TIPO_CERTIFICADO = eINSTANCE.getTipo_Certificado();

		/**
		 * The meta object literal for the '{@link ArkiWeb.modelo.Categoria_Certificado <em>Categoria Certificado</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArkiWeb.modelo.Categoria_Certificado
		 * @see ArkiWeb.modelo.impl.ModeloPackageImpl#getCategoria_Certificado()
		 * @generated
		 */
		EEnum CATEGORIA_CERTIFICADO = eINSTANCE.getCategoria_Certificado();

	}

} //ModeloPackage
