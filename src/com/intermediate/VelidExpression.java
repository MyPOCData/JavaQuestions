package com.intermediate;

public class VelidExpression {

	public static void main(String[] args) {
		String str = "((())()))(";
		String[] c = str.split("");
		int count = 0;
		for(int i=0; i<c.length; i++){
			if(c[i].equals("(") && count >= 0){
				count++;
			}else if(c[i].equals(")") && count >= 0){
				count--;
			}else if(count < 0){
				System.out.println("Invelid Expression...");
				break;
			}
		}
		if(count != 0){
			System.out.println("Invelid Expression");
		}else
			System.out.println("Velid Expression");
		
	}

}
