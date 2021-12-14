package collections.lista;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Boolean> pergunta = new ArrayList<Boolean>();

        System.out.println("Telefonou para a vítima?");
        pergunta.add(scan.nextBoolean());

        System.out.println("Esteve no local do crime?");
        pergunta.add(scan.nextBoolean());

        System.out.println("Mora perto da vítima?");
        pergunta.add(scan.nextBoolean());

        System.out.println("Devia para a vítima?");
        pergunta.add(scan.nextBoolean());

        System.out.println("Já trabalhou com a vítima?");
        pergunta.add(scan.nextBoolean());

        System.out.println(pergunta);

        int verdade = 0;
        int falso = 0;

        for(int i = 0; i < 5; i++){
            if (pergunta.get(i) == true){
                verdade = verdade + 1;
            } else {
                falso = falso + 1;
            }
        }

        if (verdade == 5){
            System.out.println("Assassino(a)!");
        } else if (verdade >= 3 && verdade <= 4 ){
            System.out.println("Cúmplice!");
        } else if (verdade == 2){
            System.out.println("Suspeito(a)");
        } else {
            System.out.println("Inocente.");
        }

    }
}
