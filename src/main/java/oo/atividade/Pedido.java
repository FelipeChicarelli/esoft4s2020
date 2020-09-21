package oo.atividade;

public class Pedido extends Item {
    private int quantidade;

    public Pedido() {
        super();
    }

    public Pedido(int quantidade, String item, double valor) {
        super(item, valor);
        setQuantidade(quantidade);
    }

    @Override
    public String toString() {
        return "Item: " + super.getNome() + ", Valor: " + super.getValor();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new RuntimeException("A quantidade deve ser positiva!");
        }
        this.quantidade = quantidade;
    }
}
