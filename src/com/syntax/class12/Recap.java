package com.syntax.class12;

public class Recap {
    public static void main(String[] args) {
//printing numbers in reverse order
        int[] num = {10, 33, 89, 0};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        //we can't loop backward using enhanced for loop
    }
}
