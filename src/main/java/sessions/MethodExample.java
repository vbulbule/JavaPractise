package sessions;

public class MethodExample {

    public static void main(String[] args) {
       
        print();

        int vale = addition(7, 9);
        System.out.println(vale);
        
    }

    static void print(){

        System.out.println("My name is Vitthal Bulbule");
        System.out.println("I am doint the java Coding");
       // return; // optional
    }

    static int addition(int i, int j){
        int k = i+j;
        return k;
    }


    
}
