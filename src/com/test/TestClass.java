package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestClass {
	
//	static int top = -1;
//	static int size = 10;
//	static int[] stack = new int[size];
//
//	
//	public static void push(int x){
//		if(stack.length > top){
//			stack[++top] = x;
//		}else
//			System.out.println("Stack is full");
//	}
//	
//	public static int pop(){
//		if(top > -1){
//			return stack[top--];
//		}else
//			System.out.println("Stack is empty");
//		return -1;		
//	}
//	
//
//	public static void main(String[] args) {	
//
//		push(5);
//		push(2);
//		push(7);
//		push(0);
//		System.out.println(pop());
//		push(9);
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//	}

	
	
	
	
//	static int[] arr = new int[10]; //{5,2,3,6,8,9,12,};
//	static int index = 0;
//	
//	public static void enterdata(int value){
//		arr[index++]= value;
//	}
//	
//	public static void bsort(){
//		for(int i=0; i<arr.length-1; i++){
//			for(int j=0; j<(arr.length-1-i); j++){
//				if(arr[j]<arr[j+1]){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//	}
//	
//	public static void display(){
//		for(int i=0; i<arr.length; i++){
//			System.out.print(arr[i] + ",");
//		}
//		System.out.println();
//	}
//	
//	public static void main(String args[]){
//		enterdata(5);
//		enterdata(3);
//		enterdata(17);
//		enterdata(9);
//		enterdata(5);
//		enterdata(0);
//		enterdata(6);
//		enterdata(1);
//		enterdata(8);
//		display();
//		bsort();
//		display();
//	}
	
	
	
	
	
//	public static void main(String args[]){
//		
//		String str = "abhinav";
//		int n = 3; int i;
//		char[] subCh = new char[n];
//		List<String> subs = new ArrayList<String>();
//		char[] ch = str.toCharArray();
//		
//		for(i=0; i<ch.length; i++){
//			if(i%n != 0 || i==0){
//				subCh[i%n]=ch[i];
//			}else{
//				subs.add(subCh.toString());
//				subCh[i%n]=ch[i];
//			}				
//		}
//	
//		for(String s : subs){
//			System.out.println(s);
//		}
//		
//	}
	
	
	
	
	
//	public static void main(String args[]){
//		String str = "aaabaa";
//		boolean flag = false;
//		for(int i=0; i<str.length(); i++){
//			flag = isPalondrom(rotateStr(str));
//			if(flag){
//				System.out.println("String is palandrom");
//				break;
//			}
//		}
//		if(!flag)
//			System.out.println("String is not palandrom");
//		
//	}
//	
//	public static String rotateStr(String s){
//		char[] ch = s.toCharArray();
//		char temp = ch[0];
//		int i;
//		for(i=0; i<ch.length-1; i++){
//			ch[i] = ch[i+1];
//		}
//		ch[i] = temp;
//		return String.valueOf(ch);		
//	}
//	
//	public static boolean isPalondrom(String st){
//		char[] cp = st.toCharArray();
//		for(int i=0; i<cp.length/2;i++){
//			if(cp[i]!=cp[cp.length-1-i]){
//				return false;
//			}
//
//		}
//		return true;
//	}
	
	
	
//	public static void main(String args[]){
//		
//		String str = "abhinav agarwal";
//		char[] ch = str.toCharArray();
//		int count = 1;
//		HashMap<Character, Integer> chCountMap = new HashMap<>();
//		for(int i=0; i<ch.length; i++){
//			if(chCountMap.containsKey(ch[i])){
//				chCountMap.put(ch[i], ++count);
//			}else
//				chCountMap.put(ch[i], 1);
//		}
//		
//		System.out.println(chCountMap);
//	}
	
	
	
	
//	public static void main(String args[]){
//		int n=10;
//		int[] arr = new int[n];
//		arr[0] = 0;
//		arr[1] = 1;
//		int sum = 0;
//		for (int i=2; i<n; i++){
//			arr[i] = arr[i-1] + arr[i-2] ;
//		}
//	
//		for(int j=0; j<n; j++){
//			System.out.print(arr[j] + ",");
//		}
//	}
	
	
	
//	public static void main(String args[]){
//		String str = "Abhinav";
//		char[] ch = str.toCharArray();
//		for(int i=0; i<ch.length-1; i++){
////			if(ch[i] == ch[i+1]){
////				continue;
////			}else if(ch[i] != ch[i+1]){
////				char temp = ch[i];
////				int z=i+1;
////				while(temp != ch[z] && z<ch.length){
////					
////				}
////			}
//			for(int j=i+1; j<ch.length-1; j++){
//				if(ch[i] == ch[j]){
//					break;
//				}else if(ch[i] != ch[j] && j==ch.length-1){
//					System.out.println(ch[i]);
//				}
//					
//			}
//		}
//	}
	
	
	
//	public static void main(String args[]){
//		String str = "Hello! How are you?";
//		char[] ch = str.toCharArray();
//		for(int i=0; i<ch.length; i++){
//			for(int j=i+1; j<ch.length-1; j++){
//				if(ch[i]==ch[j]){
//					for(int z=j; z<ch.length-1; z++){
//						ch[z]=ch[z+1];
//					}
//				}
//			}
//		}
//		
//		for(int x=0; x<ch.length; x++){
//			System.out.println(ch[x]);
//		}
//	}
	
	
	
//	public static void main(String args[]){
//		int[] arr1 = {2,4,5,7};
//		int[] arr2 = {3,6,7};
//		int[] arr3 = new int[arr1.length + arr2.length];
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
//		while(i < arr1.length && j < arr2.length){
//			if(arr1[i] <= arr2[j]){
//				arr3[k++] = arr1[i++];
//			}else if(arr1[i] > arr2[j]){
//				arr3[k++] = arr2[j++];
//			}
//		}
//		while(i < arr1.length)
//			arr3[k++] = arr1[i++];
//		while(j < arr2.length)
//			arr3[k++] = arr2[j++];
//		
//		for(int x=0; x<arr1.length+arr2.length; x++){
//			System.out.println(arr3[x]);
//		}
//	}
	
	
//	public static void main(String args[]){
//		
//		String str = "AABBCCCABDDD";  // "A2B2C3A1B1D3"
//		char[] ch = str.toCharArray();
//		char[] c = new char[ch.length];
//		for(int i=0; i<ch.length-1; i++){
//			for(int j=0; j<ch.length; j++){
//				c[j]=ch[i];
//				if(ch[i]==ch[i+1]){
//					c[j]=ch[i];
//					c[j+1]=count++;
//			}
//			
//				
//			}
//		}
//	}
}
