package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
// @NoArgsConstructor
@With

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

    // method for checking by name
    public Product getProductByName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    // method checks products is available
    public boolean isProductAvailable (List<String> productNames) {
        for (String productName : productNames) {
            if (getProductByName(productName) == null) {
                return false; // product not found
            }
        }
        return true; // product found
    }








}
