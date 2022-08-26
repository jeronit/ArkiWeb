/**
 * 	@purpose:	Controla la JSP para el proceso de login
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo;

import org.eclipse.emf.ecore.EObject;

import com.opensymphony.xwork2.ActionSupport;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;

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
	
	private String email_usuario;
	private String contrasenya_usuario;
	private Controlador_Modelo controlador_modelo;
	
	public LoginActionSupport() {
		super();
		controlador_modelo = new Controlador_ModeloImpl();
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
		return null;
		
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
		if(this.getEmail_usuario().isEmpty()) {
			addFieldError("email_usuario", "Email cannot be blank.");
		}
		
		if(!this.getEmail_usuario().contains("@")) {
			addFieldError("email_usuario", "Write a proper email.");
		}
		
	}

	/**
	 * @return the email_usuario
	 */
	public String getEmail_usuario() {
		return email_usuario;
	}

	/**
	 * @param email_usuario the email_usuario to set
	 */
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	/**
	 * @return the contrasenya_usuario
	 */
	public String getContrasenya_usuario() {
		return contrasenya_usuario;
	}

	/**
	 * @param contrasenya_usuario the contrasenya_usuario to set
	 */
	public void setContrasenya_usuario(String contrasenya_usuario) {
		this.contrasenya_usuario = contrasenya_usuario;
	};
	
	

} // LoginActionSupport
