package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	public static void main(String[] args) {
		
		
		String texto = "Rafael, Curso java , 80, 70, 90, 89";
		
		
		String[] valoreArray = texto.split(",");
		
		System.out.println("Nome "+valoreArray[0]);
		System.out.println("Curso "+valoreArray[1]);
		System.out.println("Nota 1 "+valoreArray[2]);
		System.out.println("Nota 2 "+valoreArray[3]);
		System.out.println("Nota 3 "+valoreArray[4]);
		System.out.println("Nota 4 "+valoreArray[5]);
	
	/*Converter um Array em lista*/
		
		
		
		System.out.println("Descarregando a lista");
		List<String> list = Arrays.asList(valoreArray);
		
		
		for(String valorString : list) {
			System.out.println(valorString);
		}
		
		/*Converter uma lista para Array*/
		
		
		String[] conversaoArray = list.toArray(new String[6]);
		
		
		System.out.println(conversaoArray);
		
		
		System.out.println("DESCARREGANDO ARRAY");
		for(int cont=0; cont<conversaoArray.length ;cont++) {
			System.out.println("Posiçao Array "+cont+ "    valor contido "+ conversaoArray[cont]);
			
			
		}
		
		
		
		
		
	
	}

}
