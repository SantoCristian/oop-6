package it.unibo.exceptions.fakenetwork.Exceptions;

public class NetworkException extends java.io.IOException{
    String message;
    public NetworkException(){
        super("Network error: no response");
    }

    public NetworkException(String message){
        this.message = message;
        super(message);
    }

    

}