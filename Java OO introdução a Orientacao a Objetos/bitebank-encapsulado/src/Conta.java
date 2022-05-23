
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	//construtor padrão
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O número total de contas no bytebank é "+Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 50; //isso significa que toda conta começa com 50 de saldo.
		
		System.out.println("estou criando uma conta"+ this.numero);
		
	}
	
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
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }		
		this.numero = novoNumero;		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("valor não pode ser negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal(){
	    return Conta.total;
	}
	
}

	
