package com.vodafone.typecasting;

public class Run {
    public static void main(String[] args) {


        /*
        ANimal
        {
         //2 methods
        }
        DOg extends animal
        {
         //4 method including 2 animal class methods

        }
         */

        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();
        d1.wagtail();
        System.out.println("-----------");

        Animal a1 = new Dog(); // upcastiung
                               // to behave dog as Animal with ref of a1
        a1.eat();
        a1.sleep();
        //a1.bark(); // not accessible because a1 type is animal and animal class wont have this method
        //d1.wagtail();// not accessible because a1 type is animal and animal class wont have this method

        // for downcasting first upcast
        Dog d2 = (Dog) a1; // downcast (upcasted a1 object is downcasted)
        d2.eat();
        d2.sleep();
        d2.bark();
        d2.wagtail();

    }
}
