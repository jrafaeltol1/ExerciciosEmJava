package EstudoJoptionPane;

import javax.swing.JOptionPane;

public class CalcularMedia {
	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
		
		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		
		double media = ((dnota1 + dnota2 + dnota3 + dnota4) /4);
		
		
		if(media > 70) {		
		      JOptionPane.showMessageDialog(null, "Aluno Aprovado  nota de "+media);
		}else if (media >= 50 && media<70) {
			JOptionPane.showMessageDialog(null,"Aluno esta em recuperação nota de"+media);
		}else if (media <50) {
			JOptionPane.showMessageDialog(null, " Aluno está reprovado nota de "+media);
		}
	}

}
