package LeituraDeArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivosTxt {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entrada = 
				new FileInputStream(new File
		("C:\\Users\\User\\git\\ExerciciosEmJava\\Estudo\\src\\LeituraDeArquivos\\arquivo.txt"));
		System.out.println("chegou aqui");
		Scanner lerArquivo = new Scanner(entrada, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			//System.out.println(linha);
			//Lendo a linha e setando os atributos nos objetos.
			//Após inseir na linha.
			
			
			if (linha != null && !linha.isEmpty()) {
				// Pode ser dividido por PIPE = | mais usado
				String[] dados = linha.split("\\;");
				//Quando a linha for valida ...
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setIdade(Integer.parseInt(dados[1]));
				pessoa.setEmail(dados[2]);
				
				
				pessoas.add(pessoa);
				
				
				
				
			}
				
			}
		for (Pessoa pessoa : pessoas) {
			System.out.println(" Nome : "+pessoa.getNome()+" Idade : "+
		pessoa.getIdade()+" E-mail "+pessoa.getEmail());
			
		}
		
		
		
		    
			
			
		}
			
	

	}


