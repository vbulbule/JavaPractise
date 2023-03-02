package oops.inheritance;

public class Parent {
    int i=100; // nonstatic
    static int j = 200;// static
    private int k = 300; // private nonstatic

    //nonstatic method
    public void print(){
        System.out.println(" i = "+ i);
    }

    //static method
    static void display(){
        System.out.println(" j = "+ j);
    }
}
