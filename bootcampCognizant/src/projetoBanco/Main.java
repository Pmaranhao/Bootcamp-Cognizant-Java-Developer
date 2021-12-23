package projetoBanco;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pedro", "123.879.654-82");

        Endereco endereco = new Endereco("Rua A", "45", "Bairro C", "25467-80", cliente1);

        Conta contaC = new ContaCorrente(cliente1);
        Conta contaP = new ContaPoupanca(cliente1);

        contaC.sacar(10);
        contaP.sacar(10);

        contaC.depositar(1000);
        contaC.transferir(200, contaP);
        contaC.imprimirExtrato();

        contaP.depositar(300);
        contaP.imprimirExtrato();
    }
}
