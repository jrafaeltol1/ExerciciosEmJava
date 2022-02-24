package ExercicioVetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println();
		
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		int tamanhoarray = 5;
		
		for (int i = 0 ; i < tamanhoarray; i++ ) {
			System.out.println("Entre com o numero da " +(i+1) + "o.´posição: ");
			array.add(scan.nextInt());
		}
		
		System.out.print("\nArray:");
		System.out.println(array.toString());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
