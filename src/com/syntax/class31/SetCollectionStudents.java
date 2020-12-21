package com.syntax.class31;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionStudents {
    public static void main(String[] args) {
        Set<Students> students=new HashSet<>();
        students.add(new Students("Maria", 485));
        students.add(new Students("Mike", 789));
        students.add(new Students("Veronika", 698));

        for(Students element:students){
            System.out.println(element.name);
        }

    }
}
class Students{
    String name;
    int studentID;
    Students(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }
}
