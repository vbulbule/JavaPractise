package com.vodafone.methodoverriding3;

public class Run {
    public static void main(String[] args) {

        MyMasalaDosa m1 = new MyMasalaDosa();

        m1.createMasalaDosa();
        System.out.println("------------------------------------------");
        m1.creatIdly();
        System.out.println("------------------------------------------");
        m1.mixedIdly();
        System.out.println("------------------------------------------");

    }
}
