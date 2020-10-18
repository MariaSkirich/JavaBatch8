package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		// print numbers in one line with space (from 1 to 100)

		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}

		System.out.println();
		// print numbers from 100 to 1

		for (int b = 100; b > 0; b--) {
			System.out.print(b + " ");
		}

		System.out.println();
		// print even numbers from 20 to 1 (for)

		for (int c = 20; c > 0; c--) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}

		System.out.println("SECOND WAY");
		// second way

		for (int d = 20; d > 1; d -= 2) {
			System.out.print(d + " ");
		}
		System.out.println();

		// Print odd numbers between 20 and 50 (2 ways)

		for (int e = 20; e <= 50; e++) {
			if (e % 2 != 0) {
				System.out.print(e + " ");
			}
		}

		System.out.println("SECOND WAY");

		for (int f = 21; f <= 50; f += 2) {
			System.out.print(f + " ");
		}

		System.out.println("-----------What will be the output?-------");

		int sum = 0;

		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

		int j;

		for (j = 1; j < 6; j++) {
			System.out.println("Value for j inside the loop is " + j);
		}
		System.out.println("Value for j outside the FOR loop is "+j);

		System.out.println("-----------What will be the output?-------");
		
		int result=1;
		
		for (int k=10; k>=1; k-=2) {
			result*=k;
			System.out.println("Result is equal to "+result);//we print all results that meet condition
		}
		System.out.println(result); //we print the last value before the condition became false
	}
}
