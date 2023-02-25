package oops.block;

public class B {
    static {
        System.out.println("Static block of B class");
    }
    {
        System.out.println(" Non static block of B class");
    }
}
