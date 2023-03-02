package oops.inheritance;

public class DriverForC_D_E {
    public static void main(String[] args) {
        /*
        Class C extends Class D
        Class D extends Class E
         */
        C c1 = new C(100, 200);
        c1.print();
        System.out.println("---------");
        D d1 = new D(344,678);
        d1.display();
        d1.print();
        System.out.println("------------------");
        E e1 = new E();
        e1.display();
        e1.print();
        System.out.println("------------");
        E e2 = new E(500,600);
        e2.display();
        e2.print();
        e2.print2();

    }

    /*
    create a Student class
    which is taking Student name, student email and student ID
    and u have to print the
    student details
     */

}
