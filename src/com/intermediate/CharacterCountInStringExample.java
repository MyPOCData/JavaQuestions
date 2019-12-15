package com.intermediate;

public class CharacterCountInStringExample {

	public static void main(String[] args) {
		String inputString = "This is it";
		System.out.println("inputString is : " + inputString);
		System.out.print("Output is : ");
		characterCount(inputString);
	}

	/**
	 * Method calculates count of all characters in inputString.
	 */
	public static void characterCount(String inputString) {

		char[] inputAr = inputString.toCharArray();
		int count = 0, arLength;

		arLength = inputAr.length;
		for (int x = 0; x < arLength; x++) {
			char ch = inputAr[x];
			for (int y = x + 1; y < arLength; y++) {
				if (inputAr[y] == ch) { // if we have find same character again
										// in string
					for (int z = y; z < arLength - 1; z++)
						// shift characters left.
						inputAr[z] = inputAr[z + 1];
					arLength--; // as characters have been reduce arLength.
					y = x; // done to tackle case if occurrence of character is
							// more than once in string.
				}
			}
		}

		/*
		 * Till this point of program, inputAr's first arLength number of
		 * elements are unique.
		 */

		for (int x = 0; x < arLength; x++) {
			count = 0;
			for (int y = 0; y < inputAr.length; y++) {
				if (inputAr[x] == inputString.charAt(y))
					count++;
			}
			System.out.print(inputAr[x] + "=" + count + " ");
		}

	}

}

/*
 * OUTPUT
 * 
 * inputString is : This is it Output is :T=1 h=1 i=3 s=2 =2 t=1
 */

// public static void main(String[] args) {
//
// int arr[] = {2,4,9,6,2,3,2,5,4,7,9,2,1};
// HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
// for(int i=0; i<arr.length; i++){
// if(countMap.containsKey(arr[i])){
// countMap.put(arr[i], countMap.get(arr[i])+1);
// }else
// countMap.put(arr[i], 1);
// }
// System.out.println(countMap);
// Set<Integer> keys = countMap.keySet();
// for(Integer key : keys){
// System.out.println(key + ":" + countMap.get(key));
// }
// }