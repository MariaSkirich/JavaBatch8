package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		//I want to say "Good Morning" 5 times

		//for (initialize; state condition; mention increment or decrement) {write code in here} 
		
		for (int i=1; i<=5; i++) {
			System.out.println("Good Morning");
		}
		
		System.out.println("ANOTHER EXAMPLE");
		
		//I want to print numbers from 1 to 100
		
		for (int b=1; b<=100; b++) {
			System.out.println(b);
		}
		
		//SYNTAX IS THE FOLLOWING:
		//start point, end point, increment or decrement 
		
		System.out.println("ANOTHER EXAMPLE - PRINTING FROM 10 to 0");
		
		for (int c=10; c>=0; c--) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		System.out.println("What will be the output?");
		
		for (int d=0; d<=30; d+=3) {
			System.out.println(d);
		}
		
		
	}

}
