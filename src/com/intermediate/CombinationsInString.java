package com.intermediate;

public class CombinationsInString {

	public static void main(String[] args) {
		
		String str = "abhinav";
		String sum = "";
		char[] strArr = str.toCharArray();
		for(int i=0; i<strArr.length; i++){
			for(int j=i; j<strArr.length; j++){
				sum = sum + strArr[j];
				System.out.println(sum);
			}
			sum = "";
		}
	}

}
