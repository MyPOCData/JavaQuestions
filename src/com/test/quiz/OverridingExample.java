package com.test.quiz;


public class OverridingExample {
	public static void main(String[] args) {
		ClassA h = new ClassB();
		System.out.println(h.getMessage() + " " + h.getName());
	}
}

class ClassA{
	public static String getMessage(){
		return "Hello";
	}
	public String getName(){
		return "A";
	}
}

class ClassB extends ClassA{
	public static String getMessage(){
		return "Hi";
	}
	public String getName(){
		return "B";
	}
}
