package api;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá pessoa!";

        List<String> lista = Stream.generate(saudacao)
                .limit(5).toList();
        lista.forEach(System.out::println);

        AtomicInteger num = new AtomicInteger();//Convertido em atomico
        //para que não tenha concorrência em threads em meio a Stream, o int comum
        //foi convertido para atômico para não ocorrer erros de concorrência de threads
        Supplier<Integer> numeros = num::getAndIncrement; // por method reference

        List<Integer> lista2 = Stream.generate(numeros).skip(1)//pulando o primeiro int
                .limit(10)
                .toList();

        lista2.forEach(System.out::println);
    }
}
