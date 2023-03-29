package com.vodafone.constructoraccessdemo;

public class D { // public

    // the default constructor which compiler creates it is also public
    public D(){
        System.out.println("running constructor");
    }

    public int i = 100;

    public void print(){
        System.out.println(" i :"+i);
    }


}
