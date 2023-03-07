package oops.encapsulation;

public class Driver {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.print();


        d1.setI(700);
        d1.print();
        d1.setName("Amruta");
        System.out.println(d1.getName());




    }
}
