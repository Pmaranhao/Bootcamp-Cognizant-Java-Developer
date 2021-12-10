package poo;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "20560-080";
        //dados do endereços


        Cliente cliente = new Cliente();
        //dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }




    }
}
