package org.example.products;

import org.example.interfaces.ItemInterface;

import java.util.Map;
import java.util.Scanner;

public class Item extends Stock implements ItemInterface {

    private String nome;
    private double preco;


    public Item(String nome, double preco, int quantidade) {
        super(quantidade);
        this.nome = nome;
        this.preco = preco;
    }

    public Item() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public void createItem(Map<String, Item> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Preço: ");
        float preco = scanner.nextFloat();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        Item newItem = new Item(nome, preco, quantidade);
        if (products.containsKey(newItem.getNome())) {
            System.out.println("Produto já existe!");
        } else {
            products.put(newItem.getNome(), newItem);
            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("||========================================||");
        }
    }

    @Override
    public void getProducts(Map<String, Item> products) {
        System.out.println("Listar produtos");
        System.out.println("||=========================================||");
        for (Item product : products.values()) {
            System.out.println("Nome: " + product.getNome());
            System.out.println("Preço: " + product.getPreco());
            System.out.println("Quantidade: " + product.getQuantidade());
            System.out.println("||=========================================||");
        }
    }

    @Override
    public void findByName(Map<String, Item> products, Scanner scanner) {
        System.out.println("Buscar por nome");
        System.out.print("Digite o nome do produto: ");
        String name = scanner.next();
        Item product = products.get(name);
        if (product != null) {
            System.out.println("Nome: " + product.getNome());
            System.out.println("Preço: " + product.getPreco());
            System.out.println("Quantidade: " + product.getQuantidade());
            System.out.println("||=========================================||");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    @Override
    public void deleteProduct(Map<String, Item> products, Scanner scanner) {
        System.out.println("Deletar produto");
        System.out.print("Digite o nome do produto: ");
        String deleteName = scanner.next();
        Item productDelete = products.get(deleteName);
        if (productDelete != null) {
            products.remove(deleteName);
            System.out.println("Produto deletado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    @Override
    public void updateProduct(Map<String, Item> products, Scanner scanner) {
        System.out.println("Atualizar produto");
        System.out.print("Digite o nome do produto a ser atualizado: ");
        String updateName = scanner.next();
        Item updateProduct = products.get(updateName);
        if (updateProduct != null) {
            System.out.print("Digite o novo nome: ");
            updateProduct.setNome(scanner.next());
            System.out.print("Digite o novo preço: ");
            updateProduct.setPreco(scanner.nextDouble());
            System.out.print("Digite a nova quantidade: ");
            updateProduct.setQuantidade(scanner.nextInt());
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

}
