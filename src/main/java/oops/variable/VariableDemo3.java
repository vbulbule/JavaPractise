package oops.variable;

public class VariableDemo3 {

    public static int i =10;
    public int b=40;
    public static void main(String[] args) {
        System.out.println(i);
        i= 20;
        i = 30;
        System.out.println(i);

        //block
        {

            int j = 100;
            System.out.println(i);
            System.out.println(VariableDemo3.i);
            System.out.println(j);

        }




    }
}
