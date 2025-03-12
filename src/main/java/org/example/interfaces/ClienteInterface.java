package org.example.interfaces;

import java.util.Map;
import java.util.Scanner;

import org.example.clientes.Cliente;

public interface ClienteInterface {
    void createCliente(Map<String, Cliente> clientes, Cliente cliente);
    void getCliente(Map<String, Cliente> clientes);
    void findByName(Map<String, Cliente> clientes, Scanner scanner);
    void deleteCliente(Map<String, Cliente> clientes, Scanner scanner);
    void updateCliente(Map<String, Cliente> clientes, Scanner scanner);
}
