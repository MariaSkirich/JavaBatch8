package com.syntax.class07;

public class IncrementAndDecrement {
public static void main (String[] args) {
	int num=90;
	
	num=num+1;
	
	num+=1;
	System.out.println(num);
	
	num++; //increment operator - adds 1 to the variable
	System.out.println(num);
	
	int num1=100;
	num1-=1;
	num1--;//decrement operator - subtracts 1 from the variable
	
	System.out.println(num1);
	
	//increment and decrement work only with variables, not numbers 
	
	System.out.println("----------------------------");
	//we want to type Hello 5 times
	
	System.out.println("Hello");
	System.out.println("Hello");
	System.out.println("Hello");
	System.out.println("Hello");
	System.out.println("Hello");
}
}
