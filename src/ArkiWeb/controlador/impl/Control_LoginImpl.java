/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

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

import ArkiWeb.controlador.Control_Usuarios;
import ArkiWeb.controlador.Gestor_Busquedas;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.util.Utils;

/**
 * @author JTE
 *
 */
public class Control_LoginImpl implements ArkiWeb.controlador.Control_Login {

	Utils utils;
	Control_Usuarios controlUsuarios;
	
	/**
	 * 
	 */
	public Control_LoginImpl() {
		utils = new Utils();
		controlUsuarios = new Control_UsuariosImpl();
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
	 * <!-- begin-user-doc -->
	 * Comprueba si el usuario puede acceder a la aplicaci�n
	 * <!-- end-user-doc -->
	 * @param		email				String			Email
	 * @param		contrasenya			String			Contrase�a
	 * @return							Boolean			Login success
	 * @throws SQLException 
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" contrasenyaDataType="org.eclipse.uml2.types.String" contrasenyaRequired="true" contrasenyaOrdered="false"
	 */
	@Override
	public boolean login(String email, String contrasenya) throws SQLException {
		
		Gestor_Busquedas gestor_Busquedas = new Gestor_BusquedasImpl();
		Usuario usuario = gestor_Busquedas.buscarUsuarioPorEmail(email);
		
		if(usuario.getContrasenya_usuario().equals(String.valueOf(this.utils.hashEncodedString(contrasenya)))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Cambia la contrase�a del usuario
	 * <!-- end-user-doc -->
	 * @param		usuario				Usuario 		Usuario
	 * @param		contrasenya			String			Contrase�a nueva
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 */
	@Override
	public void cambiarContrasenya(Usuario usuario, String contrasenya) {
		
		usuario.setContrasenya_usuario(String.valueOf(this.utils.hashEncodedString(contrasenya)));
		controlUsuarios.editarUsuario(usuario);
		
	}

}
