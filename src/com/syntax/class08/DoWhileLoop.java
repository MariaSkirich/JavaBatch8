package com.syntax.class08;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		Scanner scan;
		int money, waterPrice;
		waterPrice = 5;

		scan = new Scanner(System.in);
		System.out.println("Please pay for water");
		money = scan.nextInt();

		do {
			money = scan.nextInt();
			
			if (money > waterPrice) {
				System.out.println("This is too much. Please, enter less money");
			} else {
				System.out.println("Water is expensive. Please, insert more money");
			}
			
		} while (money != waterPrice);
		
		System.out.println("Enjoy your water!");

	}

}
