package LeituraDeArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("rafael");
		pessoa1.setIdade(39);
		pessoa1.setEmail("j.rafaeltol1@gmail.com");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Ana");
		pessoa2.setIdade(40);
		pessoa2.setEmail("email@gmail.com");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Fulano de Tal");
		pessoa3.setIdade(33);
		pessoa3.setEmail("email3@gmail.com");

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		File arquivo = new File
	("C:\\Users\\User\\git\\ExerciciosEmJava\\Estudo\\src\\LeituraDeArquivos\\arquivo.txt");
		
		if(!arquivo.exists()) {
			
			arquivo.createNewFile();
			
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome()+ ";" +p.getIdade()+ ";" +p.getEmail()+ "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
		
		
		

	}
	

}
