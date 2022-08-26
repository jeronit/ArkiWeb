/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import ArkiWeb.controlador.BBDD_Generar_Datos_Demo;
import ArkiWeb.controlador.Arkiweb_Initialiazer;
import ArkiWeb.modelo.Categoria_Certificado;
import ArkiWeb.modelo.Certificado;
import ArkiWeb.modelo.Certificados_Asignados;
import ArkiWeb.modelo.Inmueble;
import ArkiWeb.modelo.Proyecto;
import ArkiWeb.modelo.Proyectos_Asignados;
import ArkiWeb.modelo.Proyectos_En_Ejecucion;
import ArkiWeb.modelo.Rol;
import ArkiWeb.modelo.Tipo_Certificado;
import ArkiWeb.modelo.Tipo_Proyecto;
import ArkiWeb.modelo.Usuario;
import ArkiWeb.modelo.Vivienda;

/**
 * @author JTE
 *
 */
public class BBDD_Generar_Datos_DemoImpl implements BBDD_Generar_Datos_Demo {

//	Arkiweb_Initialiazer principal;
	
	/**
	 * 
	 */
	public BBDD_Generar_Datos_DemoImpl() {
//		principal = new Arkiweb_Initialiazer();
	}

	@Override
	public void insertarRoles() {
		Rol rol1 = (Rol) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Rol");
		Rol rol2 = (Rol) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Rol");
		Rol rol3 = (Rol) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Rol");
		
		rol1.setDescripcion_rol("Cliente");
		rol2.setDescripcion_rol("Arquitecto");
		rol3.setDescripcion_rol("Administrador");
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearRol(rol1);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearRol(rol2);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearRol(rol3);
	}

	@Override
	public void insertarUsuarios() {
		Usuario usuario1 = (Usuario) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Usuario");
		Usuario usuario2 = (Usuario) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Usuario");
		Usuario usuario3 = (Usuario) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Usuario");
		Usuario usuario4 = (Usuario) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Usuario");
		Usuario usuario5 = (Usuario) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Usuario");
		Usuario usuario6 = (Usuario) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Usuario");
		
		usuario1.setNombre_usuario("Arquitecto Usuario 01");
		usuario1.setApellidos_usuario("Apellidos Usuario 01");
		usuario1.setDomicilio_usuario("Casa Usuario 01");
		usuario1.setDni_usuario("DNI Usuario 01");
		usuario1.setContrasenya_usuario("0123");
		usuario1.setEmail_usuario("emailusuario01@usuario.com");
		usuario1.setRol_usuario(2);
		usuario1.setTelefono_usuario("012345678");
		
		usuario2.setNombre_usuario("Arquitecto Usuario 02");
		usuario2.setApellidos_usuario("Apellidos Usuario 02");
		usuario2.setDomicilio_usuario("Casa Usuario 02");
		usuario2.setDni_usuario("DNI Usuario 02");
		usuario2.setContrasenya_usuario("1234");
		usuario2.setEmail_usuario("emailusuario02@usuario.com");
		usuario2.setRol_usuario(2);
		usuario2.setTelefono_usuario("123456789");
		
		usuario3.setNombre_usuario("Administrador Usuario 03");
		usuario3.setApellidos_usuario("Apellidos Usuario 03");
		usuario3.setDomicilio_usuario("Casa Usuario 03");
		usuario3.setDni_usuario("DNI Usuario 03");
		usuario3.setContrasenya_usuario("2345");
		usuario3.setEmail_usuario("emailusuario03@usuario.com");
		usuario3.setRol_usuario(3);
		usuario3.setTelefono_usuario("234567890");
		
		usuario4.setNombre_usuario("Cliente Usuario 04");
		usuario4.setApellidos_usuario("Apellidos Usuario 04");
		usuario4.setDomicilio_usuario("Casa Usuario 04");
		usuario4.setDni_usuario("DNI Usuario 04");
		usuario4.setContrasenya_usuario("3456");
		usuario4.setEmail_usuario("emailusuario04@usuario.com");
		usuario4.setRol_usuario(1);
		usuario4.setTelefono_usuario("345678901");
		
		usuario5.setNombre_usuario("Cliente Usuario 05");
		usuario5.setApellidos_usuario("Apellidos Usuario 05");
		usuario5.setDomicilio_usuario("Casa Usuario 05");
		usuario5.setDni_usuario("DNI Usuario 05");
		usuario5.setContrasenya_usuario("4567");
		usuario5.setEmail_usuario("emailusuario05@usuario.com");
		usuario5.setRol_usuario(1);
		usuario5.setTelefono_usuario("987654321");
		
		usuario6.setNombre_usuario("Cliente Usuario 06");
		usuario6.setApellidos_usuario("Apellidos Usuario 06");
		usuario6.setDomicilio_usuario("Casa Usuario 06");
		usuario6.setDni_usuario("DNI Usuario 06");
		usuario6.setContrasenya_usuario("6789");
		usuario6.setEmail_usuario("emailusuario06@usuario.com");
		usuario6.setRol_usuario(1);
		usuario6.setTelefono_usuario("876543210");
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearUsuario(usuario1);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearUsuario(usuario2);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearUsuario(usuario3);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearUsuario(usuario4);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearUsuario(usuario5);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearUsuario(usuario6);

	}

