package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		// (�F - 32) x 5/9 = �C
		final double correcao = 32;
		final double multiplica��o = 5.0/9.0;
		double fahrenheint = 150;
		double celsius;
		
		celsius = (fahrenheint - correcao) * multiplica��o;
		
		System.out.println(celsius + "�C");
	}
}