package oops.inheritance;

public class D extends C {

    int a,b;

    // user defied constructor
    D(int a, int b){
        super(a,b); // need to call the constructor of class C explicitely
                    // because Class c having the user defined constructor
                    //so JVM will not create its default constructor
        this.a = a;
        this.b = b;
    }

    //non static method
    void display(){
        System.out.println(" a : "+a);
        System.out.println(" b : "+b);
    }

}
