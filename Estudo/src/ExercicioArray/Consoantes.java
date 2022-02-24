package ExercicioArray;

import java.util.Scanner;

/*
 * Fa�a um programa que leia um vetor de 6 caracteres e diga quantas consoantes
 * foram lidas , imprima as consoantes.
 */

public class Consoantes {

	private static final String Systen = null;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;

		int count = 0;
		do {
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase("a")|
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u"))) {
				consoantes[count] = letra;
				quantidadeConsoantes++;
				
			}
			
			count++;

		} while (count < consoantes.length);

		System.out.println("Consoantes : ");
		
		for (String consoante : consoantes) {
			if(consoante != null)
		System.out.print(consoante+" ");
		};
	}
}
