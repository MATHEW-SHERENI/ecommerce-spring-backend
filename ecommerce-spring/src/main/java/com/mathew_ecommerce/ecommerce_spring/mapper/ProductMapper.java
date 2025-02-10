package com.mathew_ecommerce.ecommerce_spring.mapper;

import com.mathew_ecommerce.ecommerce_spring.dto.CommentDTO;
import com.mathew_ecommerce.ecommerce_spring.dto.ProductDTO;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import com.mathew_ecommerce.ecommerce_spring.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "image", source = "image") //add mapping
    ProductDTO toDTO(Product product);

    @Mapping(target = "image", source = "image") //add mapping
    Product toEntity(ProductDTO productDTO);

    @Mapping(target = "userId",source = "user.id")
    CommentDTO toDTO(Comment comment);
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "product", ignore = true)
    Comment toEntity(CommentDTO commentDTO);
}
