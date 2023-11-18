package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@AllArgsConstructor
// @NoArgsConstructor
@With
public class Order {

   private String ID;
   private List<Product> products;

}
