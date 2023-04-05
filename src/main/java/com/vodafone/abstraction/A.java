package com.vodafone.abstraction;

/*
Demo for using different access specifiers
 */
abstract public class A {
    abstract void test(); // default non static abstract method
    abstract public void test1(); // public non static abstract method
    //abstract private void test2(); // private methods are not inherited so there is no question for overring
    abstract protected void test3(); // protected non static abstract method
}
