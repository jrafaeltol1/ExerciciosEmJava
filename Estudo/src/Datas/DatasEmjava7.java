package Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatasEmjava7 {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data Atual :"
		+ localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//Descobrindo o dia da semana = retorna o dia atual da semana.
		System.out.println("Dia da semana "+ localDate.getDayOfWeek().ordinal());
		
		//Dia do Mes
		System.out.println("Dia do M�s "+localDate.getDayOfMonth());
		System.out.println("Dia do ano "+localDate.getDayOfYear());
		System.out.println("Retornando o M�s "+localDate.getMonth());
		
		
		//LocalDate � uma API
		
		
		
		
		

	}

}
