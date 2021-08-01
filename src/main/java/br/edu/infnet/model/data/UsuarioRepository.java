package br.edu.infnet.model.data;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.Usuario;

public class UsuarioRepository {

	private List<Usuario> repository = new ArrayList<Usuario>();
	
	public UsuarioRepository() {
		super();
	}

	public void addUsuarios(Usuario usuario) {
		repository.add(usuario);
	}

	public List<Usuario> getUsuarios() {
		return repository;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.repository = usuarios;
	}
	
}
