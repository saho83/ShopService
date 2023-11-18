package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product niveea = new Product("Nivea", "N123", 7.56);
        Product seife = new Product("Seife", "N113", 4.56);

        // Beispiel: Erstellen von Produkt- und Bestellungsrepository
        ProductRepo productRepo = new ProductRepo();
        OrderListRepo orderListRepo = new OrderListRepo();

        productRepo.addProduct(new Product("Creme", "2323", 2.44));

        // Beispiel: Neuen Auftrag mit vorhandenen Produkten aufgeben
        ShopService shopService = new ShopService(productRepo, orderListRepo);
        List<String> orderedProductNames = Arrays.asList("nivea", "seife");
        shopService.placeOrder(orderedProductNames);
        System.out.println(shopService.getProductRepo());


    }
}