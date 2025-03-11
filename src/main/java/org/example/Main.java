package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        Map<String, Item> products = new HashMap<>();
        Item item = new Item();

        do {
            Menu menu = new Menu();
            menu.renderMenu();

            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cadastrar produto");
                    String answer;
                    do {
                        item.createItem(products);
                        System.out.println("Cadastrar outro produto? (S/N)");
                        answer = scanner.next();
                    } while (answer.equalsIgnoreCase("S"));
                    break;

                case 2:
                    item.getProducts(products);
                    System.out.print("Digite qualquer tecla para continuar...)");
                    scanner.next();
                    break;

                case 3:
                    item.findByName(products, scanner);
                    System.out.print("Digite qualquer tecla para continuar...)");
                    scanner.next();
                    break;

                case 4:
                    item.deleteProduct(products, scanner);
                    System.out.print("Digite qualquer tecla para continuar...)");
                    scanner.next();
                    break;

                case 5:
                    item.updateProduct(products, scanner);
                    System.out.print("Digite qualquer tecla para continuar...)");
                    scanner.next();
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