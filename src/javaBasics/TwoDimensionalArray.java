package javaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String x[][] = new String[3][5];
		System.out.println(x.length);//3 - total number of rows
		System.out.println(x[0].length);//5 - total number of columns
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		System.out.println(x[0][2]);//C
		
		//print all the values of two dimensional array: for loops
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
		
	}

}
