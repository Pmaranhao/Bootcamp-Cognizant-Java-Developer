package collections.lista;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<Double>();

        double soma = 0;
        double media = 0;

        for (int i = 0; i < 6; i++){
            System.out.println("Digite a temperatura do mês " + ( i + 1) + ":");
            temperatura.add(scan.nextDouble());
            soma = soma + temperatura.get(i);
        }

        media = soma /6.0;

        System.out.println("Média: " + media);

        for (int i = 1; i < 7; i++) {
            if (temperatura.get(i - 1) > media) {
                System.out.println("Temperatura: " + temperatura.get(i - 1));
                switch (i) {
                    case 1:
                        System.out.println("Janeiro");
                        break;
                    case 2:
                        System.out.println("Fevereiro");
                        break;
                    case 3:
                        System.out.println("Março");
                        break;
                    case 4:
                        System.out.println("Abril");
                        break;
                    case 5:
                        System.out.println("Maio");
                        break;
                    case 6:
                        System.out.println("Junho");
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
        }
    }
}
