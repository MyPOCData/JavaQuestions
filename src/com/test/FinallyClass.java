package com.test;

public class FinallyClass {

	public static void main(String[] args) {
			
		System.out.println(result());
	}
	
	public static String result(){
		String s = null;
		try{
			String str = "Abhinav Good Morning !!!";
			s = str.toUpperCase();
			System.out.println(str);
			System.out.println(s);
			return str;
//			System.exit(0);
//		    int i = 5/0;
		}catch(Exception e){
			System.out.println("There is some exception!");
		}
		
		finally{
			System.out.println("This is finally block !!!");
		}		
		return s;
	}
}
