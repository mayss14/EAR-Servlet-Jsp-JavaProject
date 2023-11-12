<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>

    
	<h1 class="text-center p-2 bg-warning">Welcome to Users Page</h1>
	<button type="button" name="back" class="btn btn-secondary p-1 text-center m-2"onclick="history.back()">Retour</button>
	
	<h3 class="text-center  fst-italic"> Choisir une operation </h3>
	
	<div class="container d-flex justify-content-center mt-5 bg-light">
	   
	   <a href="AjoutUser.jsp"> <button type="button" class="btn btn-secondary m-5"> Ajouter Un Utilisateur </button></a>
	    <button type="button" class="btn btn-secondary m-5">Modifier Un Utilisateur</button>
	    <button type="button" class="btn btn-secondary m-5">Supprimer Un Utilisateur</button>
	      <a href="listeUser.jsp"><button type="button" class="btn btn-secondary  m-5">Liste des Utilisateurs</button></a>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>