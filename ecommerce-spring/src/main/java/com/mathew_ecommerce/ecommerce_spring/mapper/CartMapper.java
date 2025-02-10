package com.mathew_ecommerce.ecommerce_spring.mapper;

import com.mathew_ecommerce.ecommerce_spring.dto.CartDTO;
import com.mathew_ecommerce.ecommerce_spring.dto.CartItemDTO;
import com.mathew_ecommerce.ecommerce_spring.model.Cart;
import com.mathew_ecommerce.ecommerce_spring.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userId", source = "user.id")
    CartDTO toDTO(Cart Cart);
    @Mapping(target="user.id", source = "userId")
    Cart toEntity(CartDTO cartDTO);

    @Mapping(target="productId", source="product.id")
    CartItemDTO toDTO(CartItem cartItem);

    @Mapping(target="product.id", source="productId")
    CartItem toEntity(CartItemDTO cartItemDTO);
}
