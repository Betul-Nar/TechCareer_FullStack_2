package com.hamitmizrak.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//401; yetkisiz giriş

@ResponseStatus(HttpStatus.UNAUTHORIZED )
public class UnAuthorizedExcaption extends RuntimeException {
    public UnAuthorizedExcaption(String message) {
        super(message);
    }
}
