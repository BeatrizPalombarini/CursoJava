package br.com.BPS.cm;

import br.com.BPS.cm.modelo.Tabuleiro;
import br.com.BPS.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}