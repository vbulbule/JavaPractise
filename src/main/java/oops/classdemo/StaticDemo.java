package oops.classdemo;

public class StaticDemo
{
    static int i = 10;
    static
    {
        System.out.println(i);
        print();
        i =5555;
    }

    public static void main(String[] args) {
        System.out.println(StaticDemo.i);

    }

    //block
    static // static block
    {
        i=6666;
    }

    static void print(){
        System.out.println("Hello");
    }
}
