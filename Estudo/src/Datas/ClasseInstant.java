package Datas;

import java.time.Duration;
import java.time.Instant;

public class ClasseInstant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);//Pode ser um processo com umtempo que n�o conhecemos
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Dura��o em nano segundos "+ duracao);
		System.out.println("Dura��o em minutos "+duracao.toMinutes());
		System.out.println("Dura��o em segundos "+duracao.getSeconds());
		System.out.println("Dura��o em Milisegundos "+ duracao.toMillis());

	}

}
