package com.intermediate;

public class ReplaceSpaceExample {

	public static void main(String[] args) {

		String input="java made so easy";
        System.out.println("entered string = "+input);
        System.out.println("output string  = "+replaceSpaces(input));

	}
	
	static String replaceSpaces(String s){
		char[] inputArr = s.toCharArray();
		int count=0;
		for(int i=0; i<inputArr.length; i++){
			if(inputArr[i]==' ')
				count++;
		}
		int newArrLength = inputArr.length + (count*2);
		char[] newArr = new char[newArrLength];
		for(int i=inputArr.length-1; i>=0; i--){
			if(inputArr[i] == ' '){
				newArr[--newArrLength]='$';
				newArr[--newArrLength]='#';
				newArr[--newArrLength]='$';
			}else
				newArr[--newArrLength]=inputArr[i];
		}
		String output = new String(newArr);
		return output;
		
	}

}
