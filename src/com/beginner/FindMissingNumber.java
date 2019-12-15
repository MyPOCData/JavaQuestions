package com.beginner;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {5,8,11,14,20,23,26,29,32,35};
		System.out.println(findMissingNum(arr));
	}
	
	public static int findMissingNum(int[] ar){
		int missNum=0;
		int sum=0;
		int diff = ar[1]-ar[0];
		int start = ar[0];
		int lenght = ar.length+1;
		for(int i=0; i<ar.length; i++){
			sum = sum + ar[i];
		}
		int total = (lenght*(2*start + (lenght-1)*diff)/2);
		missNum = total - sum;
		return missNum;
	}
}
