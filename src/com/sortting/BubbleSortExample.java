package com.sortting;

public class BubbleSortExample {

	public static void main(String[] args) {
		Sort bubble = new Sort(10);
		bubble.insertData(38);
		bubble.insertData(26);
		bubble.insertData(100);
		bubble.insertData(1);
		bubble.insertData(64);
		bubble.insertData(3);
		bubble.insertData(9);
		bubble.insertData(5);
		
		bubble.displayArr();
		bubble.bubbleAlgo();
		System.out.println("After Bobble Sort:");
		bubble.displayArr();

	}

}
