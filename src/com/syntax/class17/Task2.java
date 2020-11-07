package com.syntax.class17;

public class Task2 {
    boolean isPrime(int num1) {
        boolean isPrime=true;
        for (int i=2; i<num1/2; i++){
            if(num1%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
