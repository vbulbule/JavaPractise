package com.vodafone.interfacedemo;

public class I implements IDemo11 {

    @Override
    public void test1() {
        System.out.println("test1 implemented in Class I");
    }

    @Override
    public void test2() {
        System.out.println("test2 implemented in Class I");
    } 

    @Override
    public void test3() {
        System.out.println("test3 implemented in Class I");
    }
}
