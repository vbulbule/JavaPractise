package sessions;

class Apple{


}

public class Demo3 {
    

    //identifier or variables
    static int i;
    static boolean bln;
    static char ch1;
    static Apple al;


    public static void main(String[] args) {

        System.out.println(i);
        System.out.println(ch1);
        System.out.println(bln);
        System.out.println(al);

        al = new Apple();
        System.out.println(al);

        al = null;
        System.out.println(al);

    

    }
}
