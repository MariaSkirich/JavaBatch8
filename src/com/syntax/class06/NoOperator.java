package com.syntax.class06;

public class NoOperator {

	public static void main(String[] args) {
		
		boolean b = !true;//! reverses the meaning of the value
		System.out.println(b);
		
		boolean anotherBoolean=!false;
		System.out.println(anotherBoolean);

		boolean isCold=true;
		
		if (!isCold) {
			System.out.println("I'm going to the beach");
		}
	}

}
