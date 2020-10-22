package com.syntax.class10;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		System.out.println("-------Task 1-----");

		String[] animals = { "cat", "dog", "cheetah", "kangaroo", "elephant", "koala" };

		for (String myAnimals : animals) {
			System.out.print(myAnimals + " ");
		}
		System.out.println();

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		
		
		
		System.out.println("-------Task 3-----------");
		
		String[] countries= {"USA", "Ukraine", "Russia", "Spain", "Belarus"};
		
		for (int i=0; i<countries.length; i++) {
			if (i==0) {
				System.out.println("The capital of the "+countries[i]+" is Washington DC");
			} else if (i==1) {
				System.out.println("The capital of "+countries[i]+" is Kiev");
			} else if (i==2) {
				System.out.println("The capital of "+countries[i]+" is Moscow");
			} else if (i==3) {
				System.out.println("The capital of "+countries[i]+" is Madrid");
			} else if (i==4) {
				System.out.println("The capital of "+countries[i]+" is Minsk");
			}
		} 
		
		System.out.println("-----------SECOND WAY-----------");
		
		for (String country:countries) {
			if (country.equals("USA")) {
				System.out.println("The capital of the USA is Washington DC");
			} else if (country.equals("Ukraine")) {
				System.out.println("The capital of Ukraine is Kiev");
			} else if(country.equals("Russia")) {
				System.out.println("The capital of Russia is Moscow");
			} else if(country.equals("Spain")) {
				System.out.println("The capital of Spain is Madrid");
			} else if (country.equals("Belarus")) {
				System.out.println("The capital of Belarus is Minsk");
			}
		}
	}

}
