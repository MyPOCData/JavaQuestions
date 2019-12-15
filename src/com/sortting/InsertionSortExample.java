package com.sortting;

public class InsertionSortExample {

	public static void main(String[] args) {
		Sort insertion = new Sort(10);
		insertion.insertData(27);
		insertion.insertData(2);
		insertion.insertData(36);
		insertion.insertData(99);
		insertion.insertData(5);
		insertion.insertData(9);
		insertion.insertData(96);
		
		insertion.displayArr();
		insertion.insertionSort();
		insertion.displayArr();
	}
}
