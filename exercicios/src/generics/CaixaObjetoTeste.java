package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(1.8);

		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Thi e Bia");

		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}