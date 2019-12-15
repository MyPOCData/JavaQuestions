package com.xstady;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "Abhinav";
		String s2 = new String(s1);
		String s3 = "Abhinav";
		
		System.out.println(s1==s2);  //false
		System.out.println(s1==s3);  //true
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals(s3));  //true

	}

}

// "==" compare objects
// ".equel" compare values
