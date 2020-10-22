package com.syntax.class10;

public class ArraysAnotherWay {
public static void main (String[] args) {
	
	String[] names= {"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
	
	System.out.println(names[3]);
	
	//how do I know how many elements I have in the array?
	int size=names.length;
	
	System.out.println("Size of names array = "+size);
	
	System.out.println(names[names.length-2]);//prints the fourth element of the array 
	
	int a=2;
	
	System.out.println(names[a]);//we used a to get the third element of the array 
	
	a+=2;
	
	System.out.println(names[a]);//value of a was 2, now it's 4 and it gets the fifth element 
	
	for (int i=0; i<names.length; i++) { //if condition is <= we should write names.length-1
		System.out.println(names[i]);
	}
	
}
}
