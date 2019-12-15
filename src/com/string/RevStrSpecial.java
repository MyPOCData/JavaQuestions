package com.string;

public class RevStrSpecial {

	public static void main(String[] args) {
		String str = "B!@ckDuck#Com";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		int i = 0;
		int j = ch.length-1;
		while(i <= j){
			if(((ch[i]>=65 && ch[i]<=90) || (ch[i]>=97 && ch[i]<=122))&&((ch[j]>=65 && ch[j]<=90) || (ch[j]>=97 && ch[j]<=122))){
				char c = ch[i];
				ch[i] = ch[j];
				ch[j] = c;
				i++;
				j--;
			}else if(((ch[i]>=65 && ch[i]<=90) || (ch[i]>=97 && ch[i]<=122))&&((ch[j]<=65 && ch[j]>=90) || (ch[j]<=97 && ch[j]>=122))){
				j--;
			}else if(((ch[i]<=65 && ch[i]>=90) || (ch[i]<=97 && ch[i]>=122))&&((ch[j]>=65 && ch[j]<=90) || (ch[j]>=97 && ch[j]<=122))){
				i++;
			}
		}
		for(int x=0; x<ch.length; x++){
			System.out.print(ch[x]);
		}
	}
}
