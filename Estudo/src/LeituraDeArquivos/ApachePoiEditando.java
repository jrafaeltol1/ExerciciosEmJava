package LeituraDeArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFChart.HSSFSeries;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



public class ApachePoiEditando {

	public static void main(String[] args) throws IOException {
		
		   File file = new File
				("C:\\Users\\Rafael\\git\\ExerciciosEmJava\\Estudo\\src\\LeituraDeArquivos\\arquivo_excel.xls");
		   
		   FileInputStream entrada = new FileInputStream(file);
		   
		  
		   /*Prepara a entrada do arquivo xls*/
		   HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		   /*Pegando a Planilha*/
		   HSSFSheet planilha = hssfWorkbook.getSheetAt(0); //pegando a planilha
		   
		 
		   Iterator<Row> linhaIterator = planilha.iterator();// java.util.iterator
		   
		   
		   while(linhaIterator.hasNext()) { //enquanto tiver linha
			  
			   Row linha = linhaIterator.next();         //dados da pessoa na linha
			   
			  
			   int numeroCelulas = linha.getPhysicalNumberOfCells();         /*quantidade de celula*/
			   
			  
			   Cell cell = linha.createCell(numeroCelulas);        //Cria uma nova ! coluna! no caso uma celula
			   cell.setCellValue("5.458.55");
			   
		   }
		   
		  
		   entrada.close();
		   FileOutputStream saida = new FileOutputStream(file);
		   hssfWorkbook.write(saida);
		   saida.flush();
		   saida.close();
		   
		   
		   System.out.println("Planilha atualizada");
		   
		   

	}

}
