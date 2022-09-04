<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/footer.css" rel="stylesheet" type="text/css" />
		</head>
		<body>
			<footer class="footer">
				&copy; <s:property value = "getText('footer.copyright')" />
			</footer>
		</body>
	</html>
</s:i18n>
