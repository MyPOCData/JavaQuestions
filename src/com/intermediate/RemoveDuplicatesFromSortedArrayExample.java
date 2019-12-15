package com.intermediate;

public class RemoveDuplicatesFromSortedArrayExample {

	public static void main(String[] args) {
		
		int[] arr = {1,3,7,8,8,9,14,16,16,18,18};
		int size = arr.length;
		
		for(int i=0; i<size-1; i++){
			if(arr[i] == arr[i+1]){
				for(int j=i; j<size-1; j++){
					arr[j] = arr[j+1];
				}
				size--;
			}
		}
		
		for(int i=0; i<size; i++){
			System.out.print(arr[i] + ",");
		}
	}
}
