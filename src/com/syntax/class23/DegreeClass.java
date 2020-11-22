package com.syntax.class23;

class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree {

}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Master's degree you need Bachelor's degree");
    }
}
public class DegreeClass {
    public static void main(String[] args) {
        Bachelors obj1=new Bachelors();
        obj1.getPrerequisite();
        Masters obj2=new Masters();
        obj2.getPrerequisite();
    }
}
