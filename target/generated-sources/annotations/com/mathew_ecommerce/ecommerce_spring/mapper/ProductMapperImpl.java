package com.mathew_ecommerce.ecommerce_spring.mapper;

import com.mathew_ecommerce.ecommerce_spring.dto.CommentDTO;
import com.mathew_ecommerce.ecommerce_spring.dto.ProductDTO;
import com.mathew_ecommerce.ecommerce_spring.model.Comment;
import com.mathew_ecommerce.ecommerce_spring.model.Product;
import com.mathew_ecommerce.ecommerce_spring.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-05T22:44:14+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setImage( product.getImage() );
        productDTO.setId( product.getId() );
        productDTO.setName( product.getName() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setQuantity( product.getQuantity() );
        productDTO.setComments( commentListToCommentDTOList( product.getComments() ) );

        return productDTO;
    }

    @Override
    public Product toEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setImage( productDTO.getImage() );
        product.setId( productDTO.getId() );
        product.setName( productDTO.getName() );
        product.setDescription( productDTO.getDescription() );
        product.setPrice( productDTO.getPrice() );
        product.setQuantity( productDTO.getQuantity() );
        product.setComments( commentDTOListToCommentList( productDTO.getComments() ) );

        return product;
    }

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

    protected List<CommentDTO> commentListToCommentDTOList(List<Comment> list) {
        if ( list == null ) {
            return null;
        }

        List<CommentDTO> list1 = new ArrayList<CommentDTO>( list.size() );
        for ( Comment comment : list ) {
            list1.add( toDTO( comment ) );
        }

        return list1;
    }

    protected List<Comment> commentDTOListToCommentList(List<CommentDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Comment> list1 = new ArrayList<Comment>( list.size() );
        for ( CommentDTO commentDTO : list ) {
            list1.add( toEntity( commentDTO ) );
        }

        return list1;
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
