package com.mathew_ecommerce.ecommerce_spring.repositories;

import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import com.mathew_ecommerce.ecommerce_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

}
