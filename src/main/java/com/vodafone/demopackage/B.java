package com.vodafone.demopackage;

public class B extends A{

    void print(){ // overriden method
        System.out.println(" print overriden method");
    }

    private void disp(){ // we are not overrid since it is not
                      // inherited this method is belong to this class only

    }

    /*void paint(){ // will not work cannot change to smaller access specifier
        System.out.println(" paint method called");
    }*/



}
