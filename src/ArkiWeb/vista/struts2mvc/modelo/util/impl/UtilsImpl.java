/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo.util.impl;

import java.util.List;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;
import ArkiWeb.vista.struts2mvc.modelo.util.Utils;

/**
 * @author JTE
 *
 */
public class UtilsImpl implements Utils{
	/** The first instance. */
	private static UtilsImpl firstInstance = null;
	
	/** The utils. */
	Utils utils;
	
	/** The controlador modelo. */
	private Controlador_Modelo controlador_modelo;
	
	/** The roles list. */
	private List<Rol> rolesList;
	
	/** The usuario list. */
	private List<Usuario> usuarioList;
	
	/** The inmueble list. */
	private List<Inmueble> inmuebleList;
	
	/** The vivienda list. */
	private List<Vivienda> viviendaList;
	
	/** The certificado list. */
	private List<Certificado> certificadoList;
	
	/** The proyecto list. */
	private List<Proyecto> proyectoList;
	
	/**
	 * Instantiates a new utils.
	 */
	private UtilsImpl() {
		this.controlador_modelo = new Controlador_ModeloImpl();
		this.setCertificadoList(this.getListCertificado());
		this.setInmuebleList(this.getListInmueble());
		this.setProyectoList(this.getListProyecto());
		this.setRolesList(this.getListRoles());
		this.setUsuarioList(this.getListUsuario());
		this.setViviendaList(this.getListVivienda());
	}

	/**
	 * SINGLETON: Gets the single instance of Utils.
	 *
	 * @return single instance of Utils
	 */
	public static UtilsImpl getInstance() {
		if(firstInstance == null) {
			firstInstance = new UtilsImpl();
		}
		return firstInstance;
	}
	
	/**
	 * Gets the list roles.
	 *
	 * @return the list roles
	 */
	public List<Rol> getListRoles(){
		return this.controlador_modelo.listarRoles();
	}
	
	/**
	 * Gets the list usuario.
	 *
	 * @return the list usuario
	 */
	public List<Usuario> getListUsuario(){
		return this.controlador_modelo.listarUsuarios();
	}
	
	/**
	 * Gets the list inmueble.
	 *
	 * @return the list inmueble
	 */
	public List<Inmueble> getListInmueble(){
		return this.controlador_modelo.listarInmuebles();
	}
	
	/**
	 * Gets the list vivienda.
	 *
	 * @return the list vivienda
	 */
	public List<Vivienda> getListVivienda(){
		return this.controlador_modelo.listarViviendas();
	}
	
	/**
	 * Gets the list certificado.
	 *
	 * @return the list certificado
	 */
	public List<Certificado> getListCertificado(){
		return this.controlador_modelo.listarCertificados();
	}

	/**
	 * Gets the list proyecto.
	 *
	 * @return the list proyecto
	 */
	public List<Proyecto> getListProyecto(){
		return this.controlador_modelo.listarProyectos();
	}

	/**
	 * Gets the controlador modelo.
	 *
	 * @return the controlador_modelo
	 */
	public Controlador_Modelo getControlador_modelo() {
		return controlador_modelo;
	}

	/**
	 * Sets the controlador modelo.
	 *
	 * @param controlador_modelo the controlador_modelo to set
	 */
	public void setControlador_modelo(Controlador_Modelo controlador_modelo) {
		this.controlador_modelo = controlador_modelo;
	}

	/**
	 * Gets the roles list.
	 *
	 * @return the rolesList
	 */
	public List<Rol> getRolesList() {
		return rolesList;
	}

	/**
	 * Sets the roles list.
	 *
	 * @param rolesList the rolesList to set
	 */
	public void setRolesList(List<Rol> rolesList) {
		this.rolesList = rolesList;
	}

	/**
	 * Gets the usuario list.
	 *
	 * @return the usuarioList
	 */
	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}

	/**
	 * Sets the usuario list.
	 *
	 * @param usuarioList the usuarioList to set
	 */
	public void setUsuarioList(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}

	/**
	 * Gets the inmueble list.
	 *
	 * @return the inmuebleList
	 */
	public List<Inmueble> getInmuebleList() {
		return inmuebleList;
	}

	/**
	 * Sets the inmueble list.
	 *
	 * @param inmuebleList the inmuebleList to set
	 */
	public void setInmuebleList(List<Inmueble> inmuebleList) {
		this.inmuebleList = inmuebleList;
	}

	/**
	 * Gets the vivienda list.
	 *
	 * @return the viviendaList
	 */
	public List<Vivienda> getViviendaList() {
		return viviendaList;
	}

	/**
	 * Sets the vivienda list.
	 *
	 * @param viviendaList the viviendaList to set
	 */
	public void setViviendaList(List<Vivienda> viviendaList) {
		this.viviendaList = viviendaList;
	}

	/**
	 * Gets the certificado list.
	 *
	 * @return the certificadoList
	 */
	public List<Certificado> getCertificadoList() {
		return certificadoList;
	}

	/**
	 * Sets the certificado list.
	 *
	 * @param certificadoList the certificadoList to set
	 */
	public void setCertificadoList(List<Certificado> certificadoList) {
		this.certificadoList = certificadoList;
	}

	/**
	 * Gets the proyecto list.
	 *
	 * @return the proyectoList
	 */
	public List<Proyecto> getProyectoList() {
		return proyectoList;
	}

	/**
	 * Sets the proyecto list.
	 *
	 * @param proyectoList the proyectoList to set
	 */
	public void setProyectoList(List<Proyecto> proyectoList) {
		this.proyectoList = proyectoList;
	}
}
