package org.example;

import org.example.menu.Menu;
import org.example.pessoas.Pessoa;
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

        Map<String, Cliente> clientes = new HashMap<>();
        Cliente cliente = new Cliente();

        do {
            Menu menu = new Menu();
            menu.renderMenu();

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
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 6);

        scanner.close();
    }
}