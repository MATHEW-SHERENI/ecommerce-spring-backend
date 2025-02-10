package com.mathew_ecommerce.ecommerce_spring.mapper;

import com.mathew_ecommerce.ecommerce_spring.dto.CartDTO;
import com.mathew_ecommerce.ecommerce_spring.dto.CartItemDTO;
import com.mathew_ecommerce.ecommerce_spring.model.Cart;
import com.mathew_ecommerce.ecommerce_spring.model.CartItem;
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
public class CartMapperImpl implements CartMapper {

    @Override
    public CartDTO toDTO(Cart Cart) {
        if ( Cart == null ) {
            return null;
        }

        CartDTO cartDTO = new CartDTO();

        cartDTO.setUserId( cartUserId( Cart ) );
        cartDTO.setId( Cart.getId() );
        cartDTO.setItems( cartItemListToCartItemDTOList( Cart.getItems() ) );

        return cartDTO;
    }

    @Override
    public Cart toEntity(CartDTO cartDTO) {
        if ( cartDTO == null ) {
            return null;
        }

        Cart cart = new Cart();

        cart.setUser( cartDTOToUser( cartDTO ) );
        cart.setId( cartDTO.getId() );
        cart.setItems( cartItemDTOListToCartItemList( cartDTO.getItems() ) );

        return cart;
    }

    @Override
    public CartItemDTO toDTO(CartItem cartItem) {
        if ( cartItem == null ) {
            return null;
        }

        CartItemDTO cartItemDTO = new CartItemDTO();

        cartItemDTO.setProductId( cartItemProductId( cartItem ) );
        cartItemDTO.setId( cartItem.getId() );
        cartItemDTO.setQuantity( cartItem.getQuantity() );

        return cartItemDTO;
    }

    @Override
    public CartItem toEntity(CartItemDTO cartItemDTO) {
        if ( cartItemDTO == null ) {
            return null;
        }

        CartItem cartItem = new CartItem();

        cartItem.setProduct( cartItemDTOToProduct( cartItemDTO ) );
        cartItem.setId( cartItemDTO.getId() );
        cartItem.setQuantity( cartItemDTO.getQuantity() );

        return cartItem;
    }

    private Long cartUserId(Cart cart) {
        if ( cart == null ) {
            return null;
        }
        User user = cart.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected List<CartItemDTO> cartItemListToCartItemDTOList(List<CartItem> list) {
        if ( list == null ) {
            return null;
        }

        List<CartItemDTO> list1 = new ArrayList<CartItemDTO>( list.size() );
        for ( CartItem cartItem : list ) {
            list1.add( toDTO( cartItem ) );
        }

        return list1;
    }

    protected User cartDTOToUser(CartDTO cartDTO) {
        if ( cartDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( cartDTO.getUserId() );

        return user;
    }

    protected List<CartItem> cartItemDTOListToCartItemList(List<CartItemDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<CartItem> list1 = new ArrayList<CartItem>( list.size() );
        for ( CartItemDTO cartItemDTO : list ) {
            list1.add( toEntity( cartItemDTO ) );
        }

        return list1;
    }

    private Long cartItemProductId(CartItem cartItem) {
        if ( cartItem == null ) {
            return null;
        }
        Product product = cartItem.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Product cartItemDTOToProduct(CartItemDTO cartItemDTO) {
        if ( cartItemDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( cartItemDTO.getProductId() );

        return product;
    }
}
