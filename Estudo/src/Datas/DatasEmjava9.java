package Datas;

import java.time.LocalDate;

public class DatasEmjava9 {

	public static void main(String[] args) {
		
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Mais 5 dias "+dataBase.plusDays(5));
		
		System.out.println("Data Base "+dataBase);
		

	}

}
