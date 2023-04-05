package com.vodafone.superandthisdemo;

public class Run {

    static{
        // static initializatopn block

    }

    {
        //instance  initializatopn block
    }
    public static void main(String[] args) {

        A a1 = new A(); // this a just single scenario of object creation
        System.out.println(" i :"+a1.i +"   j : "+a1.j);
        a1.disp();
    }
}

//along with .(dot) or ()
//(non static ) or constructor

/*
we can refer any members of the current object using this

we can call current class construotr from another class constructor of the same class using this()

super.membername or we can call super class constructor from sub sub class constructor using super()

super() and this() can be used only in constructors

super. and this. can be used only in instance methods, constructors and IIBs (instance initialization block)

super() and this() cannot be used together



Q : can we overrid staic methods??

NO: because static methods are bound to be the class and non static methods are bounds to be object



 */