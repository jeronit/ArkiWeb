<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/arkiweb.css" rel="stylesheet" type="text/css" />
			<title><s:property value="arkiweb.title"/></title>
		</head>
		<body>
			<!-- HEADER -->
			<s:include value="./header.jsp" />
			
			<h1><s:text name="arkiweb.title" /></h1>
			<h2><s:text name="arkiweb.choosequestion" /></h2>
			<div id="selectOption">
				<div id="optionLogin">
					<s:a href="initLogin"><s:text name="arkiweb.optionLogin" /></s:a>
				</div>
				<div id="optionCertificate">
					<s:a href="initRequestCertificate"><s:text name="arkiweb.optionCertificate" /></s:a>
				</div>
				<div id="optionProject">
					<s:a href="initRequestProject"><s:text name="arkiweb.optionProject" /></s:a>
				</div>
			</div>
			
			<!-- FOOTER -->
			<s:include value="./footer.jsp"></s:include>
		</body>
	</html>
</s:i18n>
