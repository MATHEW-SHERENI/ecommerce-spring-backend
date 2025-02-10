package com.mathew_ecommerce.ecommerce_spring.dto;


import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class CartDTO {

   @Id
   private Long id;
    private Long userId; //usedId
    private List<CartItemDTO> items;
}
