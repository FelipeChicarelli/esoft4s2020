package oo.atividade;

import java.util.ArrayList;

public class AppPedido {
    public static void main(String[] args) {
        ArrayList<Pedido> itens = new ArrayList<Pedido>();
        Pedido pedido01 = new Pedido(1, "Coxinha de frango", 5.50);
        itens.add(pedido01);
        Pedido pedido02 = new Pedido(1, "Refrigerante Lata Coca", 4.50);
        itens.add(pedido02);

        Mesa mesa01 = new Mesa(01, itens);

        System.out.println(mesa01.toString());
    }
}
