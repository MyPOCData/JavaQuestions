package com.beginner;

public class FindDistanceBWTwoWords {

	public static void main(String[] args) {
		String str = "This is algo example to test";
		String fStr = "is";
		String lStr = "test";
		int x = 0;
		int y = 0;
		String s[] = str.split(" ");
		System.out.println(s.length);
		for(int i=0; i<s.length;i++){
			if(s[i].equals(fStr) || s[i].equals(lStr)){
				System.out.println(i);
				if(x==0){
					x=i;
				}else y=i;
			}
		}
		
		int z = x>y?(x-y-1):(y-x-1);
		System.out.println("Distance b/w these two words is: " + z);
	}

}
