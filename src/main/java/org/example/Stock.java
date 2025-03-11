package org.example;

import org.example.interfaces.StockInterface;

public abstract class Stock implements StockInterface {


    private int quantidade;

    public Stock() {}

    public Stock(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
