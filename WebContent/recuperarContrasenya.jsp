<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/recuperarContrasenya.css" rel="stylesheet" type="text/css" />
			<title><s:text name="recuperarcontrasenya.title"/></title>
			
		</head>
		<body>
			<!-- HEADER -->
			<s:include value="./header.jsp" />
			
			<h1><s:text name="recuperarcontrasenya.title" /></h1>
			<h3><s:text name="recuperarcontrasenya.instrucciones" /></h3>
			
			<s:form action="recuperarContrasenya">
				<div id="usuario">
					<s:textfield key="recuperarContrasenya.label.email" labelposition="left" name="email_usuario"></s:textfield>
				</div>
				<div id="password">
					<s:password key="recuperarContrasenya.label.contrasenya" labelposition="left" name="contrasenya_usuario"></s:password>
				</div>
				
				<s:submit name="submit_button_login" key="login.button.submit"/>
				
				<div id="error" class="errors">
					<s:if test="hasActionErrors()"><s:actionerror/> </s:if>
				</div>
			</s:form>

			<!-- FOOTER -->
			<s:include value="./footer.jsp"></s:include>
		</body>
	</html>
</s:i18n>