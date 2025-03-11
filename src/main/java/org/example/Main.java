package org.example;

import java.util.Scanner;

public class Main {

    public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            Menu menu = new Menu();
            menu.renderProduto();

            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    clearScreen();
                    System.out.println("Cadastrar produto");

                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Preço: ");
                    float preco = scanner.nextFloat();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    Item product = new Item(nome, preco, quantidade);
                    clearScreen();
                    System.out.println("Produto cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Listar produtos");
                    // Add code to list products
                    break;
                case 3:
                    System.out.println("Buscar por nome");
                    // Add code to search by name
                    break;
                case 4:
                    System.out.println("Deletar produto");
                    // Add code to delete a product
                    break;
                case 5:
                    System.out.println("Atualizar produto");
                    // Add code to update a product
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 6);

        scanner.close();
    }
}