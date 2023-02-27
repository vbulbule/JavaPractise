package oops.constructor;
public class Constructor6 {
    // non static variables
    int i;
    long l;
    byte b;
    public Constructor6(int a){
        i = a;
    }
    public Constructor6(){
        i = 123;
    }
    public Constructor6(long b){
        l = b;
    }
    public Constructor6(byte c){
        b = c;
    }
    public static void main(String[] args) {
        Constructor6 c1 = new Constructor6();
        System.out.println(c1.i);
        System.out.println(c1.l);
        System.out.println(c1.b);
        System.out.println("----------------------");
        Constructor6 c2 = new Constructor6(100);
        System.out.println(c2.i);
        System.out.println(c2.l);
        System.out.println(c2.b);
        System.out.println("----------------------");
        Constructor6 c3 = new Constructor6(200L);
        System.out.println(c3.i);
        System.out.println(c3.l);
        System.out.println(c3.b);
        System.out.println("----------------------");
        Constructor6 c4 = new Constructor6((byte)100);
        System.out.println(c4.i);
        System.out.println(c4.l);
        System.out.println(c4.b);
        System.out.println("----------------------");

    }



}
