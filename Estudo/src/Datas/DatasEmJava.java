package Datas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DatasEmJava {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println("Data em milisegundos " + date.getTime());
		System.out.println(" Dia do Mês " + date.getDate());
		System.out.println("Dia da semana " + date.getDay());
		System.out.println("Hora do dia " + date.getHours());
		System.out.println("Minuto da Hora " + date.getMinutes());
		System.out.println("Segundos do dia " + date.getSeconds());
		System.out.println("Ano corrente " + (date.getYear() + 1900));
	
	/*------------Simple Date Format------------*/
		
		SimpleDateFormat simpleDateFormat = new  SimpleDateFormat("dd/MM/yyyy");
	
		System.out.println(simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data em formato para banco de dados "
		                                        +simpleDateFormat.format(date));
		
	}

}
