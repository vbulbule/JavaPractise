package oops.constructor;

public class Constructor4 {
    //non static variables
    int i ;
    int j;

    //default constructor
    public Constructor4() {

    }
    // parametrized constructor
    public Constructor4(int a , int b){
        i=a;
        j=b;
    }
    public static void main(String[] args) {
        Constructor4 c1 = new Constructor4(20 , 40);
        System.out.println(c1.i);
        System.out.println(c1.j);

        Constructor4 c2 = new Constructor4(200, 300);
        System.out.println(c2.i);
        System.out.println(c2.j);

        Constructor4 c3 = new Constructor4();
        System.out.println(c3.i);
        System.out.println(c3.j);


    }


}
