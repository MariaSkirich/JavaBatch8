package com.syntax.class04;

import java.util.Scanner;

//shortcut to import ctrl+shift+o

public class ScannerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="I am a string";
		
		Scanner scan=new Scanner (System.in);//enable input into console 
		
		//I am adding some message to the user		
		System.out.println("Please, enter any text");
		
		String value=scan.nextLine();//waits for your input. once you provide the input --> hit enter 
		
		System.out.println("I have caputred String value= "+value);
		
		System.out.println("Please, enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you");
		
		

	}

}
