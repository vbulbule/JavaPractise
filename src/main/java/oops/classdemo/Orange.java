package oops.classdemo;

public class Orange {

    int i = 100; // non static variable

    //main method
    public static void main(String[] args) {

        //int i = 100;
        Orange o1 = new Orange();
        o1.print();

        o1.i =  300;
        o1.print();



        Orange o2 = new Orange();
        o2.print();


        new Orange().print(); //

       // new Orange().i = 200;
        Orange o5 = new Orange();
        o5.i=200;
        o5.print();



        new Orange().print();




    }

    //non static method
    public void print(){
        System.out.println(" i : "+i );
    }
}
