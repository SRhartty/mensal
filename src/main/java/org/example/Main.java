package org.example;

import java.util.Scanner;

public class Main {


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
                    System.out.println("Cadastrar produto");
                    // Add code to register a product
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