	@Override
	public void insertarPermisos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarInmuebles() {
		Inmueble inmueble1 = (Inmueble) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Inmueble");
		Inmueble inmueble2 = (Inmueble) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Inmueble");
		Inmueble inmueble3 = (Inmueble) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Inmueble");
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		calendar1.setTime(new Date());
		calendar2.setTime(new Date());
		calendar1.add(calendar1.YEAR, -50);
		calendar2.add(calendar1.YEAR, -10);
		Date fechaInmueble1 = calendar1.getTime();
		Date fechaInmueble2 = calendar2.getTime();
		Date fechaInmueble3 = new Date();
		
		inmueble1.setDescripcion_inmueble("inmueble1");
		inmueble1.setDireccion_inmueble("Direcci�n inmueble1");
		inmueble1.setSuperficie_inmueble(537.5);
		inmueble1.setSuperficie_terreno_inmueble(1537.25);
		inmueble1.setFecha_construccion_inmueble(fechaInmueble1);
		
		inmueble2.setDescripcion_inmueble("inmueble2");
		inmueble2.setDireccion_inmueble("Direcci�n inmueble2");
		inmueble2.setSuperficie_inmueble(137.5);
		inmueble2.setSuperficie_terreno_inmueble(137.5);
		inmueble2.setFecha_construccion_inmueble(fechaInmueble2);
		
		inmueble3.setDescripcion_inmueble("inmueble3");
		inmueble3.setDireccion_inmueble("Direcci�n inmueble3");
		inmueble3.setSuperficie_inmueble(257.55);
		inmueble3.setSuperficie_terreno_inmueble(257.55);
		inmueble3.setFecha_construccion_inmueble(fechaInmueble3);
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearInmueble(inmueble1);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearInmueble(inmueble2);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearInmueble(inmueble3);

	}

	@Override
	public void insertarViviendas() {
		Vivienda vivienda1 = (Vivienda) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Vivienda");
		Vivienda vivienda2 = (Vivienda) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Vivienda");
		
		vivienda1.setDescripcion_vivienda("vivienda1");
		vivienda1.setDescripcion_vivienda("Direccion vivienda1");
		vivienda1.setId_inmueble_vivienda(1);
		vivienda1.setSuperficie_vivienda(137.5);
		vivienda1.setSuperficie_terreno_vivienda(137.5);
		vivienda1.setPlantas_vivienda(1);
		vivienda1.setHabitaciones_vivienda(3);
		vivienda1.setBanyos_vivienda(2);
		
		vivienda2.setDescripcion_vivienda("vivienda2");
		vivienda2.setDescripcion_vivienda("Direccion vivienda2");
		vivienda2.setId_inmueble_vivienda(2);
		vivienda2.setSuperficie_vivienda(257.55);
		vivienda2.setSuperficie_terreno_vivienda(257.55);
		vivienda2.setPlantas_vivienda(2);
		vivienda2.setHabitaciones_vivienda(4);
		vivienda2.setBanyos_vivienda(3);
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearVivienda(vivienda1);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearVivienda(vivienda2);

	}

	@Override
	public void insertarCertificados() {
		Certificado certificado1 = (Certificado) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Certificado");
		Certificado certificado2 = (Certificado) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Certificado");
		
		certificado1.setDescripcion_certificado("certificado1");
		certificado1.setId_cliente_certificado(3);
		certificado1.setId_vivienda_certificado(0);
		certificado1.setTipo_certificado(Tipo_Certificado.EFIC_ENERG);
		certificado1.setFecha_solicitud_certificado(new Date());
		certificado1.setFecha_visita_certificado(new Date());
		certificado1.setCategoria_certificado(Categoria_Certificado.B);
		certificado1.setCoste_certificado(120.0);
		
		certificado2.setDescripcion_certificado("certificado1");
		certificado2.setId_cliente_certificado(4);
		certificado2.setId_vivienda_certificado(1);
		certificado2.setTipo_certificado(Tipo_Certificado.ITE);
		certificado2.setFecha_solicitud_certificado(new Date());
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearCertificado(certificado1);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearCertificado(certificado2);
	}

	@Override
	public void insertarCertificados_Asignados() {
		Certificados_Asignados certificado_Asignado = (Certificados_Asignados) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Certificados_Asignados");
		
		certificado_Asignado.setId_arquitecto_certificado_asignado(0);
		certificado_Asignado.setId_certificado_certificado_asignado(0);
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.asignarCertificado(certificado_Asignado);

	}

	@Override
	public void insertarProyectos() {
		Proyecto proyecto = (Proyecto) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Proyecto");
		
		proyecto.setId_cliente_proyecto(5);
		proyecto.setDescripcion_proyecto("proyecto1");
		proyecto.setFecha_solicitud_proyecto(new Date());
		proyecto.setId_vivienda_proyecto(1);
		proyecto.setTipo_proyecto(Tipo_Proyecto.REHABILITACION);
		proyecto.setSuperficie_proyecto(125.58);
		proyecto.setPresupuesto_ejecucion_proyecto(50000.00);
		proyecto.setDuracion_prevista_proyecto(8);
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.crearProyecto(proyecto);

	}

	@Override
	public void insertarProyectos_Asignados() {
		Proyectos_Asignados proyecto_Asignado = (Proyectos_Asignados) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Proyectos_Asignados");

		proyecto_Asignado.setId_arquitecto_proyecto_asignado(1);
		proyecto_Asignado.setId_proyecto_proyecto_asignado(0);
		
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.asignarProyecto(proyecto_Asignado);
	}

	@Override
	public void insertarProyectos_Contratados() {
		Proyectos_En_Ejecucion proyecto_Contratado = (Proyectos_En_Ejecucion) ArkiWeb.controlador.Arkiweb_Initialiazer.factory.crearObjeto("Proyectos_En_Ejecucion");

		proyecto_Contratado.setId_proyecto_ejecucion_proyecto(1);
		proyecto_Contratado.setFecha_inicio_ejecucion_proyecto(new Date());
		proyecto_Contratado.setDuracion_prevista_ejecucion_proyecto(9);
		ArkiWeb.controlador.Arkiweb_Initialiazer.db.contratarProyecto(proyecto_Contratado);
	}

}
