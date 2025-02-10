package com.mathew_ecommerce.ecommerce_spring.repositories;

import com.mathew_ecommerce.ecommerce_spring.dto.ProductListDTO;
import com.mathew_ecommerce.ecommerce_spring.repositories.ProductRepository;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import com.mathew_ecommerce.ecommerce_spring.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT new com.mathew_ecommerce.ecommerce_spring.dto.ProductListDTO(p.id, p.name, p.description, p.price, p.quantity, p.image) FROM Product p")
    Page<ProductListDTO> findAllWithoutComments(Pageable pageable);
}