package com.example.usersservice.exceptions;

import org.springframework.http.HttpStatus;

public class UserException extends BankException {



    public UserException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }


}
