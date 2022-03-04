package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrimeiraClasseJavaExecutavel {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Informe o nome");
		String matricula = JOptionPane.showInputDialog("Informe a matricula");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento");
		String idade = JOptionPane.showInputDialog("Informe a idade");
		String nomeEscola = JOptionPane.showInputDialog("Informe o nome da escola");
		String nomeMae = JOptionPane.showInputDialog("Nome Mãe");
		String dataMatri = JOptionPane.showInputDialog("Informe a data da Matricula");
		String nota1 = JOptionPane.showInputDialog("Informe a nota1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota4");
		
		
		Aluno aluno2 = new Aluno();
		/* Objeto criado na memória */
		
		

		aluno2.setDataMatricula(dataMatri);
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setIdade(Integer.valueOf(idade));
		aluno2.setNome(nome);
		aluno2.setNomeEscola(nomeEscola);
		aluno2.setNomeMae(nomeMae);
		aluno2.setDataMatricula(matricula);
		aluno2.setNota1(Double.parseDouble(nota1));
		aluno2.setNota2 (Double.parseDouble(nota2));
		aluno2.setNota3(Double.parseDouble(nota3));
		aluno2.setNota4(Double.parseDouble(nota4));
		

		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		
		aluno2.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("POO");
		disciplina2.setNota(80);
		
		aluno2.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina1.setDisciplina("HTML");
		disciplina1.setNota(75);

		aluno2.getDisciplinas().add(disciplina3);
		
		
		
		System.out.println("A Média do aluno é " + aluno2.getMedia());
		System.out.println("Data da matricula "+aluno2.getDataMatricula());
		System.out.println("Data de nascimento "+aluno2.getDataNascimento());
		System.out.println("Idade do aluno "+aluno2.getIdade());
		System.out.println("Nome do Aluno "+aluno2.getNome());
		System.out.println("O Aluno esta "+(aluno2.getAprovado()? "Aprovado":"Reprovado"));

		System.out.println("Resultado = " + (aluno2.getAprovado() ? "Aprovado" : "Reprovado"));

		System.out.println("Resultado " +aluno2.getMedia());
		
		
		
		List lista = new ArrayList();
	}
}
