package Streams.Filter.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Carros c1 = new Carros("Porsche Cayenne", 899.000, false, false);
        Carros c2 = new Carros("Lancer Evolution", 195.241, true, true);
        Carros c3 = new Carros("Subaru Impreza WRX", 289.990, true, true);
        Carros c4 = new Carros("Mazda RX-7", 189.000, false, true);
        Carros c5 = new Carros("Nissan 350Z", 339.990, false, false);
        Carros c6 = new Carros("Dodge Challenger", 1490.000, false, false);

        List<Carros> listaCarros = Arrays.asList(c1,c2,c3,c4,c5,c6);

        Predicate<Carros> precoBom = c -> c.preco <= 300.000;
        Predicate<Carros> eQuatroPortas = c -> c.quatroPortas;
        Predicate<Carros> temTurbo = c -> c.turbo;
        Function<Carros, String> melhoresCarros =
                c -> "O carro " + c.nome + " com o preço de R$" + c.preco + " é uma boa opção de carro quatro portas, custo beneficio e com turbo.";

        listaCarros.stream()
                .filter(precoBom)
                .filter(eQuatroPortas)
                .filter(temTurbo)
                .map(melhoresCarros)
                .forEach(System.out::println);
    }
}
