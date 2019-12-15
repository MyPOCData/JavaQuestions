package com.stack;

class Stack {
    private int size;
    private int[] stackAr;
    private int top; // top of stack
 
    /**
     * Constructor for initializing Array.
     */
    public Stack(int size) {
           this.size = size;
           stackAr = new int[size]; // Creation of Stack array
           top = -1; // initialize Stack to with -1
    }
 
    /**
     * Push items in stack, it will put items on top of Stack.
     */
    public void push(int value){
           if(isFull()){
                  throw new StackFullException("Cannot push "+value+", Stack is full");
           }
           stackAr[++top] = value;
    }
 
    /**
     * Pop items in stack, it will remove items from top of Stack.
     */
    public int pop() {
           if(isEmpty()){
                  throw new StackEmptyException("Stack is empty");
           }
           return stackAr[top--]; // remove item and decrement top as well.
    }
 
    /**
     * @return true if Stack is empty
     */
    public boolean isEmpty() {
           return (top == -1);
    }
 
    /**
     * @return true if stack is full
     */
    
    public boolean isFull() {
           return (top == size - 1);
    }
 
}