package com.stack;

public class StackGenericStudent {
	String name;
	int age;
	
	StackGenericStudent(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "Student [Name : "+name+", Age : "+age+"]";
	}

}
