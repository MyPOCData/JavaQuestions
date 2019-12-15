package com.test.quiz;

public class TryOrFinally {

	public static void main(String[] args) {
		System.out.println(hello("Abhinav"));
	}
	private static String hello(String name){
		try{
			System.out.println("Hello ");
		}finally{
			return name;
		}
	}

}
