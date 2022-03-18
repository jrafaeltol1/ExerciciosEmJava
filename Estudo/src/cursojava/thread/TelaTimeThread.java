package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TelaTimeThread extends JDialog {
	
	
	private JPanel jpanel = new JPanel(new GridBagLayout());/*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jbutton = new JButton("Add Lista");
	private JButton jbutton1 = new JButton("Stop");
	
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	
	
	public TelaTimeThread() {
		
		setTitle("Minha tela de Time com Thread");
		setSize(new Dimension(240 , 240));   //defini tamanho
		setLocationRelativeTo(null);         //defini posição inicial da tela
		setResizable(false);                 //impede a tela de ser redimensionada
		
		
		/*Primeira Parte Concluida*/
		
		/*Controlador de posicionamento de componentes*/
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth =2;
		gridBagConstraints.insets =new Insets(5,5 ,5,5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		
		
		
		
		descricaoHora.setPreferredSize(new Dimension(200 ,25));
		jpanel.add(descricaoHora,gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jpanel.add(mostraTempo, gridBagConstraints);
		
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;		
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jpanel.add(mostraTempo2, gridBagConstraints);
		
		
		gridBagConstraints.gridwidth = 1;
		
		jbutton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy++;
		jpanel.add(jbutton,gridBagConstraints);
		
		jbutton1.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx++;
		jpanel.add(jbutton1 , gridBagConstraints);
		
		
		
		jbutton.addActionListener(new ActionListener() {
			
				
				
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				
				for (int qtd=0; qtd <100;qtd++) {
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText());
				
				fila.add(filaThread);
			}
			}
			}
			
		
		});
	
		jbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				fila = null; // mata a fila
				
			}
		});
		
		
		
	
		
		
	
		fila.start();
		add(jpanel, BorderLayout.WEST);
		setVisible(true);/*Torna a tela visivel para o usuario , sempre tem que ser o ultimo comando*/
		
	}

}
