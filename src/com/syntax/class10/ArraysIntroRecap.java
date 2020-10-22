package com.syntax.class10;

public class ArraysIntroRecap {
public static void main (String[] args) {
	//I have 5 students in class and I have to calculate the average score
	
	int[] grades = new int [5];
	
	grades[0]=98;
	grades[1]=80;
	grades[2]=89;
	grades[3]=67;
	grades[4]=77;
	
	int avrg=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
	
	System.out.println("Average score of my students = "+avrg);
	
	double[] array;
	array=new double[3];
	array[0]=12.99;
	array[1]=10.89;
	
	System.out.println("Value of the last element is "+array[2]);
	
	array[2]=5.99;
	System.out.println("Value of the last element after reassignment is "+array[2]);
	
	//array[3]=7;
	//System.out.println("Value of the third element is "+array[3]);
	//we will have an error because we declared only three variables 
	
	String[] liquid=new String[4];
	liquid[2]="water";
	liquid[1]="tea";
	
	System.out.println(liquid[0]);//output will be null because the first element is empty
}
}
