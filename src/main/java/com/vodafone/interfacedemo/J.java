package com.vodafone.interfacedemo;

public class J implements IDemo14, IDemo15 {


    @Override
    public void test1() {

        // interfaceName.super.methodname
        IDemo14.super.test1();
    }

    public void print(){
        IDemo15.super.test1();


    }


    public static void main(String[] args) {

        J j1 = new J();
        j1.test1();
        j1.print();

    }
}

