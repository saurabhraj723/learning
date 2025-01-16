package com.transaction.flightbookingapp.exceptions;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String msg){
        super(msg);
    }
}
