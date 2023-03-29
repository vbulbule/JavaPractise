package com.vodafone.accessspecifier;

public class Demo2 {

    int i = 100; // non static var


    // making constructor as private
    // within the class only
    private  Demo2(){

    }

    void print(){
        System.out.println("i :"+i);
    }

    public static void main(String[] args) {

        Demo2 d2 = new Demo2();
        d2.print();
    }

}
