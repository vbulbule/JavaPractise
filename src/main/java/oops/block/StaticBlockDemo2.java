package oops.block;

public class StaticBlockDemo2 {
    static int i = 10;
    static {
        System.out.println(i);
        print();
        i=5555;
    }
    public static void main(String[] args) {

        System.out.println(StaticBlockDemo2.i);

    }
    static {
        i=6000;
    }

    static void print(){
        System.out.println("Hello");
    }

}


