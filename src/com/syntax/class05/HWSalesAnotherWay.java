package com.syntax.class05;

import java.util.Scanner;

public class HWSalesAnotherWay {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);

		double sales, percent, comission;
		percent=0;
		
		System.out.println("Please type your sales amount");

		sales = scanner.nextInt();

			
		if (sales >= 10 && sales < 100) {
			percent = 0.1;
		} else if (sales >= 100 && sales < 200) {
			percent = 0.2;
		} else if (sales >= 200 && sales < 500) {
			percent = 0.3;
		} else if (sales > 500) {
			percent = 0.5;
		}
		comission=sales*percent;
		
		System.out.println("The comission is " + comission);
		
		if (comission>1000) {
			System.out.println("You're an awesome seller");
		}
	}

}
