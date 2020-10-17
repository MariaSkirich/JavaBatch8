package com.syntax.class07;

public class Recap {
public static void main (String[] args) {

	String timeOfDay="Noon";
	String day="Saturday";
	String message=null;
	String message2=null;
	
	switch (timeOfDay) {
	case "Morning":
		message="Good Morning";
		if (day.equals("Saturday")) {
			message2=" Class!";
		} else if (day.equals("Monday")) {
			message2="Colleagues!";
		}
		break;
	case "Noon":
		message="Good afternoon!";
		break;
	case "Evening":
		message="Good evening!";
		break;
		default:
			message="N/A";
	}
	System.out.println(message);
	
}
}
