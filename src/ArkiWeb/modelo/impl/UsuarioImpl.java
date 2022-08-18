/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo.impl;

import java.lang.reflect.InvocationTargetException;

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

import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Usuario;

/**
 * @author JTE
 *
 */
public class UsuarioImpl implements Usuario {

	private int id_usuario;
	private String nombre_usuario;
	private String apellidos_usuario;
	private String dni_usuario;
	private String telefono_usuario;
	private String email_usuario;
	private String domicilio_usuario;
	private String contrasenya_usuario;
	private int rol_usuario;
	
	/**
	 * 
	 */
	public UsuarioImpl() {
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

	@Override
	public int getId_usuario() {
		// TODO Auto-generated method stub
		return this.id_usuario;
	}

	/**
	 * @param id_usuario the id_usuario to set
	 */
	@Override
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	/**
	 * @return the nombre_usuario
	 */
	@Override
	public String getNombre_usuario() {
		return nombre_usuario;
	}

	/**
	 * @param nombre_usuario the nombre_usuario to set
	 */
	@Override
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	/**
	 * @return the apellidos_usuario
	 */
	@Override
	public String getApellidos_usuario() {
		return apellidos_usuario;
	}

	/**
	 * @param apellidos_usuario the apellidos_usuario to set
	 */
	@Override
	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}

	/**
	 * @return the dni_usuario
	 */
	@Override
	public String getDni_usuario() {
		return dni_usuario;
	}

	/**
	 * @param dni_usuario the dni_usuario to set
	 */
	@Override
	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	/**
	 * @return the telefono_usuario
	 */
	@Override
	public String getTelefono_usuario() {
		return telefono_usuario;
	}

	/**
	 * @param telefono_usuario the telefono_usuario to set
	 */
	@Override
	public void setTelefono_usuario(String telefono_usuario) {
		this.telefono_usuario = telefono_usuario;
	}

	/**
	 * @return the email_usuario
	 */
	@Override
	public String getEmail_usuario() {
		return email_usuario;
	}

	/**
	 * @param email_usuario the email_usuario to set
	 */
	@Override
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	/**
	 * @return the domicilio_usuario
	 */
	@Override
	public String getDomicilio_usuario() {
		return domicilio_usuario;
	}

	/**
	 * @param domicilio_usuario the domicilio_usuario to set
	 */
	@Override
	public void setDomicilio_usuario(String domicilio_usuario) {
		this.domicilio_usuario = domicilio_usuario;
	}

	/**
	 * @return the contrasenya_usuario
	 */
	@Override
	public String getContrasenya_usuario() {
		return contrasenya_usuario;
	}

	/**
	 * @param contrasenya_usuario the contrasenya_usuario to set
	 */
	@Override
	public void setContrasenya_usuario(String contrasenya_usuario) {
		this.contrasenya_usuario = contrasenya_usuario;
	}

	/**
	 * @return the rol_usuario
	 */
	@Override
	public int getRol_usuario() {
		return rol_usuario;
	}

	/**
	 * @param rol_usuario the rol_usuario to set
	 */
	@Override
	public void setRol_usuario(int rol_usuario) {
		this.rol_usuario = rol_usuario;
	}

	@Override
	public Rol getRol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRol(Rol value) {
		// TODO Auto-generated method stub
		
	}

	

	

	
}
