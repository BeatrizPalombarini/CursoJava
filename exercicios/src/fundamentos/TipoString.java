package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(2));
		
		//String � imutavel
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		
		var nome = "Thiago";
		var sobrenome = "Souza";
		var idade = 21;
		
		System.out.println(nome + " " + sobrenome + " tem " + idade + " anos!");
		
		System.out.printf("O senhor %s %s tem %d anos.", nome, sobrenome, idade);
		System.out.println("\n");
		
		String frase = String.format("O senhor %s %s tem %d anos.", nome, sobrenome, idade);
		System.out.println(frase);
		
		
	}
}
