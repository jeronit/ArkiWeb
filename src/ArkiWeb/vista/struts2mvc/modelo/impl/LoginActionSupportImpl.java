/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo.impl;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;
import ArkiWeb.vista.struts2mvc.modelo.ActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.LoginActionSupport;
import ArkiWeb.vista.struts2mvc.modelo.ModeloPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Action Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LoginActionSupportImpl extends ActionSupport implements LoginActionSupport {
	
	private String email_usuario;
	private String contrasenya_usuario;
	private Controlador_Modelo controlador_modelo;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginActionSupportImpl() {
		super();
		controlador_modelo = new Controlador_ModeloImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.LOGIN_ACTION_SUPPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModeloPackage.LOGIN_ACTION_SUPPORT___EXECUTE:
				return execute();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LoginActionSupportImpl
