package projetoBanco;

public class Endereco {
    protected String rua;
    protected String numero;
    protected String bairro;
    protected String cep;
    protected Cliente cliente;

    public Endereco(String rua, String numero, String bairro, String cep, Cliente cliente) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cliente = cliente;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
