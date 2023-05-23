package br.com.lucas.unipar.central.models;

public class Telefone {
    
    private int id;
    private int numero;
    private String tipo;

    public Telefone() {
    }

    public Telefone(int id, int numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", numero=" + numero + ", tipo=" + tipo + '}';
    }
    
}
