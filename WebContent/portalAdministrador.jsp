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
			<title><s:property value="portal.administrador.title"/></title>
		</head>
		<body>
		
			<object type="text/html" data="header.jsp"></object>
			
			<h1><s:text name="portal.administrador.title" /></h1>
			<h3><s:text name="portal.bienvenida" /><s:property value="userName"/></h3>
			
			
			<s:a namespace="/yournamespace" action="the-edit-action">
   edit<s:param name="ID" value="ID"/>
</s:a>
			
			<a href="getRolesPortalAdministrador" class="actionButtonLink"><button class="actionButton">getRolesPortalAdministrador</button></a>
			<s:url id="idSelectRoles" action="getRolesPortalAdministrador"/>
			<sj:select href="%{idSelectRoles}" list="roles" listKey="id_rol" listValue="descripcion_rol" 
						headerKey=" " headerValue="[ Seleccione Rol ]" emptyOption="true"/>
			
			</br>
			<s:iterator value="roles">
				<s:property value="id_rol"/><s:property value="descripcion_rol"/></br>
				
			</s:iterator>
			
			<a href="getUsersPortalAdministrador" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getUsers"/></button></a>
			<table id="portal.administrador.tabla.usuarios" class="dataTable">
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
							<td><s:property value="rol_usuario"/></td>
							<!-- Taglib para select <\%@ taglib prefix="sj" uri="/struts2-jquery-tags"%> -->
						</tr>
					</s:iterator>
				</tbody>
			</table>
			
			<a href="getCertificatesPortalAdministrador" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getCertificates"/></button></a>
			<table id="portal.administrador.tabla.certificados" class="dataTable">
				<caption><s:text name="portal.tabla.certificados.cabecera"/></caption>
				<thead>
					<tr>
						<th scope="col"><s:text name="portal.tabla.certificados.id"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.descripcion"/></th>
						<th scope="col"><s:text name="portal.tabla.certificados.cliente"/></th>
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
							<td><s:property value="id_cliente_certificado"/></td>
							<td><s:property value="id_vivienda_certificado"/></td>
							<td><s:property value="id_inmueble_certificado"/></td>
							<td><s:property value="tipo_certificado"/></td>
							<td><s:property value="fecha_solicitud_certificado"/></td>
							<td><s:property value="fecha_entrega_certificado"/></td>
							<td><s:property value="fecha_visita_certificado"/></td>
							<td><s:property value="fecha_emision_certificado"/></td>
							<td><s:property value="categoria_certificado"/></td>
							<td><s:property value="coste_certificado"/></td>
							<!-- Taglib para select <\%@ taglib prefix="sj" uri="/struts2-jquery-tags"%> -->
						</tr>
					</s:iterator>
				</tbody>
			</table>
			
			<a href="getProjectsPortalAdministrador" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getProjects"/></button></a>
			<table id="portal.administrador.tabla.proyectos" class="dataTable">
				<caption><s:text name="portal.tabla.proyectos.cabecera"/></caption>
				<thead>
					<tr>
						<th scope="col"><s:text name="portal.tabla.proyectos.id"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.descripcion"/></th>
						<th scope="col"><s:text name="portal.tabla.proyectos.cliente"/></th>
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
							<td><s:property value="id_cliente_proyecto"/></td>
							<td><s:property value="id_vivienda_proyecto"/></td>
							<td><s:property value="id_inmueble_proyecto"/></td>
							<td><s:property value="tipo_proyecto"/></td>
							<td><s:property value="fecha_solicitud_proyecto"/></td>
							<td><s:property value="fecha_entrega_proyecto"/></td>
							<td><s:property value="duracion_prevista_proyecto"/></td>
							<td><s:property value="presupuesto_ejecucion_proyecto"/></td>
							<td><s:property value="superficie_proyecto"/></td>
							<td><s:property value="coste_proyecto"/></td>
							<!-- Taglib para select <\%@ taglib prefix="sj" uri="/struts2-jquery-tags"%> -->
						</tr>
					</s:iterator>
				</tbody>
			</table>
			
			<object type="text/html" data="footer.jsp"></object>
		</body>
	</html>
</s:i18n>