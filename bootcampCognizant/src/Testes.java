import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        String nome;
        String ultimoNome;
        float salario;
        final String time =  "Botafogo";
//        time = "América-RJ"; não pode ser alterado a variável time, pois existe "final".

        System.out.print("Nome: " );
        nome = scan.next();
        System.out.print("Sobrenome: ");
        ultimoNome = scan.next();
        System.out.print("Salário: " );
        salario = scan.nextFloat();
        System.out.print("Idade: " );
        idade = scan.nextInt();

        System.out.println("***************************************");
        System.out.println("Nome: \n" + nome);
        System.out.println("Sobrenome: \n" + ultimoNome);
        System.out.println("Salário: \n" + salario);
        System.out.println("Idade: \n" + idade);
        System.out.println("Time: \n" + time);

    }
}
