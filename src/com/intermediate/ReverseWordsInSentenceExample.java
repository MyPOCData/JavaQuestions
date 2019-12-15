package com.intermediate;

public class ReverseWordsInSentenceExample {
	
	static String str = "i am doing good dear";
	static String[] st ;
	
	public static void main(String[] args){
		st = str.split(" ");
		display(st);
		for(int i=0; i<st.length/2; i++){
			swap(i,st.length-1-i);
		}
		display(st);
	}
	
	static void swap(int x, int y){
		String temp = st[x];
		st[x] = st[y];
		st[y] = temp;
	}
	
	static void display(String[] s){
		for(int i=0; i<s.length; i++){
			System.out.print(s[i] + " ");
		}
		System.out.println();
	}

}
