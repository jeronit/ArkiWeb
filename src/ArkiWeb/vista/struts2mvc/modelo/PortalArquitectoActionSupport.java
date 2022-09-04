/**
 * 	@purpose:	Controla la JSP del Portal del Arquitecto
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
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.vista.struts2mvc.modelo.util.Utils;
import ArkiWeb.vista.struts2mvc.modelo.util.impl.UtilsImpl;

// TODO: Auto-generated Javadoc
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portal Arquitecto Action Support</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloPackage#getPortalArquitectoActionSupport()
 * @model
 * @generated NOT
 */
public class PortalArquitectoActionSupport extends ActionSupport {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4300306781413431056L;
	
	/** The certificados. */
	private List<Certificado> certificados;
	
	/** The proyectos. */
	private List<Proyecto> proyectos;
	
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
	
	/**
	 * Instantiates a new portal arquitecto action support.
	 */
	public PortalArquitectoActionSupport() {
		super();
		this.util = UtilsImpl.getInstance();
		this.controlador_modelo = new Controlador_ModeloImpl();
		new ArrayList<Usuario>();
		this.certificados = new ArrayList<Certificado>();
		this.proyectos = new ArrayList<Proyecto>();
		this.session = ActionContext.getContext().getSession();
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
		this.setUserId((int) this.getSession().get("id"));
		this.setUserName((String) this.getSession().get("userName"));
		System.out.println("id: " + this.getSession().get("id"));
		System.out.println("userName: " + this.getSession().get("userName"));
		return SUCCESS;
	};
	
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
		
		
	};
	
	/**
	 * Gets the certificates.
	 *
	 * @return the certificates
	 */
	public String getCertificatesPortalArquitecto() {
		this.setCertificados(this.controlador_modelo.buscarMisCertificados((int) this.getSession().get("id")));
		if(this.getCertificados() != null) {
			execute();
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	
	/**
	 * Gets the projects.
	 *
	 * @return the projects
	 */
	public String getProjectsPortalArquitecto() {
		this.setProyectos(this.controlador_modelo.buscarMisProyectos((int) this.getSession().get("id")));
		if(this.getProyectos() != null) {
			execute();
			return SUCCESS;
		}
		
		return LOGIN;
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

} // PortalArquitectoActionSupport
