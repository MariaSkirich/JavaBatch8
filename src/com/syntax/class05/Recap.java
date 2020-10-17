package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scanner; 
		
		scanner=new Scanner(System.in);
		
		//I want to capture a sentence
		System.out.println("Please, enter any sentence");
		String sentence=scanner.nextLine();

		System.out.println("You entered a sentence: "+sentence);
		
		//I want to capture a number
		System.out.println("Please, enter any number");
		int num=scanner.nextInt();
		
		System.out.println("You entered number: "+num);
		
		
		//I want to capture one character
		System.out.println("Please, enter any single character");
		char singleChar=scanner.next().charAt(0);
		System.out.println("You entered a single character: "+singleChar);
		
		//I want to enter a word
		System.out.println("Please, enter any word");
		String word=scanner.next();
		System.out.println("You entered ONE word: "+word);
	}

}
