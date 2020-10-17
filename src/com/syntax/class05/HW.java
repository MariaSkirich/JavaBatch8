package com.syntax.class05;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {

		Scanner scan;
		String answer;
		double balance;
		String answer2;
		int score;

		scan = new Scanner(System.in);
		System.out.println("Do you have a credit card? true/false");
		answer = scan.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What's your balance?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please, pay off your card balance");
			} else {
				System.out.println("You can spend more money");
			}
		} else if (answer.equalsIgnoreCase("no")) {
			System.out.println("Would you like to get a credit card?");
			answer2 = scan.next();
			if (answer2.equalsIgnoreCase("yes")) {
				System.out.println("What's your credit score?");
				score = scan.nextInt();
				if (score >= 500) {
					System.out.println("Please, visit www.somebank.com to apply");
				}
			} else {
				System.out.println("Okay then");
			}
		}
	}
}
