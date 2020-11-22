package com.syntax.class22;

public class UserInfo extends UserClass {
    String adress;

    UserInfo(String name, String mobileNumber, String adress) {
        super(name, mobileNumber);
        this.adress=adress;
    }

    void userDetails(){
        System.out.println("User name is "+super.name+" has a phone number "+super.mobileNumber+" and lives in "+this.adress);
    }

    public static void main(String[] args) {
        UserInfo obj=new UserInfo("Maria", "1001246", "Dnipro, Ukraine");
        obj.userDetails();
    }
}
