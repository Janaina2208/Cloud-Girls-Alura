
public class TestaLacos2 {

	public static void main(String[] args) {
		//la�os aninhados ou encadeados
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(coluna > linha) {
					//sai do la�o mais pr�ximo dele
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
