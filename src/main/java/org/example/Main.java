package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        Map<String, Item> products = new HashMap<>();
        products.put("Lapis", new Item("Lapis", 10.0, 10));

        do {
            Menu menu = new Menu();
            menu.renderProduto();

            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cadastrar produto");

                    String answer;
                    do {
                        Item newItem = Item.createItem();
                        if (products.containsKey(newItem.getNome())) {
                            System.out.println("Produto já existe!");
                        } else {
                            products.put(newItem.getNome(), newItem);
                            System.out.println("Produto cadastrado com sucesso!");
                            System.out.println("||========================================||");
                        }
                        System.out.println("Cadastrar outro produto? (S/N)");
                        answer = scanner.next();
                    } while (answer.equalsIgnoreCase("S"));
                    break;

                case 2:
                    System.out.println("Listar produtos");
                    System.out.println("||=========================================||");
                    for (Item product : products.values()) {
                        System.out.println("Nome: " + product.getNome());
                        System.out.println("Preço: " + product.getPreco());
                        System.out.println("Quantidade: " + product.getQuantidade());
                        System.out.println("||=========================================||");
                    }
                    System.out.print("Digite qualquer tecla para continuar...)");
                    scanner.next();
                    break;

                case 3:
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
                    System.out.print("Digite qualquer tecla para continuar...)");
                    scanner.next();
                    break;

                case 4:
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
                    System.out.print("Digite qualquer tecla para continuar...)");
                    scanner.next();
                    break;

                case 5:
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