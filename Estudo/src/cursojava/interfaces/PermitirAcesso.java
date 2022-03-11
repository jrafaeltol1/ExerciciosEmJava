package cursojava.interfaces;



  /*Essa interface sera o nosso contrato de autenticação*/
public interface PermitirAcesso {

	
	
	
	public boolean autenticar(String usuario , String senha);
	public boolean autenticar();
}
