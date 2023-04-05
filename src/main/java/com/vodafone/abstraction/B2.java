package com.vodafone.abstraction;

public class B2 extends A {
      void test() {
        System.out.println("test() of implemented in class B2");
    }

    public void test1() {
        System.out.println("test1() of implemented in class B2");
    }

    private void test2(){ // this private non static method is belong to B2 class and its not inherited from A
        System.out.println("test2() of implemented in class B2");
    }

    protected void test3() {
        System.out.println("test3() of implemented in class B2");
    }

}
