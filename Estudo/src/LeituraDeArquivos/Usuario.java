package LeituraDeArquivos;

import java.io.Serializable;

public class Usuario implements Serializable {
	



	private String login;
	private String senha;
	private String CPF;
	
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", CPF=" + CPF + "]";
	}
	
	
	
	

}
