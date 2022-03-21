package Datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.*;




public class DatasEmJava44 {

	public static void main(String[] args) {

		/*Total de dias a partir de uma dta até hoje*/
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2000-12-01"), LocalDate.now());
		System.out.println(dias);
		
	}

}
