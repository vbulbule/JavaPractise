package com.vodafone.finalkeyworddemo;

public class Run1 {

   final static double PI = 3.14;

   final static Car c1  = new Car();

    public static void main(String[] args) {

        System.out.println(Run1.PI);
        System.out.println(Run1.c1);

       // PI = 234;//Cannot assign a value to final variable 'PI'
        Car c2 = new Car();

       // c1 = c2; //Cannot assign a value to final variable 'c1'

        print(100,c2);
    }



    static void print(final int i, Car c1){

        //i = 100;//Cannot assign a value to final variable 'i'
        c1 = new Car();
        //c1.NO_OF_WHEELS =8;//Cannot assign a value to final variable 'NO_OF_WHEELS'
    }

}
