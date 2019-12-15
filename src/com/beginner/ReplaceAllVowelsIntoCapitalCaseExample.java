package com.beginner;

public class ReplaceAllVowelsIntoCapitalCaseExample {

	public static void main(String[] args) {
		String str = "Abhinav Agarwal doing Java code";
		System.out.println("Orignal String : " + str);
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++){
			if((ch[i]=='a') || (ch[i]=='e') || (ch[i]=='i') || (ch[i]=='o') || (ch[i]=='u')){
				ch[i] = (char)(ch[i]-32);
			}							
		}
		str = new String(ch);
		System.out.println("New String is : " + str);
	}
}
