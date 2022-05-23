
public class Conta {
	//qd coloca o private vc deixa privado, ou seja, com acesso ao atributo apenas na classe. Isso evita que que sejam realizadas contas com saldo negativo por exemplo
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
	
	}
	//refatorar muda o nome das infos no código inteiro get = getter
	public double getSaldo() {
		return this.saldo;
	}
}

	
