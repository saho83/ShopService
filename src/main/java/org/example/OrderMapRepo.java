package org.example;

import java.util.HashMap;
import java.util.Map;

public class OrderMapRepo  implements OrderRepoInterface{


    private Map<String, Order> orderMap = new HashMap<>();



    @Override
    public void addOrder(Order order) {
        orderMap.put(order.getID(), order);

    }

    @Override
    public void removeOrder(String id) {
        orderMap.remove(id);

    }

    @Override
    public Order getOrderByID(String id) {
        return orderMap.get(id);
    }
}
