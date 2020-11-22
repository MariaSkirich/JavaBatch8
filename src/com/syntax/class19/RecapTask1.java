package com.syntax.class19;

public class RecapTask1 {

    double sumArray(double[] array) {
        double sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        return sum;
    }
}
