package com.syntax.class09;

public class PatternsRepl {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
		System.out.println("----------ANOTHER TASK-------");
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println("---------------MY TASK----------");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------TASK WITH K SHAPE NUMERIC PATTERN------");

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j <= 5; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		for (int i = 5 - 1; i >= 1; i--) {

			for (int j = i; j <= 5; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println("----------------REPL TASK K SHAPE--------------");
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		for (int i = 1 + 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------------REPL 72-----------");

		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 4; c++) {
				if (r == 1 || r == 4 || c == 1 || c == 4) //we focus on what we PRINT rather than what we DON'T
					System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
