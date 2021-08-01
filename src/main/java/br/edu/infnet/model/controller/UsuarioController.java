package br.edu.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.data.UsuarioRepository;
import br.edu.infnet.model.domain.Usuario;


public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioRepository repository = new UsuarioRepository();

	public UsuarioController() {
		super();
	}
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("index.html").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Usuario usuario = new Usuario(
			req.getParameter("nome"), req.getParameter("email"), req.getParameter("senha"));

		repository.addUsuarios(usuario);
		PrintWriter out = resp.getWriter();

		out.println(
			"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" +
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" +
				"<title>Confirmação de Cadastro</title>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>	\r\n" + 
				"\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"	  <h2>O usuário "+ usuario.getNome() +" foi cadastrado com sucesso!!!</h2>\r\n" +
				"	</div>"  
		);
		out.println(
				"	<div class=\"container\">\r\n" + 
				"		<h4>Usuários Cadastrados:</h4>\r\n"
		);
		for (Usuario x : repository.getUsuarios()) {
			out.println("<p>	- " + x.getNome() + " :: " + x.getEmail() + "</p>");
		}
		out.println(
				"	<form action='index.html' method='get'>\r\n" +
				" 		<button type=\"submit\" class=\"btn btn-default\">Voltar</button>\r\n" +
				"	</form>\r\n" +
				"	</div>\r\n" +
				"</body>\r\n" +
				"</html>"
		);
	}
}
