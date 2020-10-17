package com.syntax.class05;

import java.util.Scanner;

public class ImprovedTask3 {

	public static void main(String[] args) {

		Scanner scan;
		int quiz;
		int midterm;
		int finscore;
		int avrgscore;
		char grade;

		scan = new Scanner(System.in);
		System.out.println("Please, enter your quiz score");
		quiz = scan.nextInt();
		System.out.println("Please, enter your midterm score");
		midterm = scan.nextInt();
		System.out.println("Please, enter your final score");
		finscore = scan.nextInt();

		avrgscore = (quiz + midterm + finscore) / 3;
		System.out.println(avrgscore+" is an average score");

		if (avrgscore >= 90) {
			grade = 'A';
		} else if (avrgscore < 90 && avrgscore >= 70) {
			grade = 'B';
		} else if (avrgscore < 70 && avrgscore >= 50) {
			grade = 'C';
		} else if (avrgscore <= 50 && avrgscore >= 30) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is = " + grade);
		
		if (grade=='A'||grade=='B') {
			System.out.println("You're a good student");
		} else {
			System.out.println("Study more");
		}
	}

}
