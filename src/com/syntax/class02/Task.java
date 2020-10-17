package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		String word = "Task 1";
		System.out.println(word);

		double num1 = 10.34;
		double num2 = 3.25;

		double add = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;

		
		System.out.println("The sum of two numbers "+num1+" and "+num2+" is equal to "+add);
		System.out.println("The subtraction of two numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multiplication of two numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The division of two numbers "+num1+" and "+num2+" is equal to "+div);

		String word2 = "Task 2";
		System.out.println(word2);
		
		double num3=3.9;
		double square=num3*num3;
	
		System.out.println("The square of the number "+num3+" is equal to "+square);
		
		String word3="Task 3";
		System.out.println(word3);
		
		byte wid=5;
		byte wid1=5;
		byte hei=8;
		byte hei1=8;
		
		int per=wid+wid1+hei+hei1;
		int are=wid*hei;
		
		System.out.println("The perimeter of a rectangle with width "+wid+" and height "+hei+" is equal to "+per);
		System.out.println("The area of a rectangle with width "+wid+" and height "+hei+" is equal to "+are);
		
		

	}

}
