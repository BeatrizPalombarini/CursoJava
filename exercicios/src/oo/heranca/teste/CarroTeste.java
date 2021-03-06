package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.HB20;
import oo.heranca.desafio.BMW;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new HB20();
		
		c1.acelerar();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		BMW c2 = new BMW(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println(c2.velocidadeDoAr());
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);

		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
	}
}