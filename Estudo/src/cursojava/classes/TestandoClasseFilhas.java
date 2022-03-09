package cursojava.classes;

public class TestandoClasseFilhas {
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno =new Aluno();
		aluno.setNome("Rafael");
		aluno.setNomeEscola("UniverCidade");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("45534543543");
		diretor.setNumeroCPF("454353453454354");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(43);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	}

}
