package com.search;

public class BinarySearchExample {
	public static void main(String[] args) {
		 
        int maxSize = 10; // Initial size of array

        BinarySearchArray bSearchArray = new BinarySearchArray(maxSize);

        bSearchArray.insert(11);
        bSearchArray.insert(22);
        bSearchArray.insert(33);
        bSearchArray.insert(99);
        bSearchArray.insert(55);
        bSearchArray.insert(77);
        bSearchArray.insert(66);
        bSearchArray.insert(88);
        bSearchArray.insert(44);
        bSearchArray.insert(1);

        bSearchArray.display();

        bSearchArray.binarySearch(88); // FOUND
        bSearchArray.binarySearch(-1); // NOT FOUND
        bSearchArray.binarySearch(73); // NOT FOUND
 }

}
