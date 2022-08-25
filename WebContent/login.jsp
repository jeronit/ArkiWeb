<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ omit-xml-declaration="false" doctype-root-element="html" doctype-public="-//W3C//DTD XHTML 1.1//EN" doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="general.css" rel="stylesheet" type="text/css" />
	<link href="login.css" rel="stylesheet" type="text/css" />
	<title><s:i18n name="login_i18n"><s:property value="login.title"/></s:i18n></title>
<!--  <title><s:i18n key="login.title" /></title> -->
</head>
<body>
	<s:form action="login">
		<s:label></s:label>
		<s:textfield key="email_usuario"></s:textfield>
		<s:label></s:label>
		<s:password key="contrasenya_usuario"></s:password>
		<s:submit/>
	</s:form>
</body>
</html>