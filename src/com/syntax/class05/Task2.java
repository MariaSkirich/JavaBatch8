package com.syntax.class05;

import java.util.Scanner;

public class Task2 {
 public static void main (String[] args) {
	 Scanner scan;
	 int height;
	 
	 scan=new Scanner (System.in);
	 System.out.println("Please, enter your height in inches");
	 height=scan.nextInt();
	 
	 if (height>0 && height<=60) {
		System.out.println("You're short"); 
	 } else if (height>60 && height<=72) {
		 System.out.println("Your height is medium");
	 } else if (height>72) {
		 System.out.println("You are tall");
	 }
	 
		  
 }
}
