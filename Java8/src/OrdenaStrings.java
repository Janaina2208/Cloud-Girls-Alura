import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//Collections.sort(palavras);
		//System.out.println(palavras);
		
		/*Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		palavras.sort(comparador);
		System.out.println(palavras);*/
		
	    /*default void sort(Comparator<? super E> c) {
	        Collections.sort(this, c);
	    }*/
		
		/*class ConsumidorDeString implements Consumer<String> {
		    public void accept(String s) {
		        System.out.println(s);
		    }
		}*/
		
		//opção ao forEach
		//Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		//palavras.forEach(comparador);
		
		//OU AINDA---> s -> System.out.println(s)
		
		palavras.forEach(s -> System.out.println(s));
	}
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
	
	@Override
	    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
	
	/*palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
	 
	 OU
	 
	 palavras.sort((s1, s2) -> {
    return Integer.compare(s1.length(), s2.length()); 
});
	 OU
	 
	 palavras.sort(Comparator.comparing(s -> s.length()));
	 */
}
