package com.vodafone.interfacedemo;

public class F implements IDemo5,IDemo6{

    @Override
    public void test1() {
        System.out.println("test1 implemented in class f");
    }

    @Override
    public void test2() {
        System.out.println("test2 implemented in class f");
    }
}
