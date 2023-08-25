package api;

import java.util.Arrays;
import java.util.List;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("Java", "Kotlin", "PhP", "JS", "C", "C++", "Python");

        linguagens.stream().filter(n -> n.length() > 3).forEach(System.out::println);
        //predicate em lambda dentro do filter
    }
}
