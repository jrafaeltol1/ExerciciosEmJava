package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrimeiraClasseJavaExecutavel {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		
		
		for(int qtd = 0 ;qtd<2 ;qtd++ ) {
		Aluno aluno2 = new Aluno();

		String nome = JOptionPane.showInputDialog("Informe o nome do aluno "+(qtd+1));
		/*String matricula = JOptionPane.showInputDialog("Informe a matricula");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento");
		String idade = JOptionPane.showInputDialog("Informe a idade");
		String nomeEscola = JOptionPane.showInputDialog("Informe o nome da escola");
		String nomeMae = JOptionPane.showInputDialog("Nome Mãe");
		String dataMatri = JOptionPane.showInputDialog("Informe a data da Matricula");*/
		/*String nota1 = JOptionPane.showInputDialog("Informe a nota1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota4");*/
		
		
		/* Objeto criado na memória */
		
		

		aluno2.setNome(nome);
		/*aluno2.setDataMatricula(dataMatri);
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setIdade(Integer.valueOf(idade));
		aluno2.setNomeEscola(nomeEscola);
		aluno2.setNomeMae(nomeMae);
		aluno2.setDataMatricula(matricula);
		aluno2.setNota1(Double.parseDouble(nota1));
		aluno2.setNota2 (Double.parseDouble(nota2));
		aluno2.setNota3(Double.parseDouble(nota3));
		aluno2.setNota4(Double.parseDouble(nota4));*/
		
		
		for(int pos =1;pos <=4 ; pos++) {
			String nomeDisciplina =JOptionPane.showInputDialog("Informe o nome da Disciplina "+pos);
			String notaDisciplina = JOptionPane.showInputDialog("Informe a nota "+pos);
			
			
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno2.getDisciplinas().add(disciplina);
			
			
		}
		
            int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina ?" );		
		
            if (escolha == 0) {
            	
            	int continuarRemover =0;
            	int posicao =1;
            	
            	while(continuarRemover == 0 ){
            	
            	String disciplinaRemover = JOptionPane.showInputDialog("Qual a discplina? 1,2,3,ou 4");
            	aluno2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao);
               continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
            	posicao ++;
            	}
            }
            
            alunos.add(aluno2);
		}
		
		
		
		/*for (Aluno aluno : alunos) {
			
			 if (aluno.getNome().equalsIgnoreCase("ricardo")) {
				alunos.remove(aluno); 
				break;
				
				
				System.out.println("Alunos que sobraram");
				System.out.println(aluno.getNome());
				System.out.println("Suas matérias são");
				
				
				for (Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println(disciplina.getDisciplina());
					System.out.println(disciplina.getNota());
					
					System.out.println("------------------------------");
				}
			
				
			
			}
		}  exemplo de for */
		
		
		/*ABAIXO UM FOR VARRENDO A LISTA POR POSIÇÃO*/
		
		for (int pos = 0; pos< alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			System.out.println("Aluno = "+aluno.getNome());
			System.out.println("Média do Aluno "+ aluno.getMedia());
			System.out.println("Resultado = "+ aluno.getAlunoAprovado2());
			System.out.println("-------------------------------------"); 
			
			for (Disciplina disc : aluno.getDisciplinas()) {
				System.out.println("Matéria "+ disc.getDisciplina() + " Nota = "
						+disc.getNota());
				System.out.println("-----------------------------------");
				
			}
		}
            	
            	     
	}}
