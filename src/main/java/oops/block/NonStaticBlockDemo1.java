package oops.block;

public class NonStaticBlockDemo1 {
    int i,j; // declaration of non static variables
    public static void main(String[] args) {
        // i must carete an object to access the non static variables
        NonStaticBlockDemo1 d1 = new NonStaticBlockDemo1();
        System.out.println(d1.i);
        System.out.println(d1.j);
       /* System.out.println("-----------------------------");
        NonStaticBlockDemo1 d2 = new NonStaticBlockDemo1();
        System.out.println(d2.i);
        System.out.println(d2.j);
        System.out.println("-----------------------------");
        System.out.println(new NonStaticBlockDemo1());
        System.out.println("-----------------------------");
        d2.i = 123;
        d2.j= 456;
        System.out.println(d1.i);
        System.out.println(d1.j);
        System.out.println(d2.i);
        System.out.println(d2.j);*/
    }
    // non staic block - 1
    {
        System.out.println("Vitthal");
        i = 20;
        j=30;
    }
    // non stati c block - 2
    {
        System.out.println("Amruta");
        i = 200;
        j =300;
        // inner non static block - 3
        {
            i= 222;
            j=333;
        }
    }
}


