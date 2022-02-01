package java8.method.references;

import java.util.ArrayList;
import java.util.List;

class Impressora {
	
	public static void imprime(Produto p) {
		System.out.println(p.getNome() + " = " + p.getPreco());
	}
}

public class MethodReferencesExemplo02 {
	
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L'", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		/*Method reference 
		* Referência a um método estático (imprime)
		*/
		lista.forEach(Impressora::imprime);
		
	}
}
