package oops.variable;

public class VariableDemo5 {

    int i, j; // non static premtive variable
    String s; // non static non premtive
    Apple a; // nonstatic variable of type Apple non satic non premtibve



    static int x,y; // static  (premtive type)
    static String s1; // static (static nonpremtive)
    static Apple a1 ;// static variable of APple (static nonpremtive)

    /*
    Java is what ?
    Java is Object oriented programing language

    Q? is the java Purely Object oriented programing language?
   no :
   why ??
   if there is a lanaguage which is purely object oriented then it should supports class only
   but in java premtive data types are supported thats whya we can say that java is not purely objet oriented programming language
     */

    // best way or to organized way to initilaze the declared satic variables
    // we can use static block
    static {
        x=300;
        y=400;
        s1="Vitthal";
        a1 = new Apple();
    }

    // non static block blocks
    {
        i = 69;
        j = 38;
        s = "Amruta";
        a = new Apple();
    }
    public static void main(String[] args) {

        VariableDemo5 d1 = new VariableDemo5();
        System.out.println(d1.i);
        System.out.println(d1.s);

        System.out.println("-----------");
        VariableDemo5 d2 = new VariableDemo5();

        System.out.println(d2.i);
        System.out.println(d2.s);

    }

    // constructor term is introduced

}
