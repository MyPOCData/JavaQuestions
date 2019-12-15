package com.intermediate;

public class ReplaceSpecialCharExample {

	public static void main(String[] args) {

		String input="java$#$made$#$so$#$easy";
		char[] ch = input.toCharArray();
		int length = ch.length;
		
		for(int i=0; i<length-2; i++){
			if(ch[i]=='$' && ch[i+1]=='#' && ch[i+2]=='$'){
				ch[i]=' ';
				int j = i+1;
				while(j < length-2){
					ch[j]=ch[j+2];
					j++;
				}
				length = length-2;
			}
		}
		
		for(int i=0; i<length;i++){
			System.out.print(ch[i]);
		}

	}

}
