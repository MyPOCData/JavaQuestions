package com.stack;

public class StackExample {
    public static void main(String[] args) {
           Stack stack = new Stack(10); // Creation of Stack
           stack.push(11);
           stack.push(21);
           stack.push(31);
           stack.push(41);
           stack.push(51);
 
           System.out.print("Popped items: ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           
           
    }
 
}
 
/** OUTPUT
 
Popped items: 51 41 31 21 11
 
*/