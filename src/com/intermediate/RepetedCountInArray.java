package com.intermediate;

import java.util.HashMap;

public class RepetedCountInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4,4,5,6,6,7,4};
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int i=0; i<arr.length;i++){
			if(count.containsKey(arr[i])){
				count.put(arr[i], count.get(arr[i])+1);
			}else
				count.put(arr[i], 1);
		}
		System.out.println(count);
	}

}
