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

import ArkiWeb.modelo.Permiso;
import ArkiWeb.modelo.Rol;

/**
 * @author JTE
 *
 */
public class PermisoImpl implements Permiso {

	private int id_permiso;
	private int id_rol;
	private String objeto_permiso;
	private boolean lectura_permiso;
	private boolean escritura_permiso;
	
	/**
	 * 
	 */
	public PermisoImpl() {
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
	public Rol getRol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRol(Rol value) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the id_permiso
	 */
	@Override
	public int getId_permiso() {
		return id_permiso;
	}

	/**
	 * @param id_permiso the id_permiso to set
	 */
	@Override
	public void setId_permiso(int id_permiso) {
		this.id_permiso = id_permiso;
	}

	/**
	 * @return the id_rol
	 */
	@Override
	public int getId_rol() {
		return id_rol;
	}

	/**
	 * @param id_rol the id_rol to set
	 */
	@Override
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	/**
	 * @return the objeto_permiso
	 */
	@Override
	public String getObjeto_permiso() {
		return objeto_permiso;
	}

	/**
	 * @param objeto_permiso the objeto_permiso to set
	 */
	@Override
	public void setObjeto_permiso(String objeto_permiso) {
		this.objeto_permiso = objeto_permiso;
	}

	/**
	 * @return the lectura_permiso
	 */
	@Override
	public boolean isLectura_permiso() {
		return lectura_permiso;
	}

	/**
	 * @param lectura_permiso the lectura_permiso to set
	 */
	@Override
	public void setLectura_permiso(boolean lectura_permiso) {
		this.lectura_permiso = lectura_permiso;
	}

	/**
	 * @return the escritura_permiso
	 */
	@Override
	public boolean isEscritura_permiso() {
		return escritura_permiso;
	}

	/**
	 * @param escritura_permiso the escritura_permiso to set
	 */
	@Override
	public void setEscritura_permiso(boolean escritura_permiso) {
		this.escritura_permiso = escritura_permiso;
	}

}
