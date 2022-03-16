package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo do envio de e-mail */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread ThreadNFCE = new Thread(thread2);
		ThreadNFCE.start();

		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");

		JOptionPane.showMessageDialog(null, "Sistema continua disponivel para usuario");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Executando alguma rotina - exemplo envio de e-mail");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Gera um intervalo */

			}

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Enviado notas fiscais");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Gera um intervalo */

			}

		}
	};
}
