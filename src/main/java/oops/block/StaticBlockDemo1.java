package oops.block;

public class StaticBlockDemo1 {

    static int i = 10;// static var it is initiliazed to 10



    // static block
    static {
        i = 100;
        System.out.println(3);
    }

    ///main method
    public static void main(String[] args) {
        System.out.println(i);
    }

    // static block
    static {
        i=200;
        System.out.println(1);
    }

    // static block
    static {
        i=300;
        System.out.println(2);
    }
}
