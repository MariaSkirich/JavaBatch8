package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// First way to create a variable
		// create a variable = assign value
		// declare variable = initializing

		double $num = 12.99;

		// Second way to create a variable
		// declare a variable and then initialize

		int myBox; // a declaration (happens only once)
		myBox = 135; // assigning the value

		System.out.println(myBox);

		myBox = 155;//reassigning the value

		System.out.println(myBox);
		
		//Third way to create a variable
		
		int num1, num2, num3;//if variables are of the same type, we can declare them in one line 
		
		num1=10;
		num2=20;
		num3=30;
		
		System.out.println(num3);

		//what will be the output?
		
		char char1='C';
		char char2='D';
		char char3=char1;
		
		System.out.println(char3);
		
	}

}
