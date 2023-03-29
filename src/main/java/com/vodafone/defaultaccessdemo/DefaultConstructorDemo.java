package com.vodafone.defaultaccessdemo;

public class DefaultConstructorDemo { // class is public

    DefaultConstructorDemo(){  // constructor is default access specifier

        System.out.println("COnstructor running");
    }

    public static int i=100;

}

// you can access the class in another package with static members (which is public) but u cannot create the object of class in another package
// as constroctor is default access specifier
