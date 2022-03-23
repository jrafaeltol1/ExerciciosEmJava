package LeituraDeArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreverJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		
		
		usuario1.setNome("Rafael");
		usuario1.setCPF("054870977-71");
		usuario1.setLogin("j.rafaeltol1");
		usuario1.setSenha("Ra190020");
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setNome("Ricardo");
		usuario2.setCPF("054870974471");
		usuario2.setLogin("Rick");
		usuario2.setSenha("190020");
		
		
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();// serve para organizar o código. JSON
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Rafael\\git\\ExerciciosEmJava\\Estudo\\src\\LeituraDeArquivos\\filjson.json");	
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		
	

	}

}
