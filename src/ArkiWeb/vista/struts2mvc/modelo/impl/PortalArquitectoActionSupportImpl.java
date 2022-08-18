/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo.impl;

import ArkiWeb.vista.struts2mvc.modelo.ModeloPackage;
import ArkiWeb.vista.struts2mvc.modelo.PortalArquitectoActionSupport;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Arquitecto Action Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortalArquitectoActionSupportImpl extends MinimalEObjectImpl.Container implements PortalArquitectoActionSupport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortalArquitectoActionSupportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.PORTAL_ARQUITECTO_ACTION_SUPPORT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModeloPackage.PORTAL_ARQUITECTO_ACTION_SUPPORT___EXECUTE:
				return execute();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PortalArquitectoActionSupportImpl
