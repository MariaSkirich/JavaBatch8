package com.syntax.class10;

public class Task2Array {

	public static void main(String[] args) {

		String[] cars = { "Audi", "Volvo", "Ford", "Mazda", "Tesla", "Mercedes" };

		for (int i = 0; i <= cars.length - 1; i++) {
			System.out.print(cars[i] + " ");
		}
		
		System.out.println("-------SECOND TASK--------");
		int[] num = { 12, 7, 8, 9, 47, 25 };
		int sum;
		sum=0;
		
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		System.out.println("The sum of numbers in the array is "+sum);
	}

}
