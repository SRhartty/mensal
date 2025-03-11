package org.example;

public class Cliente {
	private String nome;
    private String telefone;
    private double carteira;

	public Cliente(String nome, String telefone, double carteira) {
		this.nome = nome;
        this.telefone = telefone;
        this.carteira = carteira;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public double getCarteira() {
        return carteira;
    }
    
    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public static void cadastrarCliente(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o valor da carteira do cliente: ");
        String carteira = scanner.nextLine();

        Cliente cliente = new Cliente(nome, telefone, carteira);
        clientes.add(cliente);

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
