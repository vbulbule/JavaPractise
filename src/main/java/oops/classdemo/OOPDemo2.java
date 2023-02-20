package oops.classdemo;

public class OOPDemo2 {

    static int i; // static variable
    int j; // non static variable


    public static void main(String[] args) {

        OOPDemo2 o1 = new OOPDemo2();
        OOPDemo2 o2 = new OOPDemo2();

    }


    // want to create a static method for addition

    static void addition(int a , int b){

        System.out.println( " addition :" + a+b);

    }


    // wanto create on non-static mmethod for multiply

    void multiply(int a , int b){

        System.out.println("Multipliation :"+a*b);
    }






}
