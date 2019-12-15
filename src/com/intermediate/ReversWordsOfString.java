package com.intermediate;

import java.util.ArrayList;
import java.util.List;

public class ReversWordsOfString {

	public static void main(String[] args) {
		List<String> sR = new ArrayList<String>();
		String s = "This is my Test String";
		String[] str = s.split(" ");
		for(String s1 : str){
			sR.add(reversWord(s1));
		}
		System.out.println(sR);

	}
	
	public static String reversWord(String st){
		char[] c = st.toCharArray();
		for(int i=0, j=c.length-1; i<=j; i++, j--){
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		return c.toString();
		
	}

}
