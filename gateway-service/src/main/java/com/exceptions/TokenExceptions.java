package com.exceptions;

public class TokenExceptions extends  RuntimeException{
    int status;
    String message;
    public TokenExceptions(int status,String message){
        this.status=status;
        this.message=message;

    }
}
