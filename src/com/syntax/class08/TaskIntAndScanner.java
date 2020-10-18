package com.syntax.class08;

import java.util.Scanner;

public class TaskIntAndScanner {

	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then 
		//from that range prints the sum of the even and odd integers.
		Scanner scan=new Scanner(System.in);
		int startPoint, endPoint, sumEven, sumOdd;
		sumEven=0;
		sumOdd=0;
		
		System.out.println("Please, enter the start point of the range");
		startPoint=scan.nextInt();
		
		System.out.println("Please, enter the end point of the range");
		endPoint=scan.nextInt();
		
		for (int i=startPoint; i<=endPoint; i++ ) {
			if (i%2==0) {
				sumEven+=i;
			}
			if (i%2!=0) {
				sumOdd+=i;
			}
		}
		System.out.println("The sum of even numbers is "+sumEven);
		System.out.println("The sum of odd numbers is "+sumOdd);
		
		
		
		
		

	}

}
