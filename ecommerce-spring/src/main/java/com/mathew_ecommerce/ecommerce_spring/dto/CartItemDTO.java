package com.mathew_ecommerce.ecommerce_spring.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CartItemDTO {

    @Id
    private Long id;
    private Long productId;
    @Positive
    private Integer quantity;
}
