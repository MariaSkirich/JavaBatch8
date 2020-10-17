package com.syntax.class04;

import java.util.Scanner;

public class HomeworkTask3 {
public static void main (String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Where do you live?");
	
	String city=input.nextLine();
	
	System.out.println("What is the temperature in your city?");
	
	int temp=input.nextInt();
	temp = ((temp-32)*5)/9;
	
	System.out.println("The temperature in the "+city+" is "+temp);
	
}
}
