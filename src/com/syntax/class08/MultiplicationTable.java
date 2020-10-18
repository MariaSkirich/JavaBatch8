package com.syntax.class08;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		//I want to create a multiplication table
		//1x1=1
		//1x2=2
		//1x3=3
		//...
		//1x10=10
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num1=scan.nextInt();//we can change num1 and get another multiplication table
		int result=0;
		
		for (int i=1; i<=10; i++) {
			result=num1*i;
			System.out.println(num1+" x "+i+" = "+result);
		}
		
		

	}

}
