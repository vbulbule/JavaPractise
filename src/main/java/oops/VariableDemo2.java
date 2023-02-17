package oops;

public class VariableDemo2 {

    static int i = 10; // static variable

    public static void main(String[] args) {

        /*
        how to access static member
        using ClassName.variable or methodname

        how to access non-static??
        using Object. varuablename or method name

         */
        System.out.println(i);
        System.out.println(VariableDemo2.i);
        VariableDemo2.print();
        VariableDemo2 d1 = new VariableDemo2();
        d1.add(6, 8);



    }


    public static void print(){
        System.out.println("in print");
    }

    public void add(int a, int b){

        System.out.println(a+b);
    }



}
