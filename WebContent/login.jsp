<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/login.css" rel="stylesheet" type="text/css" />
			<title><s:text name="login.title"/></title>
			
		</head>
		<body>
			
			<h1><s:text name="login.title"/></h1>
			
			<s:form action="login">
				<div id="usuario">
					<s:label for="email_usuario" name="email_usuario_label"><s:property value = "getText('login.label.email')" /></s:label>
					<s:textfield name="email_usuario"></s:textfield>
				</div>
				<div id="password">
					<s:label for="contrasenya_usuario" name="contrasenya_usuario_label"><s:property value = "getText('login.label.contrasenya')" /></s:label>
					<s:password name="contrasenya_usuario"></s:password>
				</div>
				Olvidé contraseña
				<s:submit name="submit_button_login"/>
				
				<div id="error" class="errors">
					<s:if test="hasActionErrors()"><s:actionerror/> </s:if>
				</div>
			</s:form>
		</body>
	</html>
</s:i18n>