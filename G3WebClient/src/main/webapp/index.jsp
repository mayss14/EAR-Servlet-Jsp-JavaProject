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

	<h1 class="text-center p-2 bg-primary text-light">Welcome to Login
		page</h1>

	<div class="container d-flex justify-content-center row mt-4">
		<div class="col-2"></div>
		<div class="col-4 mt-5">
			<form action="UserController">
				<div class="mx-2">
					<label for="login" class="form-label">Nom d'utilisateur :</label> <input
						type="text" class="form-control" id="login" name="login">
				</div>
				<div class="mx-2">
					<label for="exampleInputPassword1" class="form-label">Mot de Passe :</label>
					<input type="password" class="form-control"
						id="exampleInputPassword1" name="pwd">
				</div>

				<button type="submit" class="btn btn-primary btn-sm m-2 p-2">Connexion</button>
			</form>
		</div>
		<div class="col-4 mt-2">
			<img alt="image" src="images/login.webp" height="400px">
		</div>
	</div>





	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>