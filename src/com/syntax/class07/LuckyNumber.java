package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// we're playing a lottery, where we need to enter numbers from 1 to 100
		// one of the numbers is the winning number, lucky number is 7
		// keep asking to enter a number until the number is the winning one

		Scanner scan;
		int number, luckyNum;
		luckyNum = 7;

		scan = new Scanner(System.in);

		do {
			System.out.println("Please, enter the number from range 1 to 100");
			number = scan.nextInt();
		} while (number != luckyNum);

		System.out.println("You win!");

	}

}
