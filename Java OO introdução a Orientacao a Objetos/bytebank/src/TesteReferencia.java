
public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		//duas cartas diferentes que vão para o mesmo endereço
		Conta segundaConta = primeiraConta;
		
	}
}
