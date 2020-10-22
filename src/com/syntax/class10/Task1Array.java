package com.syntax.class10;

public class Task1Array {
public static void main (String[] args) {
	
	System.out.println("----------First Task: First Way----------");
	
	char[] grades=new char[6];
	grades[0]='A';
	grades[1]='B';
	grades[2]='C';
	grades[3]='D';
	grades[4]='E';
	grades[5]='F';
	
	System.out.println(grades[1]);
	
	System.out.println("----------First Task: Second Way----------");
	
	char[] grade= {'A','B','C','D','E','F'};
	
	System.out.println(grade[1]);
	
	System.out.println("-----------Second Task: One Way-----------");
	
	String[] names=new String[7];
	names[0]="Maria";
	names[1]="Alex";
	names[2]="Mike";
	names[3]="Vlada";
	names[4]="John";
	names[5]="Emily";
	names[6]="Hannah";
	
	System.out.println(names[0]);
	
	System.out.println("-----------Second Task: Second Way-----------");
	
	String[] name= {"Maria","Alex","Mike","Vlada","John","Emily","Hannah"};
	
	System.out.println(name[0]);
	
	System.out.println("-----------Third Task-----------");
	
	String[] words= {"Java", "Saturday","day","coding","is"};
	
	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	
} 
}
