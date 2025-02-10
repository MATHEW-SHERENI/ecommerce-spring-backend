package com.mathew_ecommerce.ecommerce_spring.dto;

import lombok.Data;

@Data
public class EmailConfirmationRequest {
    private String email;
    private String confirmationCode;
}
