package com.stack;

@SuppressWarnings("serial")
class StackFullException extends RuntimeException {
    
    public StackFullException(){
        super();
    }
    
    public StackFullException(String message){
        super(message);
    }
    
}
