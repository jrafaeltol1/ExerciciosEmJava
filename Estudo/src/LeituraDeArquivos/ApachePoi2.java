package LeituraDeArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.optim.PointValuePair;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada = new FileInputStream(new File(
				"C:\\Users\\User\\git\\ExerciciosEmJava\\Estudo\\src\\LeituraDeArquivos\\arquivo_excel.xls"));
	
		try (HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada)) {
			HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/*Pega a primeira Planilha*/
			
			Iterator<Row> linhaIterator = planilha.iterator();
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			
			
			while (linhaIterator.hasNext()) { // enquanto tiver linha no arquivo excel
				
				Row linha = linhaIterator.next();/*Dados da pessoa na linha*/
				
				Iterator<Cell> celulas = linha.iterator();
				
				
				Pessoa pessoa = new Pessoa();
				
				while (celulas.hasNext()) { /*percorre as celulas*/
				Cell cell = celulas.next();
				
				
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					
					break;
				case 1:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				case 2 :
					pessoa.setEmail(cell.getStringCellValue());

				default:
					break;
				}
				
				
			}// fim das celulas da linha
				pessoas.add(pessoa);
			
			}
			entrada.close();
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa);
			}
		}

	}
	}
