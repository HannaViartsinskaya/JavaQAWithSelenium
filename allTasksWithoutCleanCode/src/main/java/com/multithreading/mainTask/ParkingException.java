package com.multithreading.mainTask;

public class ParkingException extends Exception{
    public ParkingException(){
        super();
    }
    public ParkingException(String message, Throwable cause){
        super(message,cause);
    }
    public ParkingException(String message){
        super(message);
    }
    public ParkingException(Throwable cause){
        super(cause);
    }
}
