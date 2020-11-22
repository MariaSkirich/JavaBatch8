package Repl;

public class ThisKeyword148 {
    String dogName;
    static String dogBreed="Mutt";
    double dogWeight;

    ThisKeyword148 (String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
    }
    void print(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
    public static void main (String[] args){
        ThisKeyword148 d1=new ThisKeyword148 ("Tarzan",50.0);
        ThisKeyword148  d2=new ThisKeyword148 ("Lucy",10.0);
        d1.print();
        d2.print();
    }
}
