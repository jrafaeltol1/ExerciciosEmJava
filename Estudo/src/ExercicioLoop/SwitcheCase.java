package ExercicioLoop;

import java.util.Scanner;

public class SwitcheCase {
	public static void main(String[] args) {

		System.out.println("Informe o dia conforme tabela");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sabado");
		
		
		Scanner ler = new Scanner(System.in);
		String textoDigitado = ler.next();

		int dia = Integer.parseInt(textoDigitado);
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda-Feira");
			break;

		case 3:
			System.out.println("Terça-Feira");
			break;

		default:
			System.out.println("Outro valor " + dia);
			break;
		}

	}
}
