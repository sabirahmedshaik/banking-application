package net.springboot.guide.ba.exception;

public class AccountException extends RuntimeException{
    public AccountException(String name){
        super(name);
    }
}
