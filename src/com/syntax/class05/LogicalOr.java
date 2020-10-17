package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {
public static void main (String[] args) {
	
	String day="Saturday";
	
	if (day.equals("Saturday")|| day.equals("Sunday")) {
		System.out.println("Today I have my Java class at Syntax");
	}
	System.out.println("The End");
	
	System.out.println("-----------Example---------");
	/*if day is 1 or 5 --> I'm off from Syntax 
	 * if day 2 or 3 -->I'm going to have GIT classes
	 * if day is 4 --> I have a review class
	 * if day 6 or 7 -->I'm having Java class 
	 * every other day is not valid
	 */
	Scanner scan=new Scanner (System.in);
	System.out.println("Please, enter today's day using numbers only");
	int today=scan.nextInt();
	
	if (today==1 || today==5) {
		System.out.println("I'm off from Syntax");
	} else if (today==2 || today==3) {
		System.out.println("I'm going to have a GIT class");
	} else if (today==4) {
		System.out.println("I have a review class");
	} else if (today==6 || today==7) {
		System.out.println("I'm having Java class");
	} else {
		System.out.println("Invalid information");
	}
}
}
