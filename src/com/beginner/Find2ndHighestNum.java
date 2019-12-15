package com.beginner;

public class Find2ndHighestNum {

	public static void main(String[] args) {
		int arr[] = {5,2,8,9,12,15,6,20};
		int highest = arr[0];
		int secondHighest = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i] > highest){
				secondHighest = highest;
				highest = arr[i];
			}else if(arr[i] > secondHighest){
				secondHighest = arr[i];
			}
		}
		System.out.println("2nd highest number is : " + secondHighest);

	}

}
