package com.vodafone.protecteddemo2;
import com.vodafone.protecteddemo.Amruta;


public class Run2 {
    public static void main(String[] args) {

        Amruta a1 = new Amruta();
        a1.j = 100; // j is public so i can be accessed any where
        //a1.i = 200; // i cannot be accessd becauese 'i' has protected access in 'com.vodafone.protecteddemo.Amruta'
       // a1.print(); // print cannot be accessed because 'print()' has protected access in 'com.vodafone.protecteddemo.Amruta'
    }
}


// if you wan t to access the protected members to out side of package u can access it by using inheritance