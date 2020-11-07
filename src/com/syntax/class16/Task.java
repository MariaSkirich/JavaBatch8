package com.syntax.class16;

public class Task {

    public static void largerstNum(int num1, int num2){

            if(num1<num2){
                System.out.println(num2);
            }else if (num2<num1){
                System.out.println(num1);
            } else {
                System.out.println(num1+" and "+num2+" are equal");
            }

    }
    public static void oddOrEven(int num1){
        if (num1%2==0){
            System.out.println(num1+" is an even number");
        } else {
            System.out.println(num1+" is an odd number");
        }
    }
    public static void palindromeString(String string){
        int i=0;
        int j=string.length()-1;

        while (i<j){
            if(string.charAt(i)!=string.charAt(j)){
                System.out.println("String is not a palindrome");
                return;
            }
            i++;
            j--;
            }
        System.out.println("String is a palindrome");
    }
    public static void language(String country){
        String message;
        switch (country){
            case "Ukraine":
                message="Привiт";
                break;
            case "Russia":
                message="Привет";
                break;
            case "USA":
                message="Hello";
                break;
            case "Germany":
                message="Hallo";
                break;
            case "France":
                message="Bonjour";
                break;
            case "Spain":
                message="Hola!";
                break;
            default:
                message="Sorry, I don't speak local language";
        }
        System.out.println(message);
    }
}
