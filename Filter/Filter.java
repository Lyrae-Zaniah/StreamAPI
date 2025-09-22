package Streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {


        Aluno a1 = new Aluno("Ana", 9.7);
        Aluno a2 = new Aluno("Lia", 8.8);
        Aluno a3 = new Aluno("Gui", 7.0);
        Aluno a4 = new Aluno("Roberto", 6.5);
        Aluno a5 = new Aluno("Carlos", 4.3);
        Aluno a6 = new Aluno("Jasper", 2.2);
        Aluno a7 = new Aluno("Polaski", 5.5);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns! " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
