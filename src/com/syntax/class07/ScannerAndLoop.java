package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		// I want to ask the user's name 5 times -> hello + name
		Scanner scan;
		String name;
		scan = new Scanner(System.in);
		int number = 1;

		while (number <= 5) {
			System.out.println("Please, tell me your name");
			name = scan.nextLine();
			System.out.println("Hello " + name);
			number++;
		}
		System.out.println("-----------------");
		
		
	}
}
