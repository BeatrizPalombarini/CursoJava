package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("Dia! /n/n");
		
		System.out.println("Bom");
		System.out.println("Dia!");
		
		System.out.printf("Nome: %s%n", "Bia");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.next();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = entrada.next();
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
		
	}
}
