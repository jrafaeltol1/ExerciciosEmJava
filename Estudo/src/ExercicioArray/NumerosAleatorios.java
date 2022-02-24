package ExercicioArray;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleat´roios ( entre 0 e 100 )
 * armazene-os em um vetor.
 * Ao final mostre os números e seus sucessores
 */

public class NumerosAleatorios {
	public static void main(String[] args) {

		Random randomico = new Random();

		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = randomico.nextInt(100);
			numerosAleatorios[i] = numero;

		}

		System.out.println("\nNumeros Aleatórios");
		System.out.println();

		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nSucessores dos numeros Aleatorios");
		for (int numero : numerosAleatorios) {
			System.out.print(numero+1+" ");
		}

	}

}
