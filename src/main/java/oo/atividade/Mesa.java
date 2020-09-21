package oo.atividade;

import java.util.ArrayList;

public class Mesa {
    private int numero;
    private ArrayList<Pedido> pedido;

    public Mesa() {

    }

    public Mesa(int numero, ArrayList<Pedido> pedido) {
        this.numero = numero;
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Mesa: " + numero + "\n" + pedido.toString();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }
}
