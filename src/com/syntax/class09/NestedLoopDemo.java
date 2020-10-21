package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("Hello!");
			for (int y = 0; y < 3; y++) {
				System.out.println("Bye!");
			}
		}
		System.out.println("---------------MORE EXAMPLES-----------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println("i= " + i + " j= " + j);
			}
			System.out.println("--------------------");
		}

		System.out.println("How can I print numbers from 10 to 99 using Nested Loop?");
		for (int i = 1; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + " ");
			}
		}

		System.out.println("How can I print a clock?");

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10) {
					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}
				} else {
					if (m < 10) {
						System.out.println(h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);
					}
				}
			}
		}
		System.out.println("------------I want to print a car odometer-------");
		
			
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					for (int l=0; l<10; l++) {
						for (int m=0; m<10; m++) {
							System.out.println(" "+i+" "+j+" "+k+" "+l+" "+m);
						}
					}
				}
			}
		}
	}
}
