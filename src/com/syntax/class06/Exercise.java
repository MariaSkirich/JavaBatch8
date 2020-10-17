package com.syntax.class06;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		// we're thinking of going shopping
		// 1.we check if store has sale
		// 2.if there's no sale - we're not shopping
		// 3.if sale --> we go shopping
		// 4.ask for the price
		// 5.if price>50 we get 10% discount
		// 6.if price is between 50 and 100 we get 20% discount
		// 7.if price is between 100 and 500 we get 40% discount
		// 8.if price is more than 500 we get 50% discount
		// Calculate the final price that you will pay after discount

		Scanner scanner;
		scanner = new Scanner(System.in);
		double price, discount, payment;
		discount = 0;

		System.out.println("Is there a sale at the store? True or false?");

		boolean sale;

		sale = scanner.nextBoolean();

		if (!sale) {
			System.out.println("No shopping");
			} else {
				System.out.println("What is the price?");
				price = scanner.nextInt();
				if (price >= 10 && price < 50) {
					discount = 0.1;
				} else if (price >= 50 && price <100) {
					discount = 0.2;
				} else if (price >= 100 && price < 500) {
					discount = 0.4;
				} else if (price >= 500) {
					discount = 0.5;
				}
				payment = price - (price * discount);

				System.out.println("The final price after discount is " + payment);
			
		}

	}
}
