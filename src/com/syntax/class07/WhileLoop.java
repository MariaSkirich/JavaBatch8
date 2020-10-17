package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {

		int time = 13;

		if (time > 12) {
			System.out.println("good day");// code executes once
		}
		
		System.out.println("-----------------WHILE LOOP----------------");
		while (time > 12) {
			System.out.print("good day"); // code will be executed without stopping without decrement (--)
			time--;
		}

		while (time > 12) {
			System.out.print("good day"); // code will be executed without stopping with increment (++)
			time++;
		}

		
		//I want to print numbers from 1 to 50 using loops
		System.out.println("Printing numbers from 1 to 50");
		int num = 1;

		while (num <= 50) {
			System.out.print(num+" ");
			num++;
		}
		//I want to print numbers from 10 to 60 using loops
		System.out.println("Printing numbers from 10 to 60");
		int a=10;
		
		while (a<=61) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("Printing numbers from 100 to 60");
		int b=100;
		
		while (b>=60) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println("Printing only even numbers numbers from 10 to 30");
		int c=10;
		
		while(c<=30) {
			if(c%2==0) {
				System.out.print(c+" ");
			}
			c++;//increment should be beyond if statement, else we will get an infinite loop
		}
		System.out.println("Another way");
		int d=10;
		
		while (d<=30) {
			System.out.print(d+" ");
			d+=2;//adds 2 instead of 1
		}
		System.out.println("End of the code");
		
		//print numbers from 100 to 1 odd numbers only
		int e=99;
		
		while (e>=1) {
			System.out.print(e+" ");
			e-=2;
		}
		
		System.out.println("OR I can use this code");
		
		int f=100;
		
		while (f>=0) {
			if ((f%2)!=0) {
				System.out.print(f+"  ");
			}
			f--;
		}
		
	}

}
