<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Page Accueil (jsp)</title>
</head>
<body>
	<h1> Bienvenue ! </h1>
	
	<h3> Faites votre choix : </h3>

	
		<button type="button" onclick="location.href='./CreationProprietaire'" > Création Propriétaire </button>
		
		<button type="button" onclick="location.href='./CreationLogement'" > Création Logement </button>
		
		<input type="button" value="Rechercher Logement" />
	
</body>
</html>