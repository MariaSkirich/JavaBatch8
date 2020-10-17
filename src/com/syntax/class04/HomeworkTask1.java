package com.syntax.class04;

import java.util.Scanner;

public class HomeworkTask1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What amount of loan is needed?");
		
		int loan=input.nextInt();
		
		if (loan<=200000) {
			System.out.println("Congratulations!You get the loan");
		} else {
			System.out.println("Sorry. Your loan cannot be approved");
		}

	}

}
