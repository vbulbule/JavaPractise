package oops.inheritance;

public class C {
    int i,j; // non staic var
    //user defined constructor
    C(int i, int j){
        this.i = i;
        this.j = j;
    }

    //non static method
    void print(){
        System.out.println(" i : "+ i);
        System.out.println(" j : "+ j);
    }

}
