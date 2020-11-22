package com.syntax.class21;

public class MathTeacher extends Teacher{
    int numberOfMathSubject;
    int experienceInAlgebra;
    int experienceInCalculus;
    int experienceInProbability;

    MathTeacher(int numberOfMathSubject, int experienceInAlgebra, int experienceInCalculus, int experienceInProbability){
        this.numberOfMathSubject=numberOfMathSubject;
        this.experienceInAlgebra=experienceInAlgebra;
        this.experienceInCalculus=experienceInCalculus;
        this.experienceInProbability=experienceInProbability;
    }

    public void printM(){
        System.out.println("Math teacher teaches "+numberOfMathSubject+" subjects");
        System.out.println("Math teacher has "+experienceInAlgebra+" years in teaching Algebra");
        System.out.println("Math teacher has "+experienceInCalculus+" years in teaching Calculus");
        System.out.println("Math teacher has "+experienceInProbability+" years in teaching Probability");
    }


}
