package prova;

public class Tecido {
    private String nome;
    private double valor;
    private String cor;
    
    public Tecido(){

    }

    public Tecido(String nome, double valor, String cor){
        this.nome = nome;
        this.valor = valor;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + " Valor: " + valor + " Cor: " + cor);
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
    
    public void setCor(String novaCor, boolean colecaoNova) {
        if (colecaoNova) {
            this.cor = "Nova " = novaCor;
        } else {
            this.cor = novaCor; 
        }
    }

    public boolean queimaEstoque() {
        if(this.cor.contains("Nova")){
            this.valor = this.valor - 50.00;
            return true;
        }else{
            return false;
        }
    }
    }

