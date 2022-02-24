package ExercicioLoop;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a N numeros inteiros,
 * calcule e mostre a quantidade de numeros pares
 * e a quantidade de numeros impares.
 */

public class ImparouPar {
	public static void main(String[] args) {

		int nVezes = 0;
		int numero = 0;
		int countImpar = 0;
		int countPar = 0;

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

		System.out.println("Voc� informou " + countPar + " n�mero(s) pares");
		System.out.println("Voc� informou " + countImpar + " n�mero(s) impares");

	}
}
