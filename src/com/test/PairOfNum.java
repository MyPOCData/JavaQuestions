package com.test;

public class PairOfNum {

	// Given an array A[] and a number x, check for pair in A[] with sum as x
	public static void main(String[] args) {
		
		int arr[] = {5,7,2,4,1,9,3,6};
		int num = 9;
		int pairarr[][] = new int[arr.length][2];
		int x=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]<num){
				for(int j=i+1; j<arr.length; j++){
					if(arr[i]+arr[j] == num){
						System.out.println("The pair is : " + arr[i] + " and " + arr[j]);
						pairarr[x][0] = arr[i];
						pairarr[x][1] = arr[j];
						x++;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<x ; i++){
			for(int j=0; j<2; j++){
				System.out.print(pairarr[i][j] + ", ");
			}
			System.out.println();
		}

	}

}
