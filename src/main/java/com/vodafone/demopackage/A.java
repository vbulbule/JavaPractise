package com.vodafone.demopackage;

public class A {
    void print(){
        System.out.println("print method called");
    }

    private void disp(){ // private non static this method cannot be inherited
        System.out.println(" disp method called");
    }

    public void paint(){ // public method
        System.out.println("paint method called");
    }

}
