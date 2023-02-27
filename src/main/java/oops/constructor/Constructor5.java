package oops.constructor;

public class Constructor5 {

    int i;

    public Constructor5(int a){
        i=a;
    }

    /*
    defafault constructor
    why do we need to decalre the default constructor

    --when we specify our own constructor then JVM will not be create the default constructor so if u require to use the
    deafult constructor then u must specify default explicitely along with your paratemerized constructor

     */
    public Constructor5(){

        i= 123;
    }

    public static void main(String[] args) {
        Constructor5 c1 = new Constructor5(100);
        System.out.println(c1.i);

        Constructor5 c2 = new Constructor5();
        System.out.println(c2.i);

        c2.i=567;
        System.out.println(c2.i);
    }


}
