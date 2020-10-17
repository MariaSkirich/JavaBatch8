package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {

		String name = "Maria";

		// I would like to say My name is Maria

		System.out.println("My name is " + name);

		String lastName = "Skirich";

		// first name + last name together

		System.out.println(name + " " + lastName);

		String city = "New York";

		System.out.println(name + " lives in " + city);

		char grade = 'B';
		System.out.println(name + " is a " + grade + " student ");

		int age = 27;
		System.out.println(name + " is " + age + " years old.");

		// to attach/concatenate ANY value to a string use +, which is called
		// (String concatenation operator)

		int date = 27;
		String month = "September";
		System.out.println("It's "+month+","+date);
		
		String state="DC";
		String anotherState="DC ";
		//every sign in double quotations matters 
		
	}

}
