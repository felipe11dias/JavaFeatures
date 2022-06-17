package java11.var.lambda;

import java.util.function.Function;

public class MinhaClasse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> concatena = (String s) -> s + ". ";
		System.out.println(concatena);
		//var em lambda expression
		Function<String, String> concatena2 = (var s) -> s + ". ";
		System.out.println(concatena2);
	}

}
