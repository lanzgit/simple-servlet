<%@ page import="br.edu.infnet.model.domain.Usuario" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Formulário</title>
</head>
<body>

    <%
    %>

    <div class="container">
        <h2>Formulário</h2>
        <form action="usuario" method="POST">

            <div class="form-group">
                <label>Nome:</label>
                <input type="text" name="nome" class="form-control" placeholder="Entre com o Nome">
            </div>

            <div class="form-group">
                <label>Email:</label>
                <input type="email" name="email" class="form-control" placeholder="Entre com o email">
            </div>

            <div class="form-group">
                <label>Senha:</label>
                <input type="password" name="senha" class="form-control">
            </div>

            <button type="submit" class="btn btn-default">Cadastrar</button>
        </form>

        <form action="usuario" method="GET">
            <h2>Lista de Usuários Cadastrados</h2>
            <table style="width:100%" class="table table-striped">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Usuario> usuarios = (List<Usuario>) request.getAttribute("listagem");
                    for(Usuario u : usuarios) {
                %>
                <tr>
                    <td><%=u.getNome()%></td>
                    <td><%=u.getEmail()%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
            </table>
        </form>
    </div>

</body>
</html>