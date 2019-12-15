package com.matrix;

public class SumOfDiagonals {

	static int n=3;
	static int m=3;
	public static void main(String[] args) {
		
		int[][] mat = createMat(n, m);	
		display(n, m, mat);
		System.out.println("Sum of both digonals");
		System.out.println(addDiagonals(mat));
		System.out.println("Sum of Lower Tringle Including Digonal");
		System.out.println(addlowerTriangleIncludingDiagonal(mat));
		System.out.println("Sum of Lower Tringle Excluding Digonal");
		System.out.println(addlowerTriangleExcludingDiagonal(mat));
		System.out.println("Sum of Upper Tringle Including Digonal");
		System.out.println(addupperTriangleIncludingDiagonal(mat));
		System.out.println("Sum of Upper Tringle Excluding Digonal");
		System.out.println(addupperTriangleExcludingDiagonal(mat));
		System.out.println("Transpose of the metrix");
		display(m, n, transpose(mat));
	}
	
	public static int[][] createMat(int x, int y){
		int count = 1;
		int[][] m = new int[x][y];
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				m[i][j] = count++;
			}
		}
		System.out.println(m.length);
		return m;
	}
	
	public static void display(int x, int y, int[][] matrix){
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				System.out.print( " " + matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int addDiagonals(int[][] matrix){
		int lTOr = 0;
		int rTOl = 0;
		int sum = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==j){
					lTOr = lTOr + matrix[i][j];
				}else if(i+j == n-1){
					rTOl = rTOl + matrix[i][j];
				}
			}
		}
		if(n%2!=0){
			int m = n/2;
			int mid = matrix[m][m];
			sum = lTOr + rTOl - mid;
		}else
			sum = lTOr + rTOl;
		return sum;
	}
	
	public static int addlowerTriangleIncludingDiagonal(int[][] matrix){
		int sum = 0;
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<=i; j++){
				sum = sum + matrix[i][j];
			}
		}
		return sum;
	}

	public static int addlowerTriangleExcludingDiagonal(int[][] matrix){
		int sum = 0;
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<i; j++){
				sum = sum + matrix[i][j];
			}
		}
		return sum;
	}
	
	public static int addupperTriangleIncludingDiagonal(int[][] matrix){
		int sum = 0;
		for(int i=0; i<matrix.length; i++){
			for(int j=matrix.length-1; j>=i; j--){
				sum = sum + matrix[i][j];
			}
		}
		return sum;
	}
	
	public static int addupperTriangleExcludingDiagonal(int[][] matrix){
		int sum = 0;
		for(int i=0; i<matrix.length; i++){
			for(int j=matrix.length-1; j>i; j--){
				sum = sum + matrix[i][j];
			}
		}
		return sum;
	}

	public static int[][] transpose(int[][] matrix){
		int[][] tmatrix = new int[m][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				tmatrix[j][i] = matrix[i][j];
			}
		}
		return tmatrix;
	}
}
