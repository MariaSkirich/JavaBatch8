package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {

		String day = "Saturday";

		while (day.equals("Saturday")) {
			System.out.println("My favorite Java class");
			day = "Sunday";
		}
		

		boolean isItBreakTime = true;

		while (isItBreakTime) {
			System.out.println("I will get tea");
			isItBreakTime = false;
		}
	}

}
