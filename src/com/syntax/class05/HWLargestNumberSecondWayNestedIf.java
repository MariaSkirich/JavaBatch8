package com.syntax.class05;

import java.util.Scanner;

public class HWLargestNumberSecondWayNestedIf {

	public static void main(String[] args) {
		Scanner scanner;
		double num1,num2,num3, largest;
		scanner=new Scanner(System.in);
		
		System.out.println("Please, enter three distinct numbers");
		num1=scanner.nextDouble();
		num2=scanner.nextDouble();
		num3=scanner.nextDouble();
		
		if (num1>num2) {
			if (num1>num3) {
				largest=num1;
			} else {
				largest=num3;
			}
		} else if (num2>num3) {
			largest=num2;
		} else {
			largest=num3;
		}
		
		System.out.println("The largest number is "+largest);

	}

}
