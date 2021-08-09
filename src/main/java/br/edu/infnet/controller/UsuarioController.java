package br.edu.infnet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.data.UsuarioRepository;
import br.edu.infnet.model.domain.Usuario;


public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioRepository repository = new UsuarioRepository();

	public UsuarioController() {
		super();
	}
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listagem", repository.getUsuarios());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Usuario usuario = new Usuario(
			req.getParameter("nome"), req.getParameter("email"), req.getParameter("senha"));

		repository.addUsuarios(usuario);

		req.setAttribute("nomeDoUsuario", usuario.getNome());
		req.setAttribute("emailDoUsuario", usuario.getEmail());
		req.getRequestDispatcher("confirmacao.jsp").forward(req, resp);
	}
}
