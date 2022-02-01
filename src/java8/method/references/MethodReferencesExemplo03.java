package java8.method.references;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesExemplo03 {
	
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L'", 3200.00));
		lista.add(new Produto("Fog�o 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		/*Method reference 
		* Refer�ncia a um m�todo de inst�ncia (imprime) de um objeto arbitr�rio (?) a partir de um tipo espec�fico (Produto)
		*/
		lista.forEach(Produto::imprime);
		
	}
}
