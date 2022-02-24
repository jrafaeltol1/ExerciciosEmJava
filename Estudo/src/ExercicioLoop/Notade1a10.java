package ExercicioLoop;

import java.util.Scanner;

public class Notade1a10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nota;

		System.out.println("Nota: ");
		nota = scan.nextInt();

		while (nota < 0 | nota > 10) {
			System.out.println("Nota Invalida , digite novamente");
			nota = scan.nextInt();
		}
		
		System.out.println("A nota digitada foi " +nota);

	}

}
