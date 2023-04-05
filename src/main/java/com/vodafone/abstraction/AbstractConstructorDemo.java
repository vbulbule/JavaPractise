package com.vodafone.abstraction;

abstract public class AbstractConstructorDemo {
    int i;
    AbstractConstructorDemo(int i){ // abstract calss willl have constroctor
                                   // even tho if we not create the object of abstract class
        System.out.println("Hello this is constructor from the abstract class");
        this.i=i;
    }
}
