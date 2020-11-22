package com.syntax.class23;

public class Task3 {
    private void print(){
        System.out.println("I am a private method. I have no parameters");
    }
    private void print(int a){
        System.out.println("I am a private method. My parameter is "+a);
    }
    private void print(String a){
        System.out.println("I am a private method. My parameter is "+a);
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        obj.print();
        obj.print(5);
        obj.print("Maria");
    }
}
