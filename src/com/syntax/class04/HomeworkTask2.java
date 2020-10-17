package com.syntax.class04;

import java.util.Scanner;

public class HomeworkTask2 {
public static void main (String[] args) {
	
	Scanner input=new Scanner(System.in); 
	System.out.println("How old are you?");
	
	int age=input.nextInt();
	
	if (age>=18) {
		System.out.println("Congratulations! You'll get a driver's license");
	} else {
		System.out.println("Sorry, you are not eligible to get a driver's license");
	}

	
}
}
