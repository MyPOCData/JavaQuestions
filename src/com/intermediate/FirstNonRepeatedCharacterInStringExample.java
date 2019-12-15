package com.intermediate;

public class FirstNonRepeatedCharacterInStringExample {
	
	public static void main(String[] args){
		String str = "this is it";
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++){
			char temp = ch[i];
			for(int j=i+1; j<ch.length; j++){
				if(temp == ch[j]){
					System.out.println(ch[j] + " repeated");
					break;
				}else if(temp != ch[j] && j==ch.length-i){
					System.out.println(ch[i] + " unique");
					continue;
				}
			}
		}
	}
}
