<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/solicitudcertificado.css" rel="stylesheet" type="text/css" />
			<title><s:property value="solicitud.certificado.title"/></title>
		</head>
		<body>
			<!-- HEADER -->
			<s:include value="./header.jsp" />
			
			<h1><s:text name="solicitud.certificado.title" /></h1>
			
			<a href="getCertificatesSolicitudCertificado" class="actionButtonLink"><button class="actionButton"><s:text name="solicitud.certificado.button.getCertificates"/></button></a>
			<a href="getProjectsSolicitudCertificado" class="actionButtonLink"><button class="actionButton"><s:text name="solicitud.certificado.button.getProjects"/></button></a>
			
			<table id="tabla.solicitud.certificado.tabla.certificados" class="dataTable">
				<caption><s:text name="solicitud.certificado.tabla.certificados.cabecera"/></caption>
				<thead>
					<tr>
						<th scope="col"><s:text name="solicitud.certificado.tabla.certificados.id"/></th>
						<th scope="col"><s:text name="solicitud.certificado.tabla.certificados.descripcion"/></th>
						<th scope="col"><s:text name="solicitud.certificado.tabla.certificados.vivienda"/></th>
						<th scope="col"><s:text name="solicitud.certificado.tabla.certificados.inmueble"/></th>
						<th scope="col"><s:text name="solicitud.certificado.tabla.certificados.tipo"/></th>
						<th scope="col"><s:text name="solicitud.certificado.tabla.certificados.coste"/></th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="certificados">
						<tr>
							<th scope="row"><s:property value="id_certificado"/></th>
							<td><s:textfield name="descripcion_certificado"/></td>
							<td><s:textfield name="usuarios[id_cliente_certificado].nombre_usuario"/>
							<s:select list="viviendas" listKey="id_vivienda" listValue="descripcion_vivienda" 
											headerKey=" " headerValue="[ %{select.inmueble} ]" /></td>
							<s:select list="inmuebles" listKey="id_vivienda" listValue="descripcion_inmueble" 
											headerKey=" " headerValue="[ %{select.inmueble} ]" /></td>
							<td><s:textfield name="inmuebles[id_inmueble_certificado].descripcion_inmueble"/></td>
							<td><s:textfield name="tipo_certificado"/></td>
							<td><s:textfield name="coste_certificado"/></td>
							
						</tr>
					</s:iterator>
				</tbody>
			</table>
						
			<!-- FOOTER -->
			<s:include value="./footer.jsp"></s:include>
		</body>
	</html>
</s:i18n>