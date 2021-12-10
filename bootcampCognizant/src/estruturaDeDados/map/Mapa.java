package estruturaDeDados.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Pedro");
        usuarios.put(2, "Fernanda");
        usuarios.put(3, "Rosane");
        usuarios.put(4, "Demóstenes");
        usuarios.put(19, "Priscila");
        usuarios.put( 23, "Raul");

        System.out.println(usuarios.size());
        System.out.println(usuarios);
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsValue("Pedro"));
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.get("Pedro"));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(int valor: usuarios.keySet()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }


        System.out.println(usuarios.remove(1));

    }
}
