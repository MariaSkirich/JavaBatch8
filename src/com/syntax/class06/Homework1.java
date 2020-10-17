package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scanner;
		String country, language;

		scanner = new Scanner(System.in);

		System.out.println("Please, enter your country");

		country = scanner.nextLine();

		switch (country) {
		case "USA":
			language = "English";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "Ukraine":
			language = "Ukrainian";
			break;
		case "Italy":
			language = "Italian";
			break;
		case "Sweden":
			language = "Swedish";
			break;
		case "Bulgaria":
			language = "Bulgarian";
			break;
		default:
			language = "some other languages";
		}
		System.out.println("You speak " +language);

	}

}
