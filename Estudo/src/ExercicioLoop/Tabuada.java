package ExercicioLoop;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número
 * inteiro entre 1 a 10.
 * O usuario deve informar de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 */

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("informe o numero da ta tabuada ");
		int numero = scan.nextInt();

		System.out.println("A tabuada do numero " + numero + " é:");

		for (int i = 1; i <= 10; i++) {

			int resul = 0;
			int multiplicador = 1;

			resul = numero * i;
			System.out.println(numero + " x " + i + " = " + resul);

		}

	}

}
