package com.mathew_ecommerce.ecommerce_spring.service;


import com.mathew_ecommerce.ecommerce_spring.dto.CommentDTO;
import com.mathew_ecommerce.ecommerce_spring.exception.ResourceNotFoundException;
import com.mathew_ecommerce.ecommerce_spring.mapper.CommentMapper;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import com.mathew_ecommerce.ecommerce_spring.model.Product;
import com.mathew_ecommerce.ecommerce_spring.model.User;
import com.mathew_ecommerce.ecommerce_spring.repositories.CommentRepository;
import com.mathew_ecommerce.ecommerce_spring.repositories.ProductRepository;
import com.mathew_ecommerce.ecommerce_spring.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final CommentMapper commentMapper;

    public CommentDTO addComment(Long productId, Long userId, CommentDTO commentDTO){
        Product product = productRepository.findById(productId)
                .orElseThrow(()-> new ResourceNotFoundException("Product not found"));
        User user = userRepository.findById(userId)
                .orElseThrow(()-> new ResourceNotFoundException("User not found"));

        Comment comment = commentMapper.toEntity(commentDTO);
        comment.setProduct(product);
        comment.setUser(user);
        Comment savedComment = commentRepository.save(comment);
        return commentMapper.toDTO(savedComment);

    }

    public List<CommentDTO> getCommentsByProduct(Long productId){
        List<Comment> comments = commentRepository.findByProductId(productId);
        return comments.stream()
                .map(commentMapper::toDTO)
                .collect(Collectors.toList());
    }

}
