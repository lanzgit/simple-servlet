<%@ page import="br.edu.infnet.model.domain.Usuario" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Confirmação</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%
		String nome = (String)request.getAttribute("nomeDoUsuario");
		String email = (String)request.getAttribute("emailDoUsuario");
	%>
	<div class="container">
		<h2>O usuário <%=nome%> com email <%=email%> foi cadastrado com sucesso!!</h2>
		<a href="usuario">Voltar</a>
	</div>"  
</body>
</html>