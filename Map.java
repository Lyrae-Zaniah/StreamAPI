package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Subaru ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

//        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//        UnaryOperator<String> primeiraLtra = n -> n.charAt(0) + "";
//        UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println(Utilitarios.maiuscula.andThen(Utilitarios.primeiraLtra).andThen(Utilitarios::grito).apply("BMW"));

        System.out.println("\nUsando composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLtra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
