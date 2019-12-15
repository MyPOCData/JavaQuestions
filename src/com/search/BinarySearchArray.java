package com.search;

class BinarySearchArray {
	 
    private int ar[];
    private int index; // holds current position of array, by default it is initialized with 0
 
    /**
     * Constructor for initializing array
     */
    public BinarySearchArray(int maxSize) {
           ar = new int[maxSize];
    }
 
    /**
     * Insert values into array (Array must remain sorted, because binary search works on sorted array)
     */
    public void insert(int value) {
 
           int j;
           for (j = 0; j < index; j++)
                  // find position at which value should go
                  if (ar[j] > value) // linear search
                        break;
           for (int x = index; x > j; x--)
                  // move bigger elements up
                  ar[x] = ar[x - 1];
           ar[j] = value; // insert it
           index++; // increment size
    }
 
    /**
     * Find element using Binary search
     */
    public Integer binarySearch(int key) {
 
           int low = 0;  //points to first occupied cell in array.
           int up = index - 1; //points to last occupied cell in array.
           int mid = 0;  //points to mid of array.
 
           while (true) {
 
                  mid = (low + up) / 2;
 
                  if (low > up) {
                        System.out.print("\nElement=" + key + " not found");
                        return index;
                  } else if (ar[mid] == key) {
                        System.out.print("\nElement=" + key + " found at position="   + mid);
                        return mid;
                  } else if (ar[mid] > key) {
                        up = mid - 1;
                  } else {
                        low = mid + 1;
                  }
 
           }
 
    }
 
    /**
     * Display Array
     */
    public void display() {
           System.out.print("Displaying Array: ");
           for (int i = 0; i < index; i++) {
                  System.out.print(ar[i] + " ");
           }
 
    }
    
}
 
