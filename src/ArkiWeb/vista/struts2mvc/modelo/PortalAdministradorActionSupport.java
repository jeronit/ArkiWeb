/**
 * 	@purpose:	Controla la JSP del Portal del Administrador
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;
import ArkiWeb.vista.struts2mvc.modelo.util.Utils;
import ArkiWeb.vista.struts2mvc.modelo.util.impl.UtilsImpl;

// TODO: Auto-generated Javadoc
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portal Administrador Action Support</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloPackage#getPortalAdministradorActionSupport()
 * @model
 * @generated NOT
 */
public class PortalAdministradorActionSupport extends ActionSupport {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1414659030161902545L;
	
	/** The usuarios. */
	private List<Usuario> usuarios;
	
	/** The certificados. */
	private List<Certificado> certificados;
	
	/** The proyectos. */
	private List<Proyecto> proyectos;
	
	/** The roles. */
	private List<Rol> roles;
	
	/** The inmuebles. */
	private List<Inmueble> inmuebles;
	
	/** The viviendas. */
	private List<Vivienda> viviendas;
	
	/** The controlador modelo. */
	private Controlador_Modelo controlador_modelo;
	
	/** The user id. */
	private int userId;
	
	/** The user name. */
	private String userName;
	
	/** The session. */
	private Map<String, Object> session;
	
	/** The utility class. */
	private Utils util;
	
	/** The user id to edit. */
	private String userIdToEdit;

	
	/**
	 * Instantiates a new portal administrador action support.
	 */
	public PortalAdministradorActionSupport() {
		super();
		this.util = UtilsImpl.getInstance();
		this.controlador_modelo = new Controlador_ModeloImpl();
		this.usuarios = new ArrayList<Usuario>();
		this.certificados = new ArrayList<Certificado>();
		this.proyectos = new ArrayList<Proyecto>();
		this.roles = new ArrayList<Rol>();
		this.session = ActionContext.getContext().getSession();
		getSessionData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 	Ejecuta la acción principal
	 * <!-- end-user-doc -->.
	 *
	 * @return the string
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	@Override
	public	String execute() {
		
		return SUCCESS;
		
	}
	
	/**
	 * Gets the session data.
	 *
	 * @return the session data
	 */
	public void getSessionData() {
		this.setUserId((int) this.getSession().get("id"));
		this.setUserName((String) this.getSession().get("userName"));
		System.out.println("id: " + this.getSession().get("id"));
		System.out.println("userName: " + this.getSession().get("userName"));
	}
	
	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	public String getUsersPortalAdministrador() {
		this.setUsuarios(this.controlador_modelo.listarUsuarios());
		if(this.getUsuarios() != null) {
			this.getRolesPortalAdministrador();
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	 
	/**
	 * Gets the certificates.
	 *
	 * @return the certificates
	 */
	public String getCertificatesPortalAdministrador() {
		this.setCertificados(this.controlador_modelo.listarCertificados());
		if(this.getCertificados() != null) {
			this.getUsersPortalAdministrador();
			this.getViviendasPortalAdministrador();
			this.getInmueblesPortalAdministrador();
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	
	/**
	 * Gets the projects.
	 *
	 * @return the projects
	 */
	public String getProjectsPortalAdministrador() {
		this.setProyectos(this.controlador_modelo.listarProyectos());
		if(this.getProyectos() != null) {
			this.getUsersPortalAdministrador();
			this.getViviendasPortalAdministrador();
			this.getInmueblesPortalAdministrador();
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	/**
	 * Gets the roles portal administrador.
	 *
	 * @return the roles portal administrador
	 */
	public String getRolesPortalAdministrador() {
		this.setRoles(this.controlador_modelo.listarRoles());
		if(this.getRoles() != null) {
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	/**
	 * Gets the inmuebles portal administrador.
	 *
	 * @return the inmuebles portal administrador
	 */
	public String getInmueblesPortalAdministrador() {
		this.setInmuebles(this.controlador_modelo.listarInmuebles());
		if(this.getInmuebles() != null) {
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	/**
	 * Gets the viviendas portal administrador.
	 *
	 * @return the viviendas portal administrador
	 */
	public String getViviendasPortalAdministrador() {
		this.setViviendas(this.controlador_modelo.listarViviendas());
		if(this.getViviendas() != null) {
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	/**
	 * Edits the user.
	 *
	 * @return the string
	 */
	public String editUserPortalAdministrador() {
		System.out.println("Parámetro editUser: " + this.getUserIdToEdit());
		return SUCCESS;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 	Valida los datos recibidos
	 * <!-- end-user-doc -->.
	 *
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	@Override
	public void validate() {
		
		
	}

	/**
	 * Gets the usuarios.
	 *
	 * @return the usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * Sets the usuarios.
	 *
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * Gets the certificados.
	 *
	 * @return the certificados
	 */
	public List<Certificado> getCertificados() {
		return certificados;
	}

	/**
	 * Sets the certificados.
	 *
	 * @param certificados the certificados to set
	 */
	public void setCertificados(List<Certificado> certificados) {
		this.certificados = certificados;
	}

	/**
	 * Gets the proyectos.
	 *
	 * @return the proyectos
	 */
	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	/**
	 * Sets the proyectos.
	 *
	 * @param proyectos the proyectos to set
	 */
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * Sets the session.
	 *
	 * @param session the session to set
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * Gets the roles.
	 *
	 * @return the roles
	 */
	public List<Rol> getRoles() {
		return roles;
	}

	/**
	 * Sets the roles.
	 *
	 * @param roles the roles to set
	 */
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	/**
	 * Gets the user id to edit.
	 *
	 * @return the userIdToEdit
	 */
	public String getUserIdToEdit() {
		return userIdToEdit;
	}

	/**
	 * Sets the user id to edit.
	 *
	 * @param userIdToEdit the userIdToEdit to set
	 */
	public void setUserIdToEdit(String userIdToEdit) {
		this.userIdToEdit = userIdToEdit;
	}

	/**
	 * Gets the inmuebles.
	 *
	 * @return the inmuebles
	 */
	public List<Inmueble> getInmuebles() {
		return inmuebles;
	}

	/**
	 * Sets the inmuebles.
	 *
	 * @param inmuebles the inmuebles to set
	 */
	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	/**
	 * Gets the viviendas.
	 *
	 * @return the viviendas
	 */
	public List<Vivienda> getViviendas() {
		return viviendas;
	}

	/**
	 * Sets the viviendas.
	 *
	 * @param viviendas the viviendas to set
	 */
	public void setViviendas(List<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}

} // PortalAdministradorActionSupport
