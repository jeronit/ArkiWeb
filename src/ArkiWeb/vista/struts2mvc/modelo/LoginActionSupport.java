/**
 * 	@purpose:	Controla la JSP para el proceso de login
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo;

import java.sql.SQLException;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.impl.RolImpl;

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
public class LoginActionSupport extends ActionSupport {
	
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
	
	/**
	 * Instantiates a new login action support.
	 */
	public LoginActionSupport() {
		super();
		this.controlador_modelo = new Controlador_ModeloImpl();
		this.setUsuario(null);
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
			if(user.getContrasenya_usuario().equals(String.valueOf(this.getContrasenya_usuario().hashCode()))) {
				Map<String, Object> session = ActionContext.getContext().getSession();
				session.put("login","true");
				session.put("id",user.getId_usuario());
				session.put("userName",user.getNombre_usuario());
				
				return this.grantAccess();
				
			} else {
				addActionError("Wrong password.");
				return LOGIN;
			}
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
	 * Grant access.
	 *
	 * @return the string
	 */
	private String grantAccess() {
		String access = "failure";
		Usuario user = this.getUsuario();
		
		int userRol = user.getRol_usuario();
		switch(userRol) {
		case 1:
			access = "arquitecto";
			break;
		case 2:
			access = "administrador";
			break;
		default:
			access = "cliente";
			break;
		}
		return access;
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
	};
	
	

} // LoginActionSupport
