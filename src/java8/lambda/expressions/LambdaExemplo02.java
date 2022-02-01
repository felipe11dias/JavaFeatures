package java8.lambda.expressions;

import java.util.ArrayList;
import java.util.List;

class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}

public class LambdaExemplo02 {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("TV 42'", 2000.00));
		produtos.add(new Produto("Geladeira 470L'", 3200.00));
		produtos.add(new Produto("Fogão 4 bocas", 900.00));
		produtos.add(new Produto("Videogame", 1999.00));
		produtos.add(new Produto("Microondas", 550.00));
		
		/*Paramêmetro: interface Consumer JDK 1.8
		 *
		 * Lambda expression com um argumento 
		 */
		produtos.forEach( (produto) -> System.out.println(produto.getNome() + " = " + produto.getPreco()) );
		
		System.out.println("*********************** Ordem crescente de preços **************************");
		
		/*Paramêmetro: interface Comparator JDK 1.2
		 * 
		 *Lambda expression com dois argumentos 
		 */
		produtos.sort( (produto1, produto2) -> produto1.getPreco().compareTo(produto2.getPreco()) );
		
		produtos.forEach( (produto) -> System.out.println(produto.getNome() + " = " + produto.getPreco()) );
	}
	
}
