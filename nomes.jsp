<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nome</title>
</head>
<body>
	<h2>Olá, seja bem vindo(a)!!! <br></h2>
	<h3>Digite seu nome e sobrenome:</h3>
	
	<form action="ServletNome" method="get">
		<input type="text" name="nome" placeholder="Digite seu nome:"/><br>
		<input type="text" name="nome2" placeholder="Digite seu sobrenome:"/><br>
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>
