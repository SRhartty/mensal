package org.example.clientes;

import java.util.Map;
import java.util.Scanner;

import org.example.interfaces.ClienteInterface;

public class Cliente extends Pessoa implements ClienteInterface {
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

    public void createCliente(Map<String, Cliente> clientes, Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Cadastrar outro cliente? (S/N): ");
        answer = scanner.next();
        while (answer.equalsIgnoreCase("S")) {
            if(answer.equalsIgnoreCase("N")) {
                break;
            }
            createCliente(clientes, cliente);
            System.out.println("Cadastrar outro cliente? (S/N): ");
            answer = scanner.next();
        }
    }

    @Override
    public void getCliente(Map<String, Cliente> clientes) {
        System.out.println("Listar clientes");
        System.out.println("||=========================================||");
        for (Cliente cliente : clientes.values()) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Carteira: " + cliente.getCarteira());
            System.out.println("||=========================================||");
        }
    }

    @Override
    public void findByName(Map<String, Cliente> clientes, Scanner scanner) {
        System.out.println("Buscar por nome");
        System.out.print("Digite o nome do cliente: ");
        String name = scanner.next();
        Cliente cliente = clientes.get(name);
        if (cliente != null) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Carteira: " + cliente.getCarteira());
            System.out.println("||=========================================||");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    @Override
    public void deleteCliente(Map<String, Cliente> clientes, Scanner scanner) {
        System.out.println("Deletar cliente");
        System.out.print("Digite o nome do cliente: ");
        String deleteName = scanner.next();
        Cliente ClienteDelete = clientes.get(deleteName);
        if (ClienteDelete != null) {
            clientes.remove(deleteName);
            System.out.println("Cliente deletado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    @Override
    public void updateCliente(Map<String, Cliente> clientes, Scanner scanner) {
        System.out.println("Atualizar cadastro do cliente");
        System.out.print("Digite o nome do cliente a ser atualizado: ");
        String updateName = scanner.next();
        Cliente updateCliente = clientes.get(updateName);
        if (updateCliente != null) {
            System.out.print("Digite o novo nome: ");
            updateCliente.setNome(scanner.next());
            System.out.print("Digite o nova idade: ");
            updateCliente.setIdade(scanner.nextInt());
            System.out.print("Digite a nov telefone: ");
            updateCliente.setTelefone(scanner.next());
            System.out.print("Digite o novo valor da carteira: ");
            updateCliente.setCarteira(scanner.nextDouble());
            System.out.println("Cadastro do cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
