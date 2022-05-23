
public class TestaBanco {

	public static void main(String[] args) {
		Cliente janaina = new Cliente();
		janaina.nome = "Janaina Lopes";
		janaina.cpf = "000.111.222-33";
		janaina.profissao = "programadora";
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.titular = janaina;
		System.out.println(conta.titular.nome);
		
	}
}
