package com.syntax.class05;

import java.util.Scanner;

public class HWSales {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		int sales;
		String comission = null;

		System.out.println("Please, type your sales amount");
		sales = scanner.nextInt();

		if (sales >= 10 && sales < 100) {
			comission = "10%";
		} else if (sales >= 100 && sales < 200) {
			comission = "20%";
		} else if (sales>=200 && sales<500) {
			comission="30%";
		} else if (sales>500) {
			comission="50%";
		}
			System.out.println("Your comission is " + comission);
			

	}

}
