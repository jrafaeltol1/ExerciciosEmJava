package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	
    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;
    
    private String usuario;
	private String senha;
	
	
	public Diretor() {
		
	}
	
	public Diretor(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;	
	}
    
	
	
    
    
	public String getUsuario() {
		return usuario;
	}





	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}





	public String getSenha() {
		return senha;
	}





	public void setSenha(String senha) {
		this.senha = senha;
	}





	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
    
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", getTempoDirecao()=" + getTempoDirecao() + ", getTitulacao()="
				+ getTitulacao() + ", getRegistroEducacao()=" + getRegistroEducacao() + ", getIdade()=" + getIdade()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral()
				+ ", getNumeroCPF()=" + getNumeroCPF() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()="
				+ getNomePai() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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
