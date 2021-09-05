<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	<h2>Digite valores para serem calculados e escolha a opção desejada.</h2>
	<form action="ServletCalculadora" method="get">
	<label>1º valor</label>
	<input type="text" name="PrimeiroValor" placeholder="Digite o primeiro valor"/><br>
	<label>2º valor</label>
	<input type="text" name="SegundoValor" placeholder="Digite o segundo valor"/><br>
	
	<select name=Opcao>
	<option value="+">+</option>
	<option value="-">-</option>
	<option value="*">*</option>
	<option value="/">/</option>
	</select>
	
	<input type="submit" value="resultado">
	</form>

</body>
</html>
