/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import ArkiWeb.controlador.BBDD_Generar_Datos_Demo;
import ArkiWeb.controlador.Borrar;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Usuario;

/**
 * @author JTE
 *
 */
public class BBDD_Generar_Datos_DemoImpl implements BBDD_Generar_Datos_Demo {

//	Borrar principal;
	
	/**
	 * 
	 */
	public BBDD_Generar_Datos_DemoImpl() {
//		principal = new Borrar();
	}

	@Override
	public void insertarRoles() {
		Rol rol1 = (Rol) ArkiWeb.controlador.Borrar.factory.crearObjeto("Rol");
		Rol rol2 = (Rol) ArkiWeb.controlador.Borrar.factory.crearObjeto("Rol");
		Rol rol3 = (Rol) ArkiWeb.controlador.Borrar.factory.crearObjeto("Rol");
		
		rol1.setDescripcion_rol("Cliente");
		rol2.setDescripcion_rol("Arquitecto");
		rol3.setDescripcion_rol("Administrador");
		
		ArkiWeb.controlador.Borrar.db.crearRol(rol1);
		ArkiWeb.controlador.Borrar.db.crearRol(rol2);
		ArkiWeb.controlador.Borrar.db.crearRol(rol3);
	}

	@Override
	public void insertarUsuarios() {
		Usuario usuario1 = (Usuario) ArkiWeb.controlador.Borrar.factory.crearObjeto("Usuario");
		Usuario usuario2 = (Usuario) ArkiWeb.controlador.Borrar.factory.crearObjeto("Usuario");
		Usuario usuario3 = (Usuario) ArkiWeb.controlador.Borrar.factory.crearObjeto("Usuario");
		Usuario usuario4 = (Usuario) ArkiWeb.controlador.Borrar.factory.crearObjeto("Usuario");
		Usuario usuario5 = (Usuario) ArkiWeb.controlador.Borrar.factory.crearObjeto("Usuario");
		Usuario usuario6 = (Usuario) ArkiWeb.controlador.Borrar.factory.crearObjeto("Usuario");
		
		usuario1.setNombre_usuario("Arquitecto Usuario 01");
		usuario1.setApellidos_usuario("Apellidos Usuario 01");
		usuario1.setDomicilio_usuario("Casa Usuario 01");
		usuario1.setDni_usuario("DNI Usuario 01");
		usuario1.setContrasenya_usuario("0123");
		usuario1.setEmail_usuario("emailusuario01@usuario.com");
		usuario1.setRol_usuario(2);
		usuario1.setTelefono_usuario("012345678");
		
		usuario1.setNombre_usuario("Arquitecto Usuario 02");
		usuario1.setApellidos_usuario("Apellidos Usuario 02");
		usuario1.setDomicilio_usuario("Casa Usuario 02");
		usuario1.setDni_usuario("DNI Usuario 02");
		usuario1.setContrasenya_usuario("1234");
		usuario1.setEmail_usuario("emailusuario02@usuario.com");
		usuario1.setRol_usuario(2);
		usuario1.setTelefono_usuario("123456789");
		
		usuario1.setNombre_usuario("Administrador Usuario 03");
		usuario1.setApellidos_usuario("Apellidos Usuario 03");
		usuario1.setDomicilio_usuario("Casa Usuario 03");
		usuario1.setDni_usuario("DNI Usuario 03");
		usuario1.setContrasenya_usuario("2345");
		usuario1.setEmail_usuario("emailusuario03@usuario.com");
		usuario1.setRol_usuario(3);
		usuario1.setTelefono_usuario("234567890");
		
		usuario1.setNombre_usuario("Cliente Usuario 04");
		usuario1.setApellidos_usuario("Apellidos Usuario 04");
		usuario1.setDomicilio_usuario("Casa Usuario 04");
		usuario1.setDni_usuario("DNI Usuario 04");
		usuario1.setContrasenya_usuario("3456");
		usuario1.setEmail_usuario("emailusuario04@usuario.com");
		usuario1.setRol_usuario(1);
		usuario1.setTelefono_usuario("345678901");
		
		usuario1.setNombre_usuario("Cliente Usuario 05");
		usuario1.setApellidos_usuario("Apellidos Usuario 05");
		usuario1.setDomicilio_usuario("Casa Usuario 05");
		usuario1.setDni_usuario("DNI Usuario 05");
		usuario1.setContrasenya_usuario("4567");
		usuario1.setEmail_usuario("emailusuario05@usuario.com");
		usuario1.setRol_usuario(1);
		usuario1.setTelefono_usuario("987654321");
		
		usuario6.setNombre_usuario("Cliente Usuario 06");
		usuario6.setApellidos_usuario("Apellidos Usuario 06");
		usuario6.setDomicilio_usuario("Casa Usuario 06");
		usuario6.setDni_usuario("DNI Usuario 06");
		usuario6.setContrasenya_usuario("6789");
		usuario6.setEmail_usuario("emailusuario06@usuario.com");
		usuario6.setRol_usuario(1);
		usuario6.setTelefono_usuario("876543210");
		
		ArkiWeb.controlador.Borrar.db.crearUsuario(usuario1);
		ArkiWeb.controlador.Borrar.db.crearUsuario(usuario2);
		ArkiWeb.controlador.Borrar.db.crearUsuario(usuario3);
		ArkiWeb.controlador.Borrar.db.crearUsuario(usuario4);
		ArkiWeb.controlador.Borrar.db.crearUsuario(usuario5);
		ArkiWeb.controlador.Borrar.db.crearUsuario(usuario6);

	}

	@Override
	public void insertarPermisos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarInmuebles() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarViviendas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarCertificados() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarCertificados_Asignados() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarProyectos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarProyectos_Asignados() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarProyectos_Contratados() {
		// TODO Auto-generated method stub

	}

}
