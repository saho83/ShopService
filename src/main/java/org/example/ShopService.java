package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ShopService {

    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;

    // method for adding a new order
//    public void placeOrder(List<String> productNames) {
//      //  List<Product> products = new ArrayList<>();
//        // checking for available product
//        if (productRepo.isProductAvailable(productNames)) {
//            List<Product> orderedProducts = productRepo.getProductByName(productNames);
//
//            Order newOrder = new Order("Neue BestellungID", orderedProducts);
//
//            orderListRepo.addOrder(newOrder);
//
//
//            System.out.println("Die Bestellung wurde aufgegeben.");
//        } else {
//            System.out.println("Bestellung nicht verfügbar.");
//        }
//    }

    public void placeOrder(List<String> productNames) {
        // Überprüfen, ob die bestellten Produkte vorhanden sind
        if (productRepo.isProductAvailable(productNames)) {
            List<Product> orderedProducts = productRepo.getProductsByName(productNames);

            // Generiere eine eindeutige Bestellungs-ID
            String newOrderId = UUID.randomUUID().toString();

            // Neue Bestellung erstellen
            Order newOrder = new Order(newOrderId, orderedProducts);

            // Bestellung hinzufügen
            orderListRepo.addOrder(newOrder);

            System.out.println("Die Bestellung mit der ID " + newOrderId + " wurde erfolgreich aufgegeben.");
        } else {
            System.out.println("Ein oder mehrere bestellte Produkte sind nicht verfügbar. Die Bestellung wurde nicht aufgegeben.");
        }
    }





}
