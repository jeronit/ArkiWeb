/**
 * 	@purpose:	Controla la JSP para el proceso de login
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo;

import java.sql.Date;
import java.sql.SQLException;
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
import ArkiWeb.modelo.impl.CertificadoImpl;
import ArkiWeb.modelo.impl.RolImpl;
import ArkiWeb.vista.struts2mvc.modelo.util.Utils;
import ArkiWeb.vista.struts2mvc.modelo.util.impl.UtilsImpl;

// TODO: Auto-generated Javadoc
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Action Support</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloPackage#getLoginActionSupport()
 * @model
 * @generated NOT
 */
public class SolicitudCertificadoActionSupport extends ActionSupport {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8601040361717122903L;
	
	/** The email usuario. */
	private String email_usuario;
	
	/** The contrasenya usuario. */
	private String contrasenya_usuario;
	
	/** The controlador modelo. */
	private Controlador_Modelo controlador_modelo;
	
	/** The usuario. */
	private Usuario usuario;
	
	/** The usuarios. */
	private List<Usuario> usuarios;
	
	/** The certificados. */
	private List<Certificado> certificados;
	
	/** The proyectos. */
	private List<Proyecto> proyectos;
	
	/** The inmuebles. */
	private List<Inmueble> inmuebles;
	
	/** The viviendas. */
	private List<Vivienda> viviendas;
	
	/** The user id. */
	private int userId;
	
	/** The user name. */
	private String userName;
	
	/** The session. */
	private Map<String, Object> session;
	
	/** The utility class. */
	private Utils util;

	private String descripcion_certificado;

	private double coste_certificado;
	
	/**
	 * Instantiates a new login action support.
	 */
	public SolicitudCertificadoActionSupport() {
		super();
		this.util = UtilsImpl.getInstance();
		this.controlador_modelo = new Controlador_ModeloImpl();
		new ArrayList<Usuario>();
		this.certificados = new ArrayList<Certificado>();
		this.proyectos = new ArrayList<Proyecto>();
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
		Usuario user = this.getUsuario();
		if(user != null) {
			Certificado certificado = new CertificadoImpl();
			certificado.setDescripcion_certificado(descripcion_certificado);
			certificado.setId_cliente_certificado(user.getId_usuario());
			certificado.setId_vivienda_certificado(d);
			certificado.setId_inmueble_certificado(f);
			certificado.setTipo_certificado(we);
			certificado.setFecha_solicitud_certificado(new Date());
			certificado.setCoste_certificado(coste_certificado);
			
			String rol = user.getRol().getDescripcion_rol();
			return rol;
		} else {
//			addActionError("Email not in our Database.");
			return INPUT;
		}
		
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
		if(this.getEmail_usuario().isEmpty()) {
			addFieldError("email_usuario", "Email cannot be blank.");
		}
		
		if(!this.getEmail_usuario().contains("@")) {
			addFieldError("email_usuario", "Write a proper email.");
		}
		
		if(this.getContrasenya_usuario() == null | this.getContrasenya_usuario().isEmpty()) {
			addFieldError("contrasenya_usuario", "Write your password.");
		}
		
		try {
			this.setUsuario(this.controlador_modelo.buscarUsuarioPorEmail(this.getEmail_usuario()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(this.getUsuario() == null) {
			addActionError("Email not in our Database.");
		}
	}

	/**
	 * Gets the session data.
	 *
	 * 
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
	public String getUsersSolicitudCertificado() {
		this.setUsuarios(this.controlador_modelo.listarUsuarios());
		if(this.getUsuarios() != null) {
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	/**
	 * Gets the certificates.
	 *
	 * @return the certificates
	 */
	public String getCertificatesSolicitudCertificado() {
		this.setCertificados(this.controlador_modelo.buscarMisCertificados((int) this.getSession().get("id")));
		
		if(this.getCertificados() != null) {
			this.getUsersSolicitudCertificado();
			this.getViviendasSolicitudCertificado();
			this.getInmueblesSolicitudCertificado();
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	
	/**
	 * Gets the projects.
	 *
	 * @return the projects
	 */
	public String getProjectsSolicitudCertificado() {
		this.setProyectos(this.controlador_modelo.buscarMisProyectos((int) this.getSession().get("id")));
		if(this.getProyectos() != null) {
			this.getUsersSolicitudCertificado();
			this.getViviendasSolicitudCertificado();
			this.getInmueblesSolicitudCertificado();
			return SUCCESS;
		}
		
		return LOGIN;
	}

	/**
	 * Gets the inmuebles Solicitud Certificado.
	 *
	 * @return the inmuebles Solicitud Certificado
	 */
	public String getInmueblesSolicitudCertificado() {
		this.setInmuebles(this.controlador_modelo.listarInmuebles());
		if(this.getInmuebles() != null) {
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	/**
	 * Gets the viviendas Solicitud Certificado.
	 *
	 * @return the viviendas Solicitud Certificado
	 */
	public String getViviendasSolicitudCertificado() {
		this.setViviendas(this.controlador_modelo.listarViviendas());
		if(this.getViviendas() != null) {
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	/**
	 * Gets the email usuario.
	 *
	 * @return the email_usuario
	 */
	public String getEmail_usuario() {
		return email_usuario;
	}

	/**
	 * Sets the email usuario.
	 *
	 * @param email_usuario the email_usuario to set
	 */
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	/**
	 * Gets the contrasenya usuario.
	 *
	 * @return the contrasenya_usuario
	 */
	public String getContrasenya_usuario() {
		return contrasenya_usuario;
	}

	/**
	 * Sets the contrasenya usuario.
	 *
	 * @param contrasenya_usuario the contrasenya_usuario to set
	 */
	public void setContrasenya_usuario(String contrasenya_usuario) {
		this.contrasenya_usuario = contrasenya_usuario;
	}

	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Sets the usuario.
	 *
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * @return the certificados
	 */
	public List<Certificado> getCertificados() {
		return certificados;
	}

	/**
	 * @param certificados the certificados to set
	 */
	public void setCertificados(List<Certificado> certificados) {
		this.certificados = certificados;
	}

	/**
	 * @return the proyectos
	 */
	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	/**
	 * @param proyectos the proyectos to set
	 */
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	/**
	 * @return the inmuebles
	 */
	public List<Inmueble> getInmuebles() {
		return inmuebles;
	}

	/**
	 * @param inmuebles the inmuebles to set
	 */
	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	/**
	 * @return the viviendas
	 */
	public List<Vivienda> getViviendas() {
		return viviendas;
	}

	/**
	 * @param viviendas the viviendas to set
	 */
	public void setViviendas(List<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	};
	
	

} // LoginActionSupport
