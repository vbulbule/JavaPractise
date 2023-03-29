package com.vodafone.methodoverriding3;

public class MyMasalaDosa extends MummyMasalaDosa {

    void createMasalaDosa(){ // method overriding

        super.createMasalaDosa(); // super : parent class
        System.out.println(" ill put 2 3 spoons of ghee over dosa");
        System.out.println(" put chuteny in cup");
        System.out.println(" ill add cheez over dosa and make it as cheez dosa");
    }

    void creatIdly(){ // method overriding
        System.out.println("Prepare Masala Idly");
    }

    void mixedIdly(){
        super.creatIdly();
        System.out.println(" put this on left side half of the plate");
        this.creatIdly();
        System.out.println(" put this on right side half of the plate");
    }

}
