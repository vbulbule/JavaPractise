package com.vodafone.abstraction;

public class Run2 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2(); // constructor
        d2.disp();
        Demo2.print();
        System.out.println("----------");
        System.out.println(d2.j); // non static variable
        System.out.println(d2.i); //static variable
        System.out.println(Demo2.i);
        Demo2.print(); // calling of static method of an abstract class
        Demo.print(); //calling inherited static method
    }
}
