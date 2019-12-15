package com.stack;

@SuppressWarnings("serial")
class StackEmptyException extends RuntimeException {
    
    public StackEmptyException(){
        super();
    }
    
    public StackEmptyException(String message){
        super(message);
    }
    
}