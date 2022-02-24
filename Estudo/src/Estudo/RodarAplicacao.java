package Estudo;

public class RodarAplicacao {

	
	public static void main(String[] args) {
		
		
		Carro carro1= new Carro();

		carro1.setcor("Azul");
		carro1.setmodelo("BMW series 3");
		carro1.setcapacidadeTanque(59);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getcapacidaTanque());
		System.out.println(carro1.totalValorTanque(  6.39));
		
		Carro carro2 =new Carro("cinza","BMW", 66);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getcapacidaTanque());
		System.out.println(carro2.totalValorTanque(6.48));
		
		
		
		
		
		
		
		
		
		
	}
}
