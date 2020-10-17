package com.syntax.class04;

public class IfElseIfTask1 {
	public static void main(String[] args) {

		int month = 6;

		if (month == 1) {
			System.out.println("It's January");
		} else if (month == 2) {
			System.out.println("It's February");
		} else if (month == 3) {
			System.out.println("It's March");
		} else if (month == 4) {
			System.out.println("It's April");
		} else if (month == 5) {
			System.out.println("It's May");
		} else if (month == 6) {
			System.out.println("It's June");
		} else if (month == 7) {
			System.out.println("It's July");
		} else if (month == 8) {
			System.out.println("It's August");
		} else if (month == 9) {
			System.out.println("It's September");
		} else if (month == 10) {
			System.out.println("It's October");
		} else if (month == 11) {
			System.out.println("It's November");
		} else if (month == 12) {
			System.out.println("It's December - Christmas time!");
		} else
			System.out.println("Entry is invalid, please put the number from 1 to 12");
	
		int num1;
		num1=-3;
		
	if (num1>0) {
		System.out.println(num1+" is a positive number");
	} else {
		System.out.println(num1+" is a negative number");
	}
	
	int num2=10;
	int condition=2;
	
	if (num2%condition==0) {
		System.out.println(num2+" is an even number");
	} else {
		System.out.println(num2+" is an odd number");
	}
		
	}
}
