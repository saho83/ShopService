package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With

public class ShopService {

    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;

    // method for adding a new order
    public void placeOrder(List<String> productNames) {
        // checking for available product
        if (productRepo.isProductAvailable(productNames)) {
            List<Product> orderedProducts = productRepo.getProductByName(productNames);

            Order newOrder = new Order("Neue BestellungID", orderedProducts);
        }
    }





}
