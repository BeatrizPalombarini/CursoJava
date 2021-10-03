package generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Gordovisky e Molly");

		String coisaA = caixaA.abrir();
		System.out.println(coisaA);

		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(1.8);

		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}