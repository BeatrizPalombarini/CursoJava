package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// do {} -- while (...);

		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Apenas as palavras m�gicas saem...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado.");
		entrada.close();
	}
}
