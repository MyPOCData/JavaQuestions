package com.intermediate;

public class FindSubString {

	public static void main(String[] args) {
		String str = "healloabhihi";
		String search = "abhi";
		char[] strArr = str.toCharArray();
		char[] searchArr = search.toCharArray();
		int i;
		for(i=0; i<=(strArr.length-searchArr.length); i++){
			if(strArr[i] == searchArr[0]){
				for(int j=0; j<searchArr.length;j++){
					if(searchArr[j] == strArr[i+j] && j != searchArr.length-1)
						continue;
					else if(searchArr[j] == strArr[i+j] && j == searchArr.length-1){
						System.out.println("Search String : " + search);
						System.exit(0);
					}
					else if(searchArr[j] != strArr[i+j])
						break;
				}
			}
		}
		System.out.println("Not Found");

	}

}
