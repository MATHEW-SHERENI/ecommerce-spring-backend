package com.mathew_ecommerce.ecommerce_spring.repositories;

import com.mathew_ecommerce.ecommerce_spring.model.Cart;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByProductId(Long productId);
}