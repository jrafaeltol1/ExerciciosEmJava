package cursojava.interfaces;



  /*Essa interface sera o nosso contrato de autentica��o*/
public interface PermitirAcesso {

	
	
	
	public boolean autenticar(String usuario , String senha);
	public boolean autenticar();
}
