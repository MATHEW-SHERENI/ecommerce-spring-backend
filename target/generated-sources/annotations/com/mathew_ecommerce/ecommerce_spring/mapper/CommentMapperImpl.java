package com.mathew_ecommerce.ecommerce_spring.mapper;

import com.mathew_ecommerce.ecommerce_spring.dto.CommentDTO;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import com.mathew_ecommerce.ecommerce_spring.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-05T22:44:13+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDTO toDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTO commentDTO = new CommentDTO();

        commentDTO.setUserId( commentUserId( comment ) );
        commentDTO.setId( comment.getId() );
        commentDTO.setContent( comment.getContent() );
        commentDTO.setScore( comment.getScore() );

        return commentDTO;
    }

    @Override
    public Comment toEntity(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setUser( commentDTOToUser( commentDTO ) );
        comment.setId( commentDTO.getId() );
        comment.setContent( commentDTO.getContent() );
        comment.setScore( commentDTO.getScore() );

        return comment;
    }

    private Long commentUserId(Comment comment) {
        if ( comment == null ) {
            return null;
        }
        User user = comment.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected User commentDTOToUser(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( commentDTO.getUserId() );

        return user;
    }
}
