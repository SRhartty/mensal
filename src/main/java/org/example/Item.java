package org.example;

import java.util.Scanner;

public class Item extends Stock{

    public Item(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public static Item createItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Preço: ");
        float preco = scanner.nextFloat();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        return new Item(nome, preco, quantidade);
    }

}
