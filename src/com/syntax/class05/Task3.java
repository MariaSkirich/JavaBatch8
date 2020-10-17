package com.syntax.class05;

import java.util.Scanner;

public class Task3 {
public static void main (String[] args) {
	
	Scanner scan;
	int quiz;
	int midterm;
	int finscore;
	int avrgscore;
	
	scan=new Scanner (System.in);
	System.out.println("Please, enter your quiz score");
	quiz=scan.nextInt();
	System.out.println("Please, enter your midterm score");
	midterm=scan.nextInt();
	System.out.println("Please, enter your final score");
	finscore=scan.nextInt();
	
	avrgscore = (quiz+midterm+finscore)/3;
	
	if (avrgscore>=90) {
		System.out.println("You get A");
	} else if (avrgscore<90 && avrgscore>=70) {
		System.out.println("You get B");
	} else if (avrgscore<70 && avrgscore>=50) {
		System.out.println("You get C");
	} else if (avrgscore<=50 && avrgscore>=30) {
		System.out.println("You get F");
	} else {
		System.out.println("You get D");
	}
	//if your grade is A or B -->"you're a good student, you're studying a lot"
	
	
}
}
