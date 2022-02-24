package ExercicioLoop;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o numero a ser fatorado");
		int fatorial = scan.nextInt();
		int multiplicador = 1;
		
		
		System.out.println(fatorial + "! = ");

		for (int i = fatorial; i >= 1; i--) {

			multiplicador = multiplicador * i;

		}
		
		System.out.println(multiplicador);
	}

}
