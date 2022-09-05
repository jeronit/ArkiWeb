<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/portal.css" rel="stylesheet" type="text/css" />
			<script src="./js/portalAdministrador.js"></script>
			<title><s:property value="portal.administrador.title"/></title>
		</head>
		<body>
		
			<!-- HEADER -->
			<s:include value="./header.jsp" />
			
			<h1><s:text name="portal.administrador.title" /></h1>
			<h3><s:text name="portal.bienvenida" /><s:property value="userName"/></h3>
			
			<a href="getUsersPortalAdministrador" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getUsers"/></button></a>
			<a href="getCertificatesPortalAdministrador" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getCertificates"/></button></a>
			<a href="getProjectsPortalAdministrador" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getProjects"/></button></a>
			
			
			<table id="tabla.portal.administrador.tabla.certificados" class="dataTable">
				<caption><s:text name="portal.tabla.certificados.cabecera"/></caption>
				<thead>
					<tr>
						<th scope="col"><s:text name="portal.tabla.certificados.id"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.descripcion"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.usuario.nombre"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.usuario.apellidos"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.vivienda"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.inmueble"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.tipo"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.fechasolicitud"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.fechaentrega"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.fechavisita"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.fechaemision"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.categoria"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.coste"/></th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="certificados">
						<tr>
							<th scope="row"><s:property value="id_certificado"/></th>
							<td><s:property value="descripcion_certificado"/></td>
							<td><s:property value="usuarios[id_cliente_certificado].nombre_usuario"/></td>
							<td><s:property value="usuarios[id_cliente_certificado].apellidos_usuario"/></td>
							<td><s:property value="viviendas[id_vivienda_certificado].descripcion_vivienda"/></td>
							<td><s:property value="inmuebles[id_inmueble_certificado].descripcion_inmueble"/></td>
							<td><s:property value="tipo_certificado"/></td>
							<td><s:property value="fecha_solicitud_certificado"/></td>
							<td><s:property value="fecha_entrega_certificado"/></td>
							<td><s:property value="fecha_visita_certificado"/></td>
							<td><s:property value="fecha_emision_certificado"/></td>
							<td><s:property value="categoria_certificado"/></td>
							<td><s:property value="coste_certificado"/></td>
							
						</tr>
					</s:iterator>
				</tbody>
			</table>
			
			<table id="tabla.portal.administrador.tabla.proyectos" class="dataTable">
				<caption><s:text name="portal.tabla.proyectos.cabecera"/></caption>
				<thead>
					<tr>
						<th scope="col"><s:text name="portal.tabla.proyectos.id"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.descripcion"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.usuario.nombre"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.usuario.apellidos"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.vivienda"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.inmueble"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.tipo"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.fechasolicitud"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.fechaentrega"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.duracionprevista"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.presupuestoejecucion"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.superficie"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.coste"/></th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="proyectos">
						<tr>
							<th scope="row"><s:property value="id_proyecto"/></th>
							<td><s:property value="descripcion_proyecto"/></td>
							<td><s:property value="usuarios[id_cliente_proyecto].nombre_usuario"/></td>
							<td><s:property value="usuarios[id_cliente_proyecto].apellidos_usuario"/></td>
							<td><s:property value="viviendas[id_vivienda_proyecto].descripcion_vivienda"/></td>
							<td><s:property value="inmuebles[id_inmueble_proyecto].descripcion_inmueble"/></td>
							<td><s:property value="tipo_proyecto"/></td>
							<td><s:property value="fecha_solicitud_proyecto"/></td>
							<td><s:property value="fecha_entrega_proyecto"/></td>
							<td><s:property value="duracion_prevista_proyecto"/></td>
							<td><s:property value="presupuesto_ejecucion_proyecto"/></td>
							<td><s:property value="superficie_proyecto"/></td>
							<td><s:property value="coste_proyecto"/></td>
							
						</tr>
					</s:iterator>
				</tbody>
			</table>
				
				
			<table id="tabla.portal.administrador.tabla.usuarios" class="dataTable">
				<caption><s:text name="portal.tabla.usuarios.cabecera"/></caption>
				<thead>
					<tr>
						<th scope="col"><s:text name="portal.tabla.usuarios.id"/></th>
						<th scope="col"><s:text name="portal.tabla.usuarios.nombre"/></th>
						<th scope="col"><s:text name="portal.tabla.usuarios.apellidos"/></th>
						<th scope="col"><s:text name="portal.tabla.usuarios.dni"/></th>
						<th scope="col"><s:text name="portal.tabla.usuarios.telefono"/></th>
						<th scope="col"><s:text name="portal.tabla.usuarios.email"/></th>
						<th scope="col"><s:text name="portal.tabla.usuarios.domicilio"/></th>
						<th scope="col"><s:text name="portal.tabla.usuarios.rol"/></th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="usuarios">
						<tr>
							<th scope="row"><s:property value="id_usuario"/></th>
							<td><s:property value="nombre_usuario"/></td>
							<td><s:property value="apellidos_usuario"/></td>
							<td><s:property value="dni_usuario"/></td>
							<td><s:property value="telefono_usuario"/></td>
							<td><s:property value="email_usuario"/></td>
							<td><s:property value="domicilio_usuario"/></td>
							<td><s:property value="roles[rol_usuario].descripcion_rol"/></td>
							<td>
								<s:a action="editUserPortalAdministrador" >
									<s:text name="table.row.edit.link"/>
								</s:a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<!-- FOOTER -->
			<s:include value="./footer.jsp"></s:include>
		</body>
	</html>
</s:i18n>