package oo.atividade_nota;

public class Item extends Tecido {
    private int metragem;
    public Item (){
        super();
    }
    public Item (int metragem, String nome, String cor, Double valor){
        super(nome, valor, cor);
        setMetragem(metragem);
 
    }
    public int getMetragem(){
        return metragem;
    }

    public void setMetragem (int metragem) {
        if (metragem < 0){
            throw new RuntimeException("A metragem deve ser positiva e valor inteiro");
        }
        this.metragem = metragem;
    }
}  





