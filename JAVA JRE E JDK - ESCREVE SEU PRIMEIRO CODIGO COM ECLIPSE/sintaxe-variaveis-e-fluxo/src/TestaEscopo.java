
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int qtdPessoas = 1;
		
		//escopo é sobre onde colocar as variáveis e organização do código
		boolean acompanhado = true;
		
		if(idade >= 18 || qtdPessoas >= 2 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente vc n pode entrar");
		}
}
