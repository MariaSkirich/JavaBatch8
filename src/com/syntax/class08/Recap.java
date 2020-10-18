package com.syntax.class08;

import java.util.Scanner;

public class Recap {
public static void main (String[] args) {
	//ask user to pay for water
	//water price is $5
	//we need to keep asking to pay for water 
	//once the user enters money, we should tell whether we need more money or less
	//ATM doesn't give change
	//when user gives $5 --> "Enjoy your water!"
	
	Scanner scan;
	int money,waterPrice;
	waterPrice=5;
	
	scan=new Scanner(System.in);
	System.out.println("Please pay for water");
	money=scan.nextInt();
	
	while (money!=waterPrice) {
		if (money>waterPrice) {
			System.out.println("This is too much. Please, enter less money");
		} else {
			System.out.println("Water is expensive. Please, insert more money");
			}
		money=scan.nextInt();
	}
	System.out.println("Enjoy your water!");
	
		
	
		
		
	
	
	
}
}
