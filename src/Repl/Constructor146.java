package Repl;

public class Constructor146 {
    String make;
    String model;
    int numberOfDoors=4;
    int topSpeed;
    double price;

    Constructor146(String make, String model, int numberOfDoors, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Constructor146(String make, String model, int topSpeed, double price){
        this.make=make;
        this.model=model;
        numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Constructor146 (int numberOfDoors, int topSpeed, double price){
        make="unknown";
        model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Constructor146(String make, String model, int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        topSpeed=90;
        price=0.0;
    }
    void displayInfo(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        Constructor146 obj=new Constructor146("Toyota", "Prius", 4, 120, 30000.0);
        obj.displayInfo();
        Constructor146 obj1=new Constructor146("Toyota", "Prius", 120, 30000.0);
        obj1.displayInfo();
        Constructor146 obj2=new Constructor146(4, 120, 30000.0);
        obj2.displayInfo();
        Constructor146 obj3=new Constructor146("Toyota", "Prius", 4);
        obj3.displayInfo();
    }

}
