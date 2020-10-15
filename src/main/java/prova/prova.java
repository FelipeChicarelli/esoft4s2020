package oo.atividade_nota;

public class Tecido {
    private String nome;
    private double valor;
    private String cor;
    private boolean queimaEstoque;
    public Tecido(){

    }

    public Tecido(String nome, double valor, String cor, boolean quiemaEstoque){
        this.nome = nome;
        this.valor = valor;
        this.cor = cor;
        this.quiemaEstoque = quiemaEstoque;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

     public boolean getqueimaEstoque() {
        return queimaEstoque;
    }

    public void setqueimaEstoque(boolean queimaEstoque){
        this.queimaEstoque = queimaEstoque;
    }