package com.vodafone.interfacedemo;

public class Run3 {
    public static void main(String[] args) {
        E e1 = new E();
        e1.test1();
        e1.test2();
        System.out.println("----------");

        D d1 = new D();
        d1.test1();
        //d1.test2() // test2 method is not inheriated it is present in
                   // Idemo4 interface and D is implementing only Idemo3
    }
}
