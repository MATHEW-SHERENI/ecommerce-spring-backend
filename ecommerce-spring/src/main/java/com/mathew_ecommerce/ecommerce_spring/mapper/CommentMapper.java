package com.mathew_ecommerce.ecommerce_spring.mapper;

import com.mathew_ecommerce.ecommerce_spring.dto.CommentDTO;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "userId",source = "user.id")
    CommentDTO toDTO(Comment comment);
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "product", ignore = true)
    Comment toEntity(CommentDTO commentDTO);
}
