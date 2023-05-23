package br.com.lucas.unipar.central.models;

/**
 *
 * @author 00240578
 */
public class Estado {
    
    private int id;
    private String nome;
    private String sigla;
    private Pais pais;

    public Estado() {
    }

    public Estado(int id, String nome, String sigla, Pais pais) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.pais = pais;
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

    public Pais getPais() {
        return pais;
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

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", pais=" + pais + '}';
    }
    
}
