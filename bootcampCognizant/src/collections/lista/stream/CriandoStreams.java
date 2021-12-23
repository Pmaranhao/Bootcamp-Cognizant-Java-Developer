package collections.lista.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
    }
}
