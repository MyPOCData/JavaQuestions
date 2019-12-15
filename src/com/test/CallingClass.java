package com.test;

public class CallingClass {

	public static void main(String[] args) {
		SuperClass superC = new SuperClass();
		superC.method();
		SubClass subC = new SubClass();
		subC.method();
		SuperClass superCl = new SubClass();
		superCl.method();
//		SubClass subC1 = new SuperClass();
	}

}
