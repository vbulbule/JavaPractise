package com.vodafone.superandthisdemo;

public class A extends O{

    int i,j;

    A(){
        this(144, 555); // current class construtor
    }
    // constructor overloading
    private A(int i, int j){

        super(); // super statement is refers to your parent class and super() is refers to your parent class constructor
        this.i=i;
        this.j=j;
    }

    void print(){
        System.out.println("print() method");
    }

    void disp(){
       this.print();
    }



}
