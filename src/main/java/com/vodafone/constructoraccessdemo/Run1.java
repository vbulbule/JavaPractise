package com.vodafone.constructoraccessdemo;

import com.vodafone.defaultaccessdemo.DefaultConstructorDemo;

public class Run1 {

    public static void main(String[] args) {

        System.out.println(DefaultConstructorDemo.i); // we dont need to create object for static members
        // because static mambers are loaded when class is cretaed
        // static members can beaccess through class name ; like DefaultConstructorDemo.i as var i is static

        //DefaultConstructorDemo d1 = new DefaultConstructorDemo(); // it will thorow the compile time error
        // we cannot create an object of DefaultConstructorDemo class as access of the DefaultConstructorDemo class is default
    }
}
