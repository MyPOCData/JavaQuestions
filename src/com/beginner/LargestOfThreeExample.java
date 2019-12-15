package com.beginner;

public class LargestOfThreeExample {
    public static void main(String[] args) {
           
       int a, b, c;
       a = 10;
       b = 13;
       c = 71;
     
       if ( a > b && a > c )
          System.out.println("a is largest.");
       else if ( a < b && b > c )
          System.out.println("b is largest.");
       else if ( a < c && b < c )
          System.out.println("c is largest.");
       else  
          System.out.println("a, b, c are not different.");
     
    }
 
}
//output
//c is largest.
