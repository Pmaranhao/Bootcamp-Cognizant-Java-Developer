package estruturaDeDados.set;

import java.util.HashSet;
import java.util.Set;

public class SetMelhorado {

    public static void main(String[] args) {

        Set<String> lista = new HashSet<String>();

        lista.add("Botafogo");
        lista.add("Vasco");
        lista.add("Fluminense");
        lista.add("América-RJ");
        lista.add("Flamengo");

        for (String times: lista) {
            System.out.println(times);
        }

    }
}
