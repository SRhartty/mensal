package org.example;

import org.example.menu.Menu;
import org.example.products.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static void waitEnter(Scanner scanner) {
        System.out.print("Digite qualquer tecla para continuar...)");
        scanner.next();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        Map<String, Item> products = new HashMap<>();
        Item item = new Item();


        do {
            Menu menu = new Menu();
            menu.mainMenu();

            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            if (option == 1) {
                do {
                    menu.renderProducts();
                    System.out.print("Escolha uma opção: ");
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Cadastrar produto");
                            item.createItem(products, item);
                            break;

                        case 2:
                            item.getProducts(products);
                            waitEnter(scanner);
                            break;

                        case 3:
                            item.findByName(products, scanner);
                            waitEnter(scanner);
                            break;

                        case 4:
                            item.deleteProduct(products, scanner);
                            waitEnter(scanner);
                            break;

                        case 5:
                            item.updateProduct(products, scanner);
                            waitEnter(scanner);
                            break;

                        case 6:
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } while (option != 6);

            }

            if (option == 2) {
                System.out.println("Usuários");
                waitEnter(scanner);
            }

            if (option == 3) {
                int exit = 0;
                do {

                    System.out.println("Deseja sair do pdv? (1 - Sim | 0 - Não)");
                    exit = scanner.nextInt();
                }while (exit == 1);
            }

        } while (option != 4);

        scanner.close();
    }
}