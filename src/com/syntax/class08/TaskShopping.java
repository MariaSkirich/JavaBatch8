package com.syntax.class08;

import java.util.Scanner;

public class TaskShopping {

	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy and the price of
		// that item.
		// Every time user enters money accumulate the amount and tell the user how much
		// is left to pay off. If user give more money program should return a change.
		// Whenever a user done with payments program should say “Thank you for
		// shopping!”

		Scanner scan = new Scanner(System.in);
		String item;
		double price, money, change;
		boolean shopping;
		shopping=true;

		System.out.println("Please, enter what item you're buying and the price");

		item = scan.next();
		price = scan.nextDouble();
		
		System.out.println("Please, pay for your item");
		money = scan.nextDouble();

		while (shopping) {
			if (price>money) {
				price -=money;
				System.out.println("Please add " + price);
			} else if (money > price) {
				change = money - price;
				System.out.println("Here's your item and your "+change);
				break;
			} else {
				break;
			}
			money=scan.nextDouble();
		}
		System.out.println("Thank you!");
	}

}
