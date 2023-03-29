package com.vodafone.protecteddemo2;

import com.vodafone.protecteddemo.Amruta;

public class Run3 extends Amruta {
    public static void main(String[] args) {

        Run3 r3 = new Run3();
        r3.print();
        r3.i = 500;
        r3.print();
    }
}


// we can acess the protected members outside of the package through inheritance