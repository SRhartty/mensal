package org.example;

import org.example.clientes.Cliente;
import org.example.enums.Categoria;
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

        Map<String, Cliente> clientes = new HashMap<>();
        Cliente cliente = new Cliente();


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
                do {
                    menu.renderCliente();
                    System.out.print("Escolha uma opção: ");
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Cadastrar cliente");
                            cliente.createCliente(clientes, cliente);
                            break;

                        case 2:
                            cliente.getCliente(clientes);
                            waitEnter(scanner);
                            break;

                        case 3:
                            cliente.findByName(clientes, scanner);
                            waitEnter(scanner);
                            break;

                        case 4:
                            cliente.deleteCliente(clientes, scanner);
                            waitEnter(scanner);
                            break;

                        case 5:
                            cliente.updateCliente(clientes, scanner);
                            waitEnter(scanner);
                            break;

                        case 6:
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } while (option != 6);
            }

            if (option == 3) {
                System.out.println("Qual o nome do cliente?");
                String nome = scanner.next();
                if (clientes.containsKey(nome)) {
                    Cliente clienteFind = clientes.get(nome);
                    System.out.println("Qual produto ele deseja comprar?");
                    String produto = scanner.next();
                    Item itemFind = products.get(produto);
                    if (itemFind != null) {
                        if (clienteFind.getCarteira() >= itemFind.getPreco()) {
                            System.out.println("Compra realizada com sucesso!");
                            clienteFind.setCarteira(clienteFind.getCarteira() - itemFind.getPreco());
                            itemFind.setQuantidade(itemFind.getQuantidade() - 1);
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                } else {
                    System.out.println("Cliente não encontrado!");
                }
            }

        } while (option != 4);

        scanner.close();
    }
}