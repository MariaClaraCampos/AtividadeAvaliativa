<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário</title>
</head>
<body>
	<h3>Olá, seja bem vindo(a)!!!</h3>
	<h4>Digite seus dados nos campos indicados e corretamente.</h4>
	
	<form action="ServletAgenda" method="get">
		<input type="text" name="nome" placeholder="Digite seu nome:"/><br>
		<input type="date" name="nome1" placeholder="Digite sua data de nascimento:"/><br>
		<input type="text" name="nome2" placeholder="Digite seu telefone:"/><br>
		<input type="email" name="nome3" placeholder="Digite seu email:"/><br>
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>
