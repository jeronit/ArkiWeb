/**
 * 	@purpose:	Implementaci�n de la Interface HSQLDB
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.HSQLDB;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;
import ArkiWeb.modelo.util.Utils;
import ArkiWeb.server.Server_Connection;
import ArkiWeb.server.impl.Server_ConnectionImpl;

/**
 * @author JTE
 *
 */
public class HSQLDBImpl implements HSQLDB {

	private static HSQLDBImpl firstInstance = null;
	Utils utils;
	private String url;
	private String user;
	private String password;
	
	/**
	 * SINGLETON Constructor
	 */
	private HSQLDBImpl() {
		this.utils = new Utils();
		this.url = "jdbc:hsqldb:hsql://localhost:9011/xdb";
		this.user = "sa";
		this.password = "";
	}
	
	/**
	 * SINGLETON: Gets the single instance of HSQLDBImpl.
	 *
	 * @return single instance of HSQLDBImpl
	 */
	public static HSQLDBImpl getInstance() {
		if(firstInstance == null) {
			firstInstance = new HSQLDBImpl();
		}
		return firstInstance;
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
	 * @return the url
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	@Override
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the user
	 */
	@Override
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	@Override
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo usuario.
	 * <!-- end-user-doc -->
	 * @param	usuario				Usuario				Objeto usuario
	 * @model nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.Integer" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 */
	@Override
	public void crearUsuario(Usuario usuario) {
		
		// Instanciando variables
		String tabla = "USUARIOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_usuario";

		// A�adiendo columnas
		columnas.add("nombre_usuario");
		columnas.add("apellidos_usuario");
		columnas.add("dni_usuario");
		columnas.add("telefono_usuario");
		columnas.add("email_usuario");
		columnas.add("domicilio_usuario");
		columnas.add("rol_usuario");
		columnas.add("contrasenya_usuario");
		
		// A�adiendo valores
		valores_columnas.add(usuario.getNombre_usuario());
		valores_columnas.add(usuario.getApellidos_usuario());
		valores_columnas.add(usuario.getDni_usuario());
		valores_columnas.add(usuario.getTelefono_usuario());
		valores_columnas.add(usuario.getEmail_usuario());
		valores_columnas.add(usuario.getDomicilio_usuario());
		valores_columnas.add(String.valueOf(usuario.getRol_usuario()));
		if(usuario.getContrasenya_usuario() != null) {
			String contrasenya_usuario = usuario.getContrasenya_usuario();
			valores_columnas.add(String.valueOf(this.utils.hashEncodedString(contrasenya_usuario)));
		}		
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				usuario.setId_usuario(resultsNewObjectId.getInt(columna_ID));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un usuario.
	 * <!-- end-user-doc -->
	 * @param	usuario					Usuario		Objeto usuario
	 * @model id_usuarioDataType="org.eclipse.uml2.types.Integer" id_usuarioRequired="true" id_usuarioOrdered="false" nombre_usuarioDataType="org.eclipse.uml2.types.String" nombre_usuarioRequired="true" nombre_usuarioOrdered="false" apellido_usuarioDataType="org.eclipse.uml2.types.String" apellido_usuarioRequired="true" apellido_usuarioOrdered="false" dni_usuarioDataType="org.eclipse.uml2.types.String" dni_usuarioRequired="true" dni_usuarioOrdered="false" telefono_usuarioDataType="org.eclipse.uml2.types.Integer" telefono_usuarioRequired="true" telefono_usuarioOrdered="false" email_usuarioDataType="org.eclipse.uml2.types.String" email_usuarioRequired="true" email_usuarioOrdered="false" domicilio_usuarioDataType="org.eclipse.uml2.types.String" domicilio_usuarioRequired="true" domicilio_usuarioOrdered="false" contrasenya_usuarioDataType="org.eclipse.uml2.types.Integer" contrasenya_usuarioRequired="true" contrasenya_usuarioOrdered="false"
	 */
	@Override
	public void editarUsuario(Usuario usuario) {
		
		// Instanciando variables
		String tabla = "USUARIOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_usuario";
		String where_clause = "";

		// A�adiendo columnas
		columnas.add("nombre_usuario");
		columnas.add("apellidos_usuario");
		columnas.add("dni_usuario");
		columnas.add("telefono_usuario");
		columnas.add("email_usuario");
		columnas.add("domicilio_usuario");
		columnas.add("rol_usuario");
		columnas.add("contrasenya_usuario");
		
		// A�adiendo valores
		valores_columnas.add(usuario.getNombre_usuario());
		valores_columnas.add(usuario.getApellidos_usuario());
		valores_columnas.add(usuario.getDni_usuario());
		valores_columnas.add(usuario.getTelefono_usuario());
		valores_columnas.add(usuario.getEmail_usuario());
		valores_columnas.add(usuario.getDomicilio_usuario());
		valores_columnas.add(String.valueOf(usuario.getRol_usuario()));
		if(usuario.getContrasenya_usuario() != null) {
			String contrasenya_usuario = usuario.getContrasenya_usuario();
			valores_columnas.add(String.valueOf(this.utils.hashEncodedString(contrasenya_usuario)));
		}
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + usuario.getId_usuario();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
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
		
		// Instanciando variables
		String tabla = "USUARIOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_usuario";
		String where_clause = "";

		// A�adiendo columnas
		columnas.add("nombre_usuario");
		columnas.add("apellidos_usuario");
		columnas.add("dni_usuario");
		columnas.add("telefono_usuario");
		columnas.add("email_usuario");
		columnas.add("domicilio_usuario");
		columnas.add("rol_usuario");
		columnas.add("contrasenya_usuario");
		
		// A�adiendo valores
		valores_columnas.add(null);
		valores_columnas.add(null);
		valores_columnas.add(null);
		valores_columnas.add(null);
		valores_columnas.add(null);
		valores_columnas.add(null);
		valores_columnas.add(null);
		valores_columnas.add(null);
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + id_usuario;
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * Crear rol.
	 *
	 * @param 		rol 		Rol			Rol
	 */
	@Override
	public void crearRol(Rol rol) {
		// Instanciando variables
		String tabla = "ROL";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_rol";
	
		// A�adiendo columnas
		columnas.add("descripcion_rol");
		
		// A�adiendo valores
		valores_columnas.add(rol.getDescripcion_rol());
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
		try {
			while(resultsNewObjectId.next()){
				rol.setId_rol(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 *  Registra un nuevo permiso.
	 * <!-- end-user-doc -->
	 * @param	permiso					Permiso		Permiso
	 * @model descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 */
	@Override
	public void crearPermiso(Permiso permiso) {

		// Instanciando variables
		String tabla = "PERMISOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_permiso";

		// A�adiendo columnas
		columnas.add("id_rol_permiso");
		columnas.add("objeto_permiso");
		columnas.add("lectura_permiso");
		columnas.add("escritura_permiso");
		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(permiso.getId_rol()));
		valores_columnas.add(permiso.getObjeto_permiso());
		valores_columnas.add(String.valueOf(permiso.isLectura_permiso()));
		valores_columnas.add(String.valueOf(permiso.isEscritura_permiso()));
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()){
				permiso.setId_permiso(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un permiso.
	 * <!-- end-user-doc -->
	 * @param	permiso					Permiso		Permiso
	 * @model id_permisoDataType="org.eclipse.uml2.types.Integer" id_permisoRequired="true" id_permisoOrdered="false" descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 */
	@Override
	public void editarPermiso(Permiso permiso) {
		
		// Instanciando variables
		String tabla = "PERMISOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_permiso";
		String where_clause = "";

		// A�adiendo columnas
		columnas.add("id_rol_permiso");
		columnas.add("objeto_permiso");
		columnas.add("lectura_permiso");
		columnas.add("escritura_permiso");
		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(permiso.getId_rol()));
		valores_columnas.add(permiso.getObjeto_permiso());
		valores_columnas.add(String.valueOf(permiso.isLectura_permiso()));
		valores_columnas.add(String.valueOf(permiso.isEscritura_permiso()));
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + permiso.getId_permiso();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo certificado.
	 * <!-- end-user-doc -->
	 * @param	certificado						Certificado				Certificado
	 * @model descripcion_certificadoDataType="org.eclipse.uml2.types.String" descripcion_certificadoRequired="true" descripcion_certificadoOrdered="false" cliente_certificadoRequired="true" cliente_certificadoOrdered="false" vivienda_certificadoDataType="org.eclipse.uml2.types.Integer" vivienda_certificadoRequired="true" vivienda_certificadoOrdered="false" inmueble_certificadoDataType="org.eclipse.uml2.types.Integer" inmueble_certificadoRequired="true" inmueble_certificadoOrdered="false" tipo_certificadoRequired="true" tipo_certificadoOrdered="false" fecha_solicitud_certificadoRequired="true" fecha_solicitud_certificadoOrdered="false" fecha_entrega_certificadoRequired="true" fecha_entrega_certificadoOrdered="false" fecha_visita_certificadoRequired="true" fecha_visita_certificadoOrdered="false" fecha_emision_certificadoRequired="true" fecha_emision_certificadoOrdered="false" categoria_certificadoRequired="true" categoria_certificadoOrdered="false" arquitecto_certificadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificadoRequired="true" arquitecto_certificadoOrdered="false" coste_certificadoRequired="true" coste_certificadoOrdered="false"
	 */
	@Override
	public void crearCertificado(Certificado certificado) {
		
		// Instanciando variables
		String tabla = "CERTIFICADOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_certificado";

		// A�adiendo columnas
		columnas.add("descripcion_certificado");
		columnas.add("cliente_certificado");
		columnas.add("vivienda_certificado");
		columnas.add("inmueble_certificado");
		columnas.add("tipo_certificado");
		columnas.add("fecha_solicitud_certificado");
		columnas.add("fecha_entrega_certificado");
		columnas.add("fecha_visita_certificado");
		columnas.add("fecha_emision_certificado");
		columnas.add("categoria_certificado");
		columnas.add("coste_certificado");
		
		// A�adiendo valores
		valores_columnas.add(certificado.getDescripcion_certificado());
		valores_columnas.add(String.valueOf(certificado.getId_cliente_certificado()));
		valores_columnas.add(String.valueOf(certificado.getId_vivienda_certificado()));
		valores_columnas.add(String.valueOf(certificado.getId_inmueble_certificado()));
		valores_columnas.add(String.valueOf(certificado.getTipo_certificado()));

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = null;
		if(certificado.getFecha_solicitud_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_solicitud_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		if(certificado.getFecha_entrega_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_entrega_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);

		if(certificado.getFecha_visita_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_visita_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);

		if(certificado.getFecha_emision_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_emision_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		valores_columnas.add(String.valueOf(certificado.getCategoria_certificado()));
		valores_columnas.add(String.valueOf(certificado.getCoste_certificado()));
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				certificado.setId_certificado(resultsNewObjectId.getInt(columna_ID));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un certificado
	 * <!-- end-user-doc -->
	 * @param	certificado						Certificado				Certificado
	 * @param	coste_certificado				double					Coste del certificado
	 */ 

	@Override
	public void editarCertificado(Certificado certificado) {

		// Instanciando variables
		String tabla = "CERTIFICADOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_certificado";
		String where_clause = "";

		// A�adiendo columnas
		columnas.add("descripcion_certificado");
		columnas.add("cliente_certificado");
		columnas.add("vivienda_certificado");
		columnas.add("inmueble_certificado");
		columnas.add("tipo_certificado");
		columnas.add("fecha_solicitud_certificado");
		columnas.add("fecha_entrega_certificado");
		columnas.add("fecha_visita_certificado");
		columnas.add("fecha_emision_certificado");
		columnas.add("categoria_certificado");
		columnas.add("coste_certificado");
		
		// A�adiendo valores
		valores_columnas.add(certificado.getDescripcion_certificado());
		valores_columnas.add(String.valueOf(certificado.getId_cliente_certificado()));
		valores_columnas.add(String.valueOf(certificado.getId_vivienda_certificado()));
		valores_columnas.add(String.valueOf(certificado.getId_inmueble_certificado()));
		valores_columnas.add(String.valueOf(certificado.getTipo_certificado()));

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = null;
		if(certificado.getFecha_solicitud_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_solicitud_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		if(certificado.getFecha_entrega_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_entrega_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);

		if(certificado.getFecha_visita_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_visita_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);

		if(certificado.getFecha_emision_certificado() != null) {
			fecha = simpleDateFormat.format(certificado.getFecha_emision_certificado());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		valores_columnas.add(String.valueOf(certificado.getCategoria_certificado()));
		valores_columnas.add(String.valueOf(certificado.getCoste_certificado()));
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + certificado.getId_certificado();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
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
		String tabla = "CERTIFICADOS";
		String where_clause = "id_certificado = " + id_certificado;
		String queryString = queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		Certificado certificado = (Certificado) resultsNewObject;
		this.queryCerrar(server_connection);
		return certificado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyecto						Proyecto				Proyecto
	 * @model descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoDataType="org.eclipse.uml2.types.Integer" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 */
	@Override
	public void crearProyecto(Proyecto proyecto) {

		// Instanciando variables
		String tabla = "PROYECTOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_proyecto";

		// A�adiendo columnas
		columnas.add("descripcion_proyecto");
		columnas.add("cliente_proyecto");
		columnas.add("vivienda_proyecto");
		columnas.add("inmueble_proyecto");
		columnas.add("tipo_proyecto");
		columnas.add("fecha_solicitud_proyecto");
		columnas.add("fecha_entrega_proyecto");
		columnas.add("duracion_prevista_proyecto");
		columnas.add("presupuesto_ejecucion_proyecto");
		columnas.add("superficie_proyecto");
		columnas.add("coste_proyecto");
		
		// A�adiendo valores
		valores_columnas.add(proyecto.getDescripcion_proyecto());
		valores_columnas.add(String.valueOf(proyecto.getId_cliente_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getId_vivienda_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getId_inmueble_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getTipo_proyecto()));

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = null;
		if(proyecto.getFecha_solicitud_proyecto() != null) {
			fecha = simpleDateFormat.format(proyecto.getFecha_solicitud_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		if(proyecto.getFecha_entrega_proyecto() != null) {
			fecha = simpleDateFormat.format(proyecto.getFecha_entrega_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);

		valores_columnas.add(String.valueOf(proyecto.getDuracion_prevista_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getPresupuesto_ejecucion_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getSuperficie_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getCoste_proyecto()));
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				proyecto.setId_proyecto(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyecto						Proyecto				Proyecto
	 * @model id_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyectoRequired="true" id_proyectoOrdered="false" descripcion_proyectoDataType="org.eclipse.uml2.types.String" descripcion_proyectoRequired="true" descripcion_proyectoOrdered="false" cliente_proyectoDataType="org.eclipse.uml2.types.Integer" cliente_proyectoRequired="true" cliente_proyectoOrdered="false" vivienda_proyectoDataType="org.eclipse.uml2.types.Integer" vivienda_proyectoRequired="true" vivienda_proyectoOrdered="false" inmueble_proyectoDataType="org.eclipse.uml2.types.Integer" inmueble_proyectoRequired="true" inmueble_proyectoOrdered="false" tipo_proyectoRequired="true" tipo_proyectoOrdered="false" fecha_solicitud_proyectoRequired="true" fecha_solicitud_proyectoOrdered="false" fecha_entrega_proyectoRequired="true" fecha_entrega_proyectoOrdered="false" duracion_prevista_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_proyectoRequired="true" duracion_prevista_proyectoOrdered="false" presupuesto_ejecucion_proyectoRequired="true" presupuesto_ejecucion_proyectoOrdered="false" superficie_proyectoRequired="true" superficie_proyectoOrdered="false" arquitecto_proyectoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyectoRequired="true" arquitecto_proyectoOrdered="false" coste_proyectoRequired="true" coste_proyectoOrdered="false"
	 */
	@Override
	public void editarProyecto(Proyecto proyecto) {
		
		// Instanciando variables
		String tabla = "PROYECTOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_proyecto";
		String where_clause = "";

		// A�adiendo columnas
		columnas.add("descripcion_proyecto");
		columnas.add("cliente_proyecto");
		columnas.add("vivienda_proyecto");
		columnas.add("inmueble_proyecto");
		columnas.add("tipo_proyecto");
		columnas.add("fecha_solicitud_proyecto");
		columnas.add("fecha_entrega_proyecto");
		columnas.add("duracion_prevista_proyecto");
		columnas.add("presupuesto_ejecucion_proyecto");
		columnas.add("superficie_proyecto");
		columnas.add("coste_proyecto");
		
		// A�adiendo valores
		valores_columnas.add(proyecto.getDescripcion_proyecto());
		valores_columnas.add(String.valueOf(proyecto.getId_cliente_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getId_vivienda_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getId_inmueble_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getTipo_proyecto()));
		
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = null;
		if(proyecto.getFecha_solicitud_proyecto() != null) {
			fecha = simpleDateFormat.format(proyecto.getFecha_solicitud_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		if(proyecto.getFecha_entrega_proyecto() != null) {
			fecha = simpleDateFormat.format(proyecto.getFecha_entrega_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		valores_columnas.add(String.valueOf(proyecto.getDuracion_prevista_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getPresupuesto_ejecucion_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getSuperficie_proyecto()));
		valores_columnas.add(String.valueOf(proyecto.getCoste_proyecto()));
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + proyecto.getId_proyecto();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
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
		String tabla = "PROYECTOS";
		String where_clause = "id_proyecto = " + id_proyecto;
		String queryString = queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		Proyecto proyecto = (Proyecto) resultsNewObject;
		this.queryCerrar(server_connection);
		return proyecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra una nueva vivienda.
	 * <!-- end-user-doc -->
	 * @param	vivienda						Vivienda				Vivienda
	 * @model descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 */
	@Override
	public void crearVivienda(Vivienda vivienda) {

		// Instanciando variables
		String tabla = "VIVIENDAS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_vivienda";

		// A�adiendo columnas
		columnas.add("descripcion_vivienda");
		columnas.add("direccion_vivienda");
		columnas.add("id_inmueble_vivienda");
		columnas.add("superficie_terreno_vivienda");
		columnas.add("superficie_vivienda");
		columnas.add("plantas_vivienda");
		columnas.add("habitaciones_vivienda");
		columnas.add("banyos_vivienda");
		
		// A�adiendo valores
		valores_columnas.add(vivienda.getDescripcion_vivienda());
		valores_columnas.add(vivienda.getDireccion_vivienda());
		valores_columnas.add(String.valueOf(vivienda.getId_inmueble_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getSuperficie_terreno_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getSuperficie_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getPlantas_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getHabitaciones_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getBanyos_vivienda()));
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				vivienda.setId_vivienda(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de una vivienda.
	 * <!-- end-user-doc -->
	 * @param	vivienda						Vivienda				Vivienda
	 * @model id_viviendaDataType="org.eclipse.uml2.types.Integer" id_viviendaRequired="true" id_viviendaOrdered="false" descripcion_viviendaDataType="org.eclipse.uml2.types.String" descripcion_viviendaRequired="true" descripcion_viviendaOrdered="false" direccion_viviendaDataType="org.eclipse.uml2.types.String" direccion_viviendaRequired="true" direccion_viviendaOrdered="false" id_inmueble_viviendaDataType="org.eclipse.uml2.types.Integer" id_inmueble_viviendaRequired="true" id_inmueble_viviendaOrdered="false" superficie_terreno_viviendaRequired="true" superficie_terreno_viviendaOrdered="false" superficie_viviendaRequired="true" superficie_viviendaOrdered="false" plantas_viviendaDataType="org.eclipse.uml2.types.Integer" plantas_viviendaRequired="true" plantas_viviendaOrdered="false" habitaciones_viviendaDataType="org.eclipse.uml2.types.Integer" habitaciones_viviendaRequired="true" habitaciones_viviendaOrdered="false" banyos_viviendaDataType="org.eclipse.uml2.types.Integer" banyos_viviendaRequired="true" banyos_viviendaOrdered="false"
	 * @generated NOT
	 */
	@Override
	public void editarVivienda(Vivienda vivienda) {

		// Instanciando variables
		String tabla = "VIVIENDAS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_vivienda";
		String where_clause = "";
		
		// A�adiendo columnas
		columnas.add("descripcion_vivienda");
		columnas.add("direccion_vivienda");
		columnas.add("id_inmueble_vivienda");
		columnas.add("superficie_terreno_vivienda");
		columnas.add("superficie_vivienda");
		columnas.add("plantas_vivienda");
		columnas.add("habitaciones_vivienda");
		columnas.add("banyos_vivienda");
		
		// A�adiendo valores
		valores_columnas.add(vivienda.getDescripcion_vivienda());
		valores_columnas.add(vivienda.getDireccion_vivienda());
		valores_columnas.add(String.valueOf(vivienda.getId_inmueble_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getSuperficie_terreno_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getSuperficie_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getPlantas_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getHabitaciones_vivienda()));
		valores_columnas.add(String.valueOf(vivienda.getBanyos_vivienda()));
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + vivienda.getId_vivienda();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
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
		String tabla = "VIVIENDAS";
		String where_clause = "id_vivienda = " + id_vivienda;
		String queryString = queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		Vivienda vivienda = (Vivienda) resultsNewObject;
		this.queryCerrar(server_connection);
		return vivienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Registra un nuevo inmueble.
	 * <!-- end-user-doc -->
	 * @param	inmueble						Inmueble				Inmueble
	 * @model descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 */
	@Override
	public void crearInmueble(Inmueble inmueble) {
		
		// Instanciando variables
		String tabla = "INMUEBLES";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_inmueble";

		// A�adiendo columnas
		columnas.add("descripcion_inmueble");
		columnas.add("direccion_inmueble");
		columnas.add("superficie_terreno_inmueble");
		columnas.add("superficie_inmueble");
		columnas.add("fecha_construccion_inmueble");
		
		// A�adiendo valores
		valores_columnas.add(inmueble.getDescripcion_inmueble());
		valores_columnas.add(inmueble.getDireccion_inmueble());
		valores_columnas.add(String.valueOf(inmueble.getSuperficie_terreno_inmueble()));
		valores_columnas.add(String.valueOf(inmueble.getSuperficie_inmueble()));
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = null;
		if(inmueble.getFecha_construccion_inmueble() != null) {
			fecha = simpleDateFormat.format(inmueble.getFecha_construccion_inmueble());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				inmueble.setId_inmueble(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un inmueble.
	 * <!-- end-user-doc -->
	 * @param	inmueble						Inmueble				Inmueble
	 * @model id_inmuebleDataType="org.eclipse.uml2.types.Integer" id_inmuebleRequired="true" id_inmuebleOrdered="false" descripcion_inmuebleDataType="org.eclipse.uml2.types.String" descripcion_inmuebleRequired="true" descripcion_inmuebleOrdered="false" direccion_inmuebleDataType="org.eclipse.uml2.types.String" direccion_inmuebleRequired="true" direccion_inmuebleOrdered="false" superficie_terreno_inmuebleRequired="true" superficie_terreno_inmuebleOrdered="false" superficie_inmuebleRequired="true" superficie_inmuebleOrdered="false"
	 */
	@Override
	public void editarInmueble(Inmueble inmueble) {

		// Instanciando variables
		String tabla = "INMUEBLES";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_inmueble";
		String where_clause = "";

		// A�adiendo columnas
		columnas.add("descripcion_inmueble");
		columnas.add("direccion_inmueble");
		columnas.add("superficie_terreno_inmueble");
		columnas.add("superficie_inmueble");
		
		// A�adiendo valores
		valores_columnas.add(inmueble.getDescripcion_inmueble());
		valores_columnas.add(inmueble.getDireccion_inmueble());
		valores_columnas.add(String.valueOf(inmueble.getSuperficie_terreno_inmueble()));
		valores_columnas.add(String.valueOf(inmueble.getSuperficie_inmueble()));
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + inmueble.getId_inmueble();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
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
		String tabla = "INMUEBLES";
		String where_clause = "id_inmueble = " + id_inmueble;
		String queryString = queryBuscar(tabla, null, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		Inmueble inmueble = (Inmueble) resultsNewObject;
		this.queryCerrar(server_connection);
		return inmueble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	asignacionCertificado					Certificados_Asignados			Certificados_Asignados
	 * @model id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 */
	@Override
	public void asignarCertificado(Certificados_Asignados asignacionCertificado) {
		
		// Instanciando variables
		String tabla = "ASIGNACION_CERTIFICADOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_certificado_asignado";

		// A�adiendo columnas
		columnas.add("id_certificado_certificado_asignado");
		columnas.add("arquitecto_certificado_asignado");

		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(asignacionCertificado.getId_certificado_certificado_asignado()));
		valores_columnas.add(String.valueOf(asignacionCertificado.getId_arquitecto_certificado_asignado()));
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				asignacionCertificado.setId_certificado_asignado(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignaci�n de un arquitecto a un certificado.
	 * <!-- end-user-doc -->
	 * @param	asignacionCertificado					Certificados_Asignados			Certificados_Asignados
	 * @model id_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_asignadoRequired="true" id_certificado_asignadoOrdered="false" id_certificado_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" id_certificado_certificado_asignadoRequired="true" id_certificado_certificado_asignadoOrdered="false" arquitecto_certificado_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_certificado_asignadoRequired="true" arquitecto_certificado_asignadoOrdered="false"
	 */
	@Override
	public void editarAsignacionCertificado(Certificados_Asignados asignacionCertificado) {
		
		// Instanciando variables
		String tabla = "ASIGNACION_CERTIFICADOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_certificado_asignado";
		String where_clause = "";

		// A�adiendo columnas
		columnas.add("id_certificado_certificado_asignado");
		columnas.add("arquitecto_certificado_asignado");

		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(asignacionCertificado.getId_certificado_certificado_asignado()));
		valores_columnas.add(String.valueOf(asignacionCertificado.getId_arquitecto_certificado_asignado()));
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + asignacionCertificado.getId_certificado_asignado();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Asigna un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyectoCertificado						Proyectos_Asignados				Proyectos_Asignados
	 * @model id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyecto_asignadoRequired="true" arquitecto_proyecto_asignadoOrdered="false"
	 */
	@Override
	public void asignarProyecto(Proyectos_Asignados proyectoAsignado) {
		
		// Instanciando variables
		String tabla = "ASIGNACION_PROYECTOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_proyecto_asignado";

		// A�adiendo columnas
		columnas.add("id_proyecto_proyecto_asignado");
		columnas.add("arquitecto_proyecto_asignado");

		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(proyectoAsignado.getId_proyecto_proyecto_asignado()));
		valores_columnas.add(String.valueOf(proyectoAsignado.getId_arquitecto_proyecto_asignado()));
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				proyectoAsignado.setId_proyecto_asignado(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);

	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita la asignaci�n de un arquitecto a un proyecto.
	 * <!-- end-user-doc -->
	 * @param	proyectoCertificado						Proyectos_Asignados				Proyectos_Asignados
	 * @model id_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_asignadoRequired="true" id_proyecto_asignadoOrdered="false" id_proyecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" id_proyecto_proyecto_asignadoRequired="true" id_proyecto_proyecto_asignadoOrdered="false" arquitecto_proyecto_asignadoDataType="org.eclipse.uml2.types.Integer" arquitecto_proyecto_asignadoRequired="true" arquitecto_proyecto_asignadoOrdered="false"
	 */
	@Override
	public void editarAsignacionProyecto(Proyectos_Asignados proyectoAsignado) {

		// Instanciando variables
		String tabla = "ASIGNACION_PROYECTOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String where_clause = "";
		String columna_ID = "id_ejecucion_proyecto";
		
		// A�adiendo columnas
		columnas.add("id_proyecto_proyecto_asignado");
		columnas.add("arquitecto_proyecto_asignado");

		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(proyectoAsignado.getId_proyecto_proyecto_asignado()));
		valores_columnas.add(String.valueOf(proyectoAsignado.getId_arquitecto_proyecto_asignado()));
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + proyectoAsignado.getId_proyecto_asignado();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gestiona la contrataci�n de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	contratacionCertificado					Proyectos_En_Ejecucion				Proyectos_En_Ejecucion 
	 * @model id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 */
	@Override
	public void contratarProyecto(Proyectos_En_Ejecucion contratacionProyecto) {

		// Instanciando variables
		String tabla = "PROYECTOS_CONTRATADOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String columna_ID = "id_ejecucion_proyecto";

		// A�adiendo columnas
		columnas.add("id_proyecto_ejecucion_proyecto");
		columnas.add("fecha_inicio_ejecucion_proyecto");
		columnas.add("duracion_prevista_ejecucion_proyecto");
		columnas.add("fecha_fin_ejecucion_proyecto");
		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(contratacionProyecto.getId_proyecto_ejecucion_proyecto()));
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = null;
		if(contratacionProyecto.getFecha_inicio_ejecucion_proyecto() != null) {
			fecha = simpleDateFormat.format(contratacionProyecto.getFecha_inicio_ejecucion_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		valores_columnas.add(String.valueOf(contratacionProyecto.getDuracion_prevista_ejecucion_proyecto()));

		if(contratacionProyecto.getFecha_fin_ejecucion_proyecto() != null) {
			fecha = simpleDateFormat.format(contratacionProyecto.getFecha_fin_ejecucion_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		// Creando query para obtener objeto
		String queryString = queryCrear(tabla, columnas, valores_columnas);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		
		// Obteniendo el id de objeto generado y a�adi�ndolo al objeto recibido
		String queryStringId = queryLastTableId(tabla, columna_ID);
		try {
			ResultSet resultsNewObjectId = (ResultSet) this.queryEjecutar(server_connection, queryStringId);
			while(resultsNewObjectId.next()) {
				contratacionProyecto.setId_proyecto_ejecucion_proyecto(resultsNewObjectId.getInt(columna_ID));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.queryCerrar(server_connection);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Edita la gesti�n sobre la contrataci�n de un proyecto.
	 * <!-- end-user-doc -->
	 * @param	contratacionCertificado					Proyectos_En_Ejecucion				Proyectos_En_Ejecucion 
	 * @model id_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_ejecucion_proyectoRequired="true" id_ejecucion_proyectoOrdered="false" id_proyecto_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" id_proyecto_ejecucion_proyectoRequired="true" id_proyecto_ejecucion_proyectoOrdered="false" fecha_inicio_ejecucion_proyectoRequired="true" fecha_inicio_ejecucion_proyectoOrdered="false" duracion_prevista_ejecucion_proyectoDataType="org.eclipse.uml2.types.Integer" duracion_prevista_ejecucion_proyectoRequired="true" duracion_prevista_ejecucion_proyectoOrdered="false" fecha_fin_ejecucion_proyectoRequired="true" fecha_fin_ejecucion_proyectoOrdered="false"
	 */
	@Override
	public void editarContratacionProyecto(Proyectos_En_Ejecucion contratacionProyecto) {

		// Instanciando variables
		String tabla = "PROYECTOS_CONTRATADOS";
		List<String> columnas = new ArrayList<String>();
		List<String> valores_columnas = new ArrayList<String>();
		String where_clause = "";
		String columna_ID = "id_ejecucion_proyecto";
		
		// A�adiendo columnas
		columnas.add("id_proyecto_ejecucion_proyecto");
		columnas.add("fecha_inicio_ejecucion_proyecto");
		columnas.add("duracion_prevista_ejecucion_proyecto");
		columnas.add("fecha_fin_ejecucion_proyecto");
		
		// A�adiendo valores
		valores_columnas.add(String.valueOf(contratacionProyecto.getId_proyecto_ejecucion_proyecto()));
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = null;
		if(contratacionProyecto.getFecha_inicio_ejecucion_proyecto() != null) {
			fecha = simpleDateFormat.format(contratacionProyecto.getFecha_inicio_ejecucion_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
				
		valores_columnas.add(String.valueOf(contratacionProyecto.getDuracion_prevista_ejecucion_proyecto()));
		
		if(contratacionProyecto.getFecha_fin_ejecucion_proyecto() != null) {
			fecha = simpleDateFormat.format(contratacionProyecto.getFecha_fin_ejecucion_proyecto());
		} else {
			fecha = null;
		}
		valores_columnas.add(fecha);
		
		// Creando query para obtener objeto
		where_clause += columna_ID + " = " + contratacionProyecto.getId_ejecucion_proyecto();
		String queryString = queryEditar(tabla, columnas, valores_columnas, where_clause);
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);

	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una creaci�n SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde a�adir datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde insertar la informaci�n
	 * @param	valores_columnas		List<String>		Lista de los valores para las columnas/campos (en el mismo orden)
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false"
	 */
	@Override
	public String queryCrear(String tabla, List<String> columnas, List<String> valores_columnas) {
		String queryString = "INSERT INTO " + tabla + " (";
		for(Integer i = 0; i < columnas.size(); i++) {
			queryString += columnas.get(i);
			if(i != columnas.size() - 1)  queryString += ",";
		}
		queryString += ") VALUES (";
		for(Integer i = 0; i < valores_columnas.size(); i++) {
			queryString += "'" + valores_columnas.get(i) + "'";
			if(i != valores_columnas.size() - 1)  queryString += ",";
		}
		queryString += ")";
		return queryString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una edici�n SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde editar datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde editar la informaci�n
	 * @param	valores_columnas		List<String>		Lista de los valores para las columnas/campos (en el mismo orden)
	 * @param	where_clause			String				Cadena con las condiciones de la query
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" valores_columnasRequired="true" valores_columnasOrdered="false" where_clauseDataType="org.eclipse.uml2.types.String" where_clauseRequired="true" where_clauseOrdered="false"
	 */
	@Override
	public String queryEditar(String tabla, List<String> columnas, List<String> valores_columnas, String where_clause) {
		String queryString = "UPDATE " + tabla + " SET ";
		for(Integer i = 0; i < columnas.size(); i++) {
			queryString += columnas.get(i) + " = '" + valores_columnas.get(i) + "'";
			if(i != columnas.size() - 1)  queryString += ",";
		}
		queryString += " WHERE " + where_clause;
		return queryString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para realizar una b�squeda SQL.
	 * <!-- end-user-doc -->
	 * @param	tabla					String				La tabla donde editar datos
	 * @param	columnas				List<String>		Lista de columnas/campos donde editar la informaci�n
	 * @param	where_clause_01			String				Cadena con las condiciones de la query
	 * @return							String				Cadena con la query SQL
	 * @model tablaDataType="org.eclipse.uml2.types.String" tablaRequired="true" tablaOrdered="false" columnasRequired="true" columnasOrdered="false" where_clause_01DataType="org.eclipse.uml2.types.String" where_clause_01Required="true" where_clause_01Ordered="false"
	 */
	@Override
	public String queryBuscar(String tabla, List<String> columnas, String where_clause) {
		String queryString = "SELECT ";
		if(columnas == null || columnas.isEmpty()) {
			queryString += "* ";
		} else {
			for(Integer i = 0; i < columnas.size(); i++) {
				queryString += columnas.get(i);
				if(i != columnas.size() - 1)  queryString += ",";
			}
		}
		queryString += " FROM " + tabla;
//		if(where_clause != null || !where_clause.isEmpty()) {
		if(where_clause != null) {
			queryString += " WHERE " + where_clause;
		}
		
		return queryString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelve un string con la query necesaria para crear una tabla SQL.
	 * <!-- end-user-doc -->
	 * @param	nombreTabla				String				El nombre de la tabla a crear
	 * @param	columnas				List<String>		Lista de columnas/campos donde se insertar� la informaci�n. Hay que especificar los tipos (p.ej.: varchar(255)...)
	 * @return							String				Cadena con la query SQL
	 */
	@Override
	public String queryCrearTabla(String nombreTabla, List<String> columnas) {
		String queryString = "CREATE TABLE " + nombreTabla + "(";
		for(Integer i = 0; i < columnas.size(); i++) {
			queryString += columnas.get(i);
			if(i != columnas.size() - 1)  queryString += ",";
		}
		queryString += ")";
		return queryString;
	}
	
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Crea una tabla de USUARIOS.
	 * <!-- end-user-doc -->
	 * @return							String				Cadena con la query SQL 
	 */
	@Override
	public void crearTablaUsuario() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_usuario IDENTITY PRIMARY KEY");
		columnas.add("nombre_usuario varchar(30)");
		columnas.add("apellidos_usuario varchar(120)");
		columnas.add("dni_usuario varchar(15)");
		columnas.add("telefono_usuario int");
		columnas.add("email_usuario varchar(50)");
		columnas.add("domicilio_usuario varchar(120)");
		columnas.add("rol_usuario int");
		columnas.add("contrasenya_usuario varchar(64)");
		
		String queryString = queryCrearTabla("USUARIOS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);

	}

	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Crea una tabla de ROL.
	 * <!-- end-user-doc -->
	 * @return							String				Cadena con la query SQL 
	 */
	@Override
	public void crearTablaRol() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_rol IDENTITY PRIMARY KEY");
		columnas.add("descripcion_rol varchar(20)");
		
		String queryString = queryCrearTabla("ROL", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 *  Crea una tabla de PERMISOS.
	 * <!-- end-user-doc -->
	 * @param	id_rol_permiso			int			Id rol
	 * @param	descripcion_permiso		String		Descripci�n
	 * @param	objeto_permiso			String		Objeto/P�gina a la que acceder
	 * @param	lectura_permiso			Boolean		Concede permiso de lectura
	 * @param	escritura_permiso		Boolean		Concede permiso de escritura
	 * @return							String				Cadena con la query SQL
	 */
	@Override
	public void crearTablaPermiso() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_permiso IDENTITY PRIMARY KEY");
		columnas.add("id_rol_permiso int");
		columnas.add("descripcion_permiso varchar(20)");
		columnas.add("objeto_permiso varchar(20)");
		columnas.add("lectura_permiso bit(1)");
		columnas.add("escritura_permiso bit(1)");
		
		String queryString = queryCrearTabla("PERMISOS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de CERTIFICADOS.
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void crearTablaCertificado() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_certificado IDENTITY PRIMARY KEY");
		columnas.add("descripcion_certificado varchar(20)");
		columnas.add("cliente_certificado int");
		columnas.add("vivienda_certificado int");
		columnas.add("inmueble_certificado int");
		columnas.add("tipo_certificado varchar(20)");
		columnas.add("fecha_solicitud_certificado varchar(20)");
		columnas.add("fecha_entrega_certificado varchar(20)");
		columnas.add("fecha_visita_certificado varchar(20)");
		columnas.add("fecha_emision_certificado varchar(20)");
		columnas.add("categoria_certificado varchar(20)");
		columnas.add("arquitecto_certificado int");
		columnas.add("coste_certificado double");
		
		String queryString = queryCrearTabla("CERTIFICADOS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de PROYECTOS.
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void crearTablaProyecto() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_proyecto IDENTITY PRIMARY KEY");
		columnas.add("descripcion_proyecto varchar(20)");
		columnas.add("cliente_proyecto int");
		columnas.add("vivienda_proyecto int");
		columnas.add("inmueble_proyecto int");
		columnas.add("tipo_proyecto varchar(20)");
		columnas.add("fecha_solicitud_proyecto varchar(20)");
		columnas.add("fecha_entrega_proyecto varchar(20)");
		columnas.add("duracion_prevista_proyecto int");
		columnas.add("presupuesto_ejecucion_proyecto double");
		columnas.add("superficie_proyecto double");
		columnas.add("coste_proyecto double");
		
		String queryString = queryCrearTabla("PROYECTOS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de VIVIENDAS.
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void crearTablaVivienda() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_vivienda IDENTITY PRIMARY KEY");
		columnas.add("descripcion_vivienda varchar(20)");
		columnas.add("direccion_vivienda varchar(60)");
		columnas.add("id_inmueble_vivienda int");
		columnas.add("superficie_terreno_vivienda double");
		columnas.add("superficie_vivienda double");
		columnas.add("plantas_vivienda int");
		columnas.add("habitaciones_vivienda int");
		columnas.add("banyos_vivienda int");
		
		String queryString = queryCrearTabla("VIVIENDAS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de INMUEBLES.
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void crearTablaInmueble() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_inmueble IDENTITY PRIMARY KEY");
		columnas.add("descripcion_inmueble varchar(20)");
		columnas.add("direccion_inmueble varchar(60)");
		columnas.add("superficie_terreno_inmueble double");
		columnas.add("superficie_inmueble double");
		columnas.add("fecha_construccion_inmueble varchar(20)");
				
		String queryString = queryCrearTabla("INMUEBLES", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de ASIGNACION_CERTIFICADOS.
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void crearTablaAsignarCertificado() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_certificado_asignado IDENTITY PRIMARY KEY");
		columnas.add("id_certificado_certificado_asignado int");
		columnas.add("arquitecto_certificado_asignado int");
		
		String queryString = queryCrearTabla("ASIGNACION_CERTIFICADOS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de ASIGNACION_PROYECTOS.
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void crearTablaAsignarProyecto() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_proyecto_asignado IDENTITY PRIMARY KEY");
		columnas.add("id_proyecto_proyecto_asignado int");
		columnas.add("arquitecto_proyecto_asignado int");
		
		String queryString = queryCrearTabla("ASIGNACION_PROYECTOS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet resultsNewObject = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Crea una tabla de PROYECTOS_CONTRATADOS.
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void crearTablaContratarProyecto() {
		List<String> columnas = new ArrayList<String>();
		columnas.add("id_ejecucion_proyecto IDENTITY PRIMARY KEY");
		columnas.add("id_proyecto_ejecucion_proyecto int");
		columnas.add("fecha_inicio_ejecucion_proyecto varchar(20)");
		columnas.add("duracion_prevista_ejecucion_proyecto int");
		columnas.add("fecha_fin_ejecucion_proyecto varchar(20)");
				
		String queryString = queryCrearTabla("PROYECTOS_CONTRATADOS", columnas);
		
		Server_ConnectionImpl server_connection = this.connect2Server(this.url, this.user, this.password);
		ResultSet results = (ResultSet) this.queryEjecutar(server_connection, queryString);
		this.queryCerrar(server_connection);
	}	

	/**
	 * <!-- begin-user-doc -->
	 * Conecta con la BBDD.
	 * <!-- end-user-doc -->
	 *
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 * @return the server connection
	 */
	@Override
	public Server_ConnectionImpl connect2Server(String url, String user, String password) {
		
		Server_Connection server_connection = new Server_ConnectionImpl(url, user, password);
		server_connection.serverConnect();
		return (Server_ConnectionImpl) server_connection;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Ejecuta la query que se le pasa como par�metro.
	 * <!-- end-user-doc -->
	 *
	 * @param server_connection 	Server_Connection	Conexi�n al server
	 * @param queryString 			String				Cadena con la query SQL
	 * @return 						Object				Objeto de retorno de la BBDD
	 * @model required="true" ordered="false" queryStringDataType="org.eclipse.uml2.types.String" queryStringRequired="true" queryStringOrdered="false"
	 * @generated NOT
	 */
	@Override
	public Object queryEjecutar(Server_ConnectionImpl server_connection, String queryString) {
				
		server_connection.serverSetStatement();
		server_connection.serverResultSet(queryString); 
		ResultSet results = server_connection.getResults();
		return results;
	}
	
	@Override
	public void queryCerrar(Server_Connection server_connection) {
		
		server_connection.serverCloseResultSet();
		server_connection.serverCloseStatement();
		server_connection.serverDisconnect();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Devuelva el �ltimo Id creado en la tabla correspondiente
	 * <!-- end-user-doc -->
	 * @param	tabla				String				Tabla
	 * @param	columna_ID			String				El nombre del campo/columna
	 * @return						String				Id
	 * @model required="true" ordered="false" queryStringDataType="org.eclipse.uml2.types.String" queryStringRequired="true" queryStringOrdered="false"
	 */
	private String queryLastTableId(String tabla, String columna_ID) {
		String queryString = "SELECT MAX(" + columna_ID + ") AS " + columna_ID + " FROM " + tabla + " GROUP BY " + columna_ID;
		return queryString;
	}
	
}
