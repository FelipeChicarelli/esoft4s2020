package oo.atividade_nota;

import java.util.ArrayList;

public class App_transação {
    public static void main(String[] args) {
        ArrayList<Item> item = new ArrayList<Item>();
        Item item01 = new Item (50, "Veludo","Preto", 20.00);
        item.add(item01);
        Item item02 = new Item (40, "Couro","Preto", 150.00);
        item.add(item02);
        Vendedor vendedor01 = new Vendedor (1184,"Felipe");
        Venda venda01 = new Venda (item, vendedor01);
        System.out.println(venda01.toString());

    }
}

