package oo.atividade_nota;

import java.util.ArrayList;

public class Venda {
   ArrayList <Item> item;
    Vendedor vendedor = new Vendedor();
    public Venda() {
    }

    public Venda(ArrayList<Item> item, Vendedor vendedor){
    this.item = item;
    this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Item: \n" + item.toString() + "\n Vendedor: " + vendedor.toString();
    }

}