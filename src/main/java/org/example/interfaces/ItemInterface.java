package org.example.interfaces;

import org.example.products.Item;

import java.util.Map;
import java.util.Scanner;

public interface ItemInterface {

    void createItem(Map<String, Item> products);
    void getProducts(Map<String, Item> products);
    void findByName(Map<String, Item> products, Scanner scanner);
    void deleteProduct(Map<String, Item> products, Scanner scanner);
    void updateProduct(Map<String, Item> products, Scanner scanner);
}
