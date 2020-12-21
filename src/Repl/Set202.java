package Repl;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set202 {
    public static void main(String[] args){
            Set<Student> students=new LinkedHashSet<>();
            students.add(new Student("Samir", "Jawaid", 101));
            students.add(new Student("Asel", "Umurzakova", 102));
            students.add(new Student("Diego", "Juarez",103));
            students.add(new Student("Sohil", "Aryan", 104));
            students.add(new Student("Alijon", "Nazarov", 105));

        for (Student student:students){
            student.displayInfo();
        }


    }

    }
    class Student{
        int studentId;
        String name;
        String lastName;
        Student(String name, String lastName, int studentId){
            this.studentId=studentId;
            this.name=name;
            this.lastName=lastName;
        }
        public void displayInfo(){
            System.out.println("Student details: "+name+" "+lastName+" "+"with id: "+studentId);
        }
    }

