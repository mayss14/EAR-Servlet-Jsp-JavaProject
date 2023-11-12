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

	<h1 class="text-center p-2 bg-info text-light">Listes des
		Etudiants</h1>
	<button type="button" name="back"
		class="btn btn-secondary p-1 text-center m-2" onclick="history.back()">Retour</button>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Prenom</th>
				<th scope="col">Nom</th>
				<th scope="col">CNE</th>
				<th scope="col">Filiere</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${liste}" var="etud">
				<tr>
					<td><c:out value="${etud.id}" /></td>
					<td><c:out value="${etud.fn}" /></td>
					<td><c:out value="${etud.ln}" /></td>
					<td><c:out value="${etud.cne}" /></td>
					<td>IIR5</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>