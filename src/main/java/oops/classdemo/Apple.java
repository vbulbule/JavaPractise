package oops.classdemo;

public class Apple {

    int i = 100; // non static variable

    public static void main(String[] args) {


        Apple a1 = new Apple(); // created an apple object and a1 is refferering to Apple
        a1.print(); // calling of non static print() method using Object o1
        a1.i= 400; // a1 object i value is assighed to 400
        a1.print();

        new Apple().print();//new object is creted and print is called
        new Apple().print();
        new Apple().i=6700;// new object is created and I ise set to 6700
        new Apple().print();// new object is created and print is called

    }

    void print(){ // non - satic method`

        System.out.println( " I : " + i );

    }


}
