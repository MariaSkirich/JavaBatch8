package com.syntax.class06;

import java.util.Scanner;

public class Homework2Calculator {

	public static void main(String[] args) {
		
		Scanner scanner;
		double num1,num2;
		char operator;
		double result;
		result=0.0;
		
		scanner=new Scanner (System.in);
		
		System.out.println("Please, enter two numbers");
		
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		
		System.out.println("Please, enter the operator you would like to use:+,-,*,/");
		
		operator=scanner.next().charAt(0);
		
		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
		break;
		default:
			System.out.println("The entered operator is invalid");
				
		}
		System.out.println(result);
		

	}

}
