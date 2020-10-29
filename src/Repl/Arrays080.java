package Repl;

import java.util.Scanner;

public class Arrays080 {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int size;
        size=5;
        int[] array=new int[size];

        for (int i=0; i<size; i++) {
            array[i]=scan.nextInt();
        }

        for (int i=array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }

    }
}
