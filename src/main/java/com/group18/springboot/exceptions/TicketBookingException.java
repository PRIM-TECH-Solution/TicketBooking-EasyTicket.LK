package com.group18.springboot.exceptions;

public class TicketBookingException extends RuntimeException {

    public TicketBookingException(String message) {
        super(message);
    }
}
