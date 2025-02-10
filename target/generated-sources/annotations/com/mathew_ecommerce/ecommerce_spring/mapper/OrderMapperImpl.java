package com.mathew_ecommerce.ecommerce_spring.mapper;

import com.mathew_ecommerce.ecommerce_spring.dto.OrderDTO;
import com.mathew_ecommerce.ecommerce_spring.dto.OrderItemDTO;
import com.mathew_ecommerce.ecommerce_spring.model.Order;
import com.mathew_ecommerce.ecommerce_spring.model.OrderItem;
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
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDTO toDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setUserId( orderUserId( order ) );
        orderDTO.setOrderItems( toOrderItemDTOs( order.getItems() ) );
        orderDTO.setId( order.getId() );
        orderDTO.setAddress( order.getAddress() );
        orderDTO.setPhoneNumber( order.getPhoneNumber() );
        orderDTO.setStatus( order.getStatus() );
        orderDTO.setCreatedAt( order.getCreatedAt() );

        return orderDTO;
    }

    @Override
    public Order toEntity(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setUser( orderDTOToUser( orderDTO ) );
        order.setItems( toOrderItemEntities( orderDTO.getOrderItems() ) );
        order.setId( orderDTO.getId() );
        order.setAddress( orderDTO.getAddress() );
        order.setPhoneNumber( orderDTO.getPhoneNumber() );
        order.setStatus( orderDTO.getStatus() );
        order.setCreatedAt( orderDTO.getCreatedAt() );

        return order;
    }

    @Override
    public List<OrderDTO> toDTOs(List<Order> orders) {
        if ( orders == null ) {
            return null;
        }

        List<OrderDTO> list = new ArrayList<OrderDTO>( orders.size() );
        for ( Order order : orders ) {
            list.add( toDTO( order ) );
        }

        return list;
    }

    @Override
    public List<Order> toEntities(List<OrderDTO> orderDTOS) {
        if ( orderDTOS == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( orderDTOS.size() );
        for ( OrderDTO orderDTO : orderDTOS ) {
            list.add( toEntity( orderDTO ) );
        }

        return list;
    }

    @Override
    public OrderItemDTO toOrderItemDTO(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        OrderItemDTO orderItemDTO = new OrderItemDTO();

        orderItemDTO.setProductId( orderItemProductId( orderItem ) );
        orderItemDTO.setId( orderItem.getId() );
        orderItemDTO.setQuantity( orderItem.getQuantity() );
        orderItemDTO.setPrice( orderItem.getPrice() );

        return orderItemDTO;
    }

    @Override
    public OrderItem toOrderItemEntity(OrderItemDTO orderItemDTO) {
        if ( orderItemDTO == null ) {
            return null;
        }

        OrderItem orderItem = new OrderItem();

        orderItem.setProduct( orderItemDTOToProduct( orderItemDTO ) );
        orderItem.setId( orderItemDTO.getId() );
        orderItem.setQuantity( orderItemDTO.getQuantity() );
        orderItem.setPrice( orderItemDTO.getPrice() );

        return orderItem;
    }

    @Override
    public List<OrderItemDTO> toOrderItemDTOs(List<OrderItem> orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        List<OrderItemDTO> list = new ArrayList<OrderItemDTO>( orderItem.size() );
        for ( OrderItem orderItem1 : orderItem ) {
            list.add( toOrderItemDTO( orderItem1 ) );
        }

        return list;
    }

    @Override
    public List<OrderItem> toOrderItemEntities(List<OrderItemDTO> orderItemDTO) {
        if ( orderItemDTO == null ) {
            return null;
        }

        List<OrderItem> list = new ArrayList<OrderItem>( orderItemDTO.size() );
        for ( OrderItemDTO orderItemDTO1 : orderItemDTO ) {
            list.add( toOrderItemEntity( orderItemDTO1 ) );
        }

        return list;
    }

    private Long orderUserId(Order order) {
        if ( order == null ) {
            return null;
        }
        User user = order.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected User orderDTOToUser(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( orderDTO.getUserId() );

        return user;
    }

    private Long orderItemProductId(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }
        Product product = orderItem.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Product orderItemDTOToProduct(OrderItemDTO orderItemDTO) {
        if ( orderItemDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( orderItemDTO.getProductId() );

        return product;
    }
}
