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

	<h1 class="text-center p-2 bg-info text-light">Supprimer Etudiant</h1>
	<button type="button" name="back"
		class="btn btn-secondary p-1 text-center m-2" onclick="history.back()">Retour</button>


	<div
		class="container-fluid d-flex justify-content-center bg-light mt-4 p-5">
		<form action="Etudiant" method="post">
			<div class="mx-2">
				<label for="nom" class="form-label">Nom :</label> <input type="text"
					class="form-control" id="nom" name="nom">
					 <input
					type="hidden" value="delete" class="form-control" name="action">
			</div>


			<button type="submit" class="btn btn-info btn-sm m-2 p-2">Delete
				Etudiant</button>
		</form>


	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>