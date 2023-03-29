package com.vodafone.methodoverriding2;

public class Animal {
    void speak(){
        System.out.println(" Animal Speaking");
    }
    void disp(String name, int age){
        System.out.println("Name :"+name +" "+ "Age :"+age);
    }
    // method overloading
    void disp(int age, String name){

        System.out.println(" Name : "+name +" Age : "+age);
    }
}
