/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo.util;

import java.util.List;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;
import ArkiWeb.modelo.impl.HSQLDBImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class Utils.
 *
 * @author JTE
 */
public interface Utils {

	/**
	 * Gets the list roles.
	 *
	 * @return the list roles
	 */
	public List<Rol> getListRoles();
	
	/**
	 * Gets the list usuario.
	 *
	 * @return the list usuario
	 */
	public List<Usuario> getListUsuario();
	
	/**
	 * Gets the list inmueble.
	 *
	 * @return the list inmueble
	 */
	public List<Inmueble> getListInmueble();
	
	/**
	 * Gets the list vivienda.
	 *
	 * @return the list vivienda
	 */
	public List<Vivienda> getListVivienda();
	
	/**
	 * Gets the list certificado.
	 *
	 * @return the list certificado
	 */
	public List<Certificado> getListCertificado();

	/**
	 * Gets the list proyecto.
	 *
	 * @return the list proyecto
	 */
	public List<Proyecto> getListProyecto();

	/**
	 * Gets the controlador modelo.
	 *
	 * @return the controlador_modelo
	 */
	public Controlador_Modelo getControlador_modelo();

	/**
	 * Sets the controlador modelo.
	 *
	 * @param controlador_modelo the controlador_modelo to set
	 */
	public void setControlador_modelo(Controlador_Modelo controlador_modelo);
	
}
