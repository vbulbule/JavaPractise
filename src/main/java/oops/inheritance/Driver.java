package oops.inheritance;

public class Driver {

    public static void main(String[] args) {

        //accessing the non satic
        System.out.println("--accessing instance (non static)");
        Child ch1 = new Child();
        ch1.print();
        System.out.println(ch1.i);

        System.out.println("-- accessing the static --");

        Child.display();
        System.out.println(Child.j);

        //ch1.k   // compiler will give error for private member cannot access
        System.out.println("-- accessing the static member thorough Object --");

        ch1.display(); // if we try to access the static member using object the compliler will replace the object with Class name
                       // coz any way display() function is belong to static method ie class
        System.out.println(ch1.j);

       // Child.print(); we cannont access the instance members though Class


    }
}
