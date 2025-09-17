package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> Resultado = nums.stream()
                .map(Integer::toBinaryString)
                .map(s -> new StringBuilder(s).reverse().toString())
                .map(b -> Integer.parseInt(b, 8))
                .toList();

        System.out.println("Originais: " + nums);
        System.out.println("Convertidos: " + Resultado);

    }
}
