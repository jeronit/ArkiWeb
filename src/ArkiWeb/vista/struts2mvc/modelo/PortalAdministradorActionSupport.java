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
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Usuario;

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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1414659030161902545L;
	private List<Usuario> usuarios;
	private List<Certificado> certificados;
	private List<Proyecto> proyectos;
	private Controlador_Modelo controlador_modelo;
	private int userId;
	private String userName;
	private Map<String, Object> session;
	
	/**
	 * 
	 */
	public PortalAdministradorActionSupport() {
		super();
		this.controlador_modelo = new Controlador_ModeloImpl();
		this.usuarios = new ArrayList<Usuario>();
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
		
	}
	
	public String getUsers() {
		this.setUsuarios(this.controlador_modelo.listarUsuarios());
		if(this.getUsuarios() != null) {
			execute();
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	
	public String getCertificates() {
		this.setCertificados(this.controlador_modelo.buscarMisCertificados((int) this.getSession().get("id")));
		if(this.getCertificados() != null) {
			execute();
			return SUCCESS;
		}
		
		return LOGIN;
	}
	
	
	public String getProjects() {
		this.setProyectos(this.controlador_modelo.buscarMisProyectos((int) this.getSession().get("id")));
		if(this.getProyectos() != null) {
			execute();
			return SUCCESS;
		}
		
		return LOGIN;
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

} // PortalAdministradorActionSupport
