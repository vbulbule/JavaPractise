package oops.constructor;

public class Constructor2 {

    // non - static variable
    int i;
    int j;

    // default constructor
    public Constructor2(){
        i=20;
        j=30;
    }

    // main method
    public static void main(String[] args) {

        Constructor2 c1 = new Constructor2();
        System.out.println(c1.i);
        System.out.println(c1.j);

        Constructor2 c2 = new Constructor2();
        System.out.println(c2.i);
        System.out.println(c2.i);

    }


}
