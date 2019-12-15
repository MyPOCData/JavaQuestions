package com.stack;

public class StackGeneric<T> {
	int size;
	T[] stackArr;
	int top;
	
	@SuppressWarnings("unchecked")
	StackGeneric(int size){
		this.size = size;
		stackArr = (T[]) new Object[size];
		top = -1;
	}
	
	void push(T value){
		if(top == size-1){
			System.out.println("Stack is already Full");
		}
		stackArr[++top] = value;
	}
	
	T pop(){
		if(top == -1){
			System.out.println("Stack is already empity");
		}
		return stackArr[top--];
	}

}
