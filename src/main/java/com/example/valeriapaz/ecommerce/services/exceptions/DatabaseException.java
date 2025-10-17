package com.example.valeriapaz.ecommerce.services.exceptions;

// Se extender apenas Exception, vc precisa usar Try/Catch.
// Com Runtime Exception, não precisa
public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg) {
        super(msg);
    }
}
