
public class Conta {
//atributos sao as especifica��es dos objetos, tipo os c�modos da planta
	//aqui construimos os objetos com valor default ou dar um valor diferente de 0
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//void n�o tem msg de retorno
	public void deposita(double valor) {
		//invoca a conta, atrav�s do atributo
		this.saldo += valor;
	}
	//metodo vc sempre tem onde fazer, aqui ele j� sabe
	//s�o m�todos irm�os, n�o existe m�todo dentro de m�todo
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
			//vai em testando metodo para invocar o metodo
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
}

