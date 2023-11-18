package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {


    // create a list to store products in a list
    List<Product> products = new ArrayList<>();

    // methods

    // method add product
    public void addProduct(Product product) {
        products.add(product);
        // implementiere eine abfrage die überprüft, ob die id schon angelegt wurde
    }

    // method remove product
    public void removeProduct(String id) {
        Product remove = getProductByID(id);
        if (remove != null) {
            products.remove(remove);
        }
    }

    // method get product by ID
    public Product getProductByID(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }








}
