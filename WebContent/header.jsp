<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<s:i18n name = "ArkiWeb.resources.ApplicationResources">
	<html>
		<head>
			<meta charset="UTF-8">
			<link href="./css/general.css" rel="stylesheet" type="text/css" />
			<link href="./css/header.css" rel="stylesheet" type="text/css" />
			<link href="./css/navBar.css" rel="stylesheet" type="text/css" />
			<!-- Load an icon library to show a hamburger menu (bars) on small screens -->
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		</head>
		<body>
			<header class="header">
				<div class="topnav" id="myTopnav">
					<a href="#home" class="active"><s:property value = "getText('header.home')" /></a>
					<a href="#services"><s:property value = "getText('header.services')" /></a>
					<a href="#login"><s:property value = "getText('header.login')" /></a>
					<a href="#signup"><s:property value = "getText('header.signup')" /></a>
					<a href="#logout"><s:property value = "getText('header.logout')" /></a>
					<a href="javascript:void(0);" class="icon" onclick="myFunction()">
						<i class="fa fa-bars"></i>
					</a>
				</div> 
				
				
			</header>
		</body>
	</html>
</s:i18n>
