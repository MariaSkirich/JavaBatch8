package com.syntax.class10;

public class AllValuesOfArray {

	public static void main(String[] args) {
		
		
		System.out.println("----Getting values from array with enhanced for loop (for each)-----");
		
		String[] cars = { "Audi", "Volvo", "Ford", "Mazda", "Tesla", "Mercedes" };
		
		//type of value inside the array + any variable name:name of the array
		for (String car:cars) {
			System.out.print(car+" ");
		}
		
		System.out.println("------ANOTHER EXAMPLE------");
		
		//array of numbers
		
		int[] num= {10,100,20,45};
		
		for(int number:num) {
			System.out.print(number+" ");
		}
		System.out.println("----------ANOTHER EXAMPLE---------");
		
		//array of boolean
		
		boolean[] a= {true, true, false, false, true};
		
		for (boolean b:a) {
			System.out.print(b+" ");
		}

	}

}
