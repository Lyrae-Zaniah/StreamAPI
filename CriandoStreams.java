package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "XML ", "JS\n");
        langs.forEach(print);

        String[] maislangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        Stream.of(maislangs).forEach(print);
        Arrays.stream(maislangs).forEach(print);
        Arrays.stream(maislangs, 1, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

//        Stream.generate(() -> "a").forEach(print);
//        Stream.iterate(0, n -> n+1).forEach(print);
    }
}
