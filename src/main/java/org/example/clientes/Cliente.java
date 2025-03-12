package org.example.clientes;

import java.util.Map;
import java.util.Scanner;

import org.example.pessoas.Pessoa;

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

    public static void cadastrarCliente(Map<String, Cliente> clientes, Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.next();

        System.out.print("Digite o valor da carteira do cliente: ");
        String carteira = scanner.next();
        
        Cliente cliente = new Cliente(carteira, nome, telefone, idade);

        // Cliente cliente = new Cliente(nome, idade, telefone, carteira);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("=== Lista de Clientes ===");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}
