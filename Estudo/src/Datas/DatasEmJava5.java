package Datas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava5 {

	public static void main(String[] args) throws ParseException {
		/*Gerando varios boletos (Parcelas)*/
		
		//A partir de uma data gerar varias datas de vencimento.
		
		
		//Instancia de um objeto carregando uma data e formato
		//.parse seria a conversão de String para formato Date		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(dataInicial);//Atribuindo Objeto Date ao calendario.
		
		
		for(int parcela=1; parcela <=12; parcela++) {
			
			calendar.add(Calendar.MONTH, 1);//objeto que adiciona meses
			
			System.out.println("Parcela número : "+ parcela + "  vencimento em : "
			       +new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
		}
		
		

	}

}
