
public class TesteGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente janaina = new Cliente();
		janaina.setNome("janaina lopes");
		//conta.titular = janaina;
		conta.setTitular(janaina);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		//agora em duas linhas
		//Cliente titularDaConta.setProfissao("programadora");
		
		//System.out.println(titularDaConta);
		System.out.println(janaina);
		System.out.println(conta.getTitular());
	}
}