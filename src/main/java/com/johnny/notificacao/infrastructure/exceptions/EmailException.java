package com.johnny.notificacao.infrastructure.exceptions;

import com.johnny.notificacao.business.EmailService;

public class EmailException extends RuntimeException{

    public EmailException(String mensagem){
        super(mensagem);
    }

    public EmailException(String mensagem, Throwable throwable){
        super (mensagem, throwable);
    }
}
