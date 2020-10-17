package com.syntax.class06;

public class NotMoreExamples {

	public static void main(String[] args) {
		
		boolean isJavaEasy=false;
		
		if(!isJavaEasy) {
			System.out.println("Please, spend more time studying Java");
		}
		
		System.out.println("--------------------");
		
		String day="Saturday";
		
		if (!(day.equals("Sunday") || day.equals("Saturday"))) {
			System.out.println("I am going to work");
		}

	}

}
