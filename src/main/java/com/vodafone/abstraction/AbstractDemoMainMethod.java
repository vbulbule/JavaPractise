package com.vodafone.abstraction;

abstract public class AbstractDemoMainMethod {

    static int i = 55;
    static void print(){
         System.out.println("i : "+i);
     }

     abstract void display();

    public static void main(String[] args) { // we can have main method in abstract class

        AbstractDemoMainMethod.print();
    }

}
