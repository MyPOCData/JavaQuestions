package com.search;

public class LinearSearchExample {
	public static void main(String[] args) {
		 
        int maxSize = 10; // Initial size of array

        LinearSearchArray lSearchArray = new LinearSearchArray(maxSize);

        lSearchArray.insert(11);
        lSearchArray.insert(22);
        lSearchArray.insert(33);
        lSearchArray.insert(99);
        lSearchArray.insert(55);
        lSearchArray.insert(77);
        lSearchArray.insert(66);
        lSearchArray.insert(88);
        lSearchArray.insert(44);
        lSearchArray.insert(1);

        lSearchArray.display();

        lSearchArray.linearSearch(88); // FOUND
        lSearchArray.linearSearch(-1); // NOT FOUND
        lSearchArray.linearSearch(73); // NOT FOUND
 }

}


/* OUTPUT

Displaying Array: 11 22 33 99 55 77 66 88 44 1
Element=88 found at position=7
Element=-1 not found
Element=73 not found

*/



