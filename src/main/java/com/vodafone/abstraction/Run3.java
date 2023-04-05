package com.vodafone.abstraction;

public class Run3 {

    public static void main(String[] args) {

        //AbstractConstructorDemo d1 = new AbstractConstructorDemo(); // 'AbstractConstructorDemo' is abstract; cannot be instantiated

        ConstructorDemo2 d2 = new ConstructorDemo2();
        System.out.println(d2.i);
    }

}
