package com.hamitmizrak.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//201:istisnayı tanımlar
@ResponseStatus(HttpStatus.CREATED  )
public class CreatedExcaption extends RuntimeException {
    public CreatedExcaption(String message) {
        super(message);
    }
}
