package com.beginner;

public class DecimalToBinaryConversionExample {
	 
    public static void main(String...args) {      
              int decimal=15;
        System.out.println("decimal "+decimal+" = binary " + decimalToBinaryConverter(decimal));
              decimal=14;
        System.out.println("decimal "+decimal+" = binary " + decimalToBinaryConverter(decimal));
    }

    /*
     * method converts decimal number to binary.
     */
    public static String decimalToBinaryConverter(int decimal) {
    	if (decimal == 0) {
    		return "0";  //binary of decimal(0) is 0 only.
    	}
    	String binary = "";
    	while (decimal > 0) {
    		binary = (decimal % 2) + binary;
    		decimal = decimal / 2;
    	}
    	return binary; 
    }

}

/*OUTPUT

decimal 15 = binary 1111
decimal 14 = binary 1110
*/