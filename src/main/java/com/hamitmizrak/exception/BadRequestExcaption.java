package com.hamitmizrak.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//400: kötü istek dikakt 404 değil

@ResponseStatus(HttpStatus.BAD_REQUEST )
public class BadRequestExcaption extends RuntimeException {
    public BadRequestExcaption(String message) {
        super(message);
    }
}
