package cursojava.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classesAuxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJavaExecutavel {

	public static void main(String[] args) {

		String usuario = JOptionPane.showInputDialog("Informe o usuario!");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		PermitirAcesso permitirAcesso = new Secretario(usuario , senha);
		
		
		

		if (new FuncaoAutenticacao(new Diretor(usuario , senha)).autenticarCursoJava()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 0; qtd < 2; qtd++) {
				Aluno aluno2 = new Aluno();

				String nome = JOptionPane.showInputDialog("Informe o nome do aluno " + (qtd + 1));
				/*
				 * String matricula = JOptionPane.showInputDialog("Informe a matricula"); String
				 * dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento");
				 * String idade = JOptionPane.showInputDialog("Informe a idade"); String
				 * nomeEscola = JOptionPane.showInputDialog("Informe o nome da escola"); String
				 * nomeMae = JOptionPane.showInputDialog("Nome Mãe"); String dataMatri =
				 * JOptionPane.showInputDialog("Informe a data da Matricula");
				 */
				/*
				 * String nota1 = JOptionPane.showInputDialog("Informe a nota1"); String nota2 =
				 * JOptionPane.showInputDialog("Informe a nota2"); String nota3 =
				 * JOptionPane.showInputDialog("Informe a nota3"); String nota4 =
				 * JOptionPane.showInputDialog("Informe a nota4");
				 */

				/* Objeto criado na memória */

				aluno2.setNome(nome);
				/*
				 * aluno2.setDataMatricula(dataMatri); aluno2.setDataNascimento(dataNascimento);
				 * aluno2.setIdade(Integer.valueOf(idade)); aluno2.setNomeEscola(nomeEscola);
				 * aluno2.setNomeMae(nomeMae); aluno2.setDataMatricula(matricula);
				 * aluno2.setNota1(Double.parseDouble(nota1)); aluno2.setNota2
				 * (Double.parseDouble(nota2)); aluno2.setNota3(Double.parseDouble(nota3));
				 * aluno2.setNota4(Double.parseDouble(nota4));
				 */

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da Disciplina " + pos);
					String notaDisciplina = JOptionPane.showInputDialog("Informe a nota " + pos);

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno2.getDisciplinas().add(disciplina);

				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

				if (escolha == 0) {

					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {

						String disciplinaRemover = JOptionPane.showInputDialog("Qual a discplina? 1,2,3,ou 4");
						aluno2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
						posicao++;
					}
				}

				alunos.add(aluno2);
			}

			/* Passando uma lista com valores inicializados */
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);

				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("------------------Lista Aprovados-----------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMedia());

			}

			System.out.println("------------------Lista Reprovados-----------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMedia());

			}

			System.out.println("------------------Lista Recuperação-----------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMedia());

			}

		}
	}
}
