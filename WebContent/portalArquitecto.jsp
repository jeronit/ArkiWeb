<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/portal.css" rel="stylesheet" type="text/css" />
			<title><s:property value="portal.arquitecto.title"/></title>
		</head>
		<body>
			<!-- HEADER -->
			<s:include value="./header.jsp" />
			
			<h1><s:text name="portal.arquitecto.title" /></h1>
			<h3><s:text name="portal.bienvenida" /><s:property value="userName"/></h3>
			
			<a href="getCertificatesPortalArquitecto" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getCertificates"/></button></a>
			<a href="getProjectsPortalArquitecto" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getProjects"/></button></a>
			
			<table id="tabla.portal.arquitecto.tabla.certificados" class="dataTable">
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
			
			<table id="tabla.portal.arquitecto.tabla.proyectos" class="dataTable">
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
						</tr>
					</s:iterator>
				</tbody>
			</table>
			
			<!-- FOOTER -->
			<s:include value="./footer.jsp"></s:include>
		</body>
	</html>
</s:i18n>