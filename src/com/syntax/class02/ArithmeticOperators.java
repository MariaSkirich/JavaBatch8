package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		//Arithmetic operators +,-,/,%,*
		int num1, num2; 
		num1=10;
		num2=12;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		
		double num3=10.99;
		double num4=2.99;
		
		double mult=num3*num4;
		System.out.println(mult);
		
		double div=num3/num4;
		System.out.println("The result of division of two double values is "+div);

		float f=10.99f;
		float f1=2.99f;
		
		System.out.println("The result of division of two float values = "+f/f1);
		//the difference between float and double is that double is more accurate
		//double shows more digits than float 
		
		
	}

}
