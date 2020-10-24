package com.syntax.class10;

import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Get the Locale that has been set on our Scanner
		Locale locale = scan.locale();
		// Display useful locale information
		System.out.println("Locale:"+locale);
		System.out.println("Display country:"+locale.getDisplayCountry());
		System.out.println("Diplay name:"+locale.getDisplayName());
		// closing the Scanner object
		scan.close();

	}

}
