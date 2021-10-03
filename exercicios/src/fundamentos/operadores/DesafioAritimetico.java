package fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {

//      exemplo pra mostrar o Math.pow:
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(b, 4);
//
//		System.out.println(b);
//		System.out.println(c);
		
		int cima1 = (int) Math.pow(6 * (3 + 2), 2);
		int baixo1 = (3 * 2);
		
		int b = (1 - 5) * (2 - 7);
		int baixo2 = 2;
		int cima2 = (int) Math.pow((b / baixo2), 2);
		
		int subtracao = (cima1 / baixo1) - (cima2);
		int cima = (int) Math.pow(subtracao, 3);
		
		int baixo = (int) Math.pow(10, 3);
		
		int fim = (cima / baixo);
		
		System.out.println(fim);
		
	}
}