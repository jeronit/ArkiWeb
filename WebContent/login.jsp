<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="general.css" rel="stylesheet" type="text/css" />
			<link href="login.css" rel="stylesheet" type="text/css" />
			<title><s:text name="login.title"/></title>
			
		</head>
		<body>
			
		   <h1><s:text name="login.title"/></h1>
			
			
			<h2><s:property value = "getText('login.title')" /></h2>
			
			<s:form action="login">
				<s:label for="email_usuario" name="email_usuario_label"><s:property value = "getText('login.label.email')" /></s:label>
				<s:textfield key="email_usuario" label="getText(email_usuario_label)"></s:textfield>
				<s:label></s:label>
				<s:password key="contrasenya_usuario"></s:password>
				<s:submit/>
			</s:form>
		</body>
	</html>
</s:i18n>