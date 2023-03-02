package oops.inheritance;

public class H extends G{


    H (int a, int b, int c){
        //super();  this will be put by compiler by default
                    //since super class does not have user defined constructor
                    //it will first create default constructor in the super class and in sub class uses as super();

    }

    public static void main(String[] args) {
        H h1 = new H(100,200,300);
    }

    }
