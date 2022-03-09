package cursojava.classes;

public class Diretor extends Pessoa {
	
    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;
	
    
    
    
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
	
	
	
	
	
    

}
