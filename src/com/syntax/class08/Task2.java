package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {
		// Calculate the sum of even and odd numbers from 1 to 50
		
		
		int sumEven, sumOdd;
		sumEven=0; 
		sumOdd=0;
		
		for (int a = 1; a <= 50; a++) {
			if (a % 2 == 0) {
				sumEven = sumEven + a;
			} else {
				sumOdd = sumOdd + a;
			}
		}
		System.out.println("The sum of all even numbers is "+sumEven);
		System.out.println("The sum of all odd numbers is "+sumOdd);
		

	}

}
