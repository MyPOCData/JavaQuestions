package com.test;

import java.util.HashMap;
import java.util.Set;

public class CountOfRepetedNum {

	public static void main(String[] args) {
		
		int arr[] = {2,4,9,6,2,3,2,5,4,7,9,2,1};
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++){
			if(countMap.containsKey(arr[i])){
				countMap.put(arr[i], countMap.get(arr[i])+1);
			}else
				countMap.put(arr[i], 1);
		}
		System.out.println(countMap);
		Set<Integer> keys = countMap.keySet();
		for(Integer key : keys){
			System.out.println(key + ":" + countMap.get(key));
		}
	}

	
//	public static void main(String args[]){
//		int arr[] = {2,5,9,6,10};
//		int product[] = new int[arr.length];
//		for(int i=0; i<arr.length; i++){
//			int pro = 1;
//			for(int j=0; j<arr.length; j++){
//				if(i==j){
//					continue;
//				}else{
//					pro = pro * arr[j];
//				}
//			}
//			product[i] = pro;
//		}
//		
//		for(int i=0; i<product.length; i++){
//			System.out.println(product[i]);
//		}
//	}
}
