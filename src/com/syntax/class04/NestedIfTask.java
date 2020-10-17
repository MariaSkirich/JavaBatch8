package com.syntax.class04;

public class NestedIfTask {

	public static void main(String[] args) {

		System.out.println("----Task1----");

		boolean diploma = true;
		double gpa = 3.6;
		if (diploma) {
			System.out.println("Congratualtions!");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Go get your diploma");

		}
		System.out.println("----Task2----");

		int mortgageRate = 3;
		int mortgagePrice = 300000;

		if (mortgageRate > 4.5) {
			System.out.println("I will not buy a house");
		} else {
			System.out.println("I'm thinking of buying a house");
		}
		if (mortgagePrice > 200000) {
			System.out.println("I will take a loan");
		} else {
			System.out.println("I will pay cash");
		}
	}
}
