package ExercicioLoop;

public class OperacoesLogicasAninhadas {
	public static void main(String[] args) {
		
		int nota1 = 99;
		int nota2 = 30;
		int nota3 = 50;
		
		int media = (nota1+nota2+nota3) /3;
		
		if (media >= 50) {
			if (media >=70) {
				System.out.println("Aluno aprovado direto "+media);
			}else{
				System.out.println("Aluno esta em recuperação "+media);
			}
		}else {
			System.out.println("Aluno reprovado direto "+media);
		}
	}

}
