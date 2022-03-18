package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> 
	             pilha_filha = new ConcurrentLinkedQueue<>();
	
	
	/*Temos que trer metodos para adicionar esses objetos da pilha*/
	
	
	/*Recebendo por parametro um objeto da fila thread*/
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
@Override
public void run() {
	
	
	
	while (true) {
		
		Iterator   iteracao = pilha_filha.iterator();
		
	
	
	synchronized (iteracao) {/*Bloqueia o acesso a esta lista por outros processos*/
		/*Ou seja somente essa Thread tera acesso a essa lista de processamento.*/
		
		
		while (iteracao.hasNext()) {//Enquanto conter dados na lista ira processar
			
			
			/*Pega o objeto atual*/
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
			
			/*Processar 10 mil notas fiscais por exemplo*/
			/*Gerar uma lista enorme de PDF*/
			/*Envio em massa de e-mails*/
			
			
			System.out.println("--------------------------------");
			System.out.println(processar.getEmail());
			System.out.println(processar.getNome());
			
			
			iteracao.remove();  /*Remove e sobe e processa o próximo*/
			
			
			/*Dar um tempo para descarga de memória*/
			
			try {
				Thread.sleep(2000);/*Processou a lista dá um tempo pra limpeza de memória*/
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
			
		}
	}
	
	super.run();
}
}
	
	
	

}
