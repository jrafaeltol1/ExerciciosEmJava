package ExercicioLoop;

public class OperadoresTernarios {
	public static void main(String[] args) {

		int nota1 = 29;
		int nota2 = 10;
		int nota3 = 30;

		int media = (nota1 + nota2 + nota3) / 3;

		/* Condi��o IF e Else */

		if (media >= 70) {
			System.out.println("ALUNO APROVADO " + media);

		} else if (media >= 40 && media < 70) {
			System.out.println("Aluno esta em recupera��o " + media);
		} else {
			System.out.println("Aluno Reprovado " + media);

			/* Opera��es Ternarias pequenas valida��es */

		}

		String saidaResultadoAluno = media >= 70 ? "Aluno aprovado" 
				: (media >=40 && media <70)? "Aluno em Recupera��o": "Aluno Reprovado";

		System.out.println(saidaResultadoAluno);

	}

}
