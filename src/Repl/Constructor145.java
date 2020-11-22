package Repl;

public class Constructor145 {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    Constructor145(){

    }

    Constructor145(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }

    void displayInfo(){
        System.out.println(this.schoolName+" "+this.batch+" "+this.year+" "+this.lastDayOfClass);
    }
    public static void main (String[] args){
        Constructor145 obj=new Constructor145();
        obj.displayInfo();
        Constructor145 obj1=new Constructor145("Syntax", 6, 2020, "07/30/2020");
        obj1.displayInfo();

    }
}
