
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaMarcela = new Conta();
		System.out.println(contaMarcela.saldo);
		
		contaMarcela.titular.nome="marcela";
		System.out.println(contaMarcela.titular.nome);
	}
}
