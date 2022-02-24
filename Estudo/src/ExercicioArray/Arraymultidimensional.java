package ExercicioArray;

import java.util.Random;

/*
 * Gere e , imprima uma matriz 4x4
 * com valores aleatórios entre 0-9
 */
public class Arraymultidimensional {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int [][] M = new int[4] [4];
		
		
		/*
		 * Aqui nesse for sse salva as informações no Array bidimensional
		 */
		for (int i=0;i < M.length; i++) {
			for (int j = 0; j< M[i].length ; j++)
			M[i] [j] = random.nextInt(9);
			
		}
		
		for (int[] linha :M) {
			for (int coluna : linha) {
				
				System.out.print(coluna+" ");
				System.out.println();
			}
		}
		
		
		
	}
}
