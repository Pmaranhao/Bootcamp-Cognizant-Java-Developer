package estruturaDeDados.lista;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Fernanda"));
        lista.add(new Usuario("Luis"));
        lista.add(new Usuario("Alfeu"));

        System.out.println(lista.get(3));

        for (Usuario u: lista ) {
            System.out.println(u);
        }

        lista.remove(1);
        System.out.println(lista);
    }
}
