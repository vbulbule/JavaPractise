package com.vodafone.methodoverriding2;

public class Dog extends Mammal{

    void speak(){ // method overriding
        System.out.println("Dog Barking.... bhoaw.. bhaow.. bhaow..");
    }

    void disp(){ // method overloading

        System.out.println(" Scobby dooby bow bow");
    }
}
