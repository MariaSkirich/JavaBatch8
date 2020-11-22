package com.syntax.class24;

public class VarArgs {
    void print(int ...array){

        for(int numberInArray:array){
            System.out.println(array);
        }

    }

    public static void main(String[] args) {
        VarArgs obj=new VarArgs();
        obj.print(1);
        obj.print(1,2);
        obj.print(5,60,54);
    }
}
