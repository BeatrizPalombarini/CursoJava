package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//trabalho na ter�a
		//trabalho na quinta
		//se os 2 trabalhos derem certo a familia toda vai no shopping comprar TV de 50'
		//se os 1 dos trabalhos derem certo a familia toda vai no shopping comprar TV de 32'
		//v�o tomar sorvete nesses dois cen�rios
		//se os dois derem errado ficam em casa
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador un�rio:
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprou sorvete?" + comprouSorvete);
		System.out.println("Mais saud�vel?" + maisSaudavel);
		
	}
}
