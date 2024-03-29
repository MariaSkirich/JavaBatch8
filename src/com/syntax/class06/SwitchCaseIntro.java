package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a day number");

		int day = scan.nextInt();
		String myDay;

		if (day == 1) {
			myDay="Monday";
		} else if (day == 2) {
			myDay="Tuesday";
		} else if (day == 3) {
			myDay="Wednesday";
		} else if (day == 4) {
			myDay="Thursday";
		} else if (day == 5) {
			myDay="Friday";
		} else if (day == 6) {
			myDay="Saturday";
		} else if (day == 7) {
			myDay="Sunday";
		} else {
			myDay="Invalid Day";
		}
		System.out.println("Today is "+myDay);

		System.out.println("-------SAME EXAMPLE WITH SWITCH STATEMENT-------");
		String today;

		switch (day) { //data type of variable must match with data type of cases

		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today="Invalid Day";
			break;
		}
		System.out.println("Today is "+today);

	}

}
