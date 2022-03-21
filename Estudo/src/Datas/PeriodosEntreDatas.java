package Datas;

import java.time.LocalDate;
import java.time.Period;

public class PeriodosEntreDatas {

	public static void main(String[] args) {
		
		LocalDate datAntiga =LocalDate.of(2010,03, 07);
		LocalDate dataNova = LocalDate.of(2013, 7, 4);
		
		System.out.println("Data antiga é maior que data nova ? "+datAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a nova ? "+datAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais :"+datAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(datAntiga, dataNova);
		System.out.println("Quantos dias existem nessa faixa de periodo? Resp.  "
		+periodo.getYears()+": Anos " +periodo.getMonths()+ ": Meses " +periodo.getDays()+": Dias");
		
		//Informar somente Meses
		
		System.out.println("Somente meses :"+periodo.toTotalMonths());
		System.out.println("Somente meses :"+periodo.getDays());
		

	}

}
