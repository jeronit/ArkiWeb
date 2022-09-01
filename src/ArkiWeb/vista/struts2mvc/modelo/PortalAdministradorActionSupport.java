/**
 * 	@purpose:	Controla la JSP del Portal del Administrador
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.opensymphony.xwork2.ActionSupport;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;
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
	private Controlador_Modelo controlador_modelo;
	
	/**
	 * 
	 */
	public PortalAdministradorActionSupport() {
		super();
		this.controlador_modelo = new Controlador_ModeloImpl();
		this.usuarios = new ArrayList<Usuario>();
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
		
		
		return LOGIN;
		
	}
	
	public String getUsers() {
		this.setUsuarios(this.controlador_modelo.listarUsuarios());
		if(this.getUsuarios() != null) {
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
	};

} // PortalAdministradorActionSupport
