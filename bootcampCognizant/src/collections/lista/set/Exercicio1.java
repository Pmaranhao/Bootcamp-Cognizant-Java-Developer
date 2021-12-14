package collections.lista.set;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.Set;
import java.util.TreeSet;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<String> cores = new TreeSet<>();

        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anil");
        cores.add("Violeta");

        System.out.println(cores.size());
        System.out.println(cores);

        for (int i = 0; i < cores.size(); i++){
            System.out.println(cores);
        }

    }
}
