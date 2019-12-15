package com.xstady;

public class TestClass {

	public static void main(String[] args) {
		// Remove duplicate from shoted array
//		int[] arr = {1,2,3,3,4,5,5,6,6,6};
//		int size = arr.length-1;
//		for(int i=0; i<size; i++){
//			if(arr[i]==arr[i+1]){
//				int j=i;
//				while(j<size){
//					arr[j]=arr[++j];
//				}
//				size--;
//			}
//		}
//		for(int x=0; x<size; x++){
//			System.out.print(arr[x]+", ");
//		}
		// Reverse number
		int x = 23445;
		int p = 0;
		while(x>0){
			p = p*10 + x%10;
			x = x /10;
		}
		System.out.println(p);

	}

}
