package com.mathew_ecommerce.ecommerce_spring.repositories;

import com.mathew_ecommerce.ecommerce_spring.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUserId(Long userId);
}