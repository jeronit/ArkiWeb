/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.vista.struts2mvc.modelo;

import com.opensymphony.xwork2.ActionSupport;

import ArkiWeb.controlador.Controlador_Modelo;
import ArkiWeb.controlador.impl.Controlador_ModeloImpl;
import ArkiWeb.vista.struts2mvc.modelo.util.Utils;
import ArkiWeb.vista.struts2mvc.modelo.util.impl.UtilsImpl;

/**
 * @author JTE
 *
 */
public class StartAppActionSupport extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2850633051632121719L;

	/** The controlador modelo. */
	private Controlador_Modelo controlador_modelo;
	
	/** The utility class. */
	private Utils util;
	
	
	/**
	 * 
	 */
	public StartAppActionSupport() {
		super();
		this.controlador_modelo = new Controlador_ModeloImpl();
		this.util = UtilsImpl.getInstance();
	}
	
	public String initLogin() {
		System.out.println("initLogin");
		return SUCCESS;
	}
	
	public String initRequestCertificate() {
		System.out.println("initRequestCertificate");
		return SUCCESS;
	}
	
	public String initRequestProject() {
		System.out.println("initRequestProject");
		return SUCCESS;
	}
	
	@Override
	public String execute() {
		return null;
		
	}

	@Override
	public void validate() {
		
		
	}
}
