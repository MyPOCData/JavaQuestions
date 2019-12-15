package com.test;

import java.util.HashMap;

public class AbhiTest {

	public static void main(String[] args) {
		System.out.println(revNum(234456));
		System.out.println(charCount("AbhinavAgarwal"));
	}
	
	public static int revNum(int num){
		int rNum = 0;
		while(num > 0){
			rNum = rNum*10 + num%10;
			num = num/10;
		}
		return rNum;
	}
	
	public static HashMap<Character, Integer> charCount(String str){
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> countMap = new HashMap<>();
		int count = 0;
		for(int i=0; i<ch.length; i++){
			if(countMap.containsKey(ch[i])){
				countMap.put(ch[i], countMap.get(ch[i])+1);
			}else{
				countMap.put(ch[i], 1);
			}
		}
		return countMap;
	}

}
