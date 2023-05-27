package br.com.lucas.unipar.central.models;

public class AbstractBaseEntity {
    
    private int id;
    private String registroAcademico;

    public AbstractBaseEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    @Override
    public String toString() {
        return "AbstractBaseEntity{" + "id=" + id + ", registroAcademico=" + registroAcademico + '}';
    }

}
