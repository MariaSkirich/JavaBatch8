package com.syntax.class04;

import java.util.Scanner;

public class ReplAssignments {
	public static void main (String [] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Please enter 3 distinct numbers");
	    int numberOne = scanner.nextInt();
	    int numberTwo = scanner.nextInt();
	    int numberThree = scanner.nextInt();
	    if (numberOne > numberTwo && numberOne > numberThree) {
	      System.out.println("The largest number is " + numberOne);
	    }else if (numberTwo > numberOne && numberTwo > numberThree) {
	      System.out.println("The largest number is " + numberTwo);
	    }else {
	      System.out.println("The largest number is " + numberThree);
	    }
	   
	}
}
