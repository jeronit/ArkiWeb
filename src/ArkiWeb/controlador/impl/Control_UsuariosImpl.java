/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
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

import ArkiWeb.modelo.Usuario;
import ArkiWeb.server.impl.Server_ConnectionImpl;

/**
 * @author JTE
 *
 */
public class Control_UsuariosImpl implements ArkiWeb.controlador.Control_Usuarios {

	/**
	 * 
	 */
	public Control_UsuariosImpl() {
		// TODO Auto-generated constructor stub
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
	 * Registra un nuevo usuario
	 * <!-- end-user-doc -->
	 * @param		usuario			Usuario			Usuario
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 */
	@Override
	public void crearUsuario(Usuario usuario) {
		
		ArkiWeb.controlador.Arkiweb_Initializer.db.crearUsuario(usuario);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edita los datos de un usuario
	 * <!-- end-user-doc -->
	 * @param		usuario			Usuario			Usuario
	 * @model usuarioRequired="true" usuarioOrdered="false"
	 */
	@Override
	public void editarUsuario(Usuario usuario) {
		
		ArkiWeb.controlador.Arkiweb_Initializer.db.editarUsuario(usuario);
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Elimina los datos de un usuario (manteniendo el id para no crear problemas de integridad referencial)
	 * <!-- end-user-doc -->
	 * @param		id_Usuario			int			Id de usuario
	 * @model id_UsuarioDataType="org.eclipse.uml2.types.Integer" id_UsuarioRequired="true" id_UsuarioOrdered="false"
	 */
	@Override
	public void bajaUsuario(int id_Usuario) {
		
		ArkiWeb.controlador.Arkiweb_Initializer.db.bajaUsuario(id_Usuario);

	}

}
