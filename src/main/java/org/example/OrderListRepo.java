package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@With

public class OrderListRepo {

    // create a list to store orders in a list
    List<Order> orders = new ArrayList<>();

    // methods

    // method add product
    public void addOrder(Order order) {
        orders.add(order);
        // implementiere eine abfrage die überprüft, ob die id schon angelegt wurde
    }

    // method remove order
    public void removeOrder(String id) {
        Order remove = getOrderByID(id);
        if (remove != null) {
            orders.remove(remove);
        }
    }

    // method get order by ID
    public Order getOrderByID(String id) {
        for (Order o : orders) {
            if (o.getID().equals(id)) {
                return o;
            }
        }
        return null;
    }
}
