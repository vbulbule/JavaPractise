package oops;

public class Mango {

    // body
    // variables
    //types :
    //class variables (static varialles)
       //- these variables are belong to class
    //non static or instance variables
       //-belong to instance

    // how to declare
        //1. class variable
    //we must use the static key word
    //ex :
    static int i;
    static String value;
    static boolean bln;

    // non static or Instance variable

    int number1;
    int number2;
    String name;
    boolean flag;


    // methods

    public static void main(String[] args) {
        System.out.println("you are in main method of mango class");
        //System.out.println(value);

       Mango m1 = new Mango();
       Mango m2 = new Mango();
       Mango m3 = new Mango();
       Mango m4 = new Mango();


        m1.number1=2;
        m1.number2=4;
        System.out.println(m1.addition(m1.number1, m1.number2));

        System.out.println(m2.addition(6,8));

        System.out.println(Mango.multiply(7,8));

       //using class name
        //System.out.println(Mango.bln);
    }

    //non-static ma
    public int addition (int a, int b){

        return a+b;

    }

    //static method

    public static int multiply(int a, int b){

        return a*b;
    }

}
