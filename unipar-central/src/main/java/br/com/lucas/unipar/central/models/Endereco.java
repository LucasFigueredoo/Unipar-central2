package br.com.lucas.unipar.central.models;

public class Endereco {
    
    private int id;
    private String logradouro;
    private int numero;
    private String bairro;
    private int cep;
    private String complemento;
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(int id, String logradouro, int numero, String bairro, int cep, String complemento, Cidade cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public int getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", complemento=" + complemento + ", cidade=" + cidade + '}';
    }

}
