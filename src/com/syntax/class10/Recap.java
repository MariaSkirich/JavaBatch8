package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		boolean condition=true;
		
		while(condition) {
			System.out.println("I'm a while loop");
			for (int i=1; i<=8; i++) {
				System.out.println("I am a for loop");
				}
			break;//breaks the while loop, so we have only for loop printed 
		} 

		System.out.println("--------FOR LOOP INSIDE WHILE LOOP--------");
		
		for (int i=1; i<=3; i++) {
			System.out.println("I am a for loop");
			while (condition) {
				System.out.println("I am a while loop");
				break;
			}
		}
	}

}
