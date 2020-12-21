package com.syntax.class30;

public class WrapperClasses {
    public static void main(String[] args) {
        //we have 8 primitive data types and every type has a wrapper class
        byte byteNumber=100;//between -127 and 128
        short shortNumber=1000; //upper limit 32676
        int number=10;//up to 2 billion
        long longNumbers=102022222424545l;
        float floatNumbers=1524.25f;
        double numberWDecimals=2.25;
        char characters='A';
        boolean isFlags=true;


        String stringNumber="10";
        int convertedNumber=Integer.parseInt(stringNumber);
        System.out.println(convertedNumber*2);

        Byte nonPrimitiveByteNumber=100;//between -127 and 128
        Short nonPrimitiveshortNumber=1000; //upper limit 32676
        Integer nonPrimitiveNumber=10;//up to 2 billion
        Long nonPrimitiveLongNumbers = 102022222424545l;
        Float nonPrimitiveFloatNumbers=1524.25f;
        Double nonPrimitiveNumberWDecimals=2.25;
        Character nonPrimitiveCharacters='A';
        Boolean nonPrimitiveIsFlags=true;

        int primitiveInt=10;
        Integer nonPrimitiveInteger=primitiveInt;
        System.out.println(nonPrimitiveInteger.doubleValue());
    }




}
