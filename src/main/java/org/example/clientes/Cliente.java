package org.example.clientes;

import java.util.Map;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private double carteira;

	public Cliente(double carteira, String nome, String telefone, int idade) {
        super(nome, telefone, idade);
        this.carteira = carteira;
    }

    public Cliente() {}
    
    public double getCarteira() {
        return carteira;
    }
    
    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public static void createCliente(Map<String, Cliente> clientes, Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.next();

        System.out.print("Digite o valor da carteira do cliente: ");
        double carteira = scanner.nextDouble();

        Cliente newCliente = new Cliente(carteira, nome, telefone, idade);
        if (clientes.containsKey(newCliente.getNome())) {
            System.out.println("Cliente já cadastrado!");
        }else {
            clientes.put(newCliente.getNome(), newCliente);
            System.out.println("Cliente cadastrado!");
            System.out.println("||========================================||");
        }
        String answer;
        do {
            System.out.print("Deseja cadastrar outro cliente? (S/N): ");
            answer = scanner.next();
            if (answer.equals("S")) {
                createCliente(clientes, scanner);
            }
        } while (answer.equalsIgnoreCase("S"));
    }
}
