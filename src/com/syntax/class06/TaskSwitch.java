package com.syntax.class06;

import java.util.Scanner;

public class TaskSwitch {

	public static void main(String[] args) {

		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 * 
		 */

		Scanner scan;
		char grade;
		String message;

		scan = new Scanner(System.in);
		
		System.out.println("Please, enter your grade");

		grade = scan.next().charAt(0);

		switch (grade) {
		case 'A':
			message = "Excellent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Average";
			break;
		case 'D':
			message="Bad";
			break;
			default:
				message="Not Acceptable";
		}
		
		System.out.println("Your grade is "+grade+",which is "+message);

	}

}
