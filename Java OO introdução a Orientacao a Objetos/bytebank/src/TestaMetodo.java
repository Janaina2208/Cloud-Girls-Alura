
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50);
		//qd segura o ctrl faz um hiperlink e se clicado faz vc ir direto pro item
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, conta);
		System.out.println(contaMarcela.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "janaina lopes";
		System.out.println(conta.titular);
	}
}
