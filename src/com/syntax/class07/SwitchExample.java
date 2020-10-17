package com.syntax.class07;

public class SwitchExample {
public static void main (String[] args) {
	String month="January";
	
	//if month is from December to February->winter
	//March to May->spring
	//June to August->summer
	//September to November->fall
	
	switch(month) {
	case "December":
	case "January":
	case "February":
		System.out.println("Today is winter");
		break;
	case "March":
	case "April":
	case "May":
		System.out.println("Today is spring");
		break;
	}
}
}
