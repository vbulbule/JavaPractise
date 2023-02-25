package oops.constructor;

public class Driver {
    static
    {
        System.out.println(" Static block  of CLass Driver ");
    }
    {
        System.out.println("non Static block  of CLass Driver ");
    }
    public static void main(String[] args) {

        System.out.println(" main starts");

        Constructor3 a3 = new Constructor3();

        System.out.println("main ends");
    }


}

