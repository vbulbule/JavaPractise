package oops.classdemo;

public class OOPDemo3 {

    static String Name = "Vitthal";  //  static variable/ class variable

    String girlName = "Amruta "; // non - static / instance variable/ object variables

    public static void main(String[] args) {
        int i =10; // variables declared within method or block called local variables

        // block
        {
            int j =20; // local variables

        }

    }

    void printName(String name) // non static method
    {
        System.out.println(name);
    }

}
