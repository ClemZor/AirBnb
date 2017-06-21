<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">

    <script src="assets/js/Chart.js"></script>
    
<title> Création Propriétaire </title>
</head>
<%@ include file="entete.jsp" %>
<body>

	<div id="blue">
		<div class="container">
			<div class="row ">
				<div class="col-lg-4 ">
				<h4> Déjà parmis nous ? :> Connectez-vous :</h4>
				</div>
				
				
				<form action="CreationProprietaire" method="post" >	
				<div class="col-lg-3 ">
					<input type="text" class="form-control input-lg" name="nomCompte"  placeholder="Votre Nom" ><br> </div>
					<div class="col-lg-3 ">
					<input type="text" class="col-lg-3 form-control input-lg" name="motdepasse" placeholder="Votre Mot de passe"><br></div>
					<button type="submit" class="centered btn btn-success"><span class="glyphicon glyphicon-ok-sign"></span> Valider</button>
					
				</form>	
							
			</div><!-- row -->
		</div><!-- container -->
	</div><!--  bluewrap -->

	<div class="container desc">
		<div class="row">
			<br><br>
			<div class="col-lg-6 centered">
				<img src="assets/img/p03.png" alt="">
			</div><!-- col-lg-6 -->
			
			<div class="col-lg-6">
				<h4>Entrez vos informations et créez votre compte :</h4>
				
				<form action="CreationProprietaire" method="post">	
					<input type="text" class="form-control input-lg" name="nomProp"  placeholder="Votre Nom" ><br>
					<input type="text" class="form-control input-lg" name="prenomProp" placeholder="Votre Prénom"><br>
					<input type="text" class="form-control input-lg" name="telProp" placeholder="Votre Téléphone" ><br>
					<input type="text" class="form-control input-lg" name="mailProp" placeholder="Votre Mail"><br>
				
					<button type="submit" class="col-lg-3 centered btn btn-success"><span class="glyphicon glyphicon-ok-sign"></span> Valider</button>	
				</form >
					
			</div>
		</div><!-- row -->
	</div>
	
	<div>
		<table class="table table-bordered">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Tel</th>
				<th>Mail</th>
			</tr>
			<tbody>
			
				<c:forEach var="pop" items="${listeproprio}" >
					<tr>
						<td> <c:out value="${pop.nom}" />
						<td> <c:out value="${pop.prenom}" />
						<td> <c:out value="${pop.telephone}" />
						<td> <c:out value="${pop.mail}" />
					</tr>			
				</c:forEach>
			
			</tbody>
		
		</table>
	
	
	</div>
		<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

</body>
</html>