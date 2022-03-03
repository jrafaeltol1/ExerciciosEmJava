package Estudo;

import javax.swing.JOptionPane;

public class EntradadeDados {

	public static void main(String[] args) {
				
		String quantidadeCarros = JOptionPane.showInputDialog("Informe a quantidade de Carros");
		String quantidadePessoas = JOptionPane.showInputDialog("Informe a quantidade de Carros");

		
		double carroNumero = Double.parseDouble(quantidadeCarros);
		double pessoaNumero = Double.parseDouble(quantidadePessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resultado = JOptionPane.showInternalConfirmDialog(null,"Deseja ver o resultado da divisão ?" );

		if (resultado == 0) {
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu "+ divisao );
		}else if (resultado==1) {
			JOptionPane.showMessageDialog(null, "Você decidiu não ver o resultado");
		}
	}

}
