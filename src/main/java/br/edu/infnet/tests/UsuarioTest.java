package br.edu.infnet.tests;

import br.edu.infnet.data.UsuarioRepository;
import br.edu.infnet.model.domain.Usuario;

public class UsuarioTest {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.setNome("Vinicius");
		u1.setEmail("vinicius@vianna.com");
		u1.setSenha("password");

		Usuario u2 = new Usuario();
		u2.setNome("Usuário 2");
		u2.setEmail("usuario@vianna.com");
		u2.setSenha("password");

		UsuarioRepository repository = new UsuarioRepository();
		repository.addUsuarios(u1);
		repository.addUsuarios(u2);

		for (Usuario u : repository.getUsuarios()) {
			System.out.println(u);
		}
	}
	
}
