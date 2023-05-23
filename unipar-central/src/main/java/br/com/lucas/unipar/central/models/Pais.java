package br.com.lucas.unipar.central.models;

/**
 *
 * @author 00240578
 */
public class Pais {
    
    private int id;
    private String nome;
    private String sigla;

    public Pais() {
    }

    public Pais(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + '}';
    }
    
}
