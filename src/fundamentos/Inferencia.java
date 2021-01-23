package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; erro ao tentar misturar o tipo...
		
		double d; // declaração de variável
		d = 123.65; // inicialização de variável
		System.out.println(d); // usada;
	}
}
