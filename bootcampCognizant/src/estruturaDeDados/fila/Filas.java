package estruturaDeDados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        //Adicionar
        fila.add("Ana"); // Gera erro
        fila.offer("Gerusa"); // retorna true / false
        fila.offer("Daniel");
        fila.offer("Carlos");
        fila.offer("Guilherme");

        // primeiro elemento da fila
        System.out.println(fila.peek()); // retorna null (fila vazia)
        System.out.println(fila.element()); // retorna exceção (fila vazia)

        //pool / remove ---> removendo elemento da fila
        // size --> tamanho
        // clear --> limpar
    }
}
