package com.mathew_ecommerce.ecommerce_spring.repositories;


import com.mathew_ecommerce.ecommerce_spring.model.Cart;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import com.mathew_ecommerce.ecommerce_spring.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}