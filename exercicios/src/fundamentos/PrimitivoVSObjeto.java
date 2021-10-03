package fundamentos;

public class PrimitivoVSObjeto {

	public static void main(String[] args) {
		
		//Objeto tem a notação ponto
		String s = new String ("texto"); //novo objeto
		s.toUpperCase();
		
		
		//Wrappers (embrulho) são a versão objeto dos tipos primitivos.
		int a = 123;
		System.out.println(a);
	}
}
