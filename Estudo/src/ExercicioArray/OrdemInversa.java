package ExercicioArray;

public class OrdemInversa {

	/*
	 * Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa.
	 */
	public static void main(String[] args) {

		int[] vetor = { 7, -5, 15, 50, 8, 4 };

		int count = vetor.length - 1;
		while (count >= 0) {

			System.out.println(vetor[count]);
			count--;

		}

		System.out.println("\nAgora no FOR");

		for (int i = (vetor.length - 1); i >= 0; i--) {

			System.out.println(vetor[i] + " ");

		}

	}
}
