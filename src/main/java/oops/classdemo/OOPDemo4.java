package oops.classdemo;

public class OOPDemo4 {
    static int i = 10; // static variable
    public static void main(String[] args) {

        System.out.println("i : "+ i);

        i = 20; // i is already decaled on line no 6  and initilizing with new vale i.e 20

        System.out.println("i : "+ i);

        i = 30; // i nintiliazing with new value with 30
        System.out.println("i : "+ i);

        int i = 300; // delclaring and initializing a local variable with athe same name of class declared varialble (static variable) i

        System.out.println("i : "+ i);

        i = 400;

        System.out.println("i : "+ i);

        System.out.println("OOPDemo4 i : "+ OOPDemo4.i);

        OOPDemo4.i = 68;
        System.out.println("OOPDemo4 i : "+ OOPDemo4.i);
    }

}
