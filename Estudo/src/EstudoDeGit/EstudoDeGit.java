package EstudoDeGit;

import java.util.Scanner;

public class EstudoDeGit {

	
	
	
		public static void main(String[] args) {

			int nVezes = 0;
			int numero = 0;
			int countImpar = 0;
			int countPar = 0;
			int variavelTeste =0;

			Scanner scan = new Scanner(System.in);

			System.out.println("Informe quantos numeros");
			nVezes = scan.nextInt();

			int count = 0;

			do {
				System.out.println("Numero: ");
				numero = scan.nextInt();
				count++;

				if (numero % 2 == 0)
					countPar++;
				else
					countImpar++;

			} while (count < nVezes);

			System.out.println("Você informou " + countPar + " número(s) pares");
			System.out.println("Você informou " + countImpar + " número(s) impares");

		}
	}


