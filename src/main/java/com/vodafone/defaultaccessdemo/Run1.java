package com.vodafone.defaultaccessdemo;

import com.vodafone.packagedemo.A;

class Run1 {


    public static void main(String[] args) {

        C c1 = new C();
        c1.print();

        A a1 = new A();
        //a1.i=00; cannot access i because access specifier is default so we can access i within package only
    }
}
