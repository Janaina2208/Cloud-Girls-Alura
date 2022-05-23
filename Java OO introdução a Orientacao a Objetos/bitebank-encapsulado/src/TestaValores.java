
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1510,1180);
		
		//conta está inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-100);
		
		System.out.println(conta.getAgencia());
	}
}
