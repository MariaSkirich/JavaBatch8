package com.syntax.class23;

public class CreditCard {
    double balance;
    double interest;
    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    double getInterest(){
        return balance * interest;
    }
    public static void print(){
        System.out.println("I am a static method");
    }
}
class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
    double getInterest(){
        return balance * interest*2;
    }
    public static void print(){
        System.out.println("I am an overriden method in child class");
    }
}
class AmericanExpress extends CreditCard{
    public AmericanExpress(double balance, double interest) {
        super(balance, interest);
    }
    double getInterest(){
        return balance * interest*3;
    }

}
class CreditCardTester {
    public static void main(String[] args) {
        Visa visa = new Visa(1000,0.29);
        Visa.print();
        System.out.println(visa.getInterest());
        AmericanExpress americanExpress = new AmericanExpress(1000, 0.24);
        System.out.println(americanExpress.getInterest());
    }
}
