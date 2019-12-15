package com.sortting;

public class SelectionSortExample {

	public static void main(String[] args) {
		Sort selection = new Sort(10);
		selection.insertData(40);
		selection.insertData(50);
		selection.insertData(10);
		selection.insertData(90);
		selection.insertData(30);
		selection.insertData(60);
		selection.insertData(5);
		
		selection.displayArr();
		selection.selectionAlgo();
		selection.displayArr();

	}

}
