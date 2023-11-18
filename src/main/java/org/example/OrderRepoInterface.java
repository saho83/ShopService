package org.example;

public interface OrderRepoInterface {

    void addOrder(Order order);
    void removeOrder(String id);
    Order getOrderByID(String id);

}
