package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Bia", 8.1, true);
		Aluno a2 = new Aluno("Thiago", 9.8, true);
		Aluno a3 = new Aluno("Gordovisky", 8.1, true);
		Aluno a4 = new Aluno("Molly", 8.1, true);
		Aluno a5 = new Aluno("Zeus", 5.5, false);
		Aluno a6 = new Aluno("Márcia", 2.6, false);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> bomComportamento = a -> a.bomComportamento;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";

		alunos.stream().filter(aprovado).filter(bomComportamento).map(saudacaoAprovado).forEach(System.out::println);
	}
}