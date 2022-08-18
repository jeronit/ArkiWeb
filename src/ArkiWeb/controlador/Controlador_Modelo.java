/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlador Modelo</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControlador_Modelo()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Controlador_Modelo extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.String" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 * @generated
	 */
	void crearUsuario(String nombre_usuario, String apellido_usuario, String dni_usuario, int telefono_usuario, String email_usuario, String domicilio_usuario, String contrasenya_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.String" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 * @generated
	 */
	void editarUsuario_1(int id_usuario, String nombre_usuario, String apellido_usuario, String dni_usuario, int telefono_usuario, String email_usuario, String domicilio_usuario, String contrasenya_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated
	 */
	Usuario bajaUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 * @generated
	 */
	void crearPermiso(String descripcion_permiso, String objeto_permiso, boolean lectura_permiso, boolean escritura_permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_permisoDataType="org.eclipse.uml2.types.Integer" id_permisoRequired="true" id_permisoOrdered="false" descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 * @generated
	 */
	void editarPermiso(int id_permiso, String descripcion_permiso, String objeto_permiso, boolean lectura_permiso, boolean escritura_permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_permisoDataType="org.eclipse.uml2.types.Integer" id_permisoRequired="true" id_permisoOrdered="false"
	 * @generated
	 */
	Permiso buscarPermiso(int id_permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_certificadoDataType="org.eclipse.uml2.types.String" descripcion_certificadoRequired="true" descripcion_certificadoOrdered="false" cliente_certificadoRequired="true" cliente_certificadoOrdered="false" vivienda_certificadoDataType="org.eclipse.uml2.types.Integer" vivienda_certificadoRequired="true" vivienda_certificadoOrdered="false" inmueble_certificadoDataType="org.eclipse.uml2.types.Integer" inmueble_certificadoRequired="true" inmueble_certificadoOrdered="false" tipo_certificadoRequired="true" tipo_certificadoOrdered="false" fecha_solicitud_certificadoRequired="true" fecha_solicitud_certificadoOrdered="false" fecha_entrega_certificadoRequired="true" fecha_entrega_certificadoOrdered="false" fecha_visita_certificadoRequired="true" fecha_visita_certificadoOrdered="false" fecha_emision_certificadoRequired="true" fecha_emision_certificadoOrdered="false" categoria_certificadoRequired="true" categoria_certificadoOrdered="false" arquitecto_certificadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificadoRequired="true" arquitecto_certificadoOrdered="false" coste_certificadoRequired="true" coste_certificadoOrdered="false"
	 * @generated
	 */
	void crearCertificado(String descripcion_certificado, Certificado cliente_certificado, int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado, Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado, Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado, double coste_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false" descripcion_certificadoDataType="org.eclipse.uml2.types.String" descripcion_certificadoRequired="true" descripcion_certificadoOrdered="false" cliente_certificadoDataType="org.eclipse.uml2.types.Integer" cliente_certificadoRequired="true" cliente_certificadoOrdered="false" vivienda_certificadoDataType="org.eclipse.uml2.types.Integer" vivienda_certificadoRequired="true" vivienda_certificadoOrdered="false" inmueble_certificadoDataType="org.eclipse.uml2.types.Integer" inmueble_certificadoRequired="true" inmueble_certificadoOrdered="false" tipo_certificadoRequired="true" tipo_certificadoOrdered="false" fecha_solicitud_certificadoRequired="true" fecha_solicitud_certificadoOrdered="false" fecha_entrega_certificadoRequired="true" fecha_entrega_certificadoOrdered="false" fecha_visita_certificadoRequired="true" fecha_visita_certificadoOrdered="false" fecha_emision_certificadoRequired="true" fecha_emision_certificadoOrdered="false" categoria_certificadoRequired="true" categoria_certificadoOrdered="false" arquitecto_certificadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificadoRequired="true" arquitecto_certificadoOrdered="false" coste_certificadoRequired="true" coste_certificadoOrdered="false"
	 * @generated
	 */
	void editarCertificado(int id_certificado, String descripcion_certificado, int cliente_certificado, int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado, Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado, Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado, double coste_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated
	 */
	Certificado buscarCertificado(int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 * @generated
	 */
	void crearProyecto(String descripcion_proyecto, Certificado cliente_proyecto, int vivienda_proyecto, int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto, Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto, double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false" descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 * @generated
	 */
	void editarProyecto(int id_proyecto, String descripcion_proyecto, Certificado cliente_proyecto, int vivienda_proyecto, int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto, Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto, double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated
	 */
	Proyecto buscarProyecto(int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 * @generated
	 */
	void crearVivienda(String descripcion_vivienda, String direccion_vivienda, int id_inmueble_vivienda, double superficie_terreno_vivienda, double superficie_vivienda, int plantas_vivienda, int habitaciones_vivienda, int banyos_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false" descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 * @generated
	 */
	void editarVivienda(int id_vivienda, String descripcion_vivienda, String direccion_vivienda, int id_inmueble_vivienda, double superficie_terreno_vivienda, double superficie_vivienda, int plantas_vivienda, int habitaciones_vivienda, int banyos_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated
	 */
	Vivienda buscarVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 * @generated
	 */
	void crearInmueble(String descripcion_inmueble, String direccion_inmueble, double superficie_terreno_inmueble, double superficie_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false" descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 * @generated
	 */
	void editarInmueble(int id_inmueble, String descripcion_inmueble, String direccion_inmueble, double superficie_terreno_inmueble, double superficie_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 * @generated
	 */
	Inmueble buscarInmueble(int id_inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void asignarCertificado(int id_certificado_certificado_asignado, int arquitecto_certificado_asignado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_asignadoRequired="true" id_certificado_asignadoOrdered="false" id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void editarAsignacionCertificado(int id_certificado_asignado, int id_certificado_certificado_asignado, int arquitecto_certificado_asignado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void asignarProyecto(int id_proyecto_proyecto_asignado, int arquitecto_certificado_asignado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_asignadoRequired="true" id_proyecto_asignadoOrdered="false" id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 * @generated
	 */
	void editarAsignacionProyecto(int id_proyecto_asignado, int id_proyecto_proyecto_asignado, int arquitecto_certificado_asignado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 * @generated
	 */
	void contratarProyecto(int id_proyecto_ejecucion_proyecto, Date fecha_inicio_ejecucion_proyecto, int duracion_prevista_ejecucion_proyecto, Date fecha_fin_ejecucion_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_ejecucion_proyectoRequired="true" id_ejecucion_proyectoOrdered="false" id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 * @generated
	 */
	void editarContratacionProyecto(int id_ejecucion_proyecto, int id_proyecto_ejecucion_proyecto, Date fecha_inicio_ejecucion_proyecto, int duracion_prevista_ejecucion_proyecto, Date fecha_fin_ejecucion_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false"
	 * @generated
	 */
	void queryCrear(String tabla, List<String> columnas, List<String> valores_columnas);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false" where_clauseDataType="org.eclipse.uml2.types.String" where_clauseRequired="true" where_clauseOrdered="false"
	 * @generated
	 */
	void queryEditar(String tabla, List<String> columnas, List<String> valores_columnas, String where_clause);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" where_clause_01DataType="org.eclipse.uml2.types.String" where_clause_01Required="true" where_clause_01Ordered="false"
	 * @generated
	 */
	void queryBuscar(String tabla, List<String> columnas, String where_clause_01);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean login(String email, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void cambiarContrasenya(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Usuario> listarUsuarios();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Permiso> listarPermisos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Proyecto> listarProyectos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Certificado> listarCertificados();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Vivienda> listarViviendas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Inmueble> listarInmuebles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 * @generated
	 */
	Usuario buscarUsuario(int id_usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	List<Proyecto> buscarMisProyectos(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	List<Proyecto> buscarProyectosPorUsuario(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	List<Certificado> buscarMisCertificados(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 * @generated
	 */
	List<Certificado> buscarCertificadosPorUsuario(int id_Usuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated
	 */
	List<Certificado> buscarCertificadosPorVivienda(int id_vivienda);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_InmuebleDataType="org.eclipse.uml2.types.Integer" id_InmuebleRequired="true" id_InmuebleOrdered="false"
	 * @generated
	 */
	List<Certificado> buscarCertificadosPorInmueble(int id_Inmueble);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated
	 */
	List<Certificado> buscarCertificadosPorEdadInmueble(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" edadDataType="org.eclipse.uml2.types.Integer" edadRequired="true" edadOrdered="false"
	 * @generated
	 */
	List<Certificado> buscarCertificadosPorEdadCertificadoHabitabilidad(int edad);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 * @generated
	 */
	Certificados_Asignados buscarAsignacionCertificado(int id_usuario, int id_certificado);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated
	 */
	Proyectos_Asignados buscarAsignacionProyecto(int id_usuario, int id_proyecto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated
	 */
	Proyectos_En_Ejecucion buscarContratacionProyecto(int id_proyecto);

} // Controlador_Modelo
