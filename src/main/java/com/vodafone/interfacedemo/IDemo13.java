package com.vodafone.interfacedemo;

public interface IDemo13 {

    void test1();
    void test2();

    default void print() {

        System.out.println("Hiya Huya");

    }

}
