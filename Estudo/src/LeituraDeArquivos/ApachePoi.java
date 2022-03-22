package LeituraDeArquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File
	("C:\\Users\\User\\git\\ExerciciosEmJava\\Estudo\\src\\LeituraDeArquivos\\arquivo_excel.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
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
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook();// vai ser usado para escrever a planilha.
		HSSFSheet linhasPessoa = hssfworkbook.createSheet("Planilha de pessoas");// Criar planilha
		
		int numeroLinha = 0;
		for (Pessoa p : pessoas) {
			Row Linha = linhasPessoa.createRow(numeroLinha++);// Criando a linha da Planilha
			
			int celula = 0;
			Cell celNome = Linha.createCell(celula++);//celula 1
			celNome.setCellValue(p.getNome());
			
			
			Cell celIdade = Linha.createCell(celula++); //celula 2
			celIdade.setCellValue(p.getIdade());
			
			
			Cell celEmail = Linha.createCell(celula++); //celula 3
			celEmail.setCellValue(p.getEmail());
			
			
		}// Término da montagem da planilha.
		
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);// escreve a planilha em arquivo
		saida.flush();
		saida.close();
		
		System.out.println("planilha foi criada");
		
		
		
		
		
		
	}

}
