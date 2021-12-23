package collections.lista.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Pedro", "Fernanda", "Guilherme", "Priscila", "Raul");

        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("");

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);


    }
}
