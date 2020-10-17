package com.syntax.class05;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many years have you worked?");

		int years = scan.nextInt();
		double percent, bonus;
		percent=0.1;
		
		if (years >= 5 && years<=7) {
			System.out.println("You're eligible for bonus");
			System.out.println("What's your salary?");
			int salary = scan.nextInt();
			if (salary < 100_000) {
				bonus = salary*percent;
				System.out.println("Your bonus is "+bonus);
			} else {
				System.out.println("You're not eligible for bonus");
			}
		} else {
			System.out.println("You're not eligible for bonus");
		}

	}
}
