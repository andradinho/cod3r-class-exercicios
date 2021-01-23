package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("Testo");
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos primitivod
		int a = 123;
		System.out.println(a);
	}
}
