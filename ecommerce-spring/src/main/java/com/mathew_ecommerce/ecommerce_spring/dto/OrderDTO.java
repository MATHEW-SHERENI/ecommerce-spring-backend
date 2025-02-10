package com.mathew_ecommerce.ecommerce_spring.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.mathew_ecommerce.ecommerce_spring.model.Order;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    @NotBlank(message = "Address is required")
    private String address;
    @NotBlank(message = "Phone name is required")
    private String phoneNumber;
    private Order.OrderStatus status;
    private LocalDateTime createdAt;
    private List<OrderItemDTO> orderItems;
}
