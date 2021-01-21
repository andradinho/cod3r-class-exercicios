package generics;

public class Caixa<T> {

	// T = tipo genérico
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}

