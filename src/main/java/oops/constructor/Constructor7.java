package oops.constructor;

public class Constructor7 {

    int i,j;
    long l;
    String a,b;


    //constructor overloading
    public Constructor7(int u, int v){
      i=u;j=v;
    }
    public Constructor7(int x, long y){
        i=x;
        l=y;
    }
    public Constructor7(int y, String x ){
        i=y;
        a=x;
    }

    public Constructor7(String x, int y ){
        i=y;
        a=x;
    }

    public static void main(String[] args) {

        Constructor7 c1 = new Constructor7("Vitthal",100);
        System.out.println(c1.i);
        System.out.println(c1.j);
        System.out.println(c1.l);
        System.out.println(c1.a);
        System.out.println(c1.b);



    }
}
