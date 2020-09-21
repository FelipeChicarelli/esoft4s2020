package oo.atividade_nota;

import java.util.ArrayList;

public class Vendedor {
    private int id;
    private String nome;

    public Vendedor () {

    }

    public Vendedor(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nome: " + nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId (int id){
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
}
