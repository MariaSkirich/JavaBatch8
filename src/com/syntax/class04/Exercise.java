package com.syntax.class04;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter some number");
		int num = scanner.nextInt();

		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Buzz");
		} else if (num % 5 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(num);
		}

	}

}
