package oops.classdemo;

public class Employee {
    String name = "Vitthal";
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.name);
        e1.name= "Amruta";
        e1.printName();
        new Employee().printName();
        new Employee().name= "Vinay";
        new Employee().printName();
    }
    void printName(){
        System.out.println(" Your Name :"+name);
    }
}
