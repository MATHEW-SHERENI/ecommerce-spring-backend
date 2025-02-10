package com.mathew_ecommerce.ecommerce_spring.exception;

public class InsufficientStockException extends RuntimeException{
    public InsufficientStockException(String message){ super(message);}
}
