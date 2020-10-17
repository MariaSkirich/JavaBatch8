package com.syntax.class07;

public class TaskBoolean {
public static void main (String[] args) {
	boolean workDay;
	int day;
	
	workDay=true;
	day=6;
	
	while (workDay) {
		if (day<6) {
			System.out.println("I need a day off");
		} else if (day==6){
			System.out.println("I don't need a day off");
		}
		workDay=false;
		
	}
}
}
