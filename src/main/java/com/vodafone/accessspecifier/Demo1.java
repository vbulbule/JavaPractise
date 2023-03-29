package com.vodafone.accessspecifier;

public class Demo1 {

    private int i =10; // non static private member
                       // access within the class only
    void print(){
        System.out.println(" i :"+i);
    }
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.print();
    }
}
