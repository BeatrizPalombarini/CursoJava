package fundamentos;

public class PrimitivoVSObjeto {

	public static void main(String[] args) {
		
		//Objeto tem a nota��o ponto
		String s = new String ("texto"); //novo objeto
		s.toUpperCase();
		
		
		//Wrappers (embrulho) s�o a vers�o objeto dos tipos primitivos.
		int a = 123;
		System.out.println(a);
	}
}
