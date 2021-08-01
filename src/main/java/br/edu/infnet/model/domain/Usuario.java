package br.edu.infnet.model.domain;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;

	public Usuario() {
		super();
	}

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public void impressao() {
		System.out.println(this);
		System.out.println("Usuário: " + this.nome + "cadastrado com sucesso no email: " + this.email);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append("\n");
		sb.append(this.email);
		sb.append("\n");

		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
