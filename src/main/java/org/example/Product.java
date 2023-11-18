package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@AllArgsConstructor
// @NoArgsConstructor
@With
public class Product {

    // Attribute
    private String name;
    private String id;
    private double price;

}
