package com.vodafone.abstraction;

abstract public class B {

    abstract void print(); // no body because method is abstract

    abstract void disp();// no body because method is abstract

    //abstract static void test(); // we cannot have abstract and static

    static void test(){ // we can have static method and conrete
        System.out.println("this is Test() method class B");
    }

}
