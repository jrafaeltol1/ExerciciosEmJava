package EstudoJoptionPane;

import javax.swing.JOptionPane;

public class CriandoOp��odeConfirma��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumeros = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumeros);
		
		double  resto = (carroNumero % pessoaNumeros);
		
		int escolha = JOptionPane.showInternalConfirmDialog(null,"Deseja ver o resultado da divis�o ?" );

		
		JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu "+divisao+ " carros e sobrou "+resto);
	}

}
