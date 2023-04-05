package com.vodafone.interfacedemo;

public class A implements Idemo1 {

    @Override
    public void test1() {
        System.out.println("test1 imp in class A");
    }

    @Override
    public void test2() {
        System.out.println("test2 imp in class A");
    }

    public void disp(){
        test1();
    }
}
