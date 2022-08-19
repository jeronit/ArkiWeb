/**
 * 	@purpose:	Interacción entre la aplicación y la BBDD.
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import ArkiWeb.ListString;
import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.HSQLDB;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

/**
 * @author JTE
 *
 */
public class HSQLDBImpl implements HSQLDB {

	/**
	 * 
	 */
	public HSQLDBImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eInvoke(EOperation arg0, EList<?> arg1) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eIsSet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eUnset(EStructuralFeature arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eNotify(Notification arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eSetDeliver(boolean arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo usuario.
	 * <!-- end-user-doc -->
	 * @param	nombre_usuario			String		Nombre
	 * @param	apellido_usuario		String		Apellidos
	 * @param	dni_usuario				String		DNI
	 * @param	telefono_usuario		int			Teléfono
	 * @param	email_usuario			String		Email
	 * @param	domicilio_usuario		String		Domicilio
	 * @param	contrasenya_usuario		String		Contraseña de acceso a la aplicación
	 * @model nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.String" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 */
	@Override
	public void crearUsuario(String nombre_usuario, String apellido_usuario, String dni_usuario, int telefono_usuario,
			String email_usuario, String domicilio_usuario, String contrasenya_usuario) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario				int			Id
	 * @param	nombre_usuario			String		Nombre
	 * @param	apellido_usuario		String		Apellidos
	 * @param	dni_usuario				String		DNI
	 * @param	telefono_usuario		int			Teléfono
	 * @param	email_usuario			String		Email
	 * @param	domicilio_usuario		String		Domicilio
	 * @param	contrasenya_usuario		String		Contraseña de acceso a la aplicación
	 * @model id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.String" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 */
	@Override
	public void editarUsuario(int id_usuario, String nombre_usuario, String apellido_usuario, String dni_usuario,
			int telefono_usuario, String email_usuario, String domicilio_usuario, String contrasenya_usuario) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Elimina los datos de un usuario.
	 * <!-- end-user-doc -->
	 * @param	id_usuario				int			Id
	 * @model required="true" ordered="false" id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false"
	 */
	@Override
	public void bajaUsuario(int id_usuario) {
		// TODO Auto-generated method stub
	}

	/**
	 * <!-- begin-user-doc -->
	 *  Registra un nuevo permiso.
	 * <!-- end-user-doc -->
	 * @param	descripcion_permiso		String		Descripción
	 * @param	objeto_permiso			String		Objeto/Página a la que acceder
	 * @param	lectura_permiso			Boolean		Concede permiso de lectura
	 * @param	escritura_permiso		Boolean		Concede permiso de escritura
	 * @model descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 */
	@Override
	public void crearPermiso(String descripcion_permiso, String objeto_permiso, boolean lectura_permiso,
			boolean escritura_permiso) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un permiso.
	 * <!-- end-user-doc -->
	 * @param	id_permiso				int			Id
	 * @param	descripcion_permiso		String		Descripción
	 * @param	objeto_permiso			String		Objeto/Página a la que acceder
	 * @param	lectura_permiso			Boolean		Concede permiso de lectura
	 * @param	escritura_permiso		Boolean		Concede permiso de escritura
	 * @model id_permisoDataType="org.eclipse.uml2.types.Integer" id_permisoRequired="true" id_permisoOrdered="false" descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 */
	@Override
	public void editarPermiso(int id_permiso, String descripcion_permiso, String objeto_permiso,
			boolean lectura_permiso, boolean escritura_permiso) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo certificado.
	 * <!-- end-user-doc -->
	 * @param	descripcion_certificado			String					Descripción
	 * @param	cliente_certificado				int						Id de cliente
	 * @param	vivienda_certificado			int						Id de vivienda
	 * @param	inmueble_certificado			int						Id de inmueble
	 * @param	tipo_certificado				Tipo_Certificado		Tipo de certificado
	 * @param	fecha_solicitud_certificado		Date					Fecha de solicitud del certificado
	 * @param	fecha_entrega_certificado		Date					Fecha de entrega del certificado
	 * @param	fecha_visita_certificado		Date					Fecha de visita del arquitecto
	 * @param	fecha_emision_certificado		Date					Fecha de emisión del certificado
	 * @param	categoria_certificado			Categoria_Certificado	Categoría del resultado del certificado
	 * @param	arquitecto_certificado			int						Id de arquitecto
	 * @param	coste_certificado				double					Coste del certificado
	 * @model descripcion_certificadoDataType="org.eclipse.uml2.types.String" descripcion_certificadoRequired="true" descripcion_certificadoOrdered="false" cliente_certificadoRequired="true" cliente_certificadoOrdered="false" vivienda_certificadoDataType="org.eclipse.uml2.types.Integer" vivienda_certificadoRequired="true" vivienda_certificadoOrdered="false" inmueble_certificadoDataType="org.eclipse.uml2.types.Integer" inmueble_certificadoRequired="true" inmueble_certificadoOrdered="false" tipo_certificadoRequired="true" tipo_certificadoOrdered="false" fecha_solicitud_certificadoRequired="true" fecha_solicitud_certificadoOrdered="false" fecha_entrega_certificadoRequired="true" fecha_entrega_certificadoOrdered="false" fecha_visita_certificadoRequired="true" fecha_visita_certificadoOrdered="false" fecha_emision_certificadoRequired="true" fecha_emision_certificadoOrdered="false" categoria_certificadoRequired="true" categoria_certificadoOrdered="false" arquitecto_certificadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificadoRequired="true" arquitecto_certificadoOrdered="false" coste_certificadoRequired="true" coste_certificadoOrdered="false"
	 */
	@Override
	public void crearCertificado(String descripcion_certificado, int cliente_certificado,
			int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado,
			Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado,
			Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado,
			double coste_certificado) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un certificado
	 * <!-- end-user-doc -->
	 * @param	id_certificado					int						Id 
	 * @param	descripcion_certificado			String					Descripción
	 * @param	cliente_certificado				int						Id de cliente
	 * @param	vivienda_certificado			int						Id de vivienda
	 * @param	inmueble_certificado			int						Id de inmueble
	 * @param	tipo_certificado				Tipo_Certificado		Tipo de certificado
	 * @param	fecha_solicitud_certificado		Date					Fecha de solicitud del certificado
	 * @param	fecha_entrega_certificado		Date					Fecha de entrega del certificado
	 * @param	fecha_visita_certificado		Date					Fecha de visita del arquitecto
	 * @param	fecha_emision_certificado		Date					Fecha de emisión del certificado
	 * @param	categoria_certificado			Categoria_Certificado	Categoría del resultado del certificado
	 * @param	arquitecto_certificado			int						Id de arquitecto
	 * @param	coste_certificado				double					Coste del certificado
	 */ 

	@Override
	public void editarCertificado(int id_certificado, String descripcion_certificado, int cliente_certificado,
			int vivienda_certificado, int inmueble_certificado, Tipo_Certificado tipo_certificado,
			Date fecha_solicitud_certificado, Date fecha_entrega_certificado, Date fecha_visita_certificado,
			Date fecha_emision_certificado, Categoria_Certificado categoria_certificado, int arquitecto_certificado,
			double coste_certificado) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param	id_certificado					int						Id 
	 * @return 									Certificado				Certificado
	 * @model required="true" ordered="false" id_certificadoDataType="org.eclipse.uml2.types.Integer" id_certificadoRequired="true" id_certificadoOrdered="false"
	 */
	@Override
	public Certificado buscarCertificado(int id_certificado) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param	descripcion_proyecto			String					Descripción
	 * @param	cliente_proyecto				int						Id de cliente
	 * @param	vivienda_proyecto				int						Id de vivienda
	 * @param	vivienda_proyecto				int						Id de inmueble
	 * @param	tipo_proyecto					String					Tipo de proyecto
	 * @param	fecha_solicitud_proyecto		Date					Fecha de solicitud del proyecto
	 * @param	fecha_entrega_proyecto			Date					Fecha de entrega del proyecto
	 * @param	duracion_prevista_proyecto		int						Duración prevista
	 * @param	presupuesto_ejecucion_proyecto	Double					Presupuesto de ejecución
	 * @param	superficie_proyecto				Double					Superficie
	 * @param	arquitecto_proyecto				int						Arquitecto
	 * @param	coste_proyecto					Double					Coste del proyecto
	 * @model descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoDataType="org.eclipse.uml2.types.Integer" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 */
	@Override
	public void crearProyecto(String descripcion_proyecto, int cliente_proyecto, int vivienda_proyecto,
			int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto,
			Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto,
			double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto						int						Id
	 * @param	descripcion_proyecto			String					Descripción
	 * @param	cliente_proyecto				int						Id de cliente
	 * @param	vivienda_proyecto				int						Id de vivienda
	 * @param	vivienda_proyecto				int						Id de inmueble
	 * @param	tipo_proyecto					String					Tipo de proyecto
	 * @param	fecha_solicitud_proyecto		Date					Fecha de solicitud del proyecto
	 * @param	fecha_entrega_proyecto			Date					Fecha de entrega del proyecto
	 * @param	duracion_prevista_proyecto		int						Duración prevista
	 * @param	presupuesto_ejecucion_proyecto	Double					Presupuesto de ejecución
	 * @param	superficie_proyecto				Double					Superficie
	 * @param	arquitecto_proyecto				int						Arquitecto
	 * @param	coste_proyecto					Double					Coste del proyecto
	 * @model id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false" descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoDataType="org.eclipse.uml2.types.Integer" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 */
	@Override
	public void editarProyecto(int id_proyecto, String descripcion_proyecto, int cliente_proyecto,
			int vivienda_proyecto, int inmueble_proyecto, Tipo_Proyecto tipo_proyecto, Date fecha_solicitud_proyecto,
			Date fecha_entrega_proyecto, int duracion_prevista_proyecto, double presupuesto_ejecucion_proyecto,
			double superficie_proyecto, int arquitecto_proyecto, double coste_proyecto) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto						int						Id
	 * @return									Proyecto				Proyecto
	 * @model required="true" ordered="false" id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false"
	 * @generated NOT
	 */
	@Override
	public Proyecto buscarProyecto(int id_proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra una nueva vivienda.
	 * <!-- end-user-doc -->
	 * @param	descripcion_vivienda			String					Descripción
	 * @param	direccion_vivienda				String					Direccion
	 * @param	id_inmueble_vivienda			int						Id de inmueble
	 * @param	superficie_terreno_vivienda		Double					Superficie del terreno
	 * @param	superficie_vivienda				Double					Superficie
	 * @param	plantas_vivienda				int						Plantas
	 * @param	habitaciones_vivienda			int						Habitaciones
	 * @param	banyos_vivienda					int						Baños
	 * @model descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 */
	@Override
	public void crearVivienda(String descripcion_vivienda, String direccion_vivienda, int id_inmueble_vivienda,
			double superficie_terreno_vivienda, double superficie_vivienda, int plantas_vivienda,
			int habitaciones_vivienda, int banyos_vivienda) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de una vivienda.
	 * <!-- end-user-doc -->
	 * @param	id_vivienda						int						Id
	 * @param	descripcion_vivienda			String					Descripción
	 * @param	direccion_vivienda				String					Direccion
	 * @param	id_inmueble_vivienda			int						Id de inmueble
	 * @param	superficie_terreno_vivienda		Double					Superficie del terreno
	 * @param	superficie_vivienda				Double					Superficie
	 * @param	plantas_vivienda				int						Plantas
	 * @param	habitaciones_vivienda			int						Habitaciones
	 * @param	banyos_vivienda					int						Baños
	 * @model id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false" descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 * @generated NOT
	 */
	@Override
	public void editarVivienda(int id_vivienda, String descripcion_vivienda, String direccion_vivienda,
			int id_inmueble_vivienda, double superficie_terreno_vivienda, double superficie_vivienda,
			int plantas_vivienda, int habitaciones_vivienda, int banyos_vivienda) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Devuelve una vivienda.
	 * <!-- end-user-doc -->
	 * @return									Vivienda				Vivienda
	 * @model required="true" ordered="false" id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false"
	 * @generated NOT
	 */
	@Override
	public Vivienda buscarVivienda(int id_vivienda) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo inmueble.
	 * <!-- end-user-doc -->
	 * @param	descripcion_inmueble			String					Descripción
	 * @param	direccion_inmueble				String					Direccion
	 * @param	superficie_terreno_inmueble		Double					Superficie del terreno
	 * @param	superficie_inmueble				Double					Superficie
	 * @model descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 */
	@Override
	public void crearInmueble(String descripcion_inmueble, String direccion_inmueble,
			double superficie_terreno_inmueble, double superficie_inmueble) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un inmueble.
	 * <!-- end-user-doc -->
	 * @param	id_inmueble						int						Id
	 * @param	descripcion_inmueble			String					Descripción
	 * @param	direccion_inmueble				String					Direccion
	 * @param	superficie_terreno_inmueble		Double					Superficie del terreno
	 * @param	superficie_inmueble				Double					Superficie
	 * @model id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false" descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 */
	@Override
	public void editarInmueble(int id_inmueble, String descripcion_inmueble, String direccion_inmueble,
			double superficie_terreno_inmueble, double superficie_inmueble) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un inmueble.
	 * <!-- end-user-doc -->
	 * @return									Inmueble				Inmueble
	 * @model required="true" ordered="false" id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false"
	 */
	@Override
	public Inmueble buscarInmueble(int id_inmueble) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	id_certificado_certificado_asignado		int				Id de certificado a asignar
	 * @param	arquitecto_certificado_asignado			int				Id de arquitecto asignado
	 * @model id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 */
	@Override
	public void asignarCertificado(int id_certificado_certificado_asignado, int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	id_certificado_asignado					int				Id
	 * @param	id_certificado_certificado_asignado		int				Id de certificado a asignar
	 * @param	arquitecto_certificado_asignado			int				Id de arquitecto asignado
	 * @model id_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_asignadoRequired="true" id_certificado_asignadoOrdered="false" id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 */
	@Override
	public void editarAsignacionCertificado(int id_certificado_asignado, int id_certificado_certificado_asignado,
			int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto_proyecto_asignado			int				Id de proyecto a asignar
	 * @param	arquitecto_certificado_asignado			int				Id de arquitecto asignado
	 * @model id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 */
	@Override
	public void asignarProyecto(int id_proyecto_proyecto_asignado, int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignación de un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto_asignado					int				Id
	 * @param	id_proyecto_proyecto_asignado			int				Id de proyecto a asignar
	 * @param	arquitecto_certificado_asignado			int				Id de arquitecto asignado
	 * @model id_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_asignadoRequired="true" id_proyecto_asignadoOrdered="false" id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 */
	@Override
	public void editarAsignacionProyecto(int id_proyecto_asignado, int id_proyecto_proyecto_asignado,
			int arquitecto_certificado_asignado) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Gestiona la contratación de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_proyecto_ejecucion_proyecto			int						Id de proyecto a contratar
	 * @param	fecha_inicio_ejecucion_proyecto			Date					Fecha de inicio
	 * @param	duracion_prevista_ejecucion_proyecto	int						Duración prevista
	 * @param	fecha_fin_ejecucion_proyecto			Date					Fecha de fin de obra 
	 * @model id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 */
	@Override
	public void contratarProyecto(int id_proyecto_ejecucion_proyecto, Date fecha_inicio_ejecucion_proyecto,
			int duracion_prevista_ejecucion_proyecto, Date fecha_fin_ejecucion_proyecto) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la gestión sobre la contratación de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	id_ejecucion_proyecto					int						Id
	 * @param	id_proyecto_ejecucion_proyecto			int						Id de proyecto a contratar
	 * @param	fecha_inicio_ejecucion_proyecto			Date					Fecha de inicio
	 * @param	duracion_prevista_ejecucion_proyecto	int						Duración prevista
	 * @param	fecha_fin_ejecucion_proyecto			Date					Fecha de fin de obra 
	 * @model id_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_ejecucion_proyectoRequired="true" id_ejecucion_proyectoOrdered="false" id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 */
	@Override
	public void editarContratacionProyecto(int id_ejecucion_proyecto, int id_proyecto_ejecucion_proyecto,
			Date fecha_inicio_ejecucion_proyecto, int duracion_prevista_ejecucion_proyecto,
			Date fecha_fin_ejecucion_proyecto) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una creación SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde añadir datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde insertar la información
	 * @param	valores_columnas		List<String>		Lista de los valores para las columnas/campos (en el mismo orden)
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false"
	 */
	@Override
	public void queryCrear(String tabla, List<String> columnas, List<String> valores_columnas) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una edición SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde editar datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde editar la información
	 * @param	valores_columnas		List<String>		Lista de los valores para las columnas/campos (en el mismo orden)
	 * @param	where_clause			String				Cadena con las condiciones de la query
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false" where_clauseDataType="org.eclipse.uml2.types.String" where_clauseRequired="true" where_clauseOrdered="false"
	 */
	@Override
	public void queryEditar(String tabla, List<String> columnas, List<String> valores_columnas, String where_clause) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una búsqueda SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde editar datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde editar la información
	 * @param	where_clause_01			String				Cadena con las condiciones de la query
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" where_clause_01DataType="org.eclipse.uml2.types.String" where_clause_01Required="true" where_clause_01Ordered="false"
	 */
	@Override
	public void queryBuscar(String tabla, List<String> columnas, String where_clause_01) {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc -->
	 * Conecta con la BBDD y ejecuta la query que se le pasa como parámetro.
	 * <!-- end-user-doc -->
	 * @param	queryString				String				Cadena con la query SQL
	 * @return							Object				Objeto de retorno de la BBDD
	 * @model required="true" ordered="false" queryStringDataType="org.eclipse.uml2.types.String" queryStringRequired="true" queryStringOrdered="false"
	 */
	@Override
	public Object queryEjecutar(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
