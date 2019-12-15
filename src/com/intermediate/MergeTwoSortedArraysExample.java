package com.intermediate;

public class MergeTwoSortedArraysExample {

	public static void main(String[] args) {

		int[] a1 = {2,5,8,10};
		int[] a2 = {3,4,6,8,9,12,15};
		int[] a12 = merge(a1, a2);
		
		System.out.println("Array a1 : ");
		display(a1);
		System.out.println("Array a2 : ");
		display(a2);
		System.out.println("Array a12 : ");
		display(a12);

	}
	
	static int[] merge(int[] a1, int[] a2){
		int[] am = new int[a1.length + a2.length];
		int i = 0, j = 0, k = 0;
		while(i<a1.length && j<a2.length){
			if(a1[i] < a2[j])
				am[k++] = a1[i++];
			else 
				am[k++] = a2[j++];
		}
		while(i<a1.length)
			am[k++] = a1[i++];
		while(j<a2.length)
			am[k++] = a2[j++];	
		
		return am;		
	}
	
	static void display(int[] x){
		for(int i=0; i<x.length; i++){
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}

}
