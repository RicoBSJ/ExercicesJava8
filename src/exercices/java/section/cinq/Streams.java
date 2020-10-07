package exercices.java.section.cinq;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args){

        List<String> uneListe = new ArrayList<>();
        uneListe.add("Fabien");
        uneListe.add("Eric");
        uneListe.add("RicoBSJ");

        uneListe.stream()
                .filter(s -> s.length()<7)
                .forEach(System.out::println);

        Stream.of("Fabien", "Eric", "RicoBSJ")
                .filter(s -> s.length()<7)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /*Optional somme = Stream.of("Fabien", "Eric", "RicoBSJ")
                .filter(s -> s.length()<7)
                .map(s -> s.length())
                .reduce((11),(12)->11+12);*/
    }
}
