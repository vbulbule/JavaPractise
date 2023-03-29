package com.vodafone.accessspecifier;
import com.vodafone.packagedemo.*;



//import java.lang.String;//valid
//import java.lang.*; // valid
//import java.lang; // invalid
public class Driver {



    public static void main(String[] args) {
        /*Demo1 d1 = new Demo1();
        d1.print();
        d1.i*/

      //  Demo2 d2 = new Demo2();
        // as constructor is private so we cannot create the object of demo2 outside

        DemoPackage d1 = new DemoPackage();

    }
}
