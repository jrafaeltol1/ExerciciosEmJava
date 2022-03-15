package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notasLogica = { 48, 35, 87, 88 };
		double[] notas = { 98, 45, 77, 88 };

		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setNomeEscola("Jdev Treinamentos");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notas);

		aluno.getDisciplinas().add(disciplina2);
		
		/*Array de objetos*/
		
		Aluno [] arrayAlunos = new Aluno[1];
		arrayAlunos[0] = aluno;
		
		for (int pos=0; pos<arrayAlunos.length ;pos++) {
			
			System.out.println("Nome do Aluno é "+arrayAlunos[pos].getNome());
			
			
			System.out.println("----------Disciplinas------------");
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				
				System.out.println("Disciplina "+d.getDisciplina());
				
				for(int posnota=0;posnota<d.getNota().length; posnota++) {
					System.out.println("A nota número "+ (posnota+1) + " é igual = "
							+ ""+d.getNota()[posnota]);
					
				}
				
				
			}
		}

		
	}

}
