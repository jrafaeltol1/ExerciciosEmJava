package cursojava.classesAuxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tenha o contrato  de permitir o acesso a interface*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	
	
	public boolean autenticarCursoJava() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
