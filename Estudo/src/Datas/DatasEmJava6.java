package Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) {
		
		/*Nova API de data a partir do Java 8*/
		
		
		//Essa classe LocalDate é estatica por isso não sera instanciada.
		LocalDate dataAtual = LocalDate.now();
		LocalTime horaAtual = LocalTime.now();
		
		LocalDateTime diaEHora = LocalDateTime.now();
		
		
		System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println(diaEHora);
		
		//Formatando a data
		System.out.println("Data a hora atual :" 
		+diaEHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		
		
		

	}

}
