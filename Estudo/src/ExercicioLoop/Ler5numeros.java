package ExercicioLoop;

import java.util.Scanner;

/* faça um programa que leia 5 numeros e 
informe o maior numero, e a média desses numeros
*/

public class Ler5numeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int maior = 0;
		int media = 0;
		int count = 0;
		int soma = 0;

		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			count++;
			if (maior < numero) {
				maior = numero;
			}
			soma = (soma + numero);

		} while (count < 5);
		media = (soma / 5);

		System.out.println("O maior numero digitado é " + maior);
		System.out.println("A média dos numeros digitados é de " + media);

	}

}
