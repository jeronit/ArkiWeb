/**
 * 	@purpose:	Implementaci�n de la Interface Generar_Tablas_BBDD
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import ArkiWeb.controlador.BBDD_Generar_Tablas;
import ArkiWeb.controlador.Arkiweb_Initializer;
import ArkiWeb.modelo.ConcreteFactory;
import ArkiWeb.modelo.HSQLDB;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.impl.ConcreteFactoryImpl;
import ArkiWeb.modelo.impl.HSQLDBImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class Generar_Tablas_BBDDImpl.
 *
 * @author JTE
 */
public class BBDD_Generar_TablasImpl implements BBDD_Generar_Tablas {

//	HSQLDB db;
//	ConcreteFactory factory;
	Arkiweb_Initializer principal;
	
	/**
	 * Instantiates a new generar tablas BBDD impl.
	 */
	public BBDD_Generar_TablasImpl() {
//		this.db = HSQLDBImpl.getInstance();
//		this.factory = new ConcreteFactoryImpl();
		principal = Arkiweb_Initializer.getInstance();
	}

	/**
	 * Crear tabla certificado.
	 */
	@Override
	public void crearTablaCertificado() {
		principal.db.crearTablaCertificado();
	}

	/**
	 * Crear tabla certificados asignados.
	 */
	@Override
	public void crearTablaCertificados_Asignados() {
		principal.db.crearTablaAsignarCertificado();
	}

	/**
	 * Crear tabla inmueble.
	 */
	@Override
	public void crearTablaInmueble() {
		principal.db.crearTablaInmueble();
	}

	/**
	 * Crear tabla permiso.
	 */
	@Override
	public void crearTablaPermiso() {
		principal.db.crearTablaPermiso();
	}

	/**
	 * Crear tabla proyecto.
	 */
	@Override
	public void crearTablaProyecto() {
		principal.db.crearTablaProyecto();
	}

	/**
	 * Crear tabla proyectos asignados.
	 */
	@Override
	public void crearTablaProyectos_Asignados() {
		principal.db.crearTablaAsignarProyecto();
	}

	/**
	 * Crear tabla proyectos en ejecucion.
	 */
	@Override
	public void crearTablaProyectos_En_Ejecucion() {
		principal.db.crearTablaContratarProyecto();
	}

	/**
	 * Crear tabla rol.
	 */
	@Override
	public void crearTablaRol() {
		principal.db.crearTablaRol();
	}

	/**
	 * Crear tabla usuarios.
	 */
	@Override
	public void crearTablaUsuarios() {
		principal.db.crearTablaUsuario();
	}

	/**
	 * Crear tabla vivienda.
	 */
	@Override
	public void crearTablaVivienda() {
		principal.db.crearTablaVivienda();
	}

}
