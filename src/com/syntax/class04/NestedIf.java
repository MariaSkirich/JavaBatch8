package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {
		/*
		 * a variable for allergy - yes or no if allergy is yes --> we will check if pet
		 * allergy peanut allergy pollen allergy if no allergy --> we will say
		 * "You're lucky"
		 */

		boolean allergy = false;

		boolean peanutAllery = false;
		boolean petAllergy = true;
		boolean pollenAllergy = false;

		if (allergy) {// only if it's true
			System.out.println("Let's do further check");
			if (petAllergy) {
				System.out.println("Please, no cats or dogs in the house");
			} else {
				System.out.println("That's good! You don't have a pet allergy");
			}

		} else {
			System.out.println("You're lucky");

		}
		
		System.out.println("----------Example Two------------------");
		/* if today is Friday - we will watch a movie but we need to check the date
		 * if date is 13th - we will watch a scary movie 
		 * if date is not 13th - we will watch a comedy 
		 * if it's not Friday - we are not watching any movies, I'm studying 
		 */
		
		boolean isFriday=true;
		int date=13;
		boolean isMonday=true;
		
		if (isFriday) {// left part of condition is true, right part of condition is false
			
			if (date==13) {
				System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I will watch a PK movie with Amir Khan");
			}
			
		} else {
			if (isMonday) {
				System.out.println("I'm not studying, I'm working");
			} else {
				System.out.println("I have a class at Syntax");
			}
		}
		
		System.out.println("-------------Example Three--------------");
		/*
		 * check if the assignment is completed
		 * if it is completed, it is necessary to check the score
		 * if score>90 - you did a great job
		 * if score>80 - you did a good job 
		 * if score>70 - please study more 
		 */
		int score=62;
		boolean assignment=true;
		
		if (assignment) {
			if (score>90) {
				System.out.println("You did a great job");
			} else if (score>80) {
				System.out.println("You did a good job");
			} else if (score>70) {
				System.out.println("Probably, you need to study more");
			} else {
				System.out.println("Good job for trying but you must study more");
			}
		}else { 
			System.out.println("You should always complete all assignments");
			
		}
		
	}
}
