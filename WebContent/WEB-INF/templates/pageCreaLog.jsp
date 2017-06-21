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
    
<title>Page Création Logement</title>
</head>
<%@ include file="entete.jsp" %>
<body>
	<div id="blue">
		<div class="container">
			<div class="row centered">
				<div class="col-lg-8 col-lg-offset-2">
				<h4>Vous êtes sur la page de création de logement :</h4>
				</div>
			</div><!-- row -->
		</div><!-- container -->
	</div><!--  bluewrap -->


	<div class="container desc">
		<div class="row">
			<br><br>
			<div class="col-lg-6 centered">
				<img src="assets/img/p01.png" alt="">
			</div><!-- col-lg-6 -->
			<div class="col-lg-6">
				<h4>Entrez les informations de votre logement :</h4>
				
				<form action="AffichagePageLogement" method="post">	
					<input type="text" class="form-control input-lg" name="numLogt"  placeholder="Numero" ><br>
					<input type="text" class="form-control input-lg" name="rueLogt" placeholder="Rue"><br>
					<input type="text" class="form-control input-lg" name="villeLogt" placeholder="Ville" ><br>
					<input type="text" class="form-control input-lg" name="descriLogt" placeholder="Description"><br>
				
					<button type="submit" class="col-lg-3 centered btn btn-success"><span class="glyphicon glyphicon-ok-sign"></span> Valider</button>	
	
				</form >
					
			</div>
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
			
				<c:forEach var="pop" items="${listelogement}" >
					<tr>
						<td> <c:out value="${pop.}" />
						<td> <c:out value="${pop.}" />
						<td> <c:out value="${pop.}" />
						<td> <c:out value="${pop.}" />
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

