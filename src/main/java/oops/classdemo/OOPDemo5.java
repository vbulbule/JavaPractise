package oops.classdemo;

public class OOPDemo5 {
    // using of static variables and methods
    static int i =40; // static varibales

    public static void main(String[] args) {
        System.out.println(i); // directly access is possible whn there is no local variable present with same name as static variable
        System.out.println(OOPDemo5.i);// we can also access static variable by using the class name
        printName("Amruta"); // direct access of static method
        OOPDemo5.printName("Vitthal");// with class name
    }
    // static method
    static void printName(String name){
        System.out.println(name);
        System.out.println("I : " + i);
    }


}
