package com.xstady;

public class BeforeMain {
	
	public static void main(String args[]){
		System.out.println("I am inside main");
	}
	
	static{
		for(int i=0;i<10;i++){
			System.out.println(i+". Hello") ;
		}
	}
}
