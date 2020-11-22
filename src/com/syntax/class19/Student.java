package com.syntax.class19;

public class Student {

        String name;
        int age;

        Student(){
        }
        Student( String name1, int age1){
            if (name1.equals("")){
                System.out.println("please enter your name");
            } else{
                System.out.println("Hello "+name1);
            }
            if(age1<0 || age1>100){
                System.out.println("please enter a valid age");
            } else{
                System.out.println(name1+" you're "+age1+" years old.");
            }
        }
        public static void main(String[] args) {
            Student s1= new Student();
            s1.name= "Jon";
            s1.age= 200;
            Student s2=new Student("Maria", 27);
        }
    }

