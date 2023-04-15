package com.vodafone.typecasting;

public class TypeCastDemo {

    public static void main(String[] args) {

        int i =100;
        long l = i; // auto widening
        System.out.println(l);

        byte b;
        b = (byte) l; // explicit narrowing
        System.out.println(b);

        l= 130;
        //byte ranges 120
        b =(byte) l;
        System.out.println(b); //nned to search


        l = 260;
        b = (byte) l;
        System.out.println(b); // need to search

        double d = 12.44;
        int k = (int)d; // explicit narrowing
        System.out.println(k);
        k = (int) 12.67; //  explicit narrowing


        byte b1 = 30, b2 = 40,b3;
       // b3 = b1+b2;
        b3 = (byte) (b1+b2); // addition of two whole no result in int and that has to be casted before assiging it into byte
        System.out.println(b3);


        final byte b4 = 30, b5 = 40, b6;
        b6 = b4 + b5; // when we add two bytes which are final the type remains same after addition as ot cont be chnaged
                      //so direct assign is possible without casting


        char ch = 25; // assignmet chaequivalent value in unicode table
        System.out.println(ch);

        int i1 = 65;
        char ch1 = (char) i1;
        System.out.println(ch1);

        double d1 = 65.67;
        char ch2 = (char) d1;
        System.out.println(ch2);

        //char ch2 = d1; // cannot be done as char expects only char or number

        long l1 = 100; // auto widening
        double dd = 100; // auto widening

        int  ii = (int) 100.00; // explicit narrowing

        //float f = 13.56;
        float f = (float) 15.78; // explicit narrowing



        long l2 = (long) (byte) (float)( long) (int) (short) f;
        //int i1 = (double) (byte) (int)f; invaid
        int i2 = (byte) (short) (int) (long) d; // autowidening









    }
}
