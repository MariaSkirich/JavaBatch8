package com.syntax.class05;

import java.util.Scanner;

public class ImprovedTask4 {

	public static void main(String[] args) {
		Scanner scan;
		String month;
		String season; //if we don't use ELSE part, we should assign null value to string

		scan = new Scanner(System.in);

		System.out.println("Please, enter your birth month");
		month = scan.next();

		if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else {
			season ="something like this?";
			}
		
		
		System.out.println("You were born in " + season);
	}
}
