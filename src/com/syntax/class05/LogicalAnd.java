package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {
	public static void main(String[] args) {
		/*
		 * I need to check if the entered number is small, medium, and large based on
		 * the input information
		 * small 1 to 10
		 * medium 11 to 100
		 * large 101 to 1000
		 */
		Scanner scan; 
		scan = new Scanner(System.in);
		int number;
		
		System.out.println("Please, enter any number");
		number=scan.nextInt();
		
		if (number>0 && number<=10) {
			System.out.println("You entered a small number");
		} else if (number>10 && number<=100) {
			System.out.println("You entered a medium number");
		} else if (number>100 && number<=1000) {
			System.out.println("You entered a large number");
		}
	}
}
