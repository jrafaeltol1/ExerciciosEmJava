package cursojava.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
	
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 85;
		
		
		notas[1][0] = 40;
		notas[1][1] = 95;
		notas[1][2] = 85;
		
		
		
			
			
			/*Percorre Linhas*/
			for(int poslinha =0;poslinha< notas.length;poslinha++) {
			/* Para cada linha Percorrer as colunas Array*/	
				System.out.println("=================================================");
				for(int posColuna=0 ;posColuna<notas[poslinha].length ;posColuna++) {
					System.out.println("Valor da Matriz :"+notas[poslinha][posColuna]);
					
					
				}
				
			}
		
	
	}

}
