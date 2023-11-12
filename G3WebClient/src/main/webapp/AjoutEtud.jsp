<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>School App</title>
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<div class="container-fluid p-4 m-2">
				<a class="navbar-brand" href="#">My App </a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown"
					aria-controls="navbarNavDarkDropdown" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					<ul class="navbar-nav">
						<li class="nav-item dropdown fs-5"><a
							class="nav-link dropdown-toggle" id="navbarDarkDropdownMenuLink"
							role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Etudiants </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="AjoutEtud.jsp">Ajouter</a></li>
								<li><a class="dropdown-item" href="DeleteEtud.jsp">Supprimer</a></li>

							</ul></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle fs-5"
							id="navbarDarkDropdownMenuLink" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Filieres </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="Ajoutfil.jsp">Ajouter</a></li>
								<li><a class="dropdown-item" href="#">Supprimer</a></li>

							</ul></li>
						<li class="nav-item dropdown fs-5"><a
							class="nav-link dropdown-toggle" id="navbarDarkDropdownMenuLink"
							role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Utilisateurs </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="AjoutUser.jsp">Ajouter</a></li>
								<li><a class="dropdown-item" href="DeleteEtud.jsp">Supprimer</a></li>

							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<h1 class="text-center p-2 bg-info text-light">Ajouter Etudiant</h1>
	<button type="button" name="back"
		class="btn btn-secondary p-1 text-center m-2" onclick="history.back()">Retour</button>


	<div
		class="container-fluid d-flex justify-content-center bg-light mt-4 p-5">

		<form action="Etudiant" method="POST">

			<div class="mx-2">
				<label for="nom" class="form-label">Nom :</label> <input type="text"
					class="form-control" id="nom" name="nom">
			</div>
			<div class="mx-2">
				<label for="prenom" class="form-label">Prenom :</label> <input
					type="text" class="form-control" id="prenom" name="prenom">
			</div>
			<div class="mx-2">
				<label for="cne" class="form-label">CNE :</label> <input type="text"
					class="form-control" id="cne" name="cne">

			</div>
			<div class="mx-2">
				<label for="field" class="form-label">Field:</label> <select
					name="field" class="form-select">
					<option>IIR5</option>
					<!--  
					<c:forEach items="${liste}" var="field">
						<option value="<c:out value='${field.id}' />"><c:out
								value='${field.code}' /></option>
					</c:forEach>
					-->
				</select>
			</div>


			<button type="submit" class="btn btn-info btn-sm m-2 p-2">Ajouter
				Etudiant</button>
		</form>


	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>