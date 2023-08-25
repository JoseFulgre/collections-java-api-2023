package api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<Integer> imprimirNumeroPar = n -> {
            if(n % 2 == 0)
                System.out.println(n);
        };
        System.out.println("Imprimindo números pares: ");
        //aplicando o consumer feito externamente
        numeros.forEach(imprimirNumeroPar);

        //aplicando o consumer internamente no forEach
        System.out.println("\nImprindo números ímpares: ");
        numeros.forEach(n -> {
            if(n % 2 != 0)
                System.out.println(n);
        });

        //Com filter e method reference
        System.out.println("\nImprimindo com filter: ");
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }


}
