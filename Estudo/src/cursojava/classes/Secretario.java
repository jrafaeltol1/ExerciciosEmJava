package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	
	private String usuario;
	private String senha;
	
	
	public Secretario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;	
		
	}
	
	
	public Secretario() {
		
	}
	
	
	

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", getRegistro()=" + getRegistro() + ", getNivelCargo()=" + getNivelCargo() + ", getExperiencia()="
				+ getExperiencia() + ", getIdade()=" + getIdade() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCPF()=" + getNumeroCPF()
				+ ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	@Override
	public boolean autenticar(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		return autenticar();
		}

	
	@Override
	public boolean autenticar() {
		
		return usuario.equals("admin") && senha.equals("admin");
	}

}
