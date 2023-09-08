package com.hamitmizrak.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//404 ile ilgili hataları bu kısım yakalıycak
//404:bulunamadı
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundExcaption extends RuntimeException {
    public NotFoundExcaption(String message) {
        super(message);
    }
}
