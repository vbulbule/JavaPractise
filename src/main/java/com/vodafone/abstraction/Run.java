package com.vodafone.abstraction;

public class Run {
    public static void main(String[] args) {

        C c1 = new C();
        c1.print();
        c1.test();// compiler will replace var name with class name like C.test();
        C.test();
        B.test();// we can call because in abstract class we cannot create object but the class is loaded
    }
}
