package com.intermediate;

public class CheckContinuityOfString {

	public static void main(String[] args) {
		String str = "healoabhihi";
		String s = "abhi";
		System.out.println("Continuity is : " + isContinuity(str, s));
	}
		
		static boolean isContinuity(String str, String s){
			char[] strArr = str.toCharArray();
			char[] sArr = s.toCharArray();
			int j=0;
			for(int i=0; i<strArr.length; i++){
				if(strArr[i] == sArr[j]){
					j++;
					if(j == sArr.length)
						return true;
				}else
					j=0;
			}
			return false;
		}
}
