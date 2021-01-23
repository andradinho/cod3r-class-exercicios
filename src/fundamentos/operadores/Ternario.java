package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		// Ternário >> 3 operandos: Expressão ? resultado verdadeiro : resultado falso.

		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem desconto? " + resultado);
		System.out.printf("Tem desconto? %s", resultado);
	}
}
