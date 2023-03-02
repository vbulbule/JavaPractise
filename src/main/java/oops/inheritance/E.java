package oops.inheritance;

public class E extends D{

    int x,y;

    E(){

        super(100,200);
    }

    E(int x, int y){
        super(x,y);
        this.x=x;
        this.y=y;
    }

    void print2(){
        System.out.println("x : "+ x);
        System.out.println("y : "+y );
    }



}
