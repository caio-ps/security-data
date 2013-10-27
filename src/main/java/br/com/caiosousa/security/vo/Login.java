package br.com.caiosousa.security.vo;

import br.com.caiosousa.digest.MD5;

public class Login {

	private String email;
	private String senha;

	public Login() {
	}

	public Login(String email, String senha) {
		this.email = email;
		this.senha = senha;
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
	
	public String digestedSenha() {
		return MD5.digest(senha);
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
