package com.vodafone.methodoverloading;

public class DemoMethodOverloading {
    void print(){
        System.out.println("Print method with no parameterts");
    }

    void print (int i){
        System.out.println("Print method with one argument");
    }

   /* boolean print(){
        System.out.println("Print method with no parameterts");
        return true;
    }*/
    //print()' is already defined in 'com.vodafone.methodoverloading.DemoMethodOverloading'

    // you cannot have more than one mwthod with same name with nor arg/ same signature or in same sequence
    // in other way two methods with same name cannot be different just by retun typpe

    public String print(int i , int j){
        System.out.println("Print method with two argument");
        return "Vitthal";
    }
    public String print(long i , long j){
        System.out.println("Print method with two argument");
        return "Amruta";
    }
    public String print(String s , int  i){
        System.out.println("Print method with two argument");
        return "Vits";
    }

    public String print(int  i, String s ){
        System.out.println("Print method with two argument");
        return "Ams";
    }

    public static void main(String[] args) {
        DemoMethodOverloading d1 = new DemoMethodOverloading();
        d1.print();
        d1.print(56);
        String res = d1.print(23, 35);
        System.out.println(res);

        String res1 = d1.print(456L, 467L);
        System.out.println(res1);

        String res2 = d1.print("man", 17);
        System.out.println(res2);

        String res3 = d1.print(78, "AMbeDHole");
        System.out.println(res3);
    }

    public static void main(int i){
        System.out.println(" main method with one arg");
    }


    public static void main(int i, String s){
        System.out.println(" main method with two arg");
    }


    public static void main(int i, String s, long l){
        System.out.println(" main method with three arg");
    }


    /*
    Q . can we over load the main method
    ANs : yes
    we can over lod the main method and it will succcesfully compile as well
    but it will be execute only main method which has syntax is
    public static void main(String[] args)

     */



}
