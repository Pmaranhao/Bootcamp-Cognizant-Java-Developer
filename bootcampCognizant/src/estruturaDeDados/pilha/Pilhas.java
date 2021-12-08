package estruturaDeDados.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilhas {
    public static void main(String[] args) {

        Deque<String> nomes = new ArrayDeque<String>();

        // Adicionando
        nomes.add("Pedro");
        nomes.push("Fernanda");
        nomes.push("Rosane");
        nomes.push("Demóstenes");
        nomes.push("Priscila");
        nomes.push("Raul");

        System.out.println("Fila " + nomes);

        // Exibindo o último a entrar na fila
        System.out.println("Último da fila: " + nomes.peek());
        System.out.println("Último da fila: " + nomes.element());

        // Removendo
        System.out.println(nomes.poll()); // retorna true / false
        System.out.println(nomes.remove()); // joga uma exceção
        System.out.println(nomes.poll());

        System.out.println("Fila " + nomes);

        // Retorna tamanho da pilha
        System.out.println(nomes.size());

        // Procura
        System.out.println(nomes.contains("Pedro"));

        //Limpa

        nomes.clear();
        System.out.println("Fila " + nomes);

        // Está vazio?
        System.out.println(nomes.isEmpty());

    }
}
