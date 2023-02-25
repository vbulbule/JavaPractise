package oops.block;

public class C {

    static {
        System.out.println("Static block of C class");
    }
    public static void main(String[] args) {
        System.out.println(" -- Executing of main method of C Class --");
        B b1 = new B(); // non premtive type : refrence variable
                                              // instance variable
        System.out.println( " --- End of main method of C Class --");

    }

}
