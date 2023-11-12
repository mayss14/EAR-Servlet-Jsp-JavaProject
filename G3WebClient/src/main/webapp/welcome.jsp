<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
							class="nav-link dropdown-toggle" id="navbarDarkDropdownMenuLink" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Etudiants </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="AjoutEtud.jsp">Ajouter</a></li>
								<li><a class="dropdown-item" href="DeleteEtud.jsp">Supprimer</a></li>
								
							</ul>
						</li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle fs-5" id="navbarDarkDropdownMenuLink" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Filieres </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="Ajoutfil.jsp">Ajouter</a></li>
								<li><a class="dropdown-item" href="#">Supprimer</a></li>
								
							</ul>
						</li>
						<li class="nav-item dropdown fs-5"><a
							class="nav-link dropdown-toggle" id="navbarDarkDropdownMenuLink" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Utilisateurs </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="AjoutUser.jsp">Ajouter</a></li>
								<li><a class="dropdown-item" href="DeleteEtud.jsp">Supprimer</a></li>
								
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="container-fluid row mt-5 p-3 d-flex justify-content-center row">
	  <div class="col-6">
	  <h1 class="text-center p-2 m-5 ">Welcome To Students Application </h1>
	  <p class="text-center"> Use the menu above to try diffrent operations</p>
	  
	  </div>
	  <div class="col-6">
	    <img src="images/home.webp" width="800">
	  </div>
		

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>