<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="general.css" rel="stylesheet" type="text/css" />
			<link href="portal.css" rel="stylesheet" type="text/css" />
			<title><s:i18n name="title_i18n"><s:property value="portal.title"/></s:i18n></title>
		</head>
		<body>
			success
			
			<s:property value="email_usuario"/>
			
			
			<a href="getUsers" class="actionButtonLink"><button class="actionButton"><s:text name="portal.button.getUsers"/></button></a>
			<table id="" class="dataTable">
				<thead>
					<tr>
						<th scope="col">id</th>
						<th scope="col">email</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator>
						<tr>
							<th scope="row"><s:property value="id_usuario"/></th>
							<td><s:property value="email_usuario"/></td>
							<!-- Taglib para select <\%@ taglib prefix="sj" uri="/struts2-jquery-tags"%> -->
						</tr>
					</s:iterator>
				</tbody>
			</table>
			
		</body>
	</html>
</s:i18n>