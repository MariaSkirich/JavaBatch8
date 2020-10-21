package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		// ******
		// ******
		// ******
		// ******

		for (int r = 1; r <= 6; r++) { // outer loop controls rows
			for (int c = 1; c <= 12; c++) {// inner loop controls columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------SQUARE OF NUMBERS-------");

		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println("-----------ANOTHER PATTERN------------");

		for (int r = 7; r >= 1; r--) {
			for (int c = 1; c <= 6; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("-----------ANOTHER PATTERN------------");

		for (int r = 1; r <=5; r++) {
			for (int c = 7; c >=1; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
