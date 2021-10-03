package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// Informa��es de um funcion�rio
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // true

		// Tipo caracter
		char status = 'A'; // ativo

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " Dias na empresa");

		// N�mero de viagens
		System.out.println(numeroDeVoos / 2 + " Viagens");

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + " pontos para cada real");

		System.out.println("o " + id + " ganha " + salario + " de salario.");
		System.out.println("Esta de f�rias? (true/false)" + estaDeFerias);
		System.out.println("Status: " + status);

	}
}
