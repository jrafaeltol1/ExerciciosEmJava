package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		System.out.println("Data em milisegundos " + date.getTime());
		System.out.println(" Dia do M?s " + date.getDate());
		System.out.println("Dia da semana " + date.getDay());
		System.out.println("Hora do dia " + date.getHours());
		System.out.println("Minuto da Hora " + date.getMinutes());
		System.out.println("Segundos do dia " + date.getSeconds());
		System.out.println("Ano corrente " + (date.getYear() + 1900));
	
	/*------------Simple Date Format------------*/
		
		SimpleDateFormat simpleDateFormat = new  SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
	
		System.out.println(simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data em formato para banco de dados "
		                                        +simpleDateFormat.format(date));
		
		System.out.println("Objeto date "+simpleDateFormat.parse("1987-10-18 20:10:2"));
		
	}

}
