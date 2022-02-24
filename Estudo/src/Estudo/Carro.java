package Estudo;

public class Carro extends Veiculo {

	
	String cor;
	String modelo;
	int capacidadeTanque;
	
	// Construtor
	
	Carro(){
		
	}
	
    Carro(String cor, String modelo, int capacidadeTanque){
    	
    	this.cor = cor;
    	this.modelo = modelo;
    	this.capacidadeTanque = capacidadeTanque;
		
	}
	
	
	
	
	void setcor(String cor) {
		this.cor = cor;
		
	}
	
	String getCor() {
		return cor;
	}
	
	void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	String getModelo() {
		return modelo;
	}
	
	void setcapacidadeTanque( int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	int getcapacidaTanque() {
		return capacidadeTanque;
	}
	
	
	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
	
}
