package controle.exercicioscontrole;

import java.util.Scanner;

public class Bissexto {
	/** 2. Criar um programa informa se o ano atual e�? um ano bissexto; */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		int bissexto = ano % 4;

		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();
	}

}