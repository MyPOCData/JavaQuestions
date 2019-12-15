package com.stack;

public class StackGenericExample {
	public static void main(String args[]){
		StackGeneric<StackGenericStudent> stu = new StackGeneric<StackGenericStudent>(15);
		stu.push(new StackGenericStudent("abc",20));
		stu.push(new StackGenericStudent("def",30));
		stu.push(new StackGenericStudent("ghi",40));
		stu.push(new StackGenericStudent("jkl",50));
		stu.push(new StackGenericStudent("mno",60));
		
		System.out.println("POP the data from the stack");
		System.out.println(stu.pop());
		System.out.println(stu.pop());
		System.out.println(stu.pop());
		System.out.println(stu.pop());
		System.out.println(stu.pop());
	}
}
