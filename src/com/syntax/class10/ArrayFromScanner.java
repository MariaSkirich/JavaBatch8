package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {
public static void main (String[] args) {
	
	//ask user how many names he or she would like to store
	//and then store those names 
	
	Scanner scan=new Scanner(System.in);
	String[] names;
	int size;
	
		
	System.out.println("Please, tell how many names you would like to enter");
	size=scan.nextInt();
	
	names=new String[size];
	
	//we're storing values in the array
	for (int i=0; i<size; i++) {
		System.out.println("Please, enter any name");
		names[i]=scan.next();
	}
	//we're retrieving values from the array 
	for (int i=0; i<names.length; i++) {
		System.out.print(names[i]+" ");
	}
	
	
	
	
}
}